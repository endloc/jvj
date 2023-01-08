package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int numbers[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        java.util.Arrays.sort(numbers);
        System.out.println("Max element is " + numbers[size - 1]);
    }
    public static int[] sortArray(int[] array) {
        java.util.Arrays.sort(array);
        return array;
    }
}