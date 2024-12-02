package org.example.programmers.level0;

import java.util.stream.Stream;

/**
 *
 * 문제 : 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
 * 이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
 *
 * 입출력 예시 :
 * number	                result
 * "123"	                6
 * "78720646226947352489"	2
 *
 */
public class RemainderOfNine {

    static RemainderOfNine remainderOfNine = new RemainderOfNine();

    public static void main(String[] args) {
        remainderOfNine.solution1("123");
        remainderOfNine.solution1("78720646226947352489");
    }

    // solution1
    private void solution1(String number) {
        int answer = Stream.of(number.split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(answer % 9);
    }

}
