package Chapter5Lab2;

public class ProbabilityDriver {
    public static void main (String[] args) {
        Probability p1 = new Probability(6,10);
        Probability p2 = new Probability(5,10);
        System.out.println(p1.probabilityAND(p2));
    }
    
}
