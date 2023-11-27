public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int payment1year = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Платёж в месяц " + payment1year + " рублей");

        int payment2years = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Платёж в месяц " + payment2years + " рублей");

        int payment3years = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Платёж в месяц " + payment3years + " рублей");
    }
}