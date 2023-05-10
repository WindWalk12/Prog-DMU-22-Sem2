package Exercise3;

public class App {
    public static void main(String[] args) {
        CircularCannibalMeal cannibalQueue = new CircularCannibalMeal();
        Person p1 = new Person("Susan");
        Person p2 = new Person("Lars");
        Person p3 = new Person("Marie");
        Person p4 = new Person("Emilie");
        Person p5 = new Person("Rasmus");
        Person p6 = new Person("Anna");

        cannibalQueue.addPerson(p1);
        cannibalQueue.addPerson(p2);
        cannibalQueue.addPerson(p3);
        cannibalQueue.addPerson(p4);
        cannibalQueue.addPerson(p5);
        cannibalQueue.addPerson(p6);

        cannibalQueue.printPersons();
        cannibalQueue.danceMacabre();
        cannibalQueue.printPersons();
    }
}
