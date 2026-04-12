package FactoryPattern.LogisticsService.Solution;

public class LogisticsFactory {
    
    public static Logistics getLogistics(String mode){
        if(mode == "Air"){
            return new Air();
        }
        else if(mode == "Road"){
            return new Road();
        }
        return null;
    }
   
}
