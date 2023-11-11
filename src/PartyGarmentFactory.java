public class PartyGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new PartyTop();
    }
    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoe createShoe() {
        return new PartyShoe();
    }
}
