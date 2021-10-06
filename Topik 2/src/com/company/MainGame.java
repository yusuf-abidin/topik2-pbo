package com.company;

public class MainGame {
    public static void main(String[] args) {
        GameCharacter pRaiden = new GameCharacter("Raiden", 10, 20);
        GameCharacter pSubZero = new GameCharacter("Sub-Zero", 5, 25);

        pRaiden.kick(pSubZero);
        pSubZero.kick(pRaiden);

        for (int i=0; i<3; i++){
            pSubZero.hit(pRaiden);
        }

        for (int i=0; i<4; i++){
            pRaiden.kick(pSubZero);
        }

        System.out.println("LifePoint " + pRaiden.getName() + " = " + pRaiden.getLifePoint());
        System.out.println("LifePoint " + pSubZero.getName() + " = " + pSubZero.getLifePoint());

        if (pRaiden.getLifePoint() > pSubZero.getLifePoint()){
            System.out.println("Pemenang : " + pRaiden.getName());
        }else if (pSubZero.getLifePoint() > pRaiden.getLifePoint()){
            System.out.println("Pemenang : " + pSubZero.getName());
        }else {
            System.out.println("SEIMBANG");
        }
    }
}
