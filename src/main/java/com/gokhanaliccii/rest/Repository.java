package com.gokhanaliccii.rest;


public interface Repository<Model> {

    void save(Model data);

    Model read(int id);

    void delete();

}
