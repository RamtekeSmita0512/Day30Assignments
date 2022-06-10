

public class InvoiceGenerator
{
    public static final double MINIMUM_COST_PER_KILOMETER = 10.0;
    public static final int COST_PER_TIME = 1;
    public static final double MINIMUM_FARE = 5.0;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO CAB SERVICE");
    }

}
