package org.example.ford.dto;

import lombok.Data;
import org.example.ford.enums.CarCaseType;
import org.example.ford.enums.CarColor;

// * кузов (тип, цвет, кол-во дверей, VIN),


@Data
public class Carcase {

    CarCaseType carCaseType;

    CarColor carColor;

    int doorsQty;

    String vin;

}
