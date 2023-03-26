import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean paper[][] = new boolean[100][100];

        int result = 0;

        for (int i = 0; i < num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++){
                for (int k = y; k < y + 10; k++){
                    if (!paper[j][k]){
                        paper[j][k] = true;
                        result++;
                    }
                }
            }
        }

        System.out.println(result);

    }
}