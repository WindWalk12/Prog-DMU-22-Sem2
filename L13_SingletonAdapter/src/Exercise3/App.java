package Exercise3;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("James", 29384732);
        Person p2 = new Person("Hanne", 27561947);
        Person p3 = new Person("Maj", 96387167);
        Person p4 = new Person("Lars", 736138463);

        PersonAdministrator.getInstance().addPerson(p1);
        PersonAdministrator.getInstance().addPerson(p2);
        PersonAdministrator.getInstance().addPerson(p3);
        PersonAdministrator.getInstance().addPerson(p4);

        System.out.println(PersonAdministrator.getInstance().getPeople());
        PersonAdministrator.getInstance().removePerson(p2);
        System.out.println(PersonAdministrator.getInstance().getPeople());
    }
}
