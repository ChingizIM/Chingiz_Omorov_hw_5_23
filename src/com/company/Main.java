package com.company;

import com.company.boss.Boss;
import com.company.hero.Hero;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setBossHealth(1000);
        boss.setDamage(70);
        boss.setDefense("Magical");

        System.out.println("BOSS:");
        System.out.println("Health: " +  boss.getBossHealth() +  " Damage: " + boss.getDamage() + " Defense: " + boss.getDefense());
        System.out.println("--------------------");


        for (int i = 0; i < createHero().length; i++) {
            System.out.println("Hero");
            System.out.println(createHero()[i].getHeroHealth() + " "
                    + createHero()[i].getDamage() + " " + createHero()[i].getPower());
        }
    }

    public static Hero[] createHero(){
        Hero Thor = new Hero(200,30,"Physical");

        Hero SpiderMan = new Hero(150,20);

        Hero Hulk = new Hero(300,50,"Physical");



            Hero[] heroes = new Hero[]{Thor, SpiderMan, Hulk};

            return heroes;
    }

}
