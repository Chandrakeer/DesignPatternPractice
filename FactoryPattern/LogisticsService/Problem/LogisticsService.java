package FactoryPattern.LogisticsService.Problem;

public class LogisticsService {
    
    public void send(String mode){
        if(mode == "Air"){
            Logistics logistics = new Air();
            logistics.send();
        }
        else if(mode == "Road"){
            Logistics logistics = new Road();
            logistics.send();
        }
    }
}
