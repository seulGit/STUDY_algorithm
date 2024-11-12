package org.example.programmers.level0;

import java.util.Arrays;

/**
 *
 * 문제 : 정수 리스트 num_list가 주어질 때,
 * 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
 * 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을
 * 추가하여 return하도록 solution 함수를 완성해주세요.
 *
 * 제한 사항 :
 * 2 ≤ num_list의 길이 ≤ 10
 * 1 ≤ num_list의 원소 ≤ 9
 *
 * 입출력 예시 :
 * num_list	        result
 * [2, 1, 6]	    [2, 1, 6, 5]
 * [5, 2, 1, 7, 5]	[5, 2, 1, 7, 5, 10]
 *
 * 입출력 설명 :
 * 입출력 예 #1
 * 마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return합니다.
 *
 * 입출력 예 #2
 * 마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return합니다.
 *
 *
 */
public class LastTwoElements {

    static LastTwoElements lastTwoElements = new LastTwoElements();

    public static void main(String[] args) {
        lastTwoElements.solution1(new int[]{2, 1, 6});
        lastTwoElements.solution1(new int[]{5, 2, 1, 7, 5});
    }

    // solution1
    private void solution1(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int last = num_list.length - 1;

        for (int i = 0; i < answer.length -1; i++) {
            answer[i] = num_list[i];
        }

        int cal = num_list[last] - num_list[last - 1];

        if (cal > 0) {
            answer[num_list.length] = cal;
        } else {
            answer[num_list.length] = num_list[last] * 2;
        }

        System.out.println(Arrays.toString(answer));
    }

}
