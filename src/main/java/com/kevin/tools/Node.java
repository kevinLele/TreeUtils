package com.kevin.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 1/16/2018.
 */
public class Node {

    private String id;

    private String pid;

    private String name;

    private String value;

    private List<Node> childNodes = new ArrayList<>();

    public Node() {
    }

    public Node(String pid, String id, String name, String value) {
        this.pid = pid;
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<Node> childNodes) {
        this.childNodes = childNodes;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
