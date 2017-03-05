package com.grouk.task4_1.factory;

import java.util.Random;

import static com.grouk.task4_1.util.MazeState.K;
import static com.grouk.task4_1.util.MazeState.N;

/**
 * Created by Alena on 05.03.2017.
 */
public class MazeMatrixFactory {
    private final static Random random = new Random();

    public static int[][] createMazeMatrix() {
        int[][] matrix = createMatrix();

        boolean needCheckStart = true;
        while (needCheckStart) {
            needCheckStart = !checkStart(matrix[0]);
            if (needCheckStart) {
                createDoor(matrix, 0);
            }
        }

        boolean needCheckEnd = true;
        while (needCheckEnd) {
            needCheckEnd = !checkEnd(matrix);
            if (needCheckEnd) {
                correct(K - 1, matrix);
            }
        }

        boolean needCheck = true;
        while (needCheck) {
            needCheck = checkMatrix(matrix);
            prepareMatrix(matrix);
        }

        compliteMatrix(matrix);

        printMatrix(matrix);
        return matrix;
    }

    private static void compliteMatrix(int[][] x) {
        for (int i = 0; i < K; i++) {
            int j = i + 1;
            if (j % N != 0 && x[i][j] == 0) {
                x[i][j] = -1;
            }
            j = i + N;
            if (j < K && x[i][j] == 0) {
                x[i][j] = -1;
            }
        }
    }

    private static void prepareMatrix(int[][] matrix) {
        for (int i = 0; i < K; i++) {
            for (int j = i + 1; j < K; j++) {
                if (matrix[i][j] > 0) {
                    matrix[i][j] = 1;
                }
            }
        }
    }


    private static boolean checkEnd(int[][] x) {
        for (int i = 0; i < K; i++) {
            if (x[i][K - 1] > 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkStart(int[] x0) {
        for (int j = 0; j < K; j++) {
            if (x0[j] > 0) {
                return true;
            }
        }
        return false;
    }

    private static void printMatrix(int[][] x) {
        System.out.println("Matrix:");
        for (int i = 0; i < K; i++) {
            System.out.print("[ ");
            for (int j = 0; j < K; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(x[i][j] + " ");
                }
            }
            System.out.println("]");
        }

        for (int i = 0; i < K; i++) {
            System.out.print(i + " [ ");
            for (int j = i; j < K; j++) {
                if (x[i][j] > 0) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println(" ] ");
        }
    }

    private static boolean checkMatrix(int[][] x) {
        int start = 0;
        check(start, x);
        return correctMatrix(x);
    }


    private static boolean correctMatrix(int[][] x) {
        for (int i = 0; i < K; i++) {
            for (int j = i + 1; j < K; j++) {
                if (x[i][j] == 1) {
                    correct(i, x);
                    correct(j, x);
                    return true;
                }
            }
        }
        return false;
    }

    private static void correct(int i, int[][] x) {
        if (i > 0) {
            if (i - N >= 0) {
                x[i - N][i] = 1;
            } else if (i % N > 0) {
                x[i - 1][i] = 1;
            }
        }
    }

    private static void check(int i, int[][] x) {
        for (int j = i; j < K; j++) {
            if (x[i][j] == 1) {
                x[i][j]++;
                check(j, x);
            }
        }
    }

    private static int[][] createMatrix() {
        int[][] x = new int[K][K];

        for (int i = 0; i < K - 1; i++) {
            createDoor(x, i);
        }
        return x;
    }

    private static void createDoor(int[][] x, int i) {
        if (hasDoor() && (i + 1) % N != 0) {
            x[i][i + 1] = 1;
        }
        if (hasDoor() && (i + N < K)) {
            x[i][i + N] = 1;
        }
    }

    private static boolean hasDoor() {
        return random.nextBoolean();
    }
}
