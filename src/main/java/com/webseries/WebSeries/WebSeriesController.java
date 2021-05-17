package com.webseries.WebSeries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSeriesController {
	
	@Autowired
	WebSeriesService seriesService;
	
	@PostMapping(value="/addSeries", 
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addSeries(@RequestBody WebSeriesModel webSeries) {
		seriesService.addSeries(webSeries);
	}
	
	@GetMapping(value="/series")
	public List<WebSeriesModel> getAllSeries() {
		return seriesService.getAllSeries();
	}
	
	@GetMapping(value="/series/id/{id}")
	public WebSeriesModel getById(@PathVariable String id) {
		return seriesService.getById(id);
	}
	
	@GetMapping(value="/series/name/{name}")
	public List<WebSeriesModel> getByName(@PathVariable String name) {
		return seriesService.getByName(name);
	}
	
	@PutMapping(value="/update",
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateSeries(@RequestBody WebSeriesModel newWebSeries) {
		seriesService.updateSeries(newWebSeries);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteSeries(@PathVariable String id) {
		return seriesService.deleteSeries(id);
	}
}
