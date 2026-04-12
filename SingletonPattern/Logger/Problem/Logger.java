package SingletonPattern.Logger;

class Problem {

    int count = 0;

    public void log(String message){
        System.out.println(message);
        count++;
    }   
}
