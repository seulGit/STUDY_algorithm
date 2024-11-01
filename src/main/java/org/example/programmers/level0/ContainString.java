package org.example.programmers.level0;

/**
 *
 * 문제 : 어떤 문자열 A가 다른 문자열 B안에 속하면 A를 B의 부분 문자열이라고 합니다. 예를 들어 문자열 "abc"는 문자열 "aabcc"의 부분 문자열입니다.
 * 문자열 str1과 str2가 주어질 때, str1이 str2의 부분 문자열이라면 1을 부분 문자열이 아니라면 0을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한 사항 :
 * 1 ≤ str1 ≤ str2 ≤ 20
 * str1과 str2는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예시 :
 * str1	    str2	    result
 * "abc"	"aabcc"	    1
 * "tbt"	"tbbttb"	0
 *
 */
public class ContainString {

    static ContainString containString = new ContainString();

    public static void main(String[] args) {
        containString.solution1("abc", "aabcc");
        containString.solution1("tbt", "tbbtt");
    }

    // solution1
    private void solution1(String str1, String str2) {

        int answer = (str2.contains(str1) ? 1 : 0);

        System.out.println(answer);
    }

}
