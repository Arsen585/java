class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ali", 18);
        Student s2 = new Student("Dana", 19);
        Student s3 = new Student("Arman", 20);

        System.out.println("Total students: " + Student.count);
    }
}