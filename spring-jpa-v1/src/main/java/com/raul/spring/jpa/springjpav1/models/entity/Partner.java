package com.raul.spring.jpa.springjpav1.models.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="partners")
public class Partner implements Serializable {

    private static final long serialVersionUid = 1l;

    /**
     * GenerationType.IDENTITY -> autoincrement id to h2 and mysql
     * GenerationType.SEQUENCE -> autoincrement id to Msql Server, postgres
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    @Email
    private String email;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;

    private String photo;



    public Partner() {
        super();
    }

    public Partner(Long id, String name, String surname, String email, Date createAt, String photo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.createAt = createAt;
        this.photo = photo;
    }

    @PrePersist
    public void prePersist() {
        this.createAt = new Date();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public static long getSerialVersionUid() {
        return serialVersionUid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
