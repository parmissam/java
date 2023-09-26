package ir.ac.kntu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int board[][] = new int[n][n];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                board[x][y] = -1;
            }
        }
        board[0][0] = 0;
        int xMove[] = { 1, -2, -1, 2, -2, -1, 1, 2 };
        int yMove[] = { 2, 1, 2, 1, -1, -2, -2, -1 };
        if (!tour(n,0, 0, 1, board, xMove, yMove,board)) {
                System.out.println("Not Possible");
        } else {
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    System.out.print(board[x][y] + "\t");
                }
                System.out.println();
            }
        }
    }

    static boolean tour(int n, int x, int y, int move, int arr[][], int xMove[], int yMove[],int board[][]) {
        int nextX, nextY;
        if (move == n * n && (x==1 && y==2)|(x==2 && y==1)) {
            return true;
        }
        for (int k = 0; k < 8; k++) {
            nextX = x + xMove[k];
            nextY = y + yMove[k];
            if (nextX>=0 && nextX<n && nextY>=0 && nextY<n && arr[nextX][nextY]==-1) {
                arr[nextX][nextY] = move;
                if (tour(n, nextX, nextY, move + 1, arr, xMove, yMove,board)) {
                    return true;
                } else {
                    arr[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }
}