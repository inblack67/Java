package com.intellisense;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone is always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        System.out.println("answering the desk phone");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber)
        {
            isRinging = true;
            System.out.println("ring ring");
        }
        else
        {
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
