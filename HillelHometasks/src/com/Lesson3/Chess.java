package com.Lesson3;

public class Chess {
    public static void main(String[] args) {
        char[][] chess = new char[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                if ((i + j) % 2 == 0) { // четные - белые
                    chess[i][j] = 'W';
                } else {  // нечетные - белые
                    chess[i][j] = 'B';
                }
                System.out.print(chess[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
