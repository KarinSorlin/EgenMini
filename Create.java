public class Create {

  public static User createUser(String username, String password){

    for(User user : UserStorage.userList){
      if(user.getUsername().equals(username));
        return null;
    }

    User user = new User(username, password);
    UserStorage.userList.add(user);
    return user;
  }
}
