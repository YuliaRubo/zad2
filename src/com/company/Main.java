package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int yearOfBirthday = 1990;
        int monthOfBirthday = 01;
        int dayOfBirthday = 06;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println ("Сумма моего года, месяца и дня рождения:"+" " + sum);
        boolean monthBiggerDay = monthOfBirthday>dayOfBirthday;

        System.out.println ("Месяц моего рождения больше даты рождения:"+" " +  monthBiggerDay);

        char[] imya = {'Ю','Л', 'И', 'Я'};
        System.out.print("Массив с моим именем:" + " ");
        for (int i = 0; i < imya.length; i++) {
            System.out.print(imya[i]);
        }
        System.out.println();

        double myAge = 31;
        double partYear = 2.0 / 12.0;
        double sum1 = myAge + partYear;
        System.out.println("Мне " + sum1 + "лет");
    }
}
