package org.vaadin.example.endpoints;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DataRecord {

    private Map<UUID, List<UUID>> options;

    public DataRecord(Map<UUID, List<UUID>> options) {
        this.options = options;
    }

    public Map<UUID, List<UUID>> getOptions() {
        return options;
    }

    public void setOptions(Map<UUID, List<UUID>> options) {
        this.options = options;
    }
}
