package com.company;

public class Main {

    public static void main(String[] args) {

    Account bobsAccount = new Account("122334", 0.00, "Bob ", "myemail@new.com", "0982 778 990");


    bobsAccount.withdrawal(100.0);
    bobsAccount.deposit(50.0);
    bobsAccount.withdrawal(100.00);
    bobsAccount.deposit(51.00);
    bobsAccount.withdrawal(100.00);



    }
}
