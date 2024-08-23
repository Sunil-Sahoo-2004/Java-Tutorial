class Student{
    int rollNo;
    String name;
    int marks;
}
public class array_obj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 6051;
        s1.name = "Sunul";
        s1.marks = 450;

        Student s2 = new Student();
        s2.rollNo = 6052;
        s2.name = "Suraj";
        s2.marks = 450;

        Student s3 = new Student();
        s3.rollNo = 6053;
        s3.name = "Sovan";
        s3.marks = 450;

        Student Student[] = new Student[3];
        Student[0] = s1;
        Student[1] = s2;
        Student[2] = s3;
        

        for (int i = 0; i < Student.length; i++) {
            System.out.println(Student[i].name + " " + Student[i].rollNo + " " + Student[i].marks);
        }

    }
}
