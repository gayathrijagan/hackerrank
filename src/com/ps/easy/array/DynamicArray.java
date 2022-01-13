package com.ps.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DynamicArray {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] nAndSize = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nAndSize[0]);
        int size = Integer.parseInt(nAndSize[1]);
        List<List<Integer>> queries = new ArrayList<>();
        for(int i = 0; i<size; i++) {
            queries.add(Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList()));
        }
        List<Integer> result = dynamicArray(n, queries);
        System.out.println(result);
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> result = new ArrayList<>(n);
        for (int i = 0; i<n; i++) {
            result.add(new ArrayList<>());
        }

        int lastAnswer = 0;
        List<Integer> answers = new ArrayList<>();
        for(List<Integer> query: queries) {
            int idx = (query.get(1) ^ lastAnswer) % n;
            if (query.get(0) == 1) {
                result.get(idx).add(query.get(2));
            } else {
                int nestedIdx = query.get(2) % result.get(idx).size();
                lastAnswer = result.get(idx).get(nestedIdx);
                answers.add(lastAnswer);
            }
        }

        return answers;
    }

}
