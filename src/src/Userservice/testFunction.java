package Userservice;

import java.util.List;

public class testFunction {
    public testFunction(){
        List<User> Users = createUserList.getUserList();
        List<UserDTO> Admins=userservice.getActiveAdminUsers(Users);
        for(UserDTO admin:Admins){
            System.out.println(admin.getId());
            System.out.println(admin.getUsername());
            System.out.println(admin.getEmail());
        }
    }
}
