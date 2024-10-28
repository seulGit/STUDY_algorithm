package org.example;

import java.lang.reflect.InvocationTargetException;

/**
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