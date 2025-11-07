package Userservice;

import java.util.UUID;

public class User {
    private UUID id;
    private boolean active;
    private UserRole role;
    private String email;
    private String username;
    public User(UUID id,String username,boolean active,UserRole role,String email){
        this.id=id;
        this.active=active;
        this.role=role;
        this.email=email;
        this.username=username;
    }
    public boolean isActive() {return active;}

    public UserRole getRole() {return role;}
    public UUID getId(){return this.id;};
    public void setActive(boolean active) {this.active = active;}
    public String getEmail() {return this.email;}
    public void setEmail(String email) {this.email = email;}
    public String getUsername(){return this.username;}
}
