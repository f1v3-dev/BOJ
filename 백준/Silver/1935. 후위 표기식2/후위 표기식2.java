import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String input = br.readLine();

        Stack<Double> stack = new Stack<>();
        Double [] arr = new Double[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (65 <= ch && ch <= 90) {
                stack.push(arr[ch - 65]);
            }

            else if (ch == '+') {
                double num2 = stack.pop();
                double num1 = stack.pop();
                stack.push(num1 + num2);

            } else if (ch == '-') {
                double num2 = stack.pop();
                double num1 = stack.pop();
                stack.push(num1 - num2);

            } else if (ch == '*') {
                double num2 = stack.pop();
                double num1 = stack.pop();
                stack.push(num1 * num2);

            } else if (ch == '/') {
                double num2 = stack.pop();
                double num1 = stack.pop();
                stack.push(num1 / num2);
            }
        }

        System.out.printf("%.2f", stack.pop());

    }
}