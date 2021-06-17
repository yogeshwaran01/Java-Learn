package Music;

public class Track {

    private final String songName;
    private final Album songAlbum;
    private final Genre genre;
    private final String singer;

    public Track(String songName, Album songAlbum, Genre genre, String singer) {

        this.songName = songName;
        this.songAlbum = songAlbum;
        this.genre = genre;
        this.singer = singer;
    }

    public String getSongName() {
        return songName;
    }

    public Album getSongAlbum() {
        return songAlbum;
    }

    public Genre getGenre() {
        return genre;
    }

    public void play() {
        System.out.println("Playing " + getSongName() + " ...");
    }


    public String getSinger() {
        return singer;
    }
}
