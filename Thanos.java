import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        Hero black = new Hero("Black Widow",34);
        Hero captain = new Hero("Captain America",100);
        Hero vision = new Hero("Vision",3);
        Hero iron = new Hero("Iron Man", 48);
        Hero scarlet = new Hero("Scarlet Witch",29);
        Hero thor = new Hero("Thor",1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero strange = new Hero("Doctor Strange",42);

        heroes.add(black);
        heroes.add(captain);
        heroes.add(vision);
        heroes.add(iron);
        heroes.add(scarlet);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(strange);

        // TODO 3 : It's Thor birthday, now he's 1501

        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list

        int size = heroes.size();

        List<Hero> firstHalf = new ArrayList<>(heroes.subList(0,(size + 1)/2));


        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    
        for(Hero hero : firstHalf){
            System.out.println(hero.getName());
        }
    }
}
