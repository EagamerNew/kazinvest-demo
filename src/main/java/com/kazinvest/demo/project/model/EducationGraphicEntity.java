package com.kazinvest.demo.project.model;

import javax.persistence.*;

@Entity
@Table(name = "education_graphic", schema = "kazinvest", catalog = "")
public class EducationGraphicEntity {
    private int id;
    private int managerId;
    private int dayId;
    private int timeStartId;
    private int timeEndId;
    private int educProgId;

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
    @Column(name = "dayId")
    public int getDayId() {
        return dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    @Basic
    @Column(name = "timeStartId")
    public int getTimeStartId() {
        return timeStartId;
    }

    public void setTimeStartId(int timeStartId) {
        this.timeStartId = timeStartId;
    }

    @Basic
    @Column(name = "timeEndId")
    public int getTimeEndId() {
        return timeEndId;
    }

    public void setTimeEndId(int timeEndId) {
        this.timeEndId = timeEndId;
    }

    @Basic
    @Column(name = "educProgId")
    public int getEducProgId() {
        return educProgId;
    }

    public void setEducProgId(int educProgId) {
        this.educProgId = educProgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EducationGraphicEntity that = (EducationGraphicEntity) o;

        if (id != that.id) return false;
        if (managerId != that.managerId) return false;
        if (dayId != that.dayId) return false;
        if (timeStartId != that.timeStartId) return false;
        if (timeEndId != that.timeEndId) return false;
        if (educProgId != that.educProgId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + managerId;
        result = 31 * result + dayId;
        result = 31 * result + timeStartId;
        result = 31 * result + timeEndId;
        result = 31 * result + educProgId;
        return result;
    }
}
