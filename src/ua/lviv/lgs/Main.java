package ua.lviv.lgs;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 25, "Engineer");
        Class<?> personClass = person.getClass();

        System.out.println("Ім'я класу: " + personClass.getName());
        System.out.println("Модифікатори доступу: " + Modifier.toString(personClass.getModifiers()));

        Class<?> superClass = personClass.getSuperclass();
        System.out.println("Базовий клас: " + superClass.getName());

        Package classPackage = personClass.getPackage();
        System.out.println("Пакет: " + classPackage.getName());

        Field[] fields = personClass.getDeclaredFields();
        System.out.println("Поля класу:");
        for (Field field : fields) {
            System.out.println("  " + field.getType().getSimpleName() + " " + field.getName());
        }

        Method[] methods = personClass.getDeclaredMethods();
        System.out.println("Методи класу:");
        for (Method method : methods) {
            System.out.println("  " + method.getReturnType().getSimpleName() + " " + method.getName() + "()");
        }
    }
}