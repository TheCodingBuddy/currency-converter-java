package com.thecodingbuddy.blog.java.demo;

import java.util.Scanner;
import com.thecodingbuddy.blog.java.demo.model.CurrencyConverter;
import com.thecodingbuddy.blog.java.demo.service.CurrencyConverterService;

/**
 * @author TheCodingBuddy
 *
 */
public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("*********Welcome to Currency Converter***********");
		System.out.println("Convert INR to \nEUR\nDOLLAR\nPOUND\nYEN");
		String currency = scanner.next();
		
		System.out.println("Enter Amount:");
		Double amount = scanner.nextDouble();
		
		CurrencyConverter converter = new CurrencyConverter(currency,amount);
		CurrencyConverterService converterService = new CurrencyConverterService();
		
		Boolean flag= converterService.currencyConverter(converter);
		
		if(flag)
		System.out.println("Converted Amount : "+converterService.getConvertedAmount()+" "+currency);
		scanner.close();
	}
}
