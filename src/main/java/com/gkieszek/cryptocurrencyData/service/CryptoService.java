package com.gkieszek.cryptocurrencyData.service;

import com.gkieszek.cryptocurrencyData.dto.CryptoInfo;
import com.gkieszek.cryptocurrencyData.dto.Currency;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Optional;

@Service
public class CryptoService {

    private final RestTemplate restTemplate = new RestTemplate();

//    public Currency getCurrency(String id, String vs){
//        ResponseEntity<Currency> response = restTemplate.getForEntity("https://api.coingecko.com/api/v3/simple/price?ids={id}&vs_currencies={vs}", Currency.class, id, vs);
//        return response.getBody();
//    }

    public CryptoInfo getInfoCryptocurrency(String id){
        ResponseEntity<CryptoInfo> responseEntity = restTemplate.getForEntity("https://api.coingecko.com/api/v3/coins/{id}", CryptoInfo.class, id);
        return  responseEntity.getBody();
    }
}

