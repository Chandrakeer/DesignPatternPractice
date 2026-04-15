package FactoryPattern.LogisticsService.Solution;

//The client does not directly instantiate objects. Instead, it delegates object creation to the factory, which reduces coupling and improves maintainability.
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
