package org.itstep.task06;

import org.itstep.task04.EmployeeAndTugrik;
import org.itstep.task05.EmployeeAndOffshore;

import static org.itstep.PaymentTypes.HOURLY;

public class EmplyeeAndBonus extends EmployeeAndTugrik {

    private double workHours;
    public double getWorkHours() {
        double x;
        if(workHours>200){
           x = (getPayment() + ((getPayment() * 20) / 100));
         return x;
        }else {
//           x=getPayment();
           return getPayment();
        }
    }
    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }



    public EmplyeeAndBonus(String fullName, String paymentType, double payment, boolean hasChild, double workHours) {
        super(fullName, paymentType, payment, hasChild);
        this.workHours = workHours;
    }
    public EmplyeeAndBonus(String fullName, String paymentType, double payment, double workHours) {
        super(fullName, paymentType, payment);
        this.workHours = workHours;
    }



    @Override
    public String toString() {
        for (int i = 0; i <= 3; i++) {

            if (getPaymentType().equals(HOURLY)) {
                return String.format("%-9s| %-10s | %.1f грн |%.1f/ 40.0", getFullName(), getTax(), getPayment(), getTugrickExchange());
            } else {
                return String.format("%-9s| %-10s | %.1f грн |%.1f грн  ", getFullName(), getTax(), getWorkHours(), getTugrickExchange());
            }
        }
        return String.format("%-9s| %-10s | %.1f грн |%.1f грн  ", getFullName(), getTax(), getWorkHours(), getTugrickExchange());
    }


    }




