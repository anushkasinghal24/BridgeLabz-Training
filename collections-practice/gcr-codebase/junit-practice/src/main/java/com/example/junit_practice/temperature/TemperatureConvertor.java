package com.example.junit_practice.temperature;

public class TemperatureConvertor {
	
	public double celciusToFahrenheit(double celcius) {
		return (celcius*9/5) + 32;
	}
	
	public double fahrenheitToCelcius(double farh) {
		return (farh-32) * 5/9;
	}

}