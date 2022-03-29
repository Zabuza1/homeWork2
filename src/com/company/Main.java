package com.company;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        byte lizard = 3;
        short camels =2;
        long lion = 113;
        float cornWeight = 3.5f;
        double sugarWeight = 2.5;
        int human = 30;
        boolean humanIsAdult = human > 20;
        char c = 33;
        System.out.println(c);
        System.out.println(humanIsAdult);

        // Задача 2
        double boxerWeight = 78.2;
        double boxerWeightSecond = 82.7;
        double weightAllBoxers = boxerWeightSecond + boxerWeight;
        double weightDiff = boxerWeightSecond - boxerWeight;
        System.out.println("total boxers weight is " + weightAllBoxers + " kg");
        System.out.println("weight diff between boxers is " + weightDiff + " kg");

        // Задача 3
        byte banana = 5;
        byte bananaWeight = 80;
        byte milk = 2;
        byte milkWeight = 105;
        byte ice = 2;
        byte iceWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        int breakfastWeight = banana * bananaWeight + milk * milkWeight + ice * iceWeight + egg * eggWeight;
        System.out.println(breakfastWeight + "mg in breakfast ");
        double convertToKg = 1000;
        double kg = breakfastWeight / convertToKg;
        System.out.println(kg + "kg in one breakfast");

        // Задача 4
        short goal = 7000;
        short loseWeight = 250;
        short loseWeight2 = 500;
        int days = goal / loseWeight;
        System.out.println(days + " days need spend days to lose weight");
        int days2 = goal / loseWeight2;
        System.out.println(days2 + " days need spend days to lost weight");
        int middle =(days + days2) / 2;
        System.out.println(middle + " average spend days to lost weight");

        // Задача 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double newSalaryMasha = salaryMasha * 0.10;
        double finalSalaryMasha = newSalaryMasha + salaryMasha;
        double newSalaryDenis = salaryDenis * 0.10;
        double finalSalaryDenis = newSalaryDenis + salaryDenis;
        double newSalaryKristina = salaryKristina * 0.10;
        double finalSalaryKristina = newSalaryKristina + salaryKristina;
        int mOldPerYear = salaryMasha * 12;
        int dOldPerYear = salaryDenis * 12;
        int kOldPerYear = salaryKristina * 12;
        double mNewPerYear = finalSalaryMasha * 12;
        double dNewPerYear = finalSalaryDenis * 12;
        double kNewPerYear = finalSalaryKristina * 12;
        double MashaCompare = mNewPerYear - mOldPerYear;
        double DenisCompare = dNewPerYear - dOldPerYear;
        double KristinaCompare = kNewPerYear - kOldPerYear;
        System.out.println("Masha now gets " + mNewPerYear + " income increased by " + MashaCompare);
        System.out.println("Denis now gets " + dNewPerYear + " income increased by " + DenisCompare);
        System.out.println("Kristina now gets " + kNewPerYear + " income increased by " + KristinaCompare);










    }
}
