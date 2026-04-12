package SingletonPattern.Logger.Problem;

class Logger {

    int count = 0;

    public void log(String message){
        System.out.println(message);
        count++;
    }   
}
