package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD musicDisk = new CD("Korn", 700, "Music CD", 700);
        musicDisk.playMusic();

        DVD movie = new DVD("The Matrix", 4500, "Movie DVD", 4500);
        movie.playMovie();
    }
}