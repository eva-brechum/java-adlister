import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private long id;
    private String artist_name;
    private String record_name;
    private Date release_date;
    private float sales;
    private String genre;

    public Album() {}

    public Album(long id, String artist_name, String record_name, Date release_date, float sales, String genre) {
        this.id = id;
        this.artist_name = artist_name;
        this.record_name = record_name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getRecord_name() {
        return record_name;
    }

    public void setRecord_name(String record_name) {
        this.record_name = record_name;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
