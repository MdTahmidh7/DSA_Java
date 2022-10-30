package FactoryDP;

public class ComputerFactory {
    public Lab getComputer(String string){
        if(string.equalsIgnoreCase("Lab1")){
            return new Lab1();
        } else if (string.equalsIgnoreCase("Lab2")) {
            return new Lab2();
        }
        else if (string.equalsIgnoreCase("Lab3")) {
            return new Lab3();
        }else if (string.equalsIgnoreCase("Lab4")) {
            return new Lab4();
        }else return null;
    }
}
