package com.elopez.design.patterns.structurals.composite;

import com.elopez.design.patterns.structurals.composite.squadron.Soldier;
import com.elopez.design.patterns.structurals.composite.squadron.SoldierInterface;
import com.elopez.design.patterns.structurals.composite.squadron.Squadron;

public class Client {
    public static void main(String[] args) {
        SoldierInterface soldier1 = new Soldier("John");
        SoldierInterface soldier2 = new Soldier("David");
        SoldierInterface soldier3 = new Soldier("Michael");

        SoldierInterface squad = new Squadron("Squad 1");
        ((Squadron) squad).addSoldier(soldier1);
        ((Squadron) squad).addSoldier(soldier2);
        ((Squadron) squad).addSoldier(soldier3);

        squad.respondToCommander();
    }
}
