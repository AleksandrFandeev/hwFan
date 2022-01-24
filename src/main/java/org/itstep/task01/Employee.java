package org.itstep.task01;

public class Employee {
    private String fullName;
    private String paymentType;
    private double payment;

    public Employee(String fullName, String paymentType, double payment) {
        this.fullName = fullName;
        this.paymentType = paymentType;
        this.payment = payment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

@Override
    public String toString(){
    return String.format("%-9s| %-12s | %.1f грн",fullName,paymentType,payment);
}
}