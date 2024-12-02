package org.example.programmers.level0;

/**
 *
 * 문제 : 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
 * my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 입출력 예시 :
 * my_string	        index_list	                                result
 * "cvsgiorszzzmrpaqpe"	[16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
 * "zpiaz"	            [1, 2, 0, 0, 3]	                            "pizza"
 *
 */
public class StringWithIndexArray {

    static StringWithIndexArray stringWithIndexArray = new StringWithIndexArray();

    public static void main(String[] args) {
        stringWithIndexArray.solution1("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7});
        stringWithIndexArray.solution1("zpiaz", new int[]{1, 2, 0, 0, 3});
    }

    // solution1
    private void solution1(String my_string, int[] index_list) {

        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < index_list.length; i++) {
            answer.append(my_string.charAt(index_list[i]));
        }

        System.out.println(answer);
    }

}
