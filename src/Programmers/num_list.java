package Programmers;

public class num_list {
    public static String solution(int[] num_list) {
        int plus = 0;
        int plusAndX = 0;
        int X = 1;
        for (int i = 0; i < num_list.length; i++) {
            X *= num_list[i];
            plus += num_list[i];
        }
        plusAndX = plus * 2;

        if (X > plusAndX) {
            return "1";
        } else {
            return "0";
        }
    }

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list2));
    }
}
