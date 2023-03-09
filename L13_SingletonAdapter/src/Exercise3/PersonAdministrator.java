package Exercise3;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {
    private Set<Person> people = new HashSet<>();
    private static PersonAdministrator uniquePersonAdministrator;

    private PersonAdministrator() {
    }

    public static PersonAdministrator getInstance() {
        if (uniquePersonAdministrator == null) {
            uniquePersonAdministrator = new PersonAdministrator();
        }
        return uniquePersonAdministrator;
    }

    public Set<Person> getPeople() {
        return new HashSet<>(people);
    }

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }
}
