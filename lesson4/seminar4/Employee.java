package geekbrains_course.jdk.lesson4.seminar4;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee(int id, String phoneNumber, String name, int experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}