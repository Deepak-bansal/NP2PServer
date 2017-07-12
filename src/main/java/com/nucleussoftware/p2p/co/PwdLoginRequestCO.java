package com.nucleussoftware.p2p.co;


import java.util.StringJoiner;

public class PwdLoginRequestCO {

    private String email;
    private String pwd;

    public PwdLoginRequestCO() {
    }

    public PwdLoginRequestCO(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? "" : email.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? "" : pwd.trim();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("email = " + email)
                .add("pwd = " + pwd).toString();
    }
}
