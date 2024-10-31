package org.example.programmers.level0;

/**
 *
 * 문제 : 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
 * a + b = c
 *
 * 입력 예시 :
 * 4 5
 *
 * 출력 예시 :
 * 4 + 5 = 9
 *
 */
public class PrintIntSum {

    public static void main(String[] args) {
        PrintIntSum printIntSum = new PrintIntSum();
        printIntSum.solution();
    }

    private void solution() {
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        System.out.printf("%d + %d = %d", a, b, a+b);
    }
}
