package cn.gzmdrw.vz.entity;

import java.util.List;

public class Permission {
    private int id;
    private String name;
    private int parentId;
    private String url;
    private List<Permission> pers;
    public Permission() {
    }

    public Permission(int id, String name, int parentId, String url, List<Permission> pers) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.url = url;
        this.pers = pers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Permission> getPers() {
        return pers;
    }

    public void setPers(List<Permission> pers) {
        this.pers = pers;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", url='" + url + '\'' +
                ", pers=" + pers +
                '}';
    }
}
