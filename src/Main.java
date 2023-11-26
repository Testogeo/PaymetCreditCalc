public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int Platez_za_god = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Платёж в месяц " + Platez_za_god + " рублей");

        int Platez_za_2goda = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Платёж в месяц " + Platez_za_2goda + " рублей");

        int Platez_za_3goda = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Платёж в месяц " + Platez_za_3goda + " рублей");
    }
}