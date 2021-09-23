public class ProgramingBook extends Book {
    private String language;
    private String framework;

    public ProgramingBook() {
    }

    public ProgramingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgramingBook(String code, String name, int price, String author, String language, String framework) {
        super(code, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
