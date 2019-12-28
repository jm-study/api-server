package study.api.demo.common.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.api.demo.common.model.Contents;
import study.api.demo.common.model.User;

import java.util.UUID;

@Service
@Slf4j
public class MessageService {

    public Contents sendMacroStringWithNicName(String userId) {
        String message = "";

        UserService userService = new UserService();
        User user = null;

        user = userService.getUserInfo(userId);
        String userNicName = user.getNicName();

        message = UUID.randomUUID().toString() + "_testString";

        Contents returnContents = new Contents().builder()
                .nicName(userNicName)
                .contents(message)
                .build();

        return returnContents;
    }

    public Contents sendMacroString() {
        String returnValue;

        returnValue = UUID.randomUUID().toString() + "testString";

        Contents returnContents = new Contents().builder()
                .contents(returnValue)
                .build();

        return returnContents;
    }


}
