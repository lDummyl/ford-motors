package org.example.ford;

import org.example.ford.web.JaxController;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

//http://localhost:8080/ford/

public class RSApplication extends Application
{
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(JaxController.class);
        return s;
    }
}