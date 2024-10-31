package org.example.programmers.level0;

import java.util.Random;

/**
 *
 * 문제 : 문자열 str과 정수 n이 주어집니다.
 * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
 *
 * 입력 예시 :
 * string 5
 *
 * 출력 예시 :
 * stringstringstringstringstring
 *
 */
public class PrintRepeatedString {

    // 확장가능성이나 재사용성 없으므로 간결하게 코드 작성

    public static void main(String[] args) {
        PrintRepeatedString printRepeatedString = new PrintRepeatedString();
        printRepeatedString.solution();
    }

    private void solution() {
        String str = "string";

        // 입력값을 위한 난수생성 방법01
        // int repeatCount = (int) (Math.random() * 10) + 1;

        // 입력값을 위한 난수생성 방법02
        Random random = new Random();
        int repeatCount = random.nextInt(10)+1;

        System.out.println(str.repeat(repeatCount));
    }
}
