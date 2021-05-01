class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails();
    }

    public String getType() {
        return "Publication: ";
    }

    public String getDetails() {
        return this.title;
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
        getInfo();
    }
    @Override
    public String getType() {
        return "Newspaper (source - " + source + "): ";
    }
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
        getInfo();
    }

    @Override
    public String getType() {
        return "Article (author - " + author + "): ";
    }

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
        getInfo();
    }

    @Override
    public String getType() {
        return "Announcement (days to expire - " + daysToExpire + "): ";
    }

}