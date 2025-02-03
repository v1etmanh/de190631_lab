package com.jmc.week3.excercise2.controller;

import com.jmc.week3.excercise2.model.*;

import java.time.Year;
import java.util.ArrayList;

public class InformationManagement {

    private ArrayList<Person> personList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    private int id_p = 0, id_s = 0, id_t = 0;

    public Person createPerson() {
        String id = Utils.getValue("Enter ID: ");
        while (!id.matches("\\d{6}")) {
            System.out.println("ID must be 6 digits.");
            id = Utils.getValue("Try again: ");
        }

        String name = Utils.getValue("Enter full name: ");
        while (!name.matches("^[a-zA-Z\\s]+$")) {
            System.out.println("Name must contain only alphabet and space.");
            name = Utils.getValue("Try again: ");
        }

        String phone = Utils.getValue("Enter phone number: ");
        while (!phone.matches("\\d{12}")) {
            System.out.println("Phone number must be 12 digits.");
            phone = Utils.getValue("Try again: ");
        }

        Year year = null;
        while (true) {
            String temp = Utils.getValue("Enter year of birth: ");
            if (temp.matches("\\d{4}")) {
                Year year1 = Year.parse(temp);
                if (year1.isBefore(Year.now())) {
                    year = year1;
                    break;
                }
                System.out.println("Year must be in the past.");
            }
            System.out.println("Invalid data. Year must be in the past.");
        }

        String major = Utils.getValue("Enter major: ");
        while (major.length() >= 30) {
            System.out.println("Major must be shorter than 30 characters.");
            major = Utils.getValue("Try again: ");
        }

        return new Person(id, name, phone, major, year);
    }

    public void addPerson() {
        Person person = createPerson();
        personList.add(person);  // Add to person list
        id_p++;
    }

    public void addStudent() {
        Person person = createPerson();
        Year year = null;
        while (true) {
            String temp = Utils.getValue("Enter year of admission: ");
            if (temp.matches("\\d{4}")) {
                Year year1 = Year.parse(temp);
                if (year1.isBefore(Year.now()) && year1.isAfter(person.getYearOfBirth())) {
                    year = year1;
                    break;
                }
                System.out.println("Year must be between current year and your birth year.");
            }
            System.out.println("Invalid data.");
        }

        int score = Utils.getIntValue("Enter entrance English score: ");
        while (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100.");
            score = Utils.getIntValue("Try again: ");
        }

        studentList.add(new Student(person, score, year)); // Add to student list
        id_s++;
    }

    public void addTeacher() {
        Person person = createPerson();
        int yearsInProfession = Utils.getIntValue("Enter years in profession: ");
        int age = Year.now().getValue() - person.getYearOfBirth().getValue();
        while (yearsInProfession > age || yearsInProfession < 0) {
            System.out.println("Years in profession must be between 0 and age.");
            yearsInProfession = Utils.getIntValue("Try again: ");
        }

        TypeContract[] model = TypeContract.values();
        for (int i = 0; i < model.length; i++) {
            System.out.println(i + " to choose " + model[i]);
        }

        int choice = Utils.getIntValue("Choose contract type: ");
        while (choice < 0 || choice >= model.length) {
            System.out.println("Invalid choice.");
            choice = Utils.getIntValue("Try again: ");
        }

        TypeContract contractType = model[choice];
        long salary = Utils.getLongValue("Enter salary: ");
        while (salary < 0) {
            System.out.println("Salary must be greater than 0.");
            salary = Utils.getLongValue("Try again: ");
        }

        teacherList.add(new Teacher(person, yearsInProfession, salary, contractType)); // Add to teacher list
        id_t++;
    }

    public void display(int type) {
        switch (type) {
            case 1:
                for (Person person : personList) {
                    System.out.println(person);
                }
                break;
            case 2:
                for (Student student : studentList) {
                    System.out.println(student);
                }
                break;
            case 3:
                for (Teacher teacher : teacherList) {
                    System.out.println(teacher);
                }
                break;
            default:
                System.out.println("Invalid type.");
        }
    }

    public static void main(String[] args) {
        InformationManagement management = new InformationManagement();
        // Add some test cases here
    }
}
