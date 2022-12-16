package org.bedu.jpa.modulo2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "lastname", nullable = false, length = 30)
    private String lastName;

    @Column(name = "controlnumber", nullable = false)
    private int controlNumber;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }
}
