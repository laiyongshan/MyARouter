package com.yeohe.myaruterapplication;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/23.
 */

public class Bean implements  Serializable{

    private String name;
    private int age;
    private long id;

    public Bean(String name,long id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString(){
        return id+"is"+name+":"+age;
    }

}
