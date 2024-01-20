package com.subash;

public class Shadowing {
    static int x =69; // this will be shadowed at line 10 : that means higher level x is shadowed by lower level x.
    public static void main(String[] args) {
        System.out.println(x); //69
        /*
            shadowing means using 2 variable in same name with in the scope at various laps
         */
        int x ; //the class variable at line 4 is shadowed by this.
        //System.out.println(x); // scope will begin when value is initialise
        x= 99;
        System.out.println(x); //99
        method();

    }
    static void method (){
        System.out.println(x);
    }
}
