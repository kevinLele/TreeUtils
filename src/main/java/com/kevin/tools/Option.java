package com.kevin.tools;

/**
 * Created by Administrator on 1/16/2018.
 */
public class Option implements Comparable<Option> {

    private String key;

    private String value;

    public Option() {
    }

    public Option(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ":" + value;
    }

    @Override
    public int compareTo(Option o) {
        if (this.value == null && o.getValue() == null) {
            return 0;
        } else if (this.value == null) {
            return -1;
        } else if (o.getValue() == null) {
            return 1;
        } else {
            return this.value.compareTo(o.getValue());
        }
    }
}
