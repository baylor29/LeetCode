class GameOfLife {
    public void gameOfLife(int[][] board) {

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if (board[i][j] == 0){
                    int sum = 0;
                    for (int m = i - 1; m <= i + 1; m++) {
                        for (int n = j - 1; n <= j + 1; n++) {
                            if (m >= 0 && m <= board.length - 1 && n >= 0 && n <= board[0].length - 1) {

                                if (board[m][n]%2 ==1){
                                    sum = sum + 1;
                                }

                            }
                        }
                    }

                    if (sum == 3){
                        board[i][j] = 2;
                    }

                }

                if (board[i][j] == 1) {
                    int sum = 0;
                    for (int m = i - 1; m <= i + 1; m++) {
                        for (int n = j - 1; n <= j + 1; n++) {
                            if (m >= 0 && m <= board.length - 1 && n >= 0 && n <= board[0].length - 1) {
                                if(board[m][n]%2 == 1){
                                    sum = sum + 1;
                                }

                            }
                        }
                    }
                    if (sum < 3 || sum > 4){
                        board[i][j] = 3;
                    }

                }
            }



        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 2){
                    board[i][j] = 1;
                }else if(board[i][j] == 3){
                    board[i][j] = 0;
                }
            }
        }
    }
}