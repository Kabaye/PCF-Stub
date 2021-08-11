package com.netcracker.pcfstub.controller;

import com.netcracker.pcfstub.model.SNA;
import com.netcracker.pcfstub.model.SNR;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/pcf-stub")
public class PCFController {

    @PostMapping("/notify")
    public SNA notify(SNR snr) {
        log.info("Received snr {}", snr);
        return new SNA().setSessionId(snr.getSupi());
    }
}
