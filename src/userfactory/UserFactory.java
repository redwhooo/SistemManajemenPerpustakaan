package userfactory;

import user.User;

public abstract class UserFactory {

    public abstract User createUser(
        String name,
        String studentId
    );
}