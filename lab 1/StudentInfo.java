// Имя файла должно совпадать с именем класса
// Файл: StudentInfo.java
public class StudentInfo {

    // Метод main — точка входа в Java-программу
    public static void main(String[] args) {

        // Объявление и инициализация переменной для хранения ФИО студента
        String fullName = "Arsen ";

        // Объявление переменной для хранения номера группы
        String group = "ИС 24-12";

        // Объявление переменной для хранения образовательной программы
        String program = "Информационные системы";

        String  lastName = "Baktbekov";


        // Вывод заголовка в консоль
        System.out.println("=== Информация о студенте ===");

        // Вывод ФИО студента
        System.out.println("ФИО: " + fullName);

        // Вывод группы студента
        System.out.println("Группа: " + group);

        // Вывод образовательной программы
        System.out.println("ОП/Специальность: " + program);

    }
}