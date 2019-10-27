package com.kazinvest.demo.project.model;

import javax.persistence.*;

@Entity
@Table(name = "tabulation", schema = "kazinvest", catalog = "")
public class TabulationEntity {
    private int id;
    private int managerId;
    private String fileUchet;
    private String fileSchet;
    private String fileAkt;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "managerId")
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "fileUchet")
    public String getFileUchet() {
        return fileUchet;
    }

    public void setFileUchet(String fileUchet) {
        this.fileUchet = fileUchet;
    }

    @Basic
    @Column(name = "fileSchet")
    public String getFileSchet() {
        return fileSchet;
    }

    public void setFileSchet(String fileSchet) {
        this.fileSchet = fileSchet;
    }

    @Basic
    @Column(name = "fileAkt")
    public String getFileAkt() {
        return fileAkt;
    }

    public void setFileAkt(String fileAkt) {
        this.fileAkt = fileAkt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabulationEntity that = (TabulationEntity) o;

        if (id != that.id) return false;
        if (managerId != that.managerId) return false;
        if (fileUchet != null ? !fileUchet.equals(that.fileUchet) : that.fileUchet != null) return false;
        if (fileSchet != null ? !fileSchet.equals(that.fileSchet) : that.fileSchet != null) return false;
        if (fileAkt != null ? !fileAkt.equals(that.fileAkt) : that.fileAkt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + managerId;
        result = 31 * result + (fileUchet != null ? fileUchet.hashCode() : 0);
        result = 31 * result + (fileSchet != null ? fileSchet.hashCode() : 0);
        result = 31 * result + (fileAkt != null ? fileAkt.hashCode() : 0);
        return result;
    }
}
