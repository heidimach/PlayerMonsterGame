package com.company;

public class GoldPurse {
    private int amountOfGold;

    public GoldPurse(){
        this.amountOfGold = 0;
    }

    public int getAmountOfGold() {
        return amountOfGold;
    }

    public void insert(int amountOfGold){
        this.amountOfGold = this.amountOfGold + amountOfGold;
    }

    public void withdraw(int amountOfGold){
        this.amountOfGold = this.amountOfGold - amountOfGold;
    }
}
