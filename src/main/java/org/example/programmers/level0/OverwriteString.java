package org.example.programmers.level0;

import org.example.utils.ExecutionTimeUtil;

import java.util.Arrays;

import static org.example.utils.ExecutionTimeUtil.*;

/**
 *
 * 문제 : 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한 사항 :
 * my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
 * 1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
 * 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
 *
 * 입출력 예시 :
 * my_string	        overwrite_string	s	result
 * "He11oWor1d"	        "lloWorl"	        2	"HelloWorld"
 * "Program29b8UYP"	    "merS123"	        7	"ProgrammerS123"
 *
 *
 * !! 테스트케이스 실행해보니... StringBuilder 사용한 방법이 성능이 월등히 높았다.  good!
 * solution3(char배열 사용), solution4(StringBuilder.replace() 사용) 가 성능이 좋다.
 */
public class OverwriteString {

    static OverwriteString overwriteString = new OverwriteString();

    public static void main(String[] args) {
        overwriteString.runSolution("He11oWor1d", "lloWorl", 2);
        overwriteString.runSolution("Program29b8UYP", "merS123", 7);
    }

    private void runSolution(String my_string, String overwrite_string, int s) {
        System.out.println("** TEST START **");

        System.out.println("StringBuilder append() 사용(내가 풀었던것) : ");
        measureTime(() -> {
            StringBuilder result1 = overwriteString.solution1(my_string, overwrite_string, s);
            System.out.println(result1);
        });

        System.out.println("String 사용(내가 풀었던것) : ");
        measureTime(() -> {
            String result2 = overwriteString.solution2(my_string, overwrite_string, s);
            System.out.println(result2);
        });

        System.out.println("char[] 사용 : ");
        measureTime(() -> {
            String result3 = overwriteString.solution3(my_string, overwrite_string, s);
            System.out.println(result3);
        });

        System.out.println("StringBuilder replace() 사용 : ");
        measureTime(() -> {
            StringBuilder result4 = overwriteString.solution4(my_string, overwrite_string, s);
            System.out.println(result4);
        });

        System.out.println("String 사용(더 나은 풀이) : ");
        measureTime(() -> {
            String result5 = overwriteString.solution5(my_string, overwrite_string, s);
            System.out.println(result5);
        });

        System.out.println("** TEST END **");
    }

    // solution1 : StringBuilder 사용
    private StringBuilder solution1(String my_string, String overwrite_string, int s) {

        StringBuilder sb = new StringBuilder();

        sb.append(my_string.substring(0, s));
        sb.append(overwrite_string);

        if (my_string.length() != sb.length()) {
            sb.append(my_string.substring(sb.length()));
        }

        return sb;
    }

    // solution2 : String 사용
    private String solution2(String my_string, String overwrite_string, int s) {

        String str1 = my_string.substring(0, s);

        String answer = str1 + overwrite_string;

        if (my_string.length() != answer.length()) {
            String str2 = my_string.substring(answer.length());
            answer += str2;
        }

        return answer;
    }

    // 추가 풀이
    // solution3 : char[] 배열 활용하기
    private String solution3(String my_string, String overwrite_string, int s) {

        char[] strArr = my_string.toCharArray();

        for (int i = s; i < s + overwrite_string.length(); i++) {
            strArr[i] = overwrite_string.charAt(i - s);
        }

        String answer = String.valueOf(strArr);

        return answer;
    }

    // solution4 : StringBuilder.replace 활용하기 (StringBuilder 생성자에서 바로 my_string 투입해보기.
    private StringBuilder solution4(String my_string, String overwrite_string, int s) {

        StringBuilder sb = new StringBuilder(my_string);

        sb.replace(s, s + overwrite_string.length(), overwrite_string);

        return sb;
    }

    // String after = my_string.substring(s + overwrite_string.length()) 이렇게 하면 조건식 필요없음
    private String solution5(String my_string, String overwrite_string, int s) {

        String pre = my_string.substring(0, s) + overwrite_string;
        String suf = my_string.substring(s + overwrite_string.length());

        return pre + suf;
    }
}
