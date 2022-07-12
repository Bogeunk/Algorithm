import java.util.*;

public class star {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        arr = new char[N][N];

        star(0, 0, N, false);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    static void star(int x, int y, int N, boolean blank){
        if(blank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (N == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = N / 3;
        int count = 0;
        for (int i = x; i < x + N; i += size){
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count == 5) {
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}
    /*
    N=27일때 한 블록의 사이즈는 9이고,
    N= 9일때 한 블록의 사이즈는 3이고,
    해당 블록의 한칸을 담을 변수를 의미하는 size를 선언
    count는 별 출력 누적을 의미
    */

