package org.example.programmers;

import java.util.Scanner;

public class Test02 {

    /**
     *
     * 문제 : 정수 a와 b가 주어집니다.
     * 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
     *
     *
     * 입력 예시 :
     * 4 5
     *
     *
     * 출력 예시 :
     * a = 4
     * b = 5
     *
     */
    public Test02(int launcher) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        /**
         printf() 는 특정 포맷팅에 맞춰 출력할 수 있다.
         함께 쓰는 주요 포맷 지정자 :
         %d = 10진수 정수
         %f = 소수점 포함 부동 소수점 숫자
         %s = 문자열
         %c = 문자
         %b = 불리언 값
         %x = 16진수 정수
         %o = 8진수 정수

         \n 은 println() 에서 쓰면 되는데 os환경에 따라 의도와는 다른 개행이 될 수 있다고 함.
         */

        System.out.println("a = " + a + "\n" + "b = " + b);
        System.out.printf("a = " + a + "%nb = " + b);
        System.out.printf("a = " + a + "%n" + "b = " + b);
        System.out.printf("a = %d%nb = %d", a, b);
    }
}
