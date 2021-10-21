package com.alphacoder.main;

public class PerfectTen {

    public boolean isPerfectPowerOfTen(int number){
        int resultingNumber= number/10;
        if(number<10){
            if(number==1){
                return true;
            }else{
                return false;
            }
        }
        return isPerfectPowerOfTen(resultingNumber);
    }
}
