package own.practice.design.patterns.solid.srp;

import com.fasterxml.jackson.databind.ObjectMapper;
import own.practice.design.patterns.solid.violate.srp.User;

import java.io.IOException;

public class UserController {

    UserPersistence userPersistence = new UserPersistence();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(userJson, User.class);
        UserValidator userValidator = new UserValidator();
        if(!userValidator.validateUser(user)) {
            return "ERROR";
        }
        userPersistence.saveUser(user);
        return "SUCCESS";
    }
}
