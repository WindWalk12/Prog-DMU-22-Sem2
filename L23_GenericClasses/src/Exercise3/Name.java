package Exercise3;

public class Name implements Comparable<Name> {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Name n) {
        if (this.firstName.equals(n.firstName)) {
            return this.lastName.compareTo(n.lastName);
        } else {
            return this.firstName.compareTo(n.firstName);
        }
    }
}
