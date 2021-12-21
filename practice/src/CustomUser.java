import java.util.List;

public class CustomUser {
    private static int id_counter = 0;

    private int id;
    private String name;
    private String email;
    private int age;
    private String password;
    private UserDTO userDTO;


    public CustomUser(String name, String email, int age, String password) {
        this.id = id_counter;
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;

        this.userDTO = new UserDTO(name, email, age);

        id_counter++;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }
}