package Exercise3;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private String name;
    private Integer number;
    Comparator<Customer> sort;

    public Customer(String name, Integer number) {
        this.name = name;
        this.number = number;
        this.sort = new Customer.sortByName();
    }

    public Comparator<Customer> getSort() {
        return sort;
    }

    public void setSort(Comparator<Customer> sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name + " " + this.number;
    }

    @Override
    public int compareTo(Customer o) {
        return sort.compare(this, o);
    }

    public static class sortByName implements Comparator<Customer> {

        @Override
        public int compare(Customer c1, Customer c2) {
            return c1.getName().compareTo(c2.getName());
        }
    }

    public static class sortByNumber implements Comparator<Customer> {

        @Override
        public int compare(Customer c1, Customer c2) {
            return c1.getNumber().compareTo(c2.getNumber());
        }
    }
}
