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
        maxConcatValue.solution2(3, 85);
    }

    // solution1
    private void solution1(int a, int b) {

        int answer = 0;

        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

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
