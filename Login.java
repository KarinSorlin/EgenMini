import java.util.ArrayList;
import java.util.List;

public class Login {
  public static User tryLogin(String username, String password){

    for(User user : UserStorage.userList){
      if(user.getUsername().equals(username) && user.getPassword().equals(password));
        return user;

    }
    return null;
  }
}
