package Visitor;

public interface Visitor {
    void visit(Electronics electronics);
    void visit(Plastics plastics);
    void visit(Vegetable vegetable);

}
