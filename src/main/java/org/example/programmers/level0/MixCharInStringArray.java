package org.example.programmers.level0;

/**
 *
 * 문제 : 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다.
 * parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다.
 * 각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 입출력 예시 :
 * my_strings	                                            parts	                            result
 * ["progressive", "hamburger", "hammer", "ahocorasick"]	[[0, 4], [1, 2], [3, 5], [7, 7]]	"programmers"
 *
 */
public class MixCharInStringArray {

    static MixCharInStringArray mixCharInStringArray = new MixCharInStringArray();

    public static void main(String[] args) {
        System.out.println(mixCharInStringArray.solution1(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"},
        new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
        System.out.println(mixCharInStringArray.solution2(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"},
                new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }

    // solution1
    private String solution1(String[] my_strings, int[][] parts) {
        String answer = "";
        int idx = 0;
        for (int[] part : parts) {
            int s = part[0];
            int e = part[1];

            StringBuilder sb = new StringBuilder(my_strings[idx]);
            idx++;

            answer += sb.substring(s, e + 1).toString();
        }
        return answer;
    }

    // solution2
    private String solution2(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < parts.length; i++) {
            StringBuilder sb = new StringBuilder(my_strings[i].substring(parts[i][0], parts[i][1] + 1).toString());
            answer += sb;
        }

        return answer;
    }

}
