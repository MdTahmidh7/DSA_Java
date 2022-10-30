package FactoryDP;

public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
       Lab lab2 =  computerFactory.getComputer("Lab2");
       lab2.showDetails();
        System.out.println("    \n ");
        Lab lab4 =  computerFactory.getComputer("Lab4");
        lab4.showDetails();

    }
}
