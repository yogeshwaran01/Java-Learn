package Music;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PlayList {
    
    private List<Track> listSongs;

    public void setListSongs(List<Track> listSongs) {
        this.listSongs = listSongs;
    }

    public List<Track> getListSongs() {
        return this.listSongs;
    }
    
    public void shuffle() {
        Collections.shuffle(listSongs);
    }

    public Track pickRandom() {
        int index = new Random().nextInt(listSongs.size());
        return listSongs.get(index);
    }

    public int size(){
        return listSongs.size();
    }
}
