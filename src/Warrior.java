public class Warrior extends Hero{

    @Override
    public void superAbility(String superAbilityType) {
        System.out.println("Warrior применил " + superAbilityType);
    }

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
}
