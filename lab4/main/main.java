package main;

import model.Student;
import service.Studentservice;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //8  Объектінің құрылуы
        Student s1 = new Student("Арсен", 18, "Програмист");
        Student s2 = new Student("Алибек", 19, "Зубтехник");
        Student s3 = new Student(); // әдепкі конструктор

        //4 Бір-бірінен тәуелсіз объектілер
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

        //5 Әдіс арқылы объектіні өзгерту
        s3.changeMajor("Математика");
        s3.showInfo();

        //7 Класстардың өзара әрекеті
        Studentservice service = new Studentservice();
        service.printStudent(s1);
        //8 Бағдарлама аяқталған соң объектілер жойылады
    }
}