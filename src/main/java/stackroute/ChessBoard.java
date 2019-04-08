package stackroute;

public class ChessBoard {
    public String[][] chessboard() {
        String str[][] = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        str[i][j] = "WW|";
                    else
                        str[i][j] = "BB|";
                } else {
                    if (j % 2 == 0)
                        str[i][j] = "BB|";
                    else
                        str[i][j] = "WW|";
                }
            }
        }
        return str;
    }    }
