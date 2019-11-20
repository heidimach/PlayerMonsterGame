package com.company;

import java.util.Comparator;

public class SortByLevel implements Comparator<Player> {
    public int compare(Player a, Player b){
        return -(a.getLevel()-b.getLevel());
    }
}
