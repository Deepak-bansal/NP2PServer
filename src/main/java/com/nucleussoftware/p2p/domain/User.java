package com.nucleussoftware.p2p.domain;

import com.nucleussoftware.p2p.domain.AbstractDomains.BaseAbstractDomain;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User extends BaseAbstractDomain {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

  /*@NotNull*/

    @Column(name = "email", unique = true)
    private String email;

    /*  @NotNull*/
    @Column(name = "password")
    private String password;


    public User() {
    }

    public User(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
