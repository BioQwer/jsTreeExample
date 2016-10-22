package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Node {
    @JsonProperty("id")
    private String id;
    @JsonProperty("parent")
    private String parent;
    @JsonProperty("text")
    private String text;
    @JsonProperty("children")
    private boolean children = true;

    public Node(String id, String parent, String text) {
        this.id = id;
        this.parent = parent;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        final Node node = (Node) o;

        if (children != node.children) return false;
        if (id != null ? !id.equals(node.id) : node.id != null) return false;
        if (parent != null ? !parent.equals(node.parent) : node.parent != null) return false;
        return text != null ? text.equals(node.text) : node.text == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (children ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", parent='" + parent + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
