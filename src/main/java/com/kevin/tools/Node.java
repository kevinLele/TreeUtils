package com.kevin.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin
 * @date 1/16/2018
 */
public class Node implements Comparable<Node> {

    private String id;

    private String pid;

    private String label;

    private Object value;

    private List<Node> childNodes = new ArrayList<>();

    public Node(String id) {
        this.id = id;
    }

    public Node(String pid, String id, String label, Object value) {
        this.pid = pid;
        this.id = id;
        this.label = label;
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<Node> childNodes) {
        this.childNodes = childNodes;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        if (this.label == null && o.getLabel() == null) {
            return 0;
        } else if (this.label == null) {
            return -1;
        } else if (o.getLabel() == null) {
            return 1;
        } else {
            return this.label.compareTo(o.getLabel());
        }
    }
}
