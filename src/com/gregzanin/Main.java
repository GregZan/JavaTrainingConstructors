package com.gregzanin;

public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(123321,9054.54,"Greg","greg@greg.com",99996666);
//        Without Constructor:
//        acc1.setAccNumber(123321);
//        acc1.setBalance(9054.54);
//        acc1.setCustomerName("Greg");
//        acc1.setEmail("greg@greg.com");
//        acc1.setPhoneNumber(99996666);

        System.out.println(acc1.getAccNumber());
        System.out.println(acc1.getCustomerName());
        System.out.println(acc1.getEmail());
        System.out.println(acc1.getPhoneNumber());
        System.out.println(acc1.getBalance());
        acc1.depositFunds(1000.46);
        acc1.withdrawFunds(1000000);
        acc1.withdrawFunds(4000);
        System.out.println(acc1.getBalance());


    }
}
