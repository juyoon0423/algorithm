package Programmers;

public class Prefix {
    public static int solution(String my_string, String is_prefix) {
        /*
        startsWith(): 어떤 문자열이 특정 문자로 시작하는지
        확인하여 결과를 true 혹은 false로 반환
        String.startsWith()
         */
        int answer = 0;

        if (my_string.startsWith(is_prefix)){
                answer = 1;
            } else {
                answer = 0;
            }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana", "bananann"));
    }
}
