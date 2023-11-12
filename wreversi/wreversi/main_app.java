package wreversi;

// 常量以及变量声明
class presets {
    public static final int width = 5;
    public static final int height = 5;
    public static final char icon1 = 'O';
    public static final char icon2 = 'X';
    public static int length1 = 0;
    public static int length2 = 0;
    public static int current_player = 1;
    public static int xcoordinate = -1;
    public static int ycoordinate = -1;
    public static boolean game_over = false;
    public static int turns = 1;
    public static char[][] maps = new char[width][height];
}

enum ChessType {
    CHESS_DOT,
    CHESS_CROSS
};

// 显示棋盘类
class display_chessboard {
    static void setdown(int x, int y, ChessType type) {
        if (type == ChessType.CHESS_DOT) {
            presets.maps[y][x] = 'O';
        } else {
            presets.maps[y][x] = 'X';
        }
    }

    static void display() {
        // boolean print_icon = false;
        // int i;
        // int j;
        // int k;
        // for (i = 0; i < presets.height; i++) {
        //     for (j = 0; j < presets.width; j++) {
        //         System.out.print("+---");
        //     }
        //     System.out.print("+\n");
        //     for (k = 0; k < presets.width; k++) {
        //         if (presets.maps[i][k] != ' ') {
        //             System.out.print("| " + presets.maps[i][k] == "X" ? "X" : "O");
        //             print_icon = true;
        //         } else {
        //             System.out.print("|   ");
        //         }
        //     }
        //     System.out.print("|");
        //     System.out.print("\n");
        // }
        // System.out.println("+---+---+---+---+---+");
        for (int i = 0; i < presets.height; i++) {
            for (int j = 0; j < presets.width; j++) {
                System.out.print("+---");
            }
            System.out.print("+\n");
        }
    }
}

public class main_app {
    public static void main(String[] args) {
        for (int i = 0; i < presets.height; i++) {
            for (int j = 0; j < presets.width; j++) {
                presets.maps[i][j] = ' ';
            }
        }
        while (presets.game_over != true) {
            if (presets.turns % 2 == 0) {
                player_controls.get_control();
                display_chessboard.setdown(presets.xcoordinate, presets.ycoordinate, ChessType.CHESS_CROSS);
                presets.current_player = 1;
                presets.turns++;
            } else {
                player_controls.get_control();
                display_chessboard.setdown(presets.xcoordinate, presets.ycoordinate, ChessType.CHESS_DOT);
                presets.current_player = 2;
                presets.turns++;
            }
            display_chessboard.display();
        }
    }
}