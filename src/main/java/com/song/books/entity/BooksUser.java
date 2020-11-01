package com.song.books.entity;


import javax.persistence.*;

@Entity
@Table
public class BooksUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(name = "name",unique = false,nullable = false,length = 200)
    private String name;
    @Column(name = "user_name",unique = true,nullable = false,length = 200)
    private String userName;
    @Column(name = "pass_word",unique = false,nullable = false,length = 200)
    private String passWord;
    @Column(name = "user_image",unique = false,nullable = false,length = 500)
    private String userImage;
    @Column(name = "status",unique = false,nullable = false)
    private boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
