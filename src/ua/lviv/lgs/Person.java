package ua.lviv.lgs;

public class Person {
    private String name;
    private int age;
    private String job;

    // Конструктор класу
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    // Геттери і сеттери для полів класу

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}