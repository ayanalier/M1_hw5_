public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHit(30);
        boss.setBosshealth(700);
        System.out.println("Урон боса " + boss.getBossHit() + "  Здоровье боса " + boss.getBosshealth());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Урон героев: " + createHeroes()[i].getDamage()+ " Здоровье героев: " + createHeroes()[i].getLife() + " Супер способность героев: " + createHeroes()[i].getSuperpower());

        }
    }

    public static Hero[] createHeroes() {

        Hero titan = new Hero(200,20,"Sensor");
        Hero ghom = new Hero(150,30,"Ginegical");
        Hero dracon = new Hero(155,40,"Magical");
        Hero[] Boes = {titan, ghom, dracon};
        return  Boes;


    }


}
