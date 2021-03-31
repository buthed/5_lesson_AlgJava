package com.tematihonov;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

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
        System.out.println("Пример стэка вызова: (закомментирована)");
//        Stack stackCall = new Stack();
//        stackCall.push(method1());
//        stackCall.push(method2());


        System.out.println("Пример стэка вызова с рекурсией: ");
        System.out.println("Нахождение факториала числа");
        System.out.println();

        System.out.println("Task 5.4");
        System.out.println("Простой алгоритм, использующий цикл: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }

        System.out.println("Простой алгоритм, использующий рекурсию: (закомментирована)");
        //recursionMethod(5);
        System.out.println();


        System.out.println("Task 5.5");
        int[] mArray;
        int[] mArrayCopy;
        long startTime;
        long endTime;
        mArray = new int[15];

        Random random = new Random();
        for (int i = 0; i < mArray.length; i++) {
            mArray[i] = random.nextInt(10);
        }
        mArrayCopy = Arrays.copyOf(mArray, mArray.length);
        System.out.println("Двоичный рекурсивный поиск: ");
        System.out.println("Задан массив: " + Arrays.toString(mArray));
        startTime = System.nanoTime();
        System.out.println("Поиск числа 3: " + recBinaryFind(3,0,10, mArray));
        endTime = System.nanoTime() - startTime;
        System.out.println("Результат двоичного рекурсивного поиска = " + endTime );
        System.out.println();

        System.out.println("Task 5.6");
        System.out.println("Сортировка слиянием ");
        System.out.println("Задан массив: " + Arrays.toString(mArrayCopy));
        System.out.println("Отсортированный массив: " + Arrays.toString(sortMerge(mArrayCopy)));
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

    public static void recursionMethod(int n) {
        if (n == 100) {
            System.out.println("Уже соточка");
        } else {
            n=+1;
            recursionMethod(n);
        }

    }

    public static int recBinaryFind(int searchKey, int low, int high, int[] arr) {
        if (low>high) {
            return arr.length;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == searchKey) {
            return mid;
        } else if (arr[mid] < searchKey) {
            return recBinaryFind(searchKey, low+1, high, arr);
        } else {
            return recBinaryFind(searchKey, low, high-1, arr);
        }
    }
    public static int[] sortMerge(int arr[]){
        int len = arr.length;
        if(len < 2) {
            return arr;
        }
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)), sortMerge(Arrays.copyOfRange(arr, middle, len)));
    }

    public static int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = a[aIndex]< b[bIndex] ? a[aIndex++] : b[bIndex++];
            if(aIndex == a.length){
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if(bIndex == b.length){
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
        }
        return result;
    }
}

