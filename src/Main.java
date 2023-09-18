public class Main {
    public static void main(String[] args)
    {
        int creditCard = 5000;
        double firstPayment = creditCard * 1.17;
        double secondPayment = firstPayment * 1.17;
        System.out.println("The first payment is " + " $ " + firstPayment + " and the second payment is " + " $ " + secondPayment);
    }
}