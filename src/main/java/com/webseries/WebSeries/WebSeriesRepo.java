package com.webseries.WebSeries;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface WebSeriesRepo extends CrudRepository<WebSeriesModel,String>{
	public List<WebSeriesModel> findByName(String name);
}
