import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
        this(name, surname);
        this.age = age;
    }

    boolean hasAge() {
        return age != null ? true : false;
    }

    boolean hasAddress() {
        return address != null ? true : false;
    }

    void happyBirthday() {
        if (hasAge() == true) {
            age++;
        }
    }

    PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address).setAge(5);
    }

    void setAddress(String city) {
        this.address = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age != null ? age.toString() : "The age is unknown";
    }

    public String getAddress() {
        return address != null ? address : "The address is unknown";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && surname.equals(person.surname) && Objects.equals(age, person.age) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
