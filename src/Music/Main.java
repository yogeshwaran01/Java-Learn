package Music;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void trackPrinter(Track track) {
        System.out.println("Song: " + track.getSongName() );
        System.out.println("Singer: " + track.getSinger() );
        System.out.println("Album: " + track.getSongAlbum().getName() );
        System.out.println("Music Director: " + track.getSongAlbum().getMusicDirector() );
        System.out.println("Genre: " + track.getGenre());

        System.out.println("**************");

    }

    public static void main(String[] args) {
        List<Track> songList = new ArrayList<>();

        Album master = new Album("Master", "Ani");

        songList.add(new Track("Mater Coming", master, Genre.BEAT, master.getMusicDirector()));
        songList.add(new Track("Short Story", master, Genre.POP, "Vijay"));
        songList.add(new Track("See your eyes", master, Genre.MELODY, "Shankar"));

        Album bts = new Album("Bts", "bts group");

        songList.add(new Track("butter", bts, Genre.RAP, "bts boys"));

        PlayList playlist = new PlayList();

        playlist.setListSongs(songList);

        System.out.println(playlist.getListSongs());

        playlist.shuffle();

        for (Track track : playlist.getListSongs()) {
            trackPrinter(track);
        }

        Track favouriteSong = playlist.pickRandom();

        System.out.println("Favourite Song: " + favouriteSong.getSongName());
        favouriteSong.play();
        System.out.println("Size: " + playlist.size());

    }
}
