package slot8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Room {
    String name;
    String position;
    ArrayList<Person> listPerson;

    public Room(String name, String position) {
        this.name = name;
        this.position = position;
        this.listPerson = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public ArrayList<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(ArrayList<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public void add(Person Person){
        listPerson.add(Person);

    }
    public void remove(Person Person){
        listPerson.remove(Person);
    }
    public void in(){
        System.out.println("Ten phong: " + name);
        System.out.println("vi tri: " + position);
        for (int i=0;i<listPerson.size();i++){
            System.out.println(listPerson.get(i).getName());
        }

    }
    public void Sort(){
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(int i = 0; i < listPerson.size(); i++) {
            System.out.println(listPerson.get(i).getName());
        }
    }
}
