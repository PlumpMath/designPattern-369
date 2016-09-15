package structural.composite;

/**
 * Created by manish.sharan on 14/09/16.
 */
public class Song extends SongComponent {

    private String soneName;
    private int releaseYear;
    private String singer;

    public Song(String songName, int releaseYear, String singer){
        this.soneName = songName;
        this.releaseYear = releaseYear;
        this.singer = singer;
    }

    public String getSoneName() {
        return soneName;
    }

    public void setSoneName(String soneName) {
        this.soneName = soneName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String displayInfo() {
        String s = "Song - "+ getSoneName()+" release year - "+getReleaseYear()+" singer - "+ getSinger()+"\n";
        return s;
    }
}
