package com.company.consumer;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class Movie {
    private String name;
    private String result;

    public Movie(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
