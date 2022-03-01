package com.company.SOLID_Principle.DependencyInversionPrinciple.Solution;

public class MasterCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("Payment with master card");

    }
}
