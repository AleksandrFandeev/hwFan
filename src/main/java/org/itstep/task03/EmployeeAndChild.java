package org.itstep.task03;

import org.itstep.task02.EmployeeAndTax;

import static org.itstep.PaymentTypes.*;

public class EmployeeAndChild extends EmployeeAndTax {

    private boolean hasChild;

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    //
//    public EmployeeAndChild(String fullName, String paymentType, double payment) {
//        super(fullName, paymentType, payment);
//
//    }
//
    public EmployeeAndChild(String fullName, String paymentType, double payment, int tax) {
        super(fullName, paymentType, payment, tax);

    }


    public EmployeeAndChild(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment);
        this.hasChild = hasChild;
    }


    public EmployeeAndChild(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

    @Override
    public int getTax() {

            if(getPaymentType().equals(HOURLY)&hasChild==true){
                return 20;
            }else if(getPaymentType().equals(RATE)&hasChild==true) {
                return 15;
            }else if (getPaymentType().equals(RATE)&hasChild==false) {
                return 20;
            }else if (getPaymentType().equals(JOB_PRICE)&hasChild==true){
                return 20;
            }else if (getPaymentType().equals(JOB_PRICE)&hasChild==false){
                return 20;
            }
            return 15;


        }


    @Override
    public double getPaymentWithTax(){
        double x= (getPayment()-((getPayment()*getTax())/100));

        return x;
    }


    @Override
    public String toString(){
        return String.format("%-9s| %-10s | %.1f грн |%.1f грн",getFullName(),getTax(),getPayment(),getPaymentWithTax());
    }
}

//HOURLY = "почасовая";20
//public static final String RATE = "ставка";15
//public static final String JOB_PRICE = "сдельная";15
