package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibWithFor(n);
    }
//3 Сокращаем использование памяти, и алгоритм работает
    private static void fibWithFor(int n) {
        long first = 0;
        long second = 1;
        long result;
        for (int i = 1; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
            System.out.println(first);
        }

        int[] f = fibWithArray(n);
        for (int i = 0; i < n; ++i) {
            System.out.println(f[i]);
        }
    }
//2 В цикле - с использовнием памяти
    private static int[] fibWithArray(int n) {
        if (n == 0) {
            return new int[]{0};
        } else if (n == 1) {
            return new int[]{0, 1};
        } else {
            int[] f = new int[n];
            f[0] = 0;
            f[1] = 1;
            for (int i = 2; i < n; ++i) {
                f[i] = f[i - 1] + f[i - 2];
            }
            return f;
        }
    }
}
