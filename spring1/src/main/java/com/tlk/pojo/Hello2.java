package com.tlk.pojo;

public class Hello2 {
    private String str;

    public Hello2(String str){

    }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
