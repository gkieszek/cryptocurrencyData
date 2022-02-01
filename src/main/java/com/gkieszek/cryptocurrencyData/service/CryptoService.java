package com.gkieszek.cryptocurrencyData.service;

import com.gkieszek.cryptocurrencyData.dto.Currency;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class CryptoService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Currency getCurrency(String id, String vs){
        ResponseEntity<Currency> response = restTemplate.getForEntity("https://api.coingecko.com/api/v3/simple/price?ids={id}&vs_currencies={vs}", Currency.class, id, vs);
        return response.getBody();

    }
}
