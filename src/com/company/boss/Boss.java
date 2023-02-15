package com.company.boss;

public class Boss {

    private int bossHealth;
    private int damage;
    private String defense;

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefense() {
        return defense;
    }
}
