package dentalClinic;

/**
 * Represents an abstract user in the dental clinic.
 * 
 * This class is intended to be a superclass for specific user roles such as Doctor and Receptionist.
 * Each user has:
 *  - Username
 *  - Password
 */
public abstract class User {
    // Username of the user
    private String username;
    // Password of the user
    private String password;

/****************************************************************************\
  /**
 * Constructs a new User instance.
 * 
 * @param username Username of the user.
 * @param password Password of the user.
 * @throws IllegalArgumentException if username or password is null or blank.
 */
public User(String username, String password) {
    if (username == null || username.trim().isEmpty()) {
        throw new IllegalArgumentException("Username cannot be null or blank");
    }
    if (password == null || password.trim().isEmpty()) {
        throw new IllegalArgumentException("Password cannot be null or blank");
    }
    this.username = username;
    this.password = password;
}

/****************************************************************************\
    /**
     * Returns the username of the user.
     *
     * @return username Username of the user.
     */
    public String getUsername() {
        return username;
    }
/****************************************************************************\
    /**
     * Returns the password of the user.
     *
     * @return password Password of the user.
     */
    public String getPassword() {
        return password;
    }
}
