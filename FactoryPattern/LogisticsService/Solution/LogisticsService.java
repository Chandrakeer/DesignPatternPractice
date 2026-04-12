package FactoryPattern.LogisticsService.Solution;

public class LogisticsService {
    
    public void send(String mode){
       
        Logistics logistics = LogisticsFactory.getLogistics(mode);
        if(logistics != null){
            logistics.send();
        }
    }
}
