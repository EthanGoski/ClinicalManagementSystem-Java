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
     */
    public User(String username, String password) {
        if( username != null && password != null){
        this.username = username;
        this.password = password;
        }
        else{
            break;
        }
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
