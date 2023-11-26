public class CreditPaymentService {

    public int calculate(int sum, int period, double percent) {
        double PercentM = percent / 1200; // Процентная ставка в месяц в единицах (1200 = (12 * 100))
        double AllM = period * 12; // Количество месяцев

        int Platez = (int) (sum * PercentM / (1 - Math.pow(1 + PercentM, -AllM)));

        return Platez;
    }
}