package SingletonPattern.Logger.Solution;

import java.util.concurrent.atomic.AtomicInteger;

/*
    Eager Loading - The Object is created immediately when the class is loaded.
    Thread - safe
    Wastes memory if the instance is never used. Not suitable for heavy objects
*/
public class Logger {

    //eager creation
    private static final Logger instance = new Logger();
    private AtomicInteger count = new AtomicInteger(0);
    //private constructor - prevents external instantiation
    private Logger(){}

    public static Logger getInstance(){
        return instance;
    }

    public void log(String message){
        System.out.println(message);
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}