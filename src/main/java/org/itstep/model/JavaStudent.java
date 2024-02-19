package org.itstep.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class JavaStudent extends Student {

    @Override
    public String study() {
        return "Java student study";
    }

}
