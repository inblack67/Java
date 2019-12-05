package com.intellisense;

public class EnhancedPlayer
{
    private String name;
    private int hitPoints;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon)
    {
        this.name = name;
        if(hitPoints>0 && hitPoints<=100)
            this.hitPoints = hitPoints;
        else
            this.hitPoints=100;
        this.weapon = weapon;
    }

    public int getHealth()
    {
        return hitPoints;
    }

    public void losehitPoints(int damage)
    {
        this.hitPoints-=damage;
        if(this.hitPoints<=0)
            System.out.println("Player killed ");
    }
}
