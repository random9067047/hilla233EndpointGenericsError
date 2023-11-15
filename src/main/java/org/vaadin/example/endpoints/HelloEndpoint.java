package org.vaadin.example.endpoints;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

import java.util.*;

@Endpoint
@AnonymousAllowed
public class HelloEndpoint {

    @Nonnull
    public String sayHello(@Nonnull String name) {
        if (name.isEmpty()) {
            return "Hello stranger";
        } else {
            return "Hello " + name;
        }
    }

    public List<DataRecord> getDataRecords() {
        return new ArrayList<>();
    }
}
