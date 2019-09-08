package study.api.demo.common.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.api.demo.common.memory.UserData;
import study.api.demo.common.model.Contents;
import study.api.demo.common.model.User;

import java.util.UUID;

@Service
@Slf4j
public class UserService {


    public Contents sendMacroString() {
        String returnValue;

        returnValue = UUID.randomUUID().toString() + "testString";

        Contents returnContents = new Contents().builder()
                .contents(returnValue)
                .build();

        return returnContents;
    }

    public String addUserInfo(User user) {
        //임의 메모리 데이터 User
        UserData userData = new UserData();

        boolean result = userData.AddUserList(user);

        if (result){
            return userData.toString();
        } else {
            return "";
        }
    }

    public User getUserInfo(String userId) {
        //임의 메모리 데이터 User
        UserData userData = UserData.Instance();

        System.out.println(userId);
        User user = userData.FindToIdFromUserList(userId);
        return user;
    }
}
