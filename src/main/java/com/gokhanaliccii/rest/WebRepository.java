package com.gokhanaliccii.rest;

public class WebRepository implements Repository<String> {


    @Override
    public void save(String data) {
        System.out.println("webden");
    }

    @Override
    public String read(int id) {
        return null;
    }

    @Override
    public void delete() {

    }
}
