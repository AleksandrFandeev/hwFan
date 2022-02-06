
package org.itstep.task04;

import org.itstep.task03.EmployeeAndChild;

import static org.itstep.PaymentTypes.HOURLY;

public class EmployeeAndTugrik extends EmployeeAndChild {
    private double tugrickExchange;

    //       public double getTugrickExchange() {
//        return tugrickExchange;
//    }
    public void setTugrikExchange(int tugrickExchange) {
        this.tugrickExchange = tugrickExchange;
    }

    public EmployeeAndTugrik(String fullName, String paymentType, double payment, int tax) {
        super(fullName, paymentType, payment, tax);
    }

    public EmployeeAndTugrik(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment, hasChild);
    }

    public EmployeeAndTugrik(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

//    public double getTugrickExchange() {
//        double x;
//        if (getPaymentType().equals(HOURLY)) {
//            x = getPaymentWithTax();
//            x = x / 2;
//            return x;
//        } else return x;
//    }


    public double getTugrickExchange() {
        double x = (getPayment() - ((getPayment() * getTax()) / 100));
        if (getPaymentType().equals(HOURLY)) {

            x = x / 2;
            return x;


        } else {
            return getPaymentWithTax();
        }
    }


    @Override
    public String toString() {
        for (int i = 0; i <= 3; i++) {

            if (getPaymentType().equals(HOURLY)) {
                return String.format("%-9s| %-10s | %.1f грн |%.1f/ 40.0", getFullName(), getTax(), getPayment(), getTugrickExchange());
            } else {
                return String.format("%-9s| %-10s | %.1f грн |%.1f грн  ", getFullName(), getTax(), getPayment(), getTugrickExchange());
            }
        }
        return String.format("%-9s| %-10s | %.1f грн |%.1f грн  ", getFullName(), getTax(), getPayment(), getTugrickExchange());
    }
}
