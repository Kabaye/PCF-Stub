package com.netcracker.pcfstub.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SNA {
    private ProxyInfo proxyInfo = new ProxyInfo();
    private Long resultCode = 2001L;
    private String headerApplicationName = "Sy";
    private Integer headerApplicationId = 1677732;
    private String sessionId;
}
