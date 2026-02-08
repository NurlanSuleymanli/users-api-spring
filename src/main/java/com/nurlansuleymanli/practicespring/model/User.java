package com.nurlansuleymanli.practicespring.model;

public class User {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String mail;


    public User(Long id, String name, String surname, Integer age, String mail) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
