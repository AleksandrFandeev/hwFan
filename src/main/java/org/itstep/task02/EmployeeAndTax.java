package org.itstep.task02;

import org.itstep.task01.Employee;

import static org.itstep.PaymentTypes.HOURLY;

public class EmployeeAndTax extends Employee{
        private int tax;

    public EmployeeAndTax(String fullName, String paymentType, double payment ) {
        super(fullName,paymentType,payment);
    }

    public int getTax() {
        if(getPaymentType().equals(HOURLY)){
            tax=20;
        }else {
            tax=15;
        }
        return tax;
        }
        public EmployeeAndTax(String fullName, String paymentType, double payment , int tax) {
            super(fullName,paymentType,payment);
            this.tax=tax;
        }



        @Override
        public void setPaymentType(String paymentType) {

        }

    @Override
    public String toString(){
            return String.format("%-9s| %-10s | %.1f грн |%.1f грн",getFullName(),getTax(),getPayment(),getPaymentWithTax());
    }
    @Override
    public double getPaymentWithTax(){
            double x= (getPayment()-((getPayment()*tax)/100));

            return x;
    }



}

