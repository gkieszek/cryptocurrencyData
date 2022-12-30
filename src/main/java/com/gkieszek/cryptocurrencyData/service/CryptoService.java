package com.gkieszek.cryptocurrencyData.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gkieszek.cryptocurrencyData.dto.CryptoInfo;
import com.gkieszek.cryptocurrencyData.dto.Currency;
import com.gkieszek.cryptocurrencyData.dto.CurrencyValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CryptoService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Currency getCurrency(String ids){
        ResponseEntity<Currency> response = restTemplate.getForEntity("https://api.coingecko.com/api/v3/simple/price?ids="+ids+"&vs_currencies=usd", Currency.class);
        log.info("Response: {}", response);
        return response.getBody();
//                .map(Currency::getValue)
//                .map(CurrencyValue::getVs)
//                .collect(Collectors.toList());
    }

    public CryptoInfo getInfoCryptocurrency(String id){
        ResponseEntity<CryptoInfo> responseEntity = restTemplate.getForEntity("https://api.coingecko.com/api/v3/coins/{id}", CryptoInfo.class, id);
        log.info("Response: {}", id);
        return responseEntity.getBody();
    }
}

