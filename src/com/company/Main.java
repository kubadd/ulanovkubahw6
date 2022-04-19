package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior(100, 50);
        Magic Magic = new Magic(150, 30);
        Madic medic = new Madic(200, 10);

        Hero[] superHero = {warrior, Magic, medic};

        for (int i = 0; i < superHero.length; i++) {
            superHero[i].applySuperAbility("Warrior " +
                    "применил суперспособность CRITICAL DAMAGE");

            ;
        }


    }
}
