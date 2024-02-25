package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.grammars.hql.HqlParser;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointment")

public class Appointment {
    @Id
    @Column(name = "id")
    private int Id;
    @Column(name = "symptom")
    private String symptom;
    @Column(name = "local_date")
    private String localDate;
    @Column(name = "local_time")
    private String localTime;

    @OneToOne
    private Doctor doctor;

    @OneToOne
    private Patient patient;

}