package com.opencbs.androidclient.models;

public class EconomicActivity {
    public int id;
    public String name;
    public int parentId;

    @Override
    public String toString() {
        return name;
    }
}
