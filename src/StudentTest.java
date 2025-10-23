public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        //Student s3 = new Student("Ali" , 1, true, 'M'); //Constructor parametresiz olduğu için bu şekilde çalışmaz.
        s1.name = "Hira";
        s1.age = 22;
        s1.isJunior = false;
        s1.gender = 'F';

        s2.name = "Emre";
        s2.age = 22;
        s2.isJunior = false;
        s2.gender = 'M';

        s1.info();
        s2.info();
    }
}
