public class Magic extends Hero{
    @Override
    int health() {
        return 0;
    }

    @Override
    int damage() {
        return 0;
    }

    @Override
    String typeOfSuperpower() {
        return null;
    }


    @Override
    public void superAbility(String superAbilityType) {
        System.out.println("Magic применил " + superAbilityType);
    }
}
