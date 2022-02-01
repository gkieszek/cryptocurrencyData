package com.gkieszek.cryptocurrencyData.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {
 *     "id" : ethereum {
 *      "vs" : USD
 *      }
 * }
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Currency {

String id;
String vs;

}
