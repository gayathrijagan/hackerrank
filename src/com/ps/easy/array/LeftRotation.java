package com.ps.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LeftRotation {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[] sizeAndNumRotate = input.nextLine().split(" ");
        int numRotate = Integer.parseInt(sizeAndNumRotate[1]);

        List<Integer> array = Arrays.stream(input.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(rotateLeft(numRotate, array));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        if (d == arr.size()) {
            return arr;
        }

        List<Integer> rotatedArr = new ArrayList<>();

        for (int i = d; i < arr.size(); i++) {
            rotatedArr.add(arr.get(i));
        }

        for (int i = 0; i < d; i++) {
            rotatedArr.add(arr.get(i));
        }

        return rotatedArr;
    }
}
