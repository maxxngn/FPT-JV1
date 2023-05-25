package slot8;

public class Main {
    public static void main(String[] args) {
        Person PS1 = new Person("Cuong", 40,"0904643866","tp Hanoi");
        Person PS2 = new Person("An",39,"0303030030","hp");
        Room room = new Room("room 1","head");
        room.add(PS1);
        room.add(PS2);
        room.in();
        room.Sort();
    }
}
