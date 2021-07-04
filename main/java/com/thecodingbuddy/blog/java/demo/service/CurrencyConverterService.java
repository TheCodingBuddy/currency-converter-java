package com.thecodingbuddy.blog.java.demo.service;
import com.thecodingbuddy.blog.java.demo.model.CurrencyConverter;
/**
 * @author TheCodingBuddy
 * This is service class for currencyConverter.It will perform actual currency conversion 
 */
public class CurrencyConverterService {
	Double convertedAmount = 0d;
	public Boolean currencyConverter(CurrencyConverter currencyConverter) {
		String currency = currencyConverter.getCurrency();
		Double amount = currencyConverter.getAmount();
		Double rate=0d;
		Boolean flag = true;
		if(currency.equalsIgnoreCase("DOLLAR")) {
			rate=0.013;  				// 1 INR = 0.013 USD Dollar
		}else if(currency.equalsIgnoreCase("EUR")) {
			rate=0.011;					// 1 INR = 0.011 EUR 
		}else if(currency.equalsIgnoreCase("POUND")) {
			rate=0.0097; 				// 1 INR = 0.0097 Pounds
		}else if(currency.equalsIgnoreCase("YEN")) {
			rate = 1.50;				// 1 INR = 1.50 YEN
		}else {
			flag= false;	
			System.out.println("Currency not Supported !");
		}
		convertedAmount= amount*rate;
		return flag;
	}
	public Double getConvertedAmount() {
		return convertedAmount;
	}
}
