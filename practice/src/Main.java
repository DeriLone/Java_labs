import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CustomUser> users = new ArrayList<>();
        users.add(new CustomUser("Jim", "asd@gmail.com", 32, "qwerty"));
        users.add(new CustomUser("Tim", "adhgf@gmail.com", 23, "fgds34"));
        users.add(new CustomUser("Nick", "newmailadress@gmail.com", 23, "YTT54dfa"));
        users.add(new CustomUser("Tomas", "tomas11@gmail.com", 54, "g[KL4rff"));
        users.add(new CustomUser("Brum", "killlya228@gmail.com", 12, "qtft54gGGty"));

        System.out.println(returnAllEmail(users));
        System.out.println(returnUsersByAge(users, 23));
        System.out.println(getUserDTO(users));


    }

    public static List returnAllEmail (List<CustomUser> listOfUsers) {
        List<String> usersEmail = new ArrayList<>();
        for (CustomUser user : listOfUsers) {
            usersEmail.add(user.getEmail());
        }
        return usersEmail;
    }

    public static List returnUsersByAge (List<CustomUser> listOfUsers, int age) {
        List<CustomUser> usersByAge = new ArrayList<>();
        for (CustomUser user : listOfUsers) {
            if(user.getAge() == age){
                usersByAge.add(user);
            }
        }
        return usersByAge;
    }

    public static List getUserDTO (List<CustomUser> listOfUsers) {
        List<UserDTO> usersDTO = new ArrayList<>();
        for (CustomUser user : listOfUsers) {
            usersDTO.add(user.getUserDTO());
        }
        return usersDTO;
    }
}
