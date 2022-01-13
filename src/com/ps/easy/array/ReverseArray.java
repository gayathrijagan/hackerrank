package com.ps.easy.array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        String nums = input.nextLine();
        System.out.println(reverseArray(Arrays.stream(nums.split(" ")).map(Integer::parseInt).collect(Collectors.toList())));
    }

    public static List<Integer> reverseArray(List<Integer> a) {
        int size = a.size();
        for (int i = 0; i < a.size() / 2; i++) {
            int left = a.get(i);
            int right = a.get(size - i - 1);
            a.set(size - i - 1, left);
            a.set(i, right);
        }

        return a;
    }
}
