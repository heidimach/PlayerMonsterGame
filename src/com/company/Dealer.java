package com.company;

public class Dealer extends Player {
    private int gunPower;

    public Dealer(String name, int level, float health, int gunPower){
        super(name, level, health);
        this.gunPower = gunPower;
    }

    public void showInfo(Player player){
        System.out.println(player.getName() + " " + player.getHealth() + " " + player.getLevel() + " " + gunPower + " Dealer");
    }

    public String jobOfPlayer(){
        String dealer = new String("dealers");
        System.out.println("hej");
        return dealer;
    }
}
