package Assessment;

import javax.swing.*;

public class TestAlbum {
    public static void main(String[] args) {

        Song song1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song song2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song song3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song song4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song song5 = new Song("House of Fun", "Madness", "Pop", 178, 1984 );

        Song songArray[] = new Song[5];
        songArray[0] = song1;
        songArray[1] = song2;
        songArray[2] = song3;
        songArray[3] = song4;
        songArray[4] = song5;

        Album album = new Album("Now that's what I call music 98", songArray, "Universal Music", 2016);

        //JTextArea jTextArea = new JTextArea("ddd",4,5);

        JOptionPane.showMessageDialog(null,album,"Album Information", JOptionPane.INFORMATION_MESSAGE);

        int trackSelected = Integer.parseInt(JOptionPane.showInputDialog(null, "Which track number would you like to play?","Input",JOptionPane.INFORMATION_MESSAGE));

        //playTrack(trackSelected);

        String shuffle = JOptionPane.showInputDialog(null,"Do you wish to shuffle the songs?(y/n)");

       /* if(shuffle.equals("y"))
        {
            String shuffleArray[] = new String[5];
            shuffleArray[(Math.random()*5)] = songArray[0];
            shuffleArray[(Math.random()*5)] = songArray[1];
            shuffleArray[(Math.random()*5)] = songArray[2];
            shuffleArray[(Math.random()*5)] = songArray[3];
            shuffleArray[(Math.random()*5)] = songArray[4];

            JOptionPane.showMessageDialog(null,Arrays.toString(shuffleArray));
        }*/
    }
}