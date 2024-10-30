package org.example.programmers;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    /**
     * 문제 1 : 주어진 코드는 변수에 데이터를 저장하고 출력하는 코드입니다.
     * 아래와 같이 출력되도록 빈칸을 채워 코드를 완성해 주세요.
     *
     * 출력 예시 :
     * 3
     * 2
     * 1
     * Let's go!
     *
     * ===============================================================
     *
     * 문제 2 : 정수 a와 b가 주어집니다.
     * 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
     *
     * 입력 예시 :
     * 4 5
     *
     * 출력 예시 :
     * a = 4
     * b = 5
     *
     */
    public Test01(int launcher) {

        switch (launcher) {
            case 1 :
                String message = "Let's go!";

                System.out.println("3\n2\n1");
                System.out.println(message);
                break;

            case 2 :
                int a = 4;
                int b = 5;

                System.out.println("a = " + a + "\n" + "b = " + b);
                System.out.printf("a = " + a + "%nb = " + b);
                System.out.println("");
                System.out.printf("a = " + a + "%n" + "b = " + b);
                System.out.println("");
                System.out.printf("a = %d%nb = %d", a, b);
                break;
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

            case 3:
                String str = "string";

                // 입력값을 위한 난수생성 방법01
//                int repeatCount = (int) (Math.random() * 10) + 1;

                // 입력값을 위한 난수생성 방법02
                Random random = new Random();
                int repeatCount = random.nextInt(10)+1;

                System.out.println(str.repeat(repeatCount));

                break;

            default:
                System.out.print("case 확인하세요.");
                break;
        }

    }
}
