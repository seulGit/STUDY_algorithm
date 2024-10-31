package org.example.programmers.level0;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * 문제 : 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
 * 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 *
 * 입력 예시 :
 * aBcDeFg
 *
 * 출력 예시 :
 * AbCdEfG
 *
 */
public class PrintStringReversedCase {

    public static void main(String[] args) {
        PrintStringReversedCase printStringReversedCase = new PrintStringReversedCase();
        printStringReversedCase.solution();
    }

    private void solution() {
        String str = "aBcDeFg";

        StringBuilder answer = new StringBuilder();

        // solution01
        /*
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            }
        }
        */

        // solution02
        for (char temp : str.toCharArray()) {
            if (Character.isUpperCase(temp)) {
                answer.append(Character.toLowerCase(temp));
            } else if (Character.isLowerCase(temp)) {
                answer.append(Character.toUpperCase(temp));
            }
        }

        System.out.println(answer);
    }
}
