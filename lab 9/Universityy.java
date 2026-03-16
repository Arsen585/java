
class Universityy {

    static int studentCount = 0;

    class Student {

        Student() {
            studentCount++;
        }
    }

    public static void main(String[] args) {
        Universityy u = new Universityy();
        Universityy.Student s1 = u.new Student();
        Universityy.Student s2 = u.new Student();
        Universityy.Student s3 = u.new Student();

        System.out.println("Total students: " + studentCount);
    }
}