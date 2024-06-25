package com.blessing.enthware.annotations;

class Account {
    int id;
    double balance;

    @Deprecated
    public Account() {
    }

    ;

    public Account(int id) {
        this.id = id;
    }

    ;

    public void transact(double amount) {
        balance = balance + amount;
    }
}

class NewAccount extends Account {
    public NewAccount() {
    }
}

public class TestClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Account c = new NewAccount();
    }

}
