public class CreditPaymentService {
    public int calculate(int amount, int years){
        float interestRate = (float) 9.99;
        float month = years * 12;
        float coefficient = 1 + (interestRate / 12 / 100);
        float coefficient1 = (float) ((interestRate / 12 / 100) * (Math.pow(coefficient, month)));
        float coefficient2 = (float) ((Math.pow(coefficient, month)) - 1);
        float coefficient3 = coefficient1 / coefficient2;
        int payment = (int) (coefficient3 * amount);
        return payment;
    }

}
