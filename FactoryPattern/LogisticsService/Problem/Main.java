package FactoryPattern.LogisticsService.Problem;

public class Main {
     
    LogisticsService logisticsService = new LogisticsService();
    public static void main(String[] args) {
        Main main = new Main();
        main.logisticsService.send("Air");
        main.logisticsService.send("Road");
    }
}
