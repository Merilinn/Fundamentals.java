package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs_Lab {
    static class Songs {
        String type;
        String name;
        String time;

        public Songs(String type, String name, String time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }

        public String getType() {
            return this.type;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Songs> songList = new ArrayList<>();

        while (n > 0) {
            String[] dataArr = scan.nextLine().split("_");
            String typeInput = dataArr[0];
            String nameInput = dataArr[1];
            String timeInput = dataArr[2];
            Songs currentSong = new Songs(typeInput, nameInput, timeInput);
            songList.add(currentSong);
            n--;
        }
        String command = scan.nextLine();
        if (command.equals("all")) {
            for (Songs currentSong : songList) {
                String current = currentSong.getName();
                System.out.println(current);
            }
        } else {
            for (Songs song : songList) {
                if (command.equals(song.getType())) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
