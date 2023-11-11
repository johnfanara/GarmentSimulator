public abstract class Garment {
    private String name;
    public Garment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();
}
