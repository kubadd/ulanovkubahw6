package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int Damage;
    private  int Health;

    public Hero(int damage, int health) {

    }
    public  void  applySuperAbility (int Health,int damage){}

    public  abstract  void applySuperAbility(String medic_применил_суперспособность_heath_damage);

}
