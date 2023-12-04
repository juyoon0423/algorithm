package Programmers;

public class fivePeople {
    public static String[] solution(String[] names) {
        String[] answer = {};
        for (int i = 0; i < names.length; i++) {
            answer[i] = names[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        solution(names);
        for (String e : names) {
            System.out.println(e);
        }
    }
}
