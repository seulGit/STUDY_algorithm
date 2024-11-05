package org.example.programmers.level0;

import java.util.stream.IntStream;

import static org.example.utils.ExecutionTimeUtil.measureTime;

/**
 *
 * 문제 : 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
 * 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
 * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한 사항 :
 * 1 ≤ a ≤ 100
 * 1 ≤ d ≤ 100
 * 1 ≤ included의 길이 ≤ 100
 * included에는 true가 적어도 하나 존재합니다.
 *
 * 입출력 예시 :
 * a	d	included	                                        result
 * 3	4	[true, false, false, true, true]	                37
 * 7	1	[false, false, false, true, false, false, false]	10
 *
 * 입출력 설명 :
 * 입출력 예 #1
 *
 * 예제 1번은 a와 d가 각각 3, 4이고 included의 길이가 5입니다. 이를 표로 나타내면 다음과 같습니다.
 * ||1항|2항|3항|4항|5항|
 *
 * ||--|---|---|---|---|
 *
 * |등차수열|3|7|11|15|19|
 *
 * |included|true|false|false|true|true|
 *
 * 따라서 true에 해당하는 1항, 4항, 5항을 더한 3 + 15 + 19 = 37을 return 합니다.
 *
 *
 * 입출력 예 #2
 *
 * 예제 2번은 a와 d가 각각 7, 1이고 included의 길이가 7입니다. 이를 표로 나타내면 다음과 같습니다.
 * ||1항|2항|3항|4항|5항|6항|7항|
 *
 * |-|-|---|---|---|---|---|---|
 *
 * |등차수열|7|8|9|10|11|12|13|
 *
 * |included|false|false|false|true|false|false|false|
 *
 * 따라서 4항만 true이므로 10을 return 합니다.
 *
 * !! Stream 이 코드가 짧고 간지나지만, 제일 오래 걸림.
 * 등차수열의 연산 공식을 아는 것이 가장 좋다.
 *
 */
public class ArithmeticSequenceSum {

    static ArithmeticSequenceSum arithmeticSequenceSum = new ArithmeticSequenceSum();

    public static void main(String[] args) {
        measureTime(() -> {
            arithmeticSequenceSum.solution1(3, 4, new boolean[]{true, false, false, true, true});
        });

        measureTime(() -> {
            arithmeticSequenceSum.solution1_opt(3, 4, new boolean[]{true, false, false, true, true});
        });

        measureTime(() -> {
            arithmeticSequenceSum.solution2(3, 4, new boolean[]{true, false, false, true, true});
        });

        System.out.println("*****************************");
        System.out.println("");

        measureTime(() -> {
            arithmeticSequenceSum.solution1(7, 1, new boolean[]{false, false, false, true, false, false, false});
        });

        measureTime(() -> {
            arithmeticSequenceSum.solution1_opt(7, 1, new boolean[]{false, false, false, true, false, false, false});
        });

        measureTime(() -> {
            arithmeticSequenceSum.solution2(7, 1, new boolean[]{false, false, false, true, false, false, false});
        });
    }

    // solution1
    private void solution1(int a, int d, boolean[] included) {
        int answer = 0;

        int[] intArr = new int[included.length];

        for (int i = 0; i < included.length; i++) {
            intArr[i] = a + (d * i);
            answer += included[i] ? intArr[i] : 0;
        }

        System.out.println(answer);
    }

    // solution1 - optimized
    private void solution1_opt(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            answer += included[i] ? a + (d * i) : 0;
        }

        System.out.println(answer);
    }

    // solution2
    private void solution2(int a, int d, boolean[] included) {
        int answer = IntStream.range(0, included.length).map(i -> included[i] ? a + (d * i) : 0).sum();

        System.out.println(answer);
    }

}
