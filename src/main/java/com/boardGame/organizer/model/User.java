package com.boardGame.organizer.model;

import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotEmpty
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "BIRTHDAY", nullable = true)
    private Date birthday;

    @Column(name = "ADDRESS", nullable = true)
    private String address;

    @Column(name = "PHONE", nullable = true)
    private String phone;

    @Column(name = "MAIL", nullable = true)
    private String mail;

    @NotEmpty
    @Column(name = "LOGIN", unique = true, nullable = false)
    private String login;

    @NotEmpty
    @Column(name = "PASSWORD", nullable = false)
    private String password;

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "USER_ID_PROFILE_ID", joinColumns = {@JoinColumn(name = "USER_ID")},
//            inverseJoinColumns = {@JoinColumn(name = "PROFILE_ID")}
//    )
//    private Set<UserProfile> userProfiles;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(birthday, user.birthday) &&
                Objects.equals(address, user.address) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(mail, user.mail) &&
                Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, birthday, address, phone, mail, login);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    //Setter & Getter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

//    public Set<UserProfile> getUserProfiles() {
//        return userProfiles;
//    }
//
//    public void setUserProfiles(Set<UserProfile> userProfiles) {
//        this.userProfiles = userProfiles;
//    }

}
