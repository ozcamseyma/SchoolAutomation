public class Student {

    private int studentId;
    private String studentName;
    private String studentSurname;
    private String identityNumber;
    private int age;
    private int number;
    private int classroom;

    public Student() {

    }

    public Student(int studentId, String studentName, String studentSurname, String identityNumber, int age, int number, int classroom) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.identityNumber = identityNumber;
        this.age = age;
        this.number = number;
        this.classroom = classroom;
    }

    public Student(String studentName, String studentSurname, String identityNumber, int age, int number) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.identityNumber = identityNumber;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", identityNumber=" + identityNumber +
                ", age=" + age +
                ", number=" + number +
                ", classroom='" + classroom + '\'' +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

}
