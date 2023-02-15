package com.company.hero;

public class Hero {
    private int heroHealth;
    private int damage;
    private String power;

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getDamage() {
        return damage;
    }

    public String getPower() {
        return power;
    }

    public Hero(int heroHealth, int damage, String power) {
        this.heroHealth = heroHealth;
        this.damage = damage;
        this.power = power;
    }

    public Hero(int heroHealth, int damage) {
        this.heroHealth = heroHealth;
        this.damage = damage;
    }

}
