package com.netcracker.pcfstub.controller;

import com.netcracker.pcfstub.model.SNA;
import com.netcracker.pcfstub.model.SNR;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/pcf-stub")
public class PCFController {

    @PostMapping("/notify")
    public SNA notify(@RequestBody SNR snr) {
        log.info("Received snr {}", snr);
        return new SNA().setSessionId(snr.getSupi());
    }

    @GetMapping("/test")
    public String test(){
        return "TEST!!!";
    }
}
