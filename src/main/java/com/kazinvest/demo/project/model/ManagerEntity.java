package com.kazinvest.demo.project.model;

import javax.persistence.*;

@Entity
@Table(name = "manager", schema = "kazinvest", catalog = "")
public class ManagerEntity {
    private int id;
    private String name;
    private String lastname;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private String uchcenter;
    private String bin;
    private String factAddress;
    private String specialization;
    private String projectVmest;
    private String srokObuch;
    private String language;
    private String lessons;
    private String groups;
    private String fileUstav;
    private String fileRekvisity;
    private String fileUchdocs;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    @Column(name = "uchcenter")
    public String getUchcenter() {
        return uchcenter;
    }

    public void setUchcenter(String uchcenter) {
        this.uchcenter = uchcenter;
    }

    @Basic
    @Column(name = "bin")
    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    @Basic
    @Column(name = "fact_address")
    public String getFactAddress() {
        return factAddress;
    }

    public void setFactAddress(String factAddress) {
        this.factAddress = factAddress;
    }

    @Basic
    @Column(name = "specialization")
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Basic
    @Column(name = "project_vmest")
    public String getProjectVmest() {
        return projectVmest;
    }

    public void setProjectVmest(String projectVmest) {
        this.projectVmest = projectVmest;
    }

    @Basic
    @Column(name = "srokObuch")
    public String getSrokObuch() {
        return srokObuch;
    }

    public void setSrokObuch(String srokObuch) {
        this.srokObuch = srokObuch;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "lessons")
    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    @Basic
    @Column(name = "groups")
    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    @Basic
    @Column(name = "file_ustav")
    public String getFileUstav() {
        return fileUstav;
    }

    public void setFileUstav(String fileUstav) {
        this.fileUstav = fileUstav;
    }

    @Basic
    @Column(name = "file_rekvisity")
    public String getFileRekvisity() {
        return fileRekvisity;
    }

    public void setFileRekvisity(String fileRekvisity) {
        this.fileRekvisity = fileRekvisity;
    }

    @Basic
    @Column(name = "file_uchdocs")
    public String getFileUchdocs() {
        return fileUchdocs;
    }

    public void setFileUchdocs(String fileUchdocs) {
        this.fileUchdocs = fileUchdocs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManagerEntity that = (ManagerEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (uchcenter != null ? !uchcenter.equals(that.uchcenter) : that.uchcenter != null) return false;
        if (bin != null ? !bin.equals(that.bin) : that.bin != null) return false;
        if (factAddress != null ? !factAddress.equals(that.factAddress) : that.factAddress != null) return false;
        if (specialization != null ? !specialization.equals(that.specialization) : that.specialization != null)
            return false;
        if (projectVmest != null ? !projectVmest.equals(that.projectVmest) : that.projectVmest != null) return false;
        if (srokObuch != null ? !srokObuch.equals(that.srokObuch) : that.srokObuch != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (lessons != null ? !lessons.equals(that.lessons) : that.lessons != null) return false;
        if (groups != null ? !groups.equals(that.groups) : that.groups != null) return false;
        if (fileUstav != null ? !fileUstav.equals(that.fileUstav) : that.fileUstav != null) return false;
        if (fileRekvisity != null ? !fileRekvisity.equals(that.fileRekvisity) : that.fileRekvisity != null)
            return false;
        if (fileUchdocs != null ? !fileUchdocs.equals(that.fileUchdocs) : that.fileUchdocs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (uchcenter != null ? uchcenter.hashCode() : 0);
        result = 31 * result + (bin != null ? bin.hashCode() : 0);
        result = 31 * result + (factAddress != null ? factAddress.hashCode() : 0);
        result = 31 * result + (specialization != null ? specialization.hashCode() : 0);
        result = 31 * result + (projectVmest != null ? projectVmest.hashCode() : 0);
        result = 31 * result + (srokObuch != null ? srokObuch.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (lessons != null ? lessons.hashCode() : 0);
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        result = 31 * result + (fileUstav != null ? fileUstav.hashCode() : 0);
        result = 31 * result + (fileRekvisity != null ? fileRekvisity.hashCode() : 0);
        result = 31 * result + (fileUchdocs != null ? fileUchdocs.hashCode() : 0);
        return result;
    }
}
