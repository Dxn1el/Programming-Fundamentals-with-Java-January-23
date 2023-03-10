package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs {
    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
        public String getName(){
            return this.name;
        }
        public String getTypeList(){
            return this.typeList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<String> songs = new ArrayList<>();
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            songs = Arrays.stream(scanner.nextLine().split("_")).collect(Collectors.toList());
            String type = songs.get(0);
            String name = songs.get(1);
            String time = songs.get(2);
            Song currentSong = new Song(type, name, time);
            songList.add(currentSong);
        }
        String command=scanner.nextLine();
        if(command.equals("all")){
            for (Song song : songList) {
                System.out.println(song.getName());
            }

        }else{
            for (Song song : songList) {
                if(song.getTypeList().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }


    }

}
