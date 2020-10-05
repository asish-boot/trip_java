package com.ashish.trip_java.domain;

public class AirportInfomation {
    private String name;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    private String code;

    public AirportInfomation(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
