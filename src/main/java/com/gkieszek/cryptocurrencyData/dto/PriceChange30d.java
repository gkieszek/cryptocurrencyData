package com.gkieszek.cryptocurrencyData.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceChange30d {
    Double usd;
    Double pln;
}
