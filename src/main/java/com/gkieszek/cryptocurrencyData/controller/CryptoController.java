package com.gkieszek.cryptocurrencyData.controller;

import com.gkieszek.cryptocurrencyData.dto.CryptoInfo;
import com.gkieszek.cryptocurrencyData.dto.Currency;
import com.gkieszek.cryptocurrencyData.service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CryptoController {

    @Autowired
    CryptoService cryptoService;

    @GetMapping("/cryptocurrency/{id}/{vs}")
    public Currency getCurrency(@PathVariable String id, @PathVariable String vs){
        return cryptoService.getCurrency(id, vs);
    }

    @GetMapping("/cryptocurrency/info/{id}")
    public CryptoInfo getInfo(@PathVariable String id){
        return cryptoService.getInfoCryptocurrency(id);
    }

}
