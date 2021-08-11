package com.netcracker.pcfstub.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProxyInfo {
    private String proxyHost = "DDRS-cube-DDRS1-S1";
    private String proxyState = "NCHF_ADAPTER";
}
