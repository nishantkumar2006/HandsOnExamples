package com.hackerrank.weather.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.weather.model.Weather;

@RestController
@RequestMapping("/api/weather")
public class WeatherApiRestController {
	
	@Autowired
	public  Weather weather;
	
	@RequestMapping(value="/erase", method = RequestMethod.DELETE)
	public void deleteAllWeatherData() {
		
		
	}
	
	@RequestMapping(value="/erase", method = RequestMethod.DELETE)
	public void deleteAllWeatherDataByDate(@RequestParam(value = "start") java.util.Date startDate, 
			@RequestParam(value = "end") java.util.Date endDate,@RequestParam(value = "lat") String latitude,
			@RequestParam(value = "lon") java.util.Date longitude) {
		
		
		
	}
}
