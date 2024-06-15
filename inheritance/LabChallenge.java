package inheritance;

class MP3 {
    private String artist;
    private String title;
    private String album;
    private int length;
    private String genre;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String newArtist) {
        artist = newArtist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String newAlbum) {
        album = newAlbum;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {
        genre = newGenre;
    }
}

// add class definitions below this line
class Podcast extends MP3 {
    private String date;
    private String name;

    public Podcast(String name, String title, int length, String genre, String date) {
        setTitle(title);
        setLength(length);
        setGenre(genre);
        this.date = date;
        this.name = name;
    }

    public String displayName() {
        return "The name is " + name;
    }

    public String displayTitle() {
        return "The title is " + getTitle();
    }

    public String displayLength() {
        return "The length is " + getLength() / 60 + " minutes and " + (getLength() % 60) + " seconds";
    }

    public String displayGenre() {
        return "The genre is " + getGenre();
    }

    public String displayDate() {
        return "The date is " + date;
    }

}

// add class definitions above this line

public class LabChallenge {
    public static void main(String[] args) {

        // add code below this line
        Podcast p = new Podcast("Planet Money", "Hollywood's Black List", 1460, "economics", "10 July 2020");

        System.out.println(p.displayName());// The name is Planet Money
        System.out.println(p.displayTitle()); // The title is Hollywood's Black List
        System.out.println(p.displayLength());// The length is 24 minutes and 20 seconds
        System.out.println(p.displayGenre()); // The genre is economics
        System.out.println(p.displayDate());// The date is 10 July 2020
        // add code above this line
    }
}