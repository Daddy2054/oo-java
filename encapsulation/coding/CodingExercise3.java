package coding;

//add class definitions below this line
class Song {
    private String title;
    private String artist;
    private String album;
    private int playCount;
    private final double payRate;
    private double moneyEarned;

    public Song(String ti, String ar, String al, double payRa) {
        title = ti;
        artist = ar;
        album = al;
        playCount = 0;
        payRate = payRa;
        moneyEarned = 0.0;
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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getMoneyEarned() {
        return  Math.round(moneyEarned * 1000.0) / 1000.0; 

    }

    public void play() {
        playCount++;
        moneyEarned += payRate;
    }

    //possible solution
//       public double getMoneyEarned() {
//     return moneyEarned;
//   }
  
//   public double getPayRate() {
//     return payRate;
//   }
  
//   public void play() {
//     updatePlayCount();
//     updateMoneyEarned();
//   }
  
//   private void updatePlayCount() {
//     playCount++;
//   }
  
//   private void updateMoneyEarned() {
//     moneyEarned = playCount * payRate;
//   }

}

// add class definitions above this line

public class CodingExercise3 {
    public static void main(String[] args) {

        // add code below this line

        Song mySong = new Song("led zeppelin", "ten years gone", "physical graffiti", 0.001);
        mySong.play();
        System.out.println(mySong.getMoneyEarned());
        for (int i = 0; i < 10000; i++) {
            mySong.play();
        }
        System.out.println(mySong.getMoneyEarned());

        // add code above this line
    }
}