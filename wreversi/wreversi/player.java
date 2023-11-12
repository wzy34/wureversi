package wreversi;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 读取玩家输入操作
class player_controls {
    static void get_control() {
        try {
            System.out.println("player" + presets.current_player + " input the movement");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            presets.xcoordinate = Integer.parseInt(reader.readLine());
            presets.ycoordinate = Integer.parseInt(reader.readLine());
            presets.xcoordinate--;
            presets.ycoordinate--;
        } catch (Exception e) {
            System.out.println("fail to get the input");
        }
    }
}
class game_over {
    static void get_chessboard() {
        
    }
}