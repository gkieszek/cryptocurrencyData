package com.gkieszek.cryptocurrencyData.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoInfo{

    private String name;
    private String symbol;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date genesisDate;
    private Long marketCapRank;
    private MarketData marketData;

/**
 *
 * name:	"Ethereum",
 * symbol:	"eth",
 * genesis_date:	"2015-07-30",
 * market_cap_rank:	2,
 * market_data: {
 *     current_price: {
 *        usd: 12132,
 *        pln: 23235,
 *     }
 *     ath: {
 *         usd: "4878.26",
 *         pln: "19645.56",
 *     }
 *     atl: {
 *         usd: "0.432979",
 *         pln: "1.62",
 *     }
 *     price_change_30d_in_currency: {
 *         usd: "-26.07626",
 *         pln: "-25.7706",
 *     }
 *
 *
 *
 * }
 *
 */
}
