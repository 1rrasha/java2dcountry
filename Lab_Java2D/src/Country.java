public abstract class Country implements Drawable {
    protected String name;
    protected int citizens;
    public Country (String name, int citizens) {
        this.name = name;
        this.citizens = citizens;
    }
    // Getters
    public String getName () {
        return name;
    }
    public int getCitizens () {
        return citizens;
    }
    // Setters
    public void setName (String name) {
        this.name = name;}

        public void setCitizens (int citizens) {
            this.citizens = citizens;
        }
    }