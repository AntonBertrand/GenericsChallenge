package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " already exists in this league!");
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " added to this league!");
            return true;
        }
    }

    public void showLeagueTable() {
        if (league.isEmpty()) {
            System.out.println("No teams in league to print!");
        }

        Collections.sort(league);

        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
