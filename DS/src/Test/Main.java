package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu \n_________________");
        System.out.println("Enter 1 for Dog \nEnter 2 for Cat");
        int choice = scanner.nextInt();
        if (choice==1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }else{
            animal = new Animal();
            animal.speak();
            System.out.println("Invalid Input.");
        }
    }
}
