public class Country {
    private String name;
    private String capital;
    private String headOfState;
    private int population;
    private String language;

    public Country() {
    }

    public Country(String name, String capital, String continent, int population, String language) {
        this.name = name;
        this.capital = capital;
        this.headOfState = continent;
        this.population = population;
        this.language = language;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capital: " + capital);
        System.out.println("Continent: " + headOfState);
        System.out.println("Population: " + population);
        System.out.println("Language: " + language);
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String continent) {
        this.headOfState = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
