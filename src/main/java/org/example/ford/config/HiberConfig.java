package org.example.ford.config;


import org.example.ford.dto.Motor;

import java.util.ArrayList;

public class HiberConfig {

    // Placing Entities for Hibernate for SessionUtilFactory

    public static ArrayList<Class> entitiesClassesList = new ArrayList<>();

    public static ArrayList<Class> getEntitiesClassesList() {

        entitiesClassesList.add(Motor.class);
//        entitiesClassesList.add(MixUnitHS.class);
//        entitiesClassesList.add(IMP_Pump.class);
//        entitiesClassesList.add(Fitting.class);

        return entitiesClassesList;
    }

}


