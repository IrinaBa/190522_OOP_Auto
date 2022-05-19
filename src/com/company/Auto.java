package com.company;

public class Auto {
    String manufactur;
    String model;
    int year;
    String motor;
    int horspower;

    public Auto(String mnf, String m, int y, String mtr, int hp) {
        manufactur = mnf;
        model = m;
        year = y;
        motor = mtr;
        horspower = hp;
    }

    public void print() {
        System.out.println("Auto: " + manufactur + " " + model + ". Year of: " + year + ". Motor: " + motor + ". Horspower is: " + horspower);

    }


}
