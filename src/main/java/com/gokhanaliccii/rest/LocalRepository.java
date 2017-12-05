package com.gokhanaliccii.rest;

public class LocalRepository implements Repository<String> {


    @Override
    public void save(String data) {
        System.out.println("localde");
    }

    @Override
    public String read(int id) {
        return null;
    }


    @Override
    public void delete() {

    }
}
