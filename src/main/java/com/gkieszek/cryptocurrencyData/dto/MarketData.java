package com.gkieszek.cryptocurrencyData.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * market_data: {
 *  *     current_price: {  //liczba
 *  *        usd: 11323.48,
 *  *        pln: 2794.55,
 *  *     }
 *  *     ath: {    // liczba
 *  *         usd: "4878.26",
 *  *         pln: "19645.56",
 *  *     }
 *  *     ath_change_percentage: { // procent
 *  *         usd: "-42.24493",
 *  *         pln: "-42.61479",
 *  *     }
 *  *     price_change_30d_in_currency: { // procent
 *  *         usd: "-26.07626",
 *  *         pln: "-25.7706",
 *  *     }
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketData {
    CurrentPrice currentPrice;
    Ath ath;
    AthChangePercentage athChangePercentage;
    PriceChange30d priceChange30d;

}
