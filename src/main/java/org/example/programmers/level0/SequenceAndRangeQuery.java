package org.example.programmers.level0;

import java.util.Arrays;

/**
 *
 * 문제 : 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
 *
 * 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
 *
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한 사항 :
 * 1 ≤ arr의 길이 ≤ 1,000
 * 0 ≤ arr의 원소 ≤ 1,000,000
 * 1 ≤ queries의 길이 ≤ 1,000
 * 0 ≤ i < j < arr의 길이
 *
 * 입출력 예시 :
 *
 * arr	            queries	                result
 * [0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2]
 *
 * 각 쿼리에 따라 arr가 다음과 같이 변합니다.
 *
 * arr
 * [0, 1, 2, 3, 4]
 * [3, 1, 2, 0, 4]
 * [3, 2, 1, 0, 4]
 * [3, 4, 1, 0, 2]
 *
 * 따라서 [3, 4, 1, 0, 2]를 return 합니다.
 *
 * !! 너무 어렵게 생각하고있었다.. 2차원 배열이라는 문제의 의도를 파악해야했다!!
 */
public class SequenceAndRangeQuery {

    static SequenceAndRangeQuery sequenceAndRangeQuery = new SequenceAndRangeQuery();

    public static void main(String[] args) {
        sequenceAndRangeQuery.solution1(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}});
    }

    // solution1
    private void solution1(int[] arr, int[][] queries) {

        int temp;

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}
