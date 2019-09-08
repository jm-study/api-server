package study.api.demo.common.memory;

import study.api.demo.common.model.User;

import java.util.ArrayList;
import java.util.Hashtable;

public class UserData {
    Hashtable<String, User> userList = new Hashtable<String, User>();

    public static UserData Instance() {
        return new UserData();
    }
    public UserData() {
        User user1 = new User().builder()
                .id("1")
                .nicName("user1")
                .build();
        User user2 = new User().builder()
                .id("2")
                .nicName("user2")
                .build();
        User user3 = new User().builder()
                .id("3")
                .nicName("user3")
                .build();
        User user4 = new User().builder()
                .id("4")
                .nicName("user4")
                .build();
        User user5 = new User().builder()
                .id("5")
                .nicName("user5")
                .build();

        setUserList(user1, user2, user3, user4, user5);
    }

    private void setUserList(User... users){
        for (int i = 0; i < users.length; i++) {
            userList.put(users[i].getId(), users[i]);
        }

        System.out.println("setUserList");
    }

    public User FindToIdFromUserList(String userId){
        System.out.println("FindToIdFromUserList");

        System.out.println(userList.get(userId));
        return userList.get(userId);
    }

    public boolean AddUserList(User user){
        int bfCnt = userList.size();

        userList.put(user.getId(), user);

        int afCnt = userList.size();

        if (bfCnt >= afCnt){
            return false;
        } else{
            return true;
        }
    }

    public String toString(){
        return userList.toString();
    }

}
