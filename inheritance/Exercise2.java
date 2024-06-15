package inheritance;

class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String t, String a, String g) {
        title = t;
        author = a;
        genre = g;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {
        genre = newGenre;
    }
}

// add class definitions below this line

class BlogPost extends Book {
    private String website;
    private int wordCount;
    private int pageViews;

    public BlogPost(String t, String a, String g, String w, int wc, int pv) {
        super(t, a, g);
        website = w;
        wordCount = wc;
        pageViews = pv;
    }

    public String getWebsite() {
        return website;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getPageViews() {
        return pageViews;
    }
}

// add class definitions above this line

public class Exercise2 {
    public static void main(String[] args) {

        // add code below this line
        BlogPost myPost = new BlogPost("Hot Summer Trends", "Amy Gutierrez", "fashion", "Vogue", 2319, 2748);

        System.out.println(myPost.getTitle()); // Hot Summer Trends
        System.out.println(myPost.getAuthor()); // Amy Gutierrez
        System.out.println(myPost.getGenre()); // fashion
        System.out.println(myPost.getWebsite()); // Vogue
        System.out.println(myPost.getWordCount()); // 2139
        System.out.println(myPost.getPageViews()); // 2748

        // add code above this line
    }
}