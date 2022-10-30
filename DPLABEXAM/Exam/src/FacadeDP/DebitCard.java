package FacadeDP;

public class DebitCard {
    AmountCalculator amountCalculator;
    CentralDataBase centralDataBase;
    LedScreen ledScreen;
    String acNumber;
    Printer printer;
    public DebitCard(String acNumber){
        amountCalculator = new AmountCalculator();
        centralDataBase = new CentralDataBase();
        printer = new Printer();
        this.acNumber = acNumber;
    }
    public void withdraw(){
        centralDataBase.accountIsValid();
        amountCalculator.debit();
        printer.print(acNumber);
    }
}
