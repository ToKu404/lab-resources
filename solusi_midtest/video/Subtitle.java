package video;

class Subtitle {
    private String language;
    private String translator;

    public Subtitle(String name, String age) {
        this.language = name;
        this.translator = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String name) {
        this.language = name;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String age) {
        this.translator = age;
    }
}
