public class CreditPaymentService {
    public static int calculate(int sumCredit, int termCreditYear, double interestRateYear) {
        double interestRateMonth = interestRateYear / 100 / 12; //месячная процентная ставка

        int termCreditMonth = termCreditYear * 12; // срок в месяцах
        double termCreditMonthDouble = (double) termCreditMonth; // преведение срока в double
        double sumCreditDouble = (double) sumCredit; // преведение суммы кредита в double

        double monthlyPayment = sumCreditDouble * ((interestRateMonth * Math.pow((1 + interestRateMonth), termCreditMonthDouble)) / (Math.pow((1 + interestRateMonth), termCreditMonthDouble) - 1));
        int monthlyPaymentInt = (int) monthlyPayment;

        return monthlyPaymentInt;
    }

}
