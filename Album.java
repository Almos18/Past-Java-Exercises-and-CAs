package Assessment;

import java.util.Arrays;

public class Album {
    private String name;
    private Song[] tracks;
    private String producer;
    private int releaseYear;

    public Album(String name, Song[] tracks, String producer, int releaseYear)
    {
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
        toString();
        //playTrack();
        //shuffle();
    }

    public String getName() {
        if(name==""||name==null) {
            return "No name specified";
        }
        else
            return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    /*public getNumberofTracks() {
        return
    }*/

    /*public void playTrack(int trackSelected)
    {
        for(int i=0;i<tracks.length;i++)
        {
            if(getTracks)
        }
    }*/

    /*public void shuffle()
    {
        Math.random();
    }*/

    @Override
    public String toString() {
        return "\n\nName " + getName()  + "\n\nTracks " + Arrays.toString(getTracks()) +
                "\n\nProducer " + getProducer() + "\n\nReleaseYear " + getReleaseYear();
    }
}
