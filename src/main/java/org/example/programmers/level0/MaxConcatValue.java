package org.example.programmers.level0;

import java.sql.SQLOutput;

/**
 *
 * 문제 : 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
 *
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
 * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 *
 * 제한 사항 :
 * 1 ≤ a, b < 10,000
 *
 * 입출력 예시 :
 * a	b	result
 * 9	91	991
 * 89	8	898
 *
 *
 */
public class MaxConcatValue {

    static MaxConcatValue maxConcatValue = new MaxConcatValue();

    public static void main(String[] args) {
        maxConcatValue.solution1(3, 85);
        maxConcatValue.solution1(9, 23);
        maxConcatValue.solution2(3, 85);
    }

    // solution1
    private void solution1(int a, int b) {

        int answer = 0;

        // + 연산자가 문자열과 숫자(또는 다른 타입)를 만날 때 자동으로 숫자를 문자열로 변환하여 이어 붙인다!
        int ab = Integer.parseInt(String.valueOf(a) + b);
        int ba = Integer.parseInt(String.valueOf(b) + a);

        if (ab > ba) {
            answer = ab;
        } else {
            answer = ba;
        }

        System.out.println(answer);
    }

    // solution2
    private void solution2(int a, int b) {

        int answer = Math.max(Integer.parseInt(a+""+b), Integer.parseInt(b+""+a));

        System.out.println(answer);
    }

}
