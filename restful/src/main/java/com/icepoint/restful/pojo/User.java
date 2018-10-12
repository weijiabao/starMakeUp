package com.icepoint.restful.pojo;

public class User {

    private int id;
    private String name;
    private int age;

    public User(){
    }
    /**
     * @param id
     * @param name
     */
    public User(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return  age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

}

