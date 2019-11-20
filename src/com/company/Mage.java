package com.company;

public class Mage extends Player{
    private int magicLevel;

    public Mage(String name, int level, float health, int magicLevel){
        super(name, level, health);
        this.magicLevel = magicLevel;
    }

    public void showInfo(Player player){
        System.out.println(player.getName() + " " + player.getHealth() + " " + player.getLevel() + " " + magicLevel + " Mage");
    }

    public String jobOfPlayer(){
        String mage = new String("mages");
        return mage;
    }
}
