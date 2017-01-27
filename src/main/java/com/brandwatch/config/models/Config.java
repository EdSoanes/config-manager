package com.brandwatch.config.models;

import java.util.List;

/**
 * Created by edso on 13/01/2017.
 */
public class Config {
    private String name;
    private String property;
    private String value;
    private List<Config> children;

    public String getName() { return name;}
    public void setName(String name) {
        this.name = name;
    }

    public String getProperty() { return property; }
    public void setProperty(String property) {
        this.property = property;
    }

    public String getValue() { return value; }
    public void setValue(String value) {
        this.value = value;
    }

    public List<Config> getChildren() { return children; }
    public void setChildren(List<Config> children) {
        this.children = children;
    }
}
