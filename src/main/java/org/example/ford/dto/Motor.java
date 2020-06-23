package org.example.ford.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// * двигатель (тип, объем, мощность кВт, серийный номер),


@Data
@Entity
@Table(name = "motor")
@AllArgsConstructor
@NoArgsConstructor
public class Motor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String serial;

}
