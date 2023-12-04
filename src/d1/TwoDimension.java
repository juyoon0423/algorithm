package d1;

public class TwoDimension {
    public static void deltaSearch() {
        // 0은 공원, 1은 장애물
        int[][] park = new int[][]{
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };
        int y = 0;
        int x = 0;
        String[] routes = new String[] {
                "N 1",
                "E 2",
                "S 2",
                "W 2"
        };
        String[] route = routes[0].split(" ");
        // 방향과 크기를 나누어 저장한다
        String direction = routes[0];
        int distance = Integer.parseInt(route[1]);
        // 주어진 정보를 바탕으로 y와 x를 조작한다.

        switch (direction) {
            case "N":
                y -= distance;
                break;
                // 다른 case도 넣어줘야한다.
        }

        int[][] deltas = new int[][] {
                // N 방향으로 갈때 좌표 변경
                {-1, 0},
                // S 방향으로 갈때 좌표 변경
                {1, 0},
                // W 방향으로 갈때 좌표 변경
                {0, -1},
                // E 방향으로 갈때 좌표 변경
                {0, 1}
        };


    }
    public static void main(String[] args) {
        // 3 * 3 크기의 배열을 만든다.
        int[][] tdArray = new int[3][3];
        // tdArray[i]는 toArray의 i번 줄
//        int[] tdArrayRow = tdArray[1];
//        System.out.println(tdArrayRow[0]);
//        System.out.println(tdArrayRow[1]);
//        System.out.println(tdArrayRow[2]);

//        System.out.println(tdArray[1][0]);
        // 1부터 9까지 오른쪽 그림대로 tdArray에 값 할당
        int sum = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // i가 행, j가 열 (i가 줄, j가 칸)
                tdArray[i][j] = sum;
                sum++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tdArray[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
