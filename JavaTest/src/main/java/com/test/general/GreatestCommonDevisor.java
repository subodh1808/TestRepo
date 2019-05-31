package com.test.general;

public class GreatestCommonDevisor {
    public static void main (String args[]){

        System.out.println(gcd(12,18));
    }

    private static int gcd(int p,int q){
        if (q==0){
            return p;
        }

        int r = p%q;
        return gcd (q,r);
    }
}
