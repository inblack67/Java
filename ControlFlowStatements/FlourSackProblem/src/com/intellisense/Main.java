package com.intellisense;

class Main {
    public static  void main(String[] args) {
        System.out.println(canPack(2,2,11));
    }

    // bigCount 5 kilo
    // smallCount 1 kilo
    // goal needed
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if(bigCount<0 || smallCount<0 || goal<0)
            return false;
        if((bigCount+smallCount==goal) || (bigCount+smallCount>goal && goal>=bigCount) || goal%5<=smallCount)
            return true;
        return false;

    }
}

