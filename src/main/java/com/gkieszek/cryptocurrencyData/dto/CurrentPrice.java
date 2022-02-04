package com.gkieszek.cryptocurrencyData.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentPrice {
    Double usd;
    Double pln;
}
