public class CreditPaymentService {

    public int calculate(int sum, int period, double percent) {

        int Paymentinmonth = (int) (sum * percent / (12 * 100) / (1 - Math.pow(1 + (percent / (12 * 100)), -(period * 12))));

        return Paymentinmonth;
    }
}