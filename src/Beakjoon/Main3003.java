package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BOJ 문제풀이 템플릿
public class Main3003 {
    public static void main(String[] args) throws IOException {
        // 어떤 입력에 대하여 버퍼링 기능 제공
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        // readLine()을 통해 한줄 입력 받기
        String input = reader.readLine();

        // 주어진 인자를 (정규 표현식으로 활용해서) 기준으로 삼아
        // 문자열을 나눈 배열로 반환한다.
        String[] splitString = input.split(" ");
        /*
        for (String split : splitString) {
            System.out.println(split);
        }
         */

        // 3033 문제 풀어보기
        // 1. 기준 (검은색)체스의 갯수 배열 선언
        int[] orignal = {1, 1, 2, 2, 2, 8};

        // 2. 결과 배열 생성
        int[] result = new int[6];

        // 3. 기준의 체스 갯수에서 흰색 갯수 빼기
        for (int i = 0; i < splitString.length; i++) {
            // splitString은 String 배열이기 때문에 인트형으로 형변환
            result[i] = orignal[i] - Integer.parseInt(splitString[i]);
        }

        // 4. 결과 출력
        for (int resultArr : result) {
            System.out.print(resultArr + " ");
        }
    }
}
