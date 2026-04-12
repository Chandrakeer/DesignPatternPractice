package SingletonPattern.Logger.Solution;

import java.util.concurrent.atomic.AtomicInteger;

/*
    Eager Loading - The Object is created immediately when the class is loaded.
    Thread - safe
    Wastes memory if the instance is never used. Not suitable for heavy objects
*/
// public class Logger {

//     //eager creation
//     private static final Logger instance = new Logger();
//     private AtomicInteger count = new AtomicInteger(0);
//     //private constructor - prevents external instantiation
//     private Logger(){}

//     public static Logger getInstance(){
//         return instance;
//     }

//     public void log(String message){
//         System.out.println(message);
//         count.incrementAndGet();
//     }

//     public int getCount(){
//         return count.get();
//     }
// }


/*
    Lazy Loading - instance is created only when it's needed - the first time the getInstance() method is called
    // Not - thread safe
    // Saves memory if the instance is never used. Object creation is deffered until required.

*/

// class Logger{

//     private static Logger instance;

//     private AtomicInteger count = new AtomicInteger(0);

//     // Private constructor 
//     private Logger(){}

//     public static Logger getInstance(){

//         if ( instance == null){
//             instance = new Logger();
//         }
//         return instance;
//     }

//     public void log(String message){
//         System.out.println(message);
//         count.incrementAndGet();
//     }

//     public int getCount(){
//         return count.get();
//     }
// }

/*
    Synchronized - Thread-safe without needing complex logic.
    Performance overhead: Every call to getInstance() is synchronized, even after the instance is created.
    May slow down the application in high-concurrency scenarios.
    Problem: Every thread must acquire a lock. Even after instance is created
    In production: High traffic system (1000+ threads). All threads block here → contention
    Result: Slower response time. Reduced throughput
*/

// class Logger{

//     private static Logger instance;

//     private AtomicInteger count = new AtomicInteger(0);

//     // Private constructor 
//     private Logger(){}

//     public static synchronized Logger getInstance(){
//         if ( instance == null){
//             instance = new Logger();
//         }
//         return instance;
//     }

//     public void log(String message){
//         System.out.println(message);
//         count.incrementAndGet();
//     }

//     public int getCount(){
//         return count.get();
//     }
// }

/*
    Double Locking - Efficient: Synchronization only happens once, when the instance is created.
    Safe and fast in concurrent environments.
    Slightly more complex than the synchronized method. 
    Requires Java 1.5 or above due to reliance on volatile.
*/

// class Logger{

//     private static volatile Logger instance;

//     private AtomicInteger count = new AtomicInteger(0);

//     // Private constructor 
//     private Logger(){}

//     public static Logger getInstance(){
        
//         if ( instance == null){
//             synchronized (Logger.class){
//                 if(instance == null){
//                 instance = new Logger();
//                 }
//             }
//         }
//         return instance;
//     }

//     public void log(String message){
//         System.out.println(message);
//         count.incrementAndGet();
//     }

//     public int getCount(){
//         return count.get();
//     }
// }

/*
    Bill Pugh Singleton (Best Practice for Lazy Loading)
    The Singleton instance is not created until getInstance() is called.
    The static inner class (Holder) is not loaded until referenced, thanks to Java's class loading mechanism.
    It ensures thread safety, lazy loading, and high performance without synchronization overhead.

    Best of both worlds: Lazy + Thread-safe. No need for synchronized or volatile. Clean and efficient.

*/

class Logger{

    private AtomicInteger count = new AtomicInteger(0);

    // Private constructor 
    private Logger(){}

    // Static inner class to hold the singleton instance 
    private static class Holder{
        private static final Logger instance = new Logger();
    }

    // Public method to return the Singleton instance 
    public static Logger getInstance(){
        return Holder.instance;
    }

    public void log(String message){
        System.out.println(message);
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}
