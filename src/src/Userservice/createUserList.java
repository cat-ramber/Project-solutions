package Userservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class createUserList {
    public static List<User> getUserList(){
        List<User> list = new ArrayList<>();
        Random rng = new Random();
        for(int i=0;i<10;i++){
            boolean userActive = rng.nextBoolean();
           UserRole userRole;
            if(rng.nextBoolean()){
                userRole = UserRole.ADMIN;
            }else {
                userRole=UserRole.USER;
            }
            String username="name:????";
            String email="email:????????????";
            list.add(new User(UUID.randomUUID(),username,userActive,userRole,email));
        }
        return list;
    }
}
