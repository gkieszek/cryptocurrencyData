package com.gkieszek.cryptocurrencyData.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * {
 *     "ethereum" {
 *      "vs" : USD
 *      }
 * }
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Currency implements Serializable {

CurrencyValue value;

}
