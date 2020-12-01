package com.nazmul;

public class PrepaidSim extends Sim {
    String userName;

    public PrepaidSim(int balance) {
        super(balance);
    }

    public PrepaidSim(int balance, String userName) {
        super(balance);
        this.userName = userName;
    }

    @Override
    void call() {
        System.out.println("calling");
    }
}
