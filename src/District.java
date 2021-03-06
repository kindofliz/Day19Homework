import java.util.ArrayList;

public class District {

    //attributes
    private String title;
    private String city;
    private int DistrictID;
    ArrayList<Person> personInTheDistrict = new ArrayList<Person>();

    //no-argument constructor
    public District() {
    }


    //argument constructor
    public District(String title, String city, int districtID) {
        this.title = title;
        this.city = city;
        DistrictID = districtID;
    }

    //CUSTOM METHODS
    public boolean addNewPerson(Person person) {
        return personInTheDistrict.add(person);
    }


    public Person removePerson(int index) {
        return personInTheDistrict.remove(index);
    }


    // is a method where total heroes’ levels will be summarized and divided by the amount of the hero in this District.
    public float calculateAvgLevelInDistrict() {

        float heroLevelSum = 0;
        int heroCount = 0;
        Hero hero = null;
        for (int i = 0; i < personInTheDistrict.size(); i++) {
            if (personInTheDistrict.get(i) instanceof Hero) {
                heroCount++;
                hero = (Hero) personInTheDistrict.get(i);

                heroLevelSum += hero.calculatedLevel(); //sum of all hero's levels in the district
            }
        }
//            System.out.println(heroLevelSum + " and " + heroCount);
            return heroLevelSum / heroCount;

    }

    //METHOD TO STRING


    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", DistrictID=" + DistrictID +
                ", personInTheDistrict=" + personInTheDistrict +
                '}';
    }

    //GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return DistrictID;
    }

    public void setDistrictID(int districtID) {
        DistrictID = districtID;
    }

    public ArrayList<Person> getPersonInTheDistrict() {
        return personInTheDistrict;
    }

    public void setPersonInTheDistrict(ArrayList<Person> personInTheDistrict) {
        this.personInTheDistrict = personInTheDistrict;
    }
}

