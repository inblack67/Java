package com.intellisense;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Bucky";
//        player.hitPoints = 20;
//        player.weapon = "FullStack";
//
//        int damage = 25;
//        player.losehitPoints(damage);
//        System.out.println("hitPoints remaining = " + player.hitPointsRemaining());
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim",450,"SWORD");
        System.out.println("Initial hitPoints is " + enhancedPlayer.getHealth());
    }
}
