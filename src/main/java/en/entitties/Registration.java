package en.entitties;

import java.time.LocalDate;

public class Registration implements Comparable<Registration> {
    private final LocalDate registrationDate;

    private final int sequence;

    private static final String REGISTRATION_FORMAT = "%04d%02d-%03d";

    private Registration(LocalDate dataMatricula, int sequence) {
        this.registrationDate = dataMatricula;
        this.sequence = sequence;
    }

    public static Registration newRegistration(LocalDate registrationDate, int sequence) {
        return new Registration(registrationDate, sequence);
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    public int getSequence() {
        return this.sequence;
    }

    @Override
    public String toString() {
        return String.format(
            REGISTRATION_FORMAT,
            registrationDate.getYear(),
            registrationDate.getMonthValue(),
            sequence);
    }

    @Override
    public int compareTo(Registration another) {
        return hashCode() - another.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if(other == null) return false;
        if(!(other instanceof Registration)) return false;

        Registration anotherRegistration = (Registration)other;

        if(!registrationDate.equals(anotherRegistration.getRegistrationDate())) return false;
        if(sequence != anotherRegistration.getSequence()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int regisration = (registrationDate.getYear() * 100) + registrationDate.getMonthValue();
        regisration = (regisration * 1000) + sequence;
        return regisration;
    }
}
