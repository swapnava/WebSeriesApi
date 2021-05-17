package com.webseries.WebSeries;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WebSeriesModel {
	@Id
	private String id;
	private String name;
	private String seasons;
	private String episodes;
	private String rating;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeasons() {
		return seasons;
	}
	public void setSeasons(String seasons) {
		this.seasons = seasons;
	}
	public String getEpisodes() {
		return episodes;
	}
	public void setEpisodes(String episodes) {
		this.episodes = episodes;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
}
