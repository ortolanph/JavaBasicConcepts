package en.entitties;

public class Employee {
    private Person person;
    private Registration registration;
    private String tieline;

    private Employee(Person person, Registration registration, String tieline) {
        this.person = person;
        this.registration = registration;
        this.tieline = tieline;
    }

    public static Employee newEmployee(Person person, Registration registration, String tieline) {
        return new Employee(person, registration, tieline);
    }

    public Registration getRegistration() {
        return registration;
    }

    public Person getPessoa() {
        return person;
    }

    public String getTieline() {
        return tieline;
    }

    @Override public String toString() {
        StringBuilder builder = new StringBuilder();

        builder
            .append(registration.toString()).append('\t')
            .append(person.getName()).append('\t')
            .append(tieline);

        return builder.toString();
    }
}
