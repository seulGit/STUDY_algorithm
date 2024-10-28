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
         * fileNumber   = 1, 2, 3, 4, ....
         * launcher     = 1 : main / 2 : test
         */

        int site        = 'p';
        int fileNumber  = 1;
        int launcher    = 1;

        printSolution(site, fileNumber, launcher);
    }

    private static void printSolution(int site, int fileNumber, int launcher) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String str = "";


        if (site == 'b') {
            str = String.format("backjoon.Test%02d", fileNumber);
        } else if (site == 'p') {
            str = String.format("programmers.Test%02d", fileNumber);
        }

        Class<?> clazz = Class.forName("org.example." + str);
        clazz.getDeclaredConstructor(int.class).newInstance(launcher);
    }
}