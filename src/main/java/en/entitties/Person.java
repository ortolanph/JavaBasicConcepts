package en.entitties;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private int id;
    private String name;
    private LocalDate birthDay;
    private String phone;
    private String mobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object other) {
        if(other == null) return false;
        if(!(other instanceof Person)) return false;

        Person anotherPerson = (Person)other;

        if(id != anotherPerson.getId()) return false;
        if(!name.equals(anotherPerson.getName())) return false;
        if(!birthDay.equals(anotherPerson.getBirthDay())) return false;
        if(!phone.equals(anotherPerson.getPhone())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 31;

        hash += id;
        hash += name.hashCode();
        hash += birthDay.hashCode();
        hash += phone.hashCode();

        return hash;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder
            .append("Person {")
            .append(" id: ").append(id)
            .append(", name: ").append(name)
            .append(", birthDay: ").append(birthDay.format(DateTimeFormatter.ISO_DATE))
            .append(", phone: ").append(phone)
            .append(", mobile: ").append(mobile)
            .append("}");

        return builder.toString();
    }
}
