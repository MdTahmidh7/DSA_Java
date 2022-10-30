package Visitor;

public class VisitorImp implements Visitor{
      public void visit(Electronics electronics) {
          System.out.println(" Category : Electronics");
          System.out.println(" Discount : 20%");
          System.out.println(" Return : 60 days");
          System.out.println(" Vendor : Amazon USPS");
      }
    @Override
    public void visit(Plastics plastics) {
        System.out.println(" Category : Plastics");
        System.out.println(" Discount : 10%");
        System.out.println(" Return : 30 days");
        System.out.println(" Vendor : Sundorans Paribahan");
    }
    @Override
    public void visit(Vegetable vegetable) {
        System.out.println(" Category : Vegetable");
        System.out.println(" Discount : 5%");
        System.out.println(" Return : 0 days");
        System.out.println(" Vendor : Sohoz Bazar");
    }
}
