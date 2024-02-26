package Program;

import Program.MyException.DateInputException;
import Program.MyException.GenderInputException;
import Program.MyException.LengthInputException;
import Program.MyException.TelephoneNumberInputException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        scannerData();
    }


    public static void scannerData() {

        System.out.println("Введите данные через пробел в порядке:");
        System.out.println("<Фамилия> <Имя> <Отчество> <дата_рождения> <номер_телефона> <пол>");
        String personData = in.nextLine();
        String[] splitPersonData = personData.split(" ");

        try {
            CheckData(splitPersonData);
            try (FileWriter fileWriter = new FileWriter(splitPersonData[1] + ".txt")){
                fileWriter.write(personData);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (LengthInputException | DateInputException | TelephoneNumberInputException | GenderInputException e) {
            System.out.println(e);
            scannerData();
        }
    }

    private static void CheckData(String[] splitPersonData)
            throws LengthInputException, DateInputException, TelephoneNumberInputException, GenderInputException {

        if (splitPersonData.length != 6) {
            throw new LengthInputException("Некорректный ввод данных!");
        }

        String[] birthDate = splitPersonData[3].split("\\.");
        ArrayList<Integer> birthDateInt = new ArrayList<>();
        for (String o : birthDate) {
            if (o.length() > 5 || o.length() < 2) {
                throw new DateInputException("Неверный формат даты рождения!");
            }
            birthDateInt.add(Integer.parseInt(o));
        }
        if (birthDateInt.size() != 3) {
            throw new DateInputException("Неверный формат даты рождения!");
        }

        if (splitPersonData[4].length() != 11) {
            throw new TelephoneNumberInputException("Неверный формат номера телефона");
        }
        try {
            Double phoneNumber = Double.parseDouble(splitPersonData[4]);
        } catch (NumberFormatException e) {
            throw new TelephoneNumberInputException("Неверный формат номера телефона");
        }

        if (!splitPersonData[5].equals("f") && !splitPersonData[5].equals("m")) {
            throw new GenderInputException("Неверный формат пола");
        }
    }
}
