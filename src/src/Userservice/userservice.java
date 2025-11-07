package Userservice;

import java.util.ArrayList;
import java.util.List;

public class userservice {
    public static List<UserDTO> getActiveAdminUsers(List<User> users) {
        return users.stream()
                .filter(User::isActive)
                .filter(User-> User.getRole()==UserRole.ADMIN)
                .map(userservice::convertToDTO).toList();//don't really know how this works but it auto recommended it instead of User->
    }
    private static UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}
