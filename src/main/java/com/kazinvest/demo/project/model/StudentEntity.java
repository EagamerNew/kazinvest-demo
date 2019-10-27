package com.kazinvest.demo.project.model;

import javax.persistence.*;

@Entity
@Table(name = "student", schema = "kazinvest", catalog = "")
public class StudentEntity {
    private int id;
    private int managerId;
    private String surname;
    private String name;
    private String lastname;
    private String idn;
    private String phone;
    private String email;
    private String password;
    private int regionId;
    private int specId;
    private int qualId;
    private int educId;
    private String skills;
    private int attend;
    private int absent;
    private String created;

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
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "idn")
    public String getIdn() {
        return idn;
    }

    public void setIdn(String idn) {
        this.idn = idn;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "regionId")
    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "specId")
    public int getSpecId() {
        return specId;
    }

    public void setSpecId(int specId) {
        this.specId = specId;
    }

    @Basic
    @Column(name = "qualId")
    public int getQualId() {
        return qualId;
    }

    public void setQualId(int qualId) {
        this.qualId = qualId;
    }

    @Basic
    @Column(name = "educId")
    public int getEducId() {
        return educId;
    }

    public void setEducId(int educId) {
        this.educId = educId;
    }

    @Basic
    @Column(name = "skills")
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Basic
    @Column(name = "attend")
    public int getAttend() {
        return attend;
    }

    public void setAttend(int attend) {
        this.attend = attend;
    }

    @Basic
    @Column(name = "absent")
    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    @Basic
    @Column(name = "created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (id != that.id) return false;
        if (managerId != that.managerId) return false;
        if (regionId != that.regionId) return false;
        if (specId != that.specId) return false;
        if (qualId != that.qualId) return false;
        if (educId != that.educId) return false;
        if (attend != that.attend) return false;
        if (absent != that.absent) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (idn != null ? !idn.equals(that.idn) : that.idn != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (skills != null ? !skills.equals(that.skills) : that.skills != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + managerId;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (idn != null ? idn.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + regionId;
        result = 31 * result + specId;
        result = 31 * result + qualId;
        result = 31 * result + educId;
        result = 31 * result + (skills != null ? skills.hashCode() : 0);
        result = 31 * result + attend;
        result = 31 * result + absent;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        return result;
    }
}
