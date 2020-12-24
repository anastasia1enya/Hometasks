package GameCreator;

public class GaneMech {

    public void attack(Hero hero, Monster monster){
        if(hero.isTurn()){
            System.out.println(" h tirn");
            System.out.println("monster health before" + monster.getHealth());
            double mult = mult();
            monster.setHealth(monster.getHealth()-hero.getStrength());
            hero.setTurn(false);
            monster.setTurn(true);
            System.out.println("monster health after" + monster.getHealth());
        }
        else if(monster.isTurn()){
            System.out.println(" m tirn");
            System.out.println("hero health before" + hero.getHealth());
            double mult = mult();
            hero.setHealth(hero.getHealth()-monster.getStrength());
            monster.setTurn(false);
            hero.setTurn(true);
            System.out.println("hero health after" + hero.getHealth());
        }


    }


    public void selectWinner(Hero hero, Monster monster){

    }

    private Action getAction( ){

        switch ((int)(Math.random()*3+1)){
            case 1:
                return Action.HEAD;

            case 2:
                return Action.BODY;

            case 3:
                return Action.LEGS;
            default:return Action.BODY;
        }


    }

    private double mult(){
        Action a = getAction();
        Action d = getAction();

        if (a.equals(d)){
            System.out.println("0.5");
            return 0.5;
        } else {
            System.out.println("1.2");
            return 1.2;
        }
    }
}
