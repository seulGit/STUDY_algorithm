package org.example.programmers.level0;

import java.util.stream.IntStream;

/**
 *
 * 문제 : 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
 *
 * 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
 * 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
 * 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
 * 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한 사항 :
 * a, b, c는 1이상 6이하의 정수입니다.
 *
 * 입출력 예시 :
 * a	b	c	result
 * 2	6	1	9
 * 5	3	3	473
 * 4	4	4	110592
 *
 * 입출력 설명 :
 * 예제 1번에서 세 주사위 숫자가 모두 다르므로 2 + 6 + 1 = 9점을 얻습니다.
 * 따라서 9를 return 합니다.
 *
 *
 * 입출력 예 #2
 *
 * 예제 2번에서 두 주사위 숫자만 같으므로 (5 + 3 + 3) × (5² + 3² + 3² ) = 11 × 43 = 473점을 얻습니다.
 * 따라서 473을 return 합니다.
 *
 *
 * 입출력 예 #3
 *
 * 예제 3번에서 세 주사위 숫자가 모두 같으므로 (4 + 4 + 4) × (4² + 4² + 4² ) × (4³ + 4³ + 4³ ) = 12 × 48 × 192 = 110,592점을 얻습니다.
 * 따라서 110592를 return 합니다.
 *
 * !! solution2가 수학적 논리에 더 맞다 !!! 둘다 어쩌다보니 주사위의 조건이 있어서 답은 될 수 있음.
 *
 */
public class DiceGame {

    static DiceGame diceGame = new DiceGame();

    public static void main(String[] args) {
        diceGame.solution1(2, 6,1);
        diceGame.solution1(5, 3, 3);
        diceGame.solution1(4, 4, 4);
    }

    // solution1
    private void solution1(int a, int b, int c) {
        int answer = 1;

        int count = 1;

        if ((a == b) && (a == c)) {
            count++;
        }

        if ((a == b) || (a == c) || (b == c)) {
            count++;
        }

        for (int i = 0; i < count; i++) {
            answer *= (pow1(a, i) + pow1(b, i) + pow1(c, i));
        }

        System.out.println(answer);
    }

    private int pow1(int diceNum, int exponent) {
        if (exponent == 0) {
            return diceNum;
        }

        return diceNum * pow1(diceNum, exponent - 1);
    }


    // solution2
    private void solution2(int a, int b, int c) {
        int answer = 1;

        int count = 1;

        if ((a == b) && (a == c)) {
            count++;
        }

        if ((a == b) || (a == c) || (b == c)) {
            count++;
        }

        for (int i = 0; i < count; i++) {
            answer *= (pow2(a, i) + pow2(b, i) + pow2(c, i));
        }

        System.out.println(answer);
    }

    private int pow2(int diceNum, int exponent) {
        if (exponent == 0) {
            return diceNum;
        }

        return diceNum * pow2(diceNum, exponent - 1);
    }


}
