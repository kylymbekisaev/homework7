public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero [] heroes = {magic,medic,warrior};

        String [] super1 = {"fly","treat","critDamage"};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].superAbility(super1[i]);

        }
    }
}