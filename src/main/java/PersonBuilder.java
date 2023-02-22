public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        try {
            if (name == null | surname == null) {
                throw new IllegalArgumentException("Должны быть указаны имя и фамилия");
            } else if (age != null && age < 0) {
                throw new IllegalArgumentException("Возраст не может быть отрицательным");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Person person = new Person(name, surname, age);
        person.setAddress(address);
        return person;
    }
}
