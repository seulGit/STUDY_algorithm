package org.example.programmers.level0;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * 문제 : boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
 *
 * (x1 ∨ x2) ∧ (x3 ∨ x4)
 *
 * 입출력 예시 :
 * x1	    x2	    x3	    x4	    result
 * false	true	true	true	true
 * true	    false	false	false	false
 *
 * !! && : 두 조건이 모두 true일 때만 true. false && false = false
 * !! || : 두 조건 중 하나라도 true면 true. false || false = false
 *
 */
public class SimpleLogicalOperation {

    static SimpleLogicalOperation simpleLogicalOperation = new SimpleLogicalOperation();

    public static void main(String[] args) {
        System.out.println(simpleLogicalOperation.solution1(false, true, true, true));
        System.out.println(simpleLogicalOperation.solution1(true, false, false, false));
    }

    // solution1
    private boolean solution1(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean x12 = x1 || x2;
        boolean x34 = x3 || x4;

        boolean answer = true;

        return (x12 && x34) ? answer : !answer;
    }

}
