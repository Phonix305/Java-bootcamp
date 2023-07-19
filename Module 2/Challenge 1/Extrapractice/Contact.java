package Extrapractice;

import java.time.LocalDate;
import java.time.Period;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age=toAge(birthDate);

    }
    public Contact(Contact contact) {

        this.name=contact.name;
        this.phoneNumber = contact.phoneNumber;
        this.birthDate = contact.birthDate;
        this.age=contact.toAge(birthDate);

    }

    private int toAge(String birthDate){
        LocalDate dob = LocalDate.parse(birthDate);
        LocalDate tod=LocalDate.now();
        
        return Period.between(dob, tod).getYears();
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(birthDate);
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(String age) {
        this.age = toAge(age);
    }
    


}
