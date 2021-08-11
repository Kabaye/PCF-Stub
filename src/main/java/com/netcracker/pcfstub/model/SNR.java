package com.netcracker.pcfstub.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SNR {
    private String supi;
    private String supportedFeatures;
    private String statusInfos;
}
