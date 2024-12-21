package org.example.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * 문제 : 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
 *
 * 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
 * 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 입출력 예시 :
 * intStrs	                                    k	    s	l	result
 * ["0123456789","9876543210","9999999999999"]	50000	5	5	[56789, 99999]
 *
 * 입출력 설명 :
 * 입출력 예 #1
 *
 * idx	잘라낸 문자열	ret
 * 0	"56789"	[56789]
 * 1	"43210"	[56789]
 * 2	"99999"	[56789, 99999]
 *
 */
public class CreateArray5 {

    static CreateArray5 createArray5 = new CreateArray5();

    public static void main(String[] args) {

        String[] intStrs = {"0123456789","9876543210","9999999999999"};

        System.out.println(Arrays.toString(createArray5.solution1(intStrs, 50000, 5, 5)));
    }

    // solution1
    private int[] solution1(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answerList = new ArrayList<>();

        int a = 0;
        int lastIdx = s + l;

        for (String intStr : intStrs) {
            if (intStr.length() == lastIdx) {
                a = Integer.parseInt(intStr.substring(s));
            } else {
                //lastIdx += 1;
                a = Integer.parseInt(intStr.substring(s, lastIdx));
            }

            if(a > k) {
                answerList.add(a);
            }
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

}
