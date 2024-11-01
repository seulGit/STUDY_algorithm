package org.example.utils;

public class ExecutionTimeUtil {

    public static void measureTime(Runnable task) {
        long startTimeNano = System.nanoTime();
        long startTimeMillis = System.currentTimeMillis();

        task.run();

        long endTimeNano = System.nanoTime();
        long endTimeMillis = System.currentTimeMillis();

        System.out.println("=================Execution Time=================");
        System.out.println("Execution Nano time: " + (endTimeNano - startTimeNano));
        System.out.println("Execution Millis time: " + (double) (endTimeMillis - startTimeMillis));
        System.out.println("=================================================");
        System.out.printf("\n");
    }
}
