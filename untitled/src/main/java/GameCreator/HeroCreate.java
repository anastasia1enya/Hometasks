package GameCreator;

public class HeroCreate  {
    public  Hero createHero (int rasa, String name){
        Hero hero = new Hero();
        hero.setName(name);

        if (rasa == 1){
            hero.setRasa(Rasa.WARRIOR);
            hero.setlHand(Items.SWORD);
            hero.setrHand(Items.SHIELD);

            return hero;

        } else if(rasa == 2){
            hero.setRasa(Rasa.WIZARD);
            hero.setlHand(Items.SWORD);
            hero.setrHand(Items.SHIELD);
            return hero;
        }else if(rasa == 3) {
            hero.setRasa(Rasa.ARCHER);
            hero.setlHand(Items.SWORD);
            hero.setrHand(Items.SHIELD);
            return hero;
        }
        else   {throw new UnsupportedHeroException("Cant create"); }

       //return null;
    }
    public  Monster createMonster(){

        Monster monster = new Monster();
        monster.setName("Big monster");
        monster.setHealth(1500);
        monster.setStrength(10);

        return monster;
    }


}
