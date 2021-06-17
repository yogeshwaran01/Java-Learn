package Music;

public class Album {

    private final String name;
    private final String musicDirector;

    public Album(String name, String musicDirector) {
        this.name = name;
        this.musicDirector = musicDirector;
    }

    public String getName() {
        return name;
    }

    public String getMusicDirector() {
        return musicDirector;
    }
}

