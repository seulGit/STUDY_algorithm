package org.example.programmers.level0;

/**
 *
 * 문제 : 정수 배열 numLog가 주어집니다. 처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.
 *
 * "w" : 수에 1을 더한다.
 * "s" : 수에 1을 뺀다.
 * "d" : 수에 10을 더한다.
 * "a" : 수에 10을 뺀다.
 * 그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다. 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있습니다.
 *
 * 주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한 사항 :
 * 2 ≤ numLog의 길이 ≤ 100,000
 * -100,000 ≤ numLog[0] ≤ 100,000
 * 1 ≤ i ≤ numLog의 길이인 모든 i에 대해 |numLog[i] - numLog[i - 1]|의 값은 1 또는 10입니다.
 *
 * 입출력 예시 :
 * numLog	                                    result
 * [0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]	"wsdawsdassw"
 *
 * result인 "wsdawsdassw"를 따라 numLog[0]에서부터 시작해 조작을 하면 numLog의 값과 순서대로 일치합니다. 따라서 "wsdawsdassw"를 return 합니다.
 *
 * !! 수 조작하기 1 문제는 switch case 문으로 풀었어서 이번꺼는 그냥 삼항연산자로 쭉쭉 써봤다.
 *
 */
public class ManipulateNumbers {

    static ManipulateNumbers manipulateNumbers = new ManipulateNumbers();

    public static void main(String[] args) {
        manipulateNumbers.solution1(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1});
    }

    // solution1
    private void solution1(int[] numLog) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            sb.append((numLog[i] > numLog[i - 1]) ? ((numLog[i] - numLog[i - 1] == 1) ? "w" : "d") : ((numLog[i] - numLog[i - 1] == -1) ? "s" : "a"));
        }

        System.out.println(sb);
    }

}
