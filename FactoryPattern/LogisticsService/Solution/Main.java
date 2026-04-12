package FactoryPattern.LogisticsService.Solution;

public class Main {
     
    LogisticsService logisticsService = new LogisticsService();
    public static void main(String[] args) {
        
        LogisticsService logisticsService = new LogisticsService();
        logisticsService.send("Air");
        logisticsService.send("Road");
    }
}
