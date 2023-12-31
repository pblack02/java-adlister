import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private String artist;
    private long id;
    private String name;
    private int releaseDate;
    private long sales;
    private String genre;

    public Album (){};

    public Album(String artist, String name, int releaseDate, long sales, String genre) {
        this.artist = artist;
        this.name = name;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }
}
