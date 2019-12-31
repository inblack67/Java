package com.intellisense;

public interface ITelephone {

//These methods have to ve implemented
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();

//    You don't write code in here, just contracts and their signatures
//    private public are useless here

}
