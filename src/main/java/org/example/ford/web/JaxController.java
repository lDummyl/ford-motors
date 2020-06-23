package org.example.ford.web;


import org.example.ford.dao.CarDao;
import org.example.ford.dto.Motor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *

 возможность создавать,
 модифицировать и удалять каждый из вышеописанных узлов в отдельности,
 собирать из созданных узлов автомобиль в целом,
 контролировать типы связи объектов в соответствии
 с реальным миром (нельзя один и тот же двигатель устанавливать
 в 2 разные машины и т.д.), просматривать результат получившегося
 автопарка с возможностью постраничного вывода и поддержкой
 поиска и сортировки (поиск, сортировка и постраничный вывод
 следует поддержать для всех списков, например, работа с компонентами автомобиля),
 иметь возможность разбирать машины на запчасти, для повторного использования. 

 * */




//http://localhost:8080/ford/rest/hello
@Path("/hello")
public class JaxController {

    @GET
//    @Path("/hello")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getHelloResponse() {

        Motor byId = (Motor) new CarDao(Motor.class).findById(2);

        return Response.status(200).entity("Hithere!"+ byId.getSerial()).build();
    }
}
