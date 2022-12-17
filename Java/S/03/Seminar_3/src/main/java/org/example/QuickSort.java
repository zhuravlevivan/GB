package org.example;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] inputArray = {8, 0, 4, 7, 3, 7, 10, 12, -3};

        System.out.println("\n--- Исходный массив ---");
        System.out.println(Arrays.toString(inputArray));

        int low = 0;
        int high = inputArray.length - 1;

        quickSort(inputArray, low, high);

        System.out.println("\n--- Отсортированный массив ---");
        System.out.println(Arrays.toString(inputArray));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high)
            return; //завершить, если длина массива равна 0 или нечего делить
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) { //меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части        if (low < j)
        quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
}