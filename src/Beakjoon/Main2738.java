package Beakjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2738 {
    public static void main(String[] args) throws IOException {
        // 2738
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        // 각 행렬의 크기 정보 받기
        String matInfoString = reader.readLine();
        String[] matInfo = matInfoString.split(" ");
        int N = Integer.parseInt(matInfo[0]);
        int M = Integer.parseInt(matInfo[1]);

        // 행렬의 크기 정보를 바탕으로 새로운 행렬 만들고, 할당하기
        int[][] matrix = new int[N][M];
        // 2중 반복문을 수행하면서,
        for (int i = 0; i < N; i++) {
            // 각 줄을 입력받는다.
            String[] rowInfo = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                // i번 줄의 j번 칸에 rowInfo[j]를 정수로 할당한다.
                matrix[i][j] = Integer.parseInt(rowInfo[j]);
            }
        }

        // 1. 다른 2차원 배열을 만들어 할당 뒤 연산
        // 2. 입력을 받으며 바로 연산
        for (int i = 0; i < N; i++) {
            // 반대 행렬 줄을 입력받는다.
            String[] rowInfo = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                // matrix[i][j]에 rowInfo[j]를 더해준다.
                matrix[i][j] += Integer.parseInt(rowInfo[j]);


                // <Scanner 사용해서 푸는 방법>
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        int[][] arr1 = new int[N][M];
//        int[][] arr2 = new int[N][M];
//        int[][] result = new int[N][M];
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                arr2[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                result[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println(" ");
        }
            }
        }
    }

