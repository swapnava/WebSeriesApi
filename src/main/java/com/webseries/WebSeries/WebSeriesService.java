package com.webseries.WebSeries;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebSeriesService {
	@Autowired
	WebSeriesRepo webRepo;
	
	public void addSeries(WebSeriesModel webSeries) {
		webRepo.save(webSeries);
	}
	
	public List<WebSeriesModel> getAllSeries(){
		List<WebSeriesModel> webSeries = new ArrayList<>();
		webRepo.findAll().forEach(webSeries::add);
		return webSeries;
	}
	
	public WebSeriesModel getById(String id){
		WebSeriesModel webseries=webRepo.findById(id).get();
		return webseries;
	}
	
	public List<WebSeriesModel> getByName(String name) {
		List<WebSeriesModel> webSeries=new ArrayList<>(webRepo.findByName(name));
		return webSeries;
	}
	
	public void updateSeries(WebSeriesModel newWebSeries) {
		if(webRepo.existsById(newWebSeries.getId())) {
			WebSeriesModel webSeries = new WebSeriesModel();
			webSeries.setId(newWebSeries.getId());
			webSeries.setName(newWebSeries.getName());
			webSeries.setEpisodes(newWebSeries.getEpisodes());
			webSeries.setSeasons(newWebSeries.getSeasons());
			webSeries.setRating(newWebSeries.getRating());
			webRepo.save(webSeries);
		}
	}
	
	public String deleteSeries(String id) {
		if (webRepo.existsById(id)) {
			webRepo.deleteById(id);
			return "Series Removed ! " + id;
		}
		else {
			return "No Series with the given id";
		}
	}
}
