class Student1 {
    String name;
    static String university = "ATU";

    Student1(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " studies at " + university);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1 ("Arsen");
        Student1 s2 = new Student1 ("Alibek");

        s1.display();
        s2.display();
    }
}
