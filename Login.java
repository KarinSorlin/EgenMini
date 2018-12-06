import java.util.ArrayList;
import java.util.List;

public class Login {
  public static Users tryLogin(String username, String password){

    for(User user : user.userList){
      if(user.getUsername().equals(username) && user.getPassword().equals(password));
        return user;

    }
    return null;
  }
}
