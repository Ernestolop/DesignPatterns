package com.elopez.design.patterns.creationals.prototype.warrior;

public class Warrior implements WarriorPrototype {

    private String name;
    private String weapon;

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public Warrior clone() {
        Warrior warrior = new Warrior();
        warrior.setName(name);
        warrior.setWeapon(weapon);
        return warrior;
    }

    @Override
    public String toString() {
        return "Warrior{" + "name=" + name + ", weapon=" + weapon + '}';
    }
}
