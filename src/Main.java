public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж составит " + CreditPaymentService.calculate(1_000_000, 1, 9.99) + " рублей");
        System.out.println();
        System.out.println("Ежемесячный платеж составит " + CreditPaymentService.calculate(1_000_000, 2, 9.99) + " рублей");
        System.out.println();
        System.out.println("Ежемесячный платеж составит " + CreditPaymentService.calculate(1_000_000, 3, 9.99) + " рублей");

    }
}