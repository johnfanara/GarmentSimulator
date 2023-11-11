public class ProfessionalGarmentFactory implements GarmentFactory{
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }
    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }
    @Override
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}
