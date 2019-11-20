package com.company;

public class Hawker extends Player {
    private int bowPower;

    public Hawker(String name, int level, float health, int bowPower){
        super(name,level,health);
        this.bowPower=bowPower;
    }

    public void showInfo(Player player){
        System.out.println(player.getName() + " " + player.getHealth() + " " + player.getLevel() + " " + bowPower+ " Hawker");
    }

    public String jobOfPlayer(){
        String hawker = new String("hawkers");
        return hawker;
    }
}
