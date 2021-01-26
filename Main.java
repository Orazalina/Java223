public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate(1000000, 1);
        System.out.println(payment);

        int payment1 = service.calculate(1000000, 2);
        System.out.println(payment1);

        int payment2 = service.calculate(1000000, 3);
        System.out.println(payment2);
    }

}
