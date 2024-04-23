import java.util.ArrayList;

public class RegisteredUser {
    private ArrayList<User> listOfUsers = new ArrayList<User>();

    public void addUser(User newUser) {
        this.listOfUsers.add(newUser);
    }

    public void removeUser(User user){
        for (User e: this.listOfUsers){
            if (e.getUserId().equals(user.getUserId())){
                this.listOfUsers.remove(user);
                return;
            }
        }
    }

    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(ArrayList<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

}
