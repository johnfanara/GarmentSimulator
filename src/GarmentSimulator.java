public class GarmentSimulator {
    public static void main(String[] args) {
        GarmentFactory professionalGarmentFactory = new ProfessionalGarmentFactory();

        Top professionalTop = professionalGarmentFactory.createTop();
        Pants professionalPants = professionalGarmentFactory.createPants();
        Shoe professionalShoes = professionalGarmentFactory.createShoe();

        professionalTop.create();
        professionalPants.create();
        professionalShoes.create();

        GarmentFactory casualGarmentFactory = new CasualGarmentFactory();

        Top casualTop = casualGarmentFactory.createTop();
        Pants casualPants = casualGarmentFactory.createPants();
        Shoe casualShoes = casualGarmentFactory.createShoe();

        casualTop.create();
        casualPants.create();
        casualShoes.create();

        GarmentFactory partyGarmentFactory = new PartyGarmentFactory();

        Top partyTop = partyGarmentFactory.createTop();
        Pants partyPants = partyGarmentFactory.createPants();
        Shoe partyShoes = partyGarmentFactory.createShoe();

        partyTop.create();
        partyPants.create();
        partyShoes.create();

    }
}
