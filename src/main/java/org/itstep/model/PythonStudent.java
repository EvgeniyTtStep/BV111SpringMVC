package org.itstep.model;

import org.springframework.stereotype.Component;


@Component
public class PythonStudent extends Student {
    @Override
    public String study() {
        return "Python student study";
    }
}
