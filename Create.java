public class Create {

  public static User createUser(String username, String password){

    for(User user : Users.userList){
      if(user.getUsername().equals(username));
        return null;
    }

    User user = new User(username, password);
    User.userList.add(user);
    return user;
  }
}
