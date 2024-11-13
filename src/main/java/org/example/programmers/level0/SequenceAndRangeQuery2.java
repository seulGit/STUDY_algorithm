package org.example.programmers.level0;

import java.util.Arrays;

/**
 *
 * 문제 : 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
 *
 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
 *
 * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
 * 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
 *
 * 제한 사항 :
 * 1 ≤ arr의 길이 ≤ 1,000
 * 0 ≤ arr의 원소 ≤ 1,000,000
 * 1 ≤ queries의 길이 ≤ 1,000
 * 0 ≤ s ≤ e < arr의 길이
 * 0 ≤ k ≤ 1,000,000
 *
 * 입출력 예시 :
 *
 *  arr	            queries	                            result
 * [0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	    [3, 4, -1]
 *
 * 첫 번째 쿼리의 범위에는 0, 1, 2, 4, 3이 있으며 이 중 2보다 크면서 가장 작은 값은 3입니다.
 * 두 번째 쿼리의 범위에는 0, 1, 2, 4가 있으며 이 중 2보다 크면서 가장 작은 값은 4입니다.
 * 세 번째 쿼리의 범위에는 0, 1, 2가 있으며 여기에는 2보다 큰 값이 없습니다.
 * 따라서 [3, 4, -1]을 return 합니다.
 *
 * solution1로 열심히 풀었고,
 * solution2 는 다른 사람의 풀이인데, 생각해낸 로직이 신기해서 가져왔다.
 *
 *
 */
public class SequenceAndRangeQuery2 {

    static SequenceAndRangeQuery2 sequenceAndRangeQuery2 = new SequenceAndRangeQuery2();

    public static void main(String[] args) {
        sequenceAndRangeQuery2.solution1(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}});
        sequenceAndRangeQuery2.solution2(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}});
    }

    // solution1
    private void solution1(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];

            int s = query[0];
            int e = query[1];
            int k = query[2];

            int[] newArr = Arrays.copyOfRange(arr, s, e + 1);

            answer[i] = Arrays.stream(newArr).filter(j-> j > k).min().orElse(-1);
        }

        System.out.println(Arrays.toString(answer));
    }

    // solution2
    private void solution2(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];
        // 일단 -1로 쫙 초기화해두고
        Arrays.fill(answer, -1);

        for (int idx = 0; idx < queries.length; idx++) {
            int[] query = queries[idx];
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    // -1로 초기화해뒀던 배열을 돌면서 아직 -1 일떈 큰수를 일단 넣고,
                    // -1이 아닐땐 먼저 들어간 큰수와 현재 턴의 수를 비교해서 작은 수를 넣는다.
                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }

}
