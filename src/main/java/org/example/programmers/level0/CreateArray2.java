package org.example.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * 문제 : 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return
 * 하는 solution 함수를 완성해 주세요.
 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 *
 * 제한 사항 :
 * 1 ≤ l ≤ r ≤ 1,000,000
 *
 * 입출력 예시 :
 * arr	            queries	                            result
 * [0, 1, 2, 4, 3]	[[0, 4, 1],[0, 3, 2],[0, 3, 3]]	    [3, 2, 4, 6, 4]
 *
 * 입출력 설명 :
 * 입출력 예 #1
 *
 * l	r	result
 * 5	555	[5, 50, 55, 500, 505, 550, 555]
 * 10	20	[-1]
 *
 * 5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터 5, 50, 55, 500, 505, 550, 555가 있습니다. 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.
 *
 */
public class CreateArray2 {

    static CreateArray2 createArray2 = new CreateArray2();

    public static void main(String[] args) {
        createArray2.solution1(5, 555);
        createArray2.solution1(10, 20);

        createArray2.solution2(5, 555);
        createArray2.solution2(10, 20);
    }

    // solution1
    private void solution1(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i%5==0) {
                String divisionQuotient = String.valueOf(i / 5);

                if (divisionQuotient.matches("[01]+")) {
                    result.add(i);
                }
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(answer));
    }

    // solution2
    private void solution2(int l, int r) {
        List<Integer> result = IntStream.rangeClosed(l, r)
                .filter(i -> i % 5 == 0 && String.valueOf(i).matches("[05]+"))
                .boxed()
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            result.add(-1);
        }

        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));
    }

}
