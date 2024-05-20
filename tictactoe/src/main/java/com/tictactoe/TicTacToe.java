package com.tictactoe;

public class TicTacToe {
  protected static final int X = 1, O = -1;
  protected static final int EMPTY = 0;
  protected int board[][] = new int[3][3];
  protected int player;

  public TicTacToe() {
    clearBoard();
  }

  public void clearBoard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = EMPTY;
      }
    }
    player = X;
  }
}
