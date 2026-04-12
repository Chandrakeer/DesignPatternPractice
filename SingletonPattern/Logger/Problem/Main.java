package SingletonPattern.Logger;

public class Main {
    
    public static void main(String[] args){

        Problem logger = new Problem();
        logger.log("Application started");

        System.out.println("Total log messages: " + logger.count);

        Problem logger2 = new Problem();
        logger2.log("Application started");
        logger2.log("Error occurred");
        System.out.println("Total log messages: " + logger2.count);
        




    }
}
