import java.time.*;

public class Person {
    public final String name;
    public final String surname;
    public final Gender gender;
    public final LocalDate birthdate;

    Person(String name, String surname, Gender gender, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    Person(String name, String surname, Gender gender, int birthYear, int birthMonth, int birthDayOfMonth) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = LocalDate.of(birthYear, birthMonth, birthDayOfMonth);
    }

    public Integer getAge() {
        if (birthdate == null)
            return null;
        else {
            LocalDate currentDate = LocalDate.now(); //şu anın tarihini alıyor

            Period period = Period.between(birthdate, currentDate);  //şu andan verilen birthdate tarihini çıkarıyor

            return period.getYears();// yaşı döndürüyor
        }
    }

    public String getName() {
        return name == null ? "Uknownn" : name;
    }

    public String getSurname() {
        return name == null ? "Uknownn" : surname;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }

    public String toString() {
        return getFullName() + " (" + gender + ")";
    }

}
