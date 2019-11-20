package com.company;

public abstract class Player {
    private String name;
    private int level;
    private float health;
    private GoldPurse purse;

    /**
     *
     * @param name is the name of the player, which takes integer as an input.
     * @param level is the level of the player, which takes integer as an input.
     * @param health is the health of the player, which takes float as an input.
     */
    public Player(String name, int level, float health){
        this.name = name;
        this.level = level;
        this.health = health;
        this.purse = new GoldPurse();
    }

    /**
     * Lets other classes to access to the private variable with the value of name.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Lets other classes to access to the private variable with value of level.
     * @return
     */
    public int getLevel() {
        return level;
    }


    /**
     * Let other classes to access to the private variable.
     * @return
     */
    public float getHealth() {
        return health;
    }

    /**
     * Inserts gold of the player.
     * @param amountOfGold gives an amount of gold, where amountOfGold is an integer.
     */
    public void insertGold(int amountOfGold){
        purse.insert(amountOfGold);
    }

    /**
     * Withdraws gold from the player.
     * @param amountOfGold takes an amount of gold, where the parameter is an integer.
     */
    public void withdrawGold(int amountOfGold){
        purse.withdraw(amountOfGold);// TODO fix pwease
    }


    /**
     * Shows how much gold a player has.
     */
    public void showAmountOfGold(){
        System.out.println(purse.getAmountOfGold());
    }

    /**
     * Shows information of the player, like name, health, level etc.
     * @param player is a player object.
     */
    public abstract void showInfo(Player player);

    public abstract String jobOfPlayer();
}
