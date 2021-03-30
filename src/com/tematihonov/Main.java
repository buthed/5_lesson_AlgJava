package com.tematihonov;

public class Main {

    public static void main(String[] args) {
        System.out.println("Дз №5. Рекрсия'");
        System.out.println("Task 5.1");
        System.out.println("Пример использвания рекурсии: ");
        System.out.println("Перед вами лежат очень много запечатанных конвертов и в одном из них лежат деньги.\n Вы проверяете все конверты по одномму, пока не найдете тот, в котором лежат деньги.");
        System.out.println();


        System.out.println("Task 5.2");
        System.out.println("Реализация бесконечной и обычной рекурсии с условием для входа: ");
        int usr = 10;
        int unsr = 10;
        System.out.println("Обычная рекурсия: ");
        usualRecursion(usr);
        System.out.println();

        System.out.println("Бесконечная рекурсия: (закомментирована)");
        //infinityRecursion(unsr);
        System.out.println();


        System.out.println("Task 5.3");
    }


    public static void usualRecursion(int n) {
        System.out.println("Привет мир!");
        if ( n ==  0) {
            System.out.println("Передали привет всем мирам!");
        } else {
            usualRecursion(n - 1);
        }
    }

    public static void infinityRecursion(int n) {
        System.out.println("Привет мир!");
        if ( n ==  11) {
            System.out.println("Передали привет всем мирам!");
        } else {
            infinityRecursion(n - 1);
        }
    }
}

