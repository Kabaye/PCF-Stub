package com.netcracker.pcfstub.model;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SNR {
    private String supi;
    private String supportedFeatures;
    private JsonNode statusInfos;
}
