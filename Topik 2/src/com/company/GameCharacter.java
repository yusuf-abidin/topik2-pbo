package com.company;

public class GameCharacter {

    private String name;
    private int lifePoint = 100;
    private int attackHitPoint;
    private int attackKickPoint;

    public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public void hit(GameCharacter karB){
        karB.lifePoint = karB.getLifePoint() - this.attackHitPoint;
    }

    public void kick(GameCharacter karB){
        karB.lifePoint = karB.getLifePoint() - this.attackKickPoint;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public String getName() {
        return name;
    }
}
