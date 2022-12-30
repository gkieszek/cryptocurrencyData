package com.gkieszek.cryptocurrencyData.controller;

import com.gkieszek.cryptocurrencyData.dto.CryptoInfo;
import com.gkieszek.cryptocurrencyData.dto.Currency;
import com.gkieszek.cryptocurrencyData.service.CryptoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class CryptoController {

    @Autowired
    CryptoService cryptoService;

    @GetMapping("/price/{ids}{vs_currencies}")
    @ResponseBody
    public Currency getCurrency(@PathVariable String ids, @PathVariable String vs_currencies){
        log.info("Get: ", ids, vs_currencies);
        return cryptoService.getCurrency(ids);
    }

    @GetMapping("/info/{id}")
    public CryptoInfo getInfo(@PathVariable String id){
        log.info("Get: ", id);
        return cryptoService.getInfoCryptocurrency(id);
    }

}
