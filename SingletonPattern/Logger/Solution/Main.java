package SingletonPattern.Logger.Solution;

public class Main {
    
    public static void main(String[] args){

        Logger logger = Logger.getInstance();

        logger.log("Application1 started");

        Logger logger2 = Logger.getInstance();
        logger2.log("Application2 started");
        System.out.println(logger2.getCount());
    }
}
