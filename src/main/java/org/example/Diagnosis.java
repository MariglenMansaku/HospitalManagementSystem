package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "diagnosis")

public class Diagnosis {
    @Id
    @Column(name = "id")
    private int Id;
    @Column(name = "diagnosis")
    private String diagnosis;

    @OneToOne
    private Appointment appointment;
}