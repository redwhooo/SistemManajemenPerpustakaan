package userfactory;

import user.Student;
import user.User;

public class StudentFactory extends UserFactory {

    @Override
    public User createUser(
        String name,
        String studentId
    ) {
        return new Student(name, studentId);
    }
}