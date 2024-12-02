package org.example.programmers.level0;

import java.util.stream.Stream;

/**
 *
 * 문제 : 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
 * queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
 * my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 입출력 예시 :
 * my_string	    queries	                            result
 * "rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"
 *
 */
public class MultiReverse {

    static MultiReverse multiReverse = new MultiReverse();

    public static void main(String[] args) {
        multiReverse.solution1("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}});
    }

    // solution1
    private void solution1(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            String temp = sb.substring(s, e + 1);

            StringBuilder reversed = new StringBuilder(temp).reverse();

            sb.replace(s, e + 1, reversed.toString());
        }

        System.out.println(sb);
    }

}
