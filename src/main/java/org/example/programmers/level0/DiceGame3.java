package org.example.programmers.level0;

import java.util.*;

/**
 *
 * 문제 : 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 *
 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한 사항 :
 * a, b, c는 1이상 6이하의 정수입니다.
 *
 * 입출력 예시 :
 * a	b	c	d	result
 * 2	2	2	2	2222
 * 4	1	4	4	1681
 * 6	3	3	6	27
 * 2	5	2	6	30
 * 6	4	2	5	2
 *
 * !! 매우 풀기 싫었던 문제.. 배열을 정렬해서 쓰려는 의도까지는 맞았는데, 그걸 너무 복잡하게 쓴듯?
 *
 */
public class DiceGame3 {

    static DiceGame3 diceGame = new DiceGame3();

    public static void main(String[] args) {
        System.out.println(diceGame.solution1(2, 2, 2, 2));
        System.out.println(diceGame.solution1(4, 1, 4, 4));
        System.out.println(diceGame.solution1(6, 3, 3, 6));
        System.out.println(diceGame.solution1(2, 5, 2, 6));
        System.out.println(diceGame.solution1(6, 4, 2, 5));
    }

    // solution1
    private int solution1(int a, int b, int c, int d) {
        int answer = 0;

        int count = 0;
        int temp1 = 0;
        int temp2 = 0;

        List<Integer> numbers = Arrays.asList(a, b, c, d);
        Collections.sort(numbers);

        Set<Integer> intSet = new HashSet<>();
        Collections.addAll(intSet, a, b, c, d);

        List<Integer> intList = new ArrayList<>(intSet);
        Collections.sort(intList);

        int size = intSet.size();

        switch(size) {
            case 1 :
                answer = 1111 * a;
                break;
            case 2 :
                if (numbers.get(1) == numbers.get(2)) {
                    for (Integer element : intSet) {
                        count += Collections.frequency(numbers, element);
                        if (count == 1) {
                            temp1 = element;
                        } else {
                            temp2 = element;
                        }
                        count = 0;
                    }
                    answer = (int) Math.pow(10 * temp2 + temp1, 2);
                } else {
                    answer = Math.abs((intList.get(0) + intList.get(1)) * (intList.get(0) - intList.get(1)));
                }
                break;
            case 3 :
                for (Integer element : intSet) {
                    count += Collections.frequency(numbers, element);
                    if (count == 1) {
                        int temp = element;
                        if (answer == 0) {
                            answer = temp;
                        } else {
                            answer *= temp;
                        }
                    }
                    count = 0;
                }
                break;
            case 4 :
                answer = numbers.get(0);
                break;
        }

        System.out.println(solution2(a, b, c, d));
        return answer;
    }

    // solution2
    private int solution2(int a, int b, int c, int d) {
        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }

}
