package com.nazmul;

public abstract class Sim {
    int balance;
    boolean canCall;

    public Sim(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    abstract void call();

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isCanCall() {
        return balance > 0;
    }

    public void setCanCall(boolean canCall) {
        this.canCall = canCall;
    }
}
