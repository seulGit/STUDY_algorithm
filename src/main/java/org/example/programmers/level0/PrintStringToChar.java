package org.example.programmers.level0;

/**
 * 문제 : 문자열 str이 주어집니다.
 * 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
 *
 * 입력 예시 :
 * abcde
 *
 * 출력 예시 :
 * a
 * b
 * c
 * d
 * e
 *
 */
public class PrintStringToChar {

    public static void main(String[] args) {
        PrintStringToChar printStringToChar = new PrintStringToChar();
        printStringToChar.solution();
    }

    private void solution() {
        String str = "abcde";

        //solution01
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }

        //solution02
        for (String s : str.split("")) {
            System.out.println(s);
        }

        //solution03
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
