package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class MonsterGame {
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Player> mages = new ArrayList<>();
    ArrayList<Player> soldiers = new ArrayList<>();
    ArrayList<Player> hawkers = new ArrayList<>();
    ArrayList<Player> dealers = new ArrayList<>();
    private static final int maxLevel = 100;
    private static final int maxHealth = 6000;

    /**
     * Initiating the variables
     */
    public MonsterGame() {
        this.players.add(new Mage("Monicas", 1, 10, 10));
        this.players.add(new Soldier("Jonas", 1, 10, 10));
        this.players.add(new Hawker("Legolas", 1, 10, 10));
        this.players.add(new Dealer("Rosa", 1, 10, 10));


        players.get(1).insertGold(100);
        players.get(1).showAmountOfGold();
        players.get(1).withdrawGold(10);
        players.get(1).showAmountOfGold();
    }

    /**
     * Shows
     */
    public void showMainMenu(){
        System.out.println("Welcome to monstergame!\n");

        mainMenu();
    }
    public void mainMenu(){
        System.out.println("1. Add Player\n" +
                "2. Remove Player\n" +
                "3. Show Players\n" +
                "4. Top level Players\n" +
                "5. Help\n" +
                "6. Exit");
        Scanner input = new Scanner(System.in);
        String alt = input.next();

        do {
            switch (alt) {
                case "1":
                    addPlayer();
                    mainMenu();
                    return;
                case "2":
                    removePlayer();
                    mainMenu();
                    return;
                case "3":
                    System.out.println("Which kind of players do you want to see?\n"+
                            "1. Mage\n" +
                            "2. Soldier\n" +
                            "3. Hawker\n" +
                            "4. Dealer\n" +
                            "5. All jobs.\n" +
                            "6. Back");
                    Scanner jobChoice = new Scanner(System.in);
                    switch (jobChoice.next()) {
                        case "1":
                            showPlayer(mages);
                            System.out.println("The number of mages are: " + showAmountOfPlayers(mages));
                            System.out.println("\n");
                            mainMenu();
                            break;
                        case "2":
                            showPlayer(soldiers);
                            System.out.println("The number of soldiers are: " + showAmountOfPlayers(soldiers));
                            System.out.println("\n");
                            mainMenu();
                            break;
                        case "3":
                            showPlayer(hawkers);
                            System.out.println("The number of hawkers are: " + showAmountOfPlayers(hawkers));
                            System.out.println("\n");
                            mainMenu();
                            break;
                        case "4":
                            showPlayer(dealers);
                            System.out.println("The number of dealers are: " + showAmountOfPlayers(dealers));
                            System.out.println("\n");
                            mainMenu();
                            break;
                        case "5":
                            showPlayer(players);
                            System.out.println("\n");
                            mainMenu();
                            break;
                        case "6":
                            mainMenu();
                            break;
                    }
                    return;

                case "4":
                    Collections.sort(players, new SortByLevel());
                    showPlayer(players);
                    mainMenu();
                    return;

                case "5":
                    System.out.println("Write a number in the console to choose an alternative from the menu.");
                    mainMenu();
                    return;
            }

        }while(!alt.equals("6"));
    }

    public void addPlayer(){

        System.out.println("Enter name, health, level, specialty and job(mage, soldier, hawker, dealer) of player:");
        Scanner infoOfPlayer= new Scanner(System.in);

        String nameOfPlayer = infoOfPlayer.next();
        int health = infoOfPlayer.nextInt();
        int level = infoOfPlayer.nextInt();
        int specialty = infoOfPlayer.nextInt();
        String jobOfPlayer = infoOfPlayer.next();


        if(health>maxHealth){
            health = maxHealth;
        }
        if(level>maxLevel){
            level=maxLevel;
        }


        if(jobOfPlayer.equals("mage")) {
            Mage mage = new Mage(nameOfPlayer, health, level, specialty);
            players.add(mage);
            mages.add(mage);
        }
        else if (jobOfPlayer.equals("soldier")) {
            Soldier soldier = new Soldier(nameOfPlayer,health,level, specialty);
            players.add(soldier);
            soldiers.add(soldier);
        }
        else if (jobOfPlayer.equals("hawker")) {
            Hawker hawker = new Hawker(nameOfPlayer,health, level, specialty);
            players.add(hawker);
            hawkers.add(hawker);

        }
        else if (jobOfPlayer.equals("dealer")) {
            Dealer dealer = new Dealer(nameOfPlayer,health, level, specialty);
            players.add(dealer);
            dealers.add(dealer);
        }
    }
    public void removePlayer(){
        showPlayer(players);
        System.out.println("Write the name of the player you want to remove:");

        Scanner playerName = new Scanner(System.in);
        String playerNames = playerName.next();
        int i;
        for(i=0; i<= players.size()-1;i++){
            if(playerNames.equals(players.get(i).getName())) {
                players.remove(i);
            }
        }
    }
    public void showPlayer(ArrayList<Player> showPlayers){
        System.out.println("Name: Health: Level: Specialty: Job:");
        for(Player player: showPlayers){
            player.showInfo(player);
        }
    }
    public int showAmountOfPlayers(ArrayList<Player> amountOfPlayers){
        return amountOfPlayers.size();

    }



}
