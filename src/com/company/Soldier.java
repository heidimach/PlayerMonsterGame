package com.company;

public class Soldier extends Player {
    private int strength;

    public Soldier(String name, int level, float health, int strength){
        super(name,level,health);
        this.strength = strength;
    }
    public void showInfo(Player player){
        System.out.println(player.getName() + " " + player.getHealth() + " " + player.getLevel() + " " + strength + " Soldier");
    }

    public String jobOfPlayer() {
        String soldier = new String("soldiers");
        return soldier;
    }
}