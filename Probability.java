package Chapter5Lab2;

public class Probability implements ProbabilityCalc, Comparable<Probability> {
    // instance variables - replace the example below with your own
    private double prob;
    private int favorable;
    private int sampleSpace;
    
    public Probability(int fav, int sample) {
        this.favorable = fav;
        this.sampleSpace = sample;
        prob = ((double)favorable)/sampleSpace;
    }
    public double probabilityAND(Probability p2) {
         return this.prob * p2.prob;
    }
    public double probabilityOR(Probability p2, double overlap) {
        return this.prob + p2.prob - overlap;
    }
    public int compareTo(Probability other) {
        if(this.prob > other.prob) {
            return 1;
        }
        else if(this.prob < other.prob) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
