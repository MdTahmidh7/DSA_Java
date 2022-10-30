package Visitor;

public class Main {
    public static void main(String[] args) {
        VisitorImp visitorImp = new VisitorImp();

        Electronics electronics = new Electronics();
        Plastics plastics = new Plastics();
        Vegetable vegetable  = new Vegetable();

         plastics.accept(visitorImp);
        System.out.println("\n");
         electronics.accept(visitorImp);
        System.out.println("\n");
        vegetable.accept(visitorImp);
    }
}
