package com.nazmul;

public class PostPaidSim extends Sim {
    String userName;

    public PostPaidSim(int balance, String userName) {
        super(balance);
        this.userName = userName;
    }

    @Override
    void call() {
        System.out.println("calling");
    }

    @Override
    public boolean isCanCall() {
        return true;
    }
}
