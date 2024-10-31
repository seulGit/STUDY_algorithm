package org.example.programmers.level0;

import java.util.Random;

/**
 * 문제 : 주어진 코드는 변수에 데이터를 저장하고 출력하는 코드입니다.
 * 아래와 같이 출력되도록 빈칸을 채워 코드를 완성해 주세요.
 *
 * 출력 예시 :
 * 3
 * 2
 * 1
 * Let's go!
 *
 */
public class PrintString {

    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.solution();
    }

    private void solution() {
        String message = "Let's go!";

        System.out.println("3\n2\n1");
        System.out.println(message);
    }
}