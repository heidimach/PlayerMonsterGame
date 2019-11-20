package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MonsterGameTest {

    @Test
    public void showAmountOfPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Mage("Monica", 1, 10, 10));
        players.add(new Soldier("Jonas", 1, 10, 10));
        players.add(new Hawker("Legolas", 1, 10, 10));
        players.add(new Dealer("Rosa", 1, 10, 10));
        MonsterGame test = new MonsterGame();
        int out = test.showAmountOfPlayers(players);
        assertEquals(4,out);
    }
}