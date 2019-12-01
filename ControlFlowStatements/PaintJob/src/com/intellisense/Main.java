package com.intellisense;

class Main {
    public static  void main(String[] args)
    {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBucket)
    {
        if(extraBucket<0 || width<=0 || height<=0 || areaPerBucket<=0)
            return -1;
        return (int)Math.ceil(((height*width)/(areaPerBucket)-extraBucket));
    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area<=0 || areaPerBucket<=0)
            return -1;
        return (int)Math.ceil(area/areaPerBucket);
    }
}

