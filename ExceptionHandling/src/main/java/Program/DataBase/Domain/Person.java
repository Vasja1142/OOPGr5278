package Program.DataBase.Domain;

import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Integer age;
    private Date birthDate;
    private Integer phoneNumber;
    private Character Gender;

    public Person(String firstName,
                  String lastName,
                  String patronymic,
                  Integer age,
                  Date birthDate,
                  Integer phoneNumber,
                  Character Gender) {
        this.firstName = firstName;
    }
}
