import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class RunningPage {
    public static void main(String[] args) {

        // a. Create seven Heroes as the objects, two Districts as the objects and three Villains as the objects.
        Hero hero1 = new Hero(11, "JayMan", "Tallin", "This", 555, 26);
        Hero hero2 = new Hero(12, "LeoMan", "Tallin", "This", 352, 126);
        Hero hero3 = new Hero(13, "MaeLady", "Tallin", "This", 155, 75);
        Hero hero4 = new Hero(14, "JimMan", "Tallin", "This", 703, 3);
        Hero hero5 = new Hero(15, "KimLady", "Tallin", "This", 1002, 15);
        Hero hero6 = new Hero(16, "PamLady", "Tallin", "This", 65, 32);
        Hero hero7 = new Hero(17, "SamMan", "Tallin", "This", 109.5, 28);

        District district1 = new District("District 1", "NoNameTown", 1);
        District district2 = new District("District 2", "OtherNameTown", 2);

        Villain villain1 = new Villain(111, "DrDo", "Tallin", "This", 399.99, 66);
        Villain villain2 = new Villain(222, "DrNo", "Tallin", "This", 4000.1, 451);
        Villain villain3 = new Villain(333, "DrYes", "Tallin", "This", 2687.33, 3);


        //b. Add three Heroes and two Villains in the first District and others - in the second District.
        district1.addNewPerson(hero1);
        district1.addNewPerson(hero2);
        district1.addNewPerson(hero3);
        district1.addNewPerson(villain1);
        district1.addNewPerson(villain2);

        district2.addNewPerson(hero4);
        district2.addNewPerson(hero5);
        district2.addNewPerson(hero6);
        district2.addNewPerson(hero7);
        district2.addNewPerson(villain3);


        //c. Print out all information about each District.
        System.out.println(district1);
        System.out.println(district2);
        System.out.println();


        //d. Edit the method calculateAvgLevelInDistrict() that only all Heroes’ levels are summarized and divided by the amount of the Heroes (not Villains) in this District.
        System.out.println("Average Level in DISTRICT 1: " + district1.calculateAvgLevelInDistrict());
        System.out.println("Average Level in DISTRICT 2: " + district2.calculateAvgLevelInDistrict());
        System.out.println();

        //e. Create an arraylist for the Districts storage. Put both Districts in the arraylist.
        ArrayList<District> allDistricts = new ArrayList<District>();
        allDistricts.add(district1);
        allDistricts.add(district2);

        //f. Find out which District is with the highest amount of Persons.
        int personsD1 = district1.getPersonInTheDistrict().size();
        int personsD2 = district2.getPersonInTheDistrict().size();


        if (personsD1 > personsD2) {
            System.out.println("DISTRICT 1 has more Persons.");
        } else if (personsD1 < personsD2) {
            System.out.println("DISTRICT 2 has more Persons.");
        } else if (personsD1 == personsD2) {
            System.out.println("DISTRICT 1 and DISTRICT 2 have the same amount of Persons!");
        } else
            System.out.println("There seems to be an error..");


    }


}

