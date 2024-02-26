package Program;

import Program.MyException.DateInputException;
import Program.MyException.LengthInputException;
import Program.MyException.TelephoneNumberInputException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.in;

public class ScannerData {


    public static void scannerData() {
        try (Scanner in = new Scanner(System.in);) {
            System.out.println("Введите данные через пробел в порядке");
            System.out.println("<Фамилия> <Имя> <Отчество> <дата_рождения> <номер_телефона> <пол>");
            String personData = in.nextLine();
            String[] splitPersonData = personData.split(" ");
            boolean flag = CheckData(splitPersonData);

        }




    }

    private static boolean CheckData(String[] splitPersonData) {
        if (splitPersonData.length != 6) {
            throw new LengthInputException("Некорректный ввод данных!");
        }


        String[] birthDate = splitPersonData[3].split(".");
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
            Integer phoneNumber = Integer.parseInt(splitPersonData[4]);
        } catch (NumberFormatException e) {
            throw new TelephoneNumberInputException("Неверный формат номера телефона");
        }

        Character Gender;
        return true;

    }catch(LengthInputException | DateInputException | TelephoneNumberInputException e){
        return false;
    }
    }

}
