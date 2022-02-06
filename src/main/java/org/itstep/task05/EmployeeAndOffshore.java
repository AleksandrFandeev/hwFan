package org.itstep.task05;

import org.itstep.task04.EmployeeAndTugrik;

import static org.itstep.PaymentTypes.*;

public class EmployeeAndOffshore extends EmployeeAndTugrik {
    private boolean inOffshore;

    public void setInOffshore(boolean inOffshore) {
        this.inOffshore = inOffshore;
    }

    public boolean getInOffshore() {
        if (getPaymentType().equals(RATE)) {
            return true;
        } else {
            return false;
        }
    }


//    public EmployeeAndOffshore(String fullName, String paymentType, double payment, int tax) {
//        super(fullName, paymentType, payment, tax);
//    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild, boolean inOffshore) {
        super(fullName, paymentType, payment, hasChild);
        this.inOffshore = inOffshore;
    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment, hasChild);

    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

    @Override
    public int getTax() {
        if (getPaymentType().equals(RATE)) {
            return 0;
        } else if (getPaymentType().equals(HOURLY)) {
            return 20;
        } else if (getPaymentType().equals(JOB_PRICE)){
            return 20;
    }
            return 0;
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
