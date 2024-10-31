package org.example;

import java.lang.reflect.InvocationTargetException;

/**
 * (참고 출처 :
 * https://velog.io/@zhyun/%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8%EC%9A%A9-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%ED%85%9C%ED%94%8C%EB%A6%BF)
 *
 *
 * Index
 *
 * site 0 : backjoon
 * 01.
 * 02.
 *
 * site 1 : programmers
 * 01.
 * 02.
 *
 *
 *
 *
 *
 */

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        /**
         * site         = b : backjoon / p : programmers
         * levelNumber  = 0, 1, 2, ....
         * fileNumber   = 1, 2, 3, ....
         * launcher     = 1 : main / 2 : test
         */

        int site        = 'p';
        int levelNumber = 0;
        int fileNumber  = 1;
        int launcher    = 3;

        printSolution(site, levelNumber, fileNumber, launcher);
    }

    private static void printSolution(int site, int levelNumber, int fileNumber, int launcher) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        StringBuilder temp = new StringBuilder();

        // 백준 or 프로그래머스 구분
        if (site == 'b') {
            temp.append("backjoon");
        } else if (site == 'p') {
            temp.append("programmers");
        }

        // 클래스 경로 조합
        temp.append(String.format(".level%d.Test%02d", levelNumber, fileNumber));

        try {
            Class<?> clazz = Class.forName("org.example." + temp);
            clazz.getDeclaredConstructor(int.class).newInstance(launcher);
        } catch (Exception e) {
            System.out.println("존재하지 않는 클래스입니다. 설정값을 확인하세요!");
        }
    }
}