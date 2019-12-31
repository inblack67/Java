package com.intellisense;

public class Main {

    public static void main(String[] args) {

        ITelephone myPhone;
//        DeskPhone myPhone; //valid too

        myPhone = new DeskPhone(123);
        myPhone.powerOn();
        myPhone.callPhone(123);
        myPhone.answer();
        myPhone.isRinging();

        myPhone = new MobilePhone(4553);
        myPhone.powerOn();
        myPhone.callPhone(4553);
        myPhone.answer();
    }
}
