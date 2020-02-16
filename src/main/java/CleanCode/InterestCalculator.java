package CleanCode;

public class InterestCalculator {
    private double interest;
    public double simpleInterest(double p,double r,double t){
        interest = p*r*t/100;
        return interest;
    }
    public double compoundInterest(double p,double r,double t){
        double amt =  p * Math.pow(1 + (r/100),t);
        interest = amt - p;
        return interest;
    }
}
