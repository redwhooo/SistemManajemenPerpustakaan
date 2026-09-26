package user;

public class Student implements User {

    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String getInfo() {
        return "Mahasiswa: " + name + " - NIM: " + studentId;
    }
}