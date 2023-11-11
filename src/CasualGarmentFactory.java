public class CasualGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new CasualTop();
    }
    public Pants createPants() {
        return new CasualPants();
    }
    public Shoe createShoe() {
        return new CasualShoe();
    }
}
