package com.company;

public class Magic extends Hero{

    public Magic(int damage, int health) {
        super(damage, health);
    }

    @Override
    public void applySuperAbility(String medic_применил_суперспособность_heath_damage) {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}
