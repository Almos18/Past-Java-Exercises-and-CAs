package Assessment;

public class Song {
    private static int trackID;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song(String title, String artist, String genre, int duration, int releaseYear)
    {
        setTrackNumber();
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setDuration(duration);
        setReleaseYear(releaseYear);
        toString();
        //setTrackID(trackID);
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    private void setTrackNumber() {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /*private static void setTrackID(trackID)
    {
        trackID++;
        trackNumber==trackID;
    }*/

    @Override
    public String toString() {
        return "\n\nTrackNumber " + getTrackNumber() + "\nTitle " + getTitle() + "\nArtist " + getArtist() +
                "\nGenre " + getGenre() + "\nDuration " + getDuration() + "\nReleaseYear " + getReleaseYear();
    }
}