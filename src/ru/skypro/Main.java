package ru.skypro;

import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) {

        String q = "   ";
        checkString(q);
    }

    public static void checkString(String s) {
        try {
            check(s);
        } catch (FileNotFoundException exception) {
            System.out.println("Данное поле обязательно к заполнению");
        } catch (IllegalArgumentException exception) {
            System.out.println("Строка не должна состоять из одних пробелов");
        }
        System.out.println("Проверка завершена");
    }

    public static void check(String s) throws FileNotFoundException, IllegalArgumentException {
        if (s.isEmpty()) {
            throw new FileNotFoundException();
        }
        if (s.isBlank()) {
            throw new IllegalArgumentException();
        }
    }
}