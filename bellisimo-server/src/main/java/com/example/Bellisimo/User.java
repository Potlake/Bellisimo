package com.example.Bellisimo;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "User")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column(name = "username")
    private String username;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_type")
    private boolean userType;

    protected User()
    {

    }

    public User(String username, String email, boolean userType)
    {
        this.username = username;
        this.email = email;
        this.userType = userType;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserType(boolean userType) {
        this.userType = userType;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString()
    {
        return String.format("User[user_id=%d,username='%s',email='%s',userType=%b]",user_id,username,email,userType);
    }

}
