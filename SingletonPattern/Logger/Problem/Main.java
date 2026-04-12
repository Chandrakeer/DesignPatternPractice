package SingletonPattern.Logger.Problem;

public class Main {
    /* 
        In this example, the Logger class is used to log messages, 
        where each instance maintains its own count of log entries. 
        Whenever a new Logger object is created and its log method is invoked, 
        it prints the message and increments its internal counter. 
        However, since each instance keeps a separate count, there is no centralized way 
        to track the total number of log messages across the entire application.
    */    
    public static void main(String[] args){

        Logger logger = new Logger();
        logger.log("Application started");

        System.out.println("Total log messages: " + logger.count);

        Logger logger2 = new Logger();
        logger2.log("Application started");
        logger2.log("Error occurred");
        System.out.println("Total log messages: " + logger2.count);

    }
}
