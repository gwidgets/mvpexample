package com.gwidgets.client.placesAndactivities;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MainPagePlace extends Place{

     String name;
	
	public MainPagePlace(String placeName){
		this.name = placeName;
	}
	
	public String getPlaceName(){
		return name;
	}
	
public void setPlaceName(String name){
		this.name = name;
	}
	
	 public static class Tokenizer implements PlaceTokenizer<MainPagePlace> {
	        @Override
	        public String getToken(MainPagePlace place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public MainPagePlace getPlace(String token) {
	            return new MainPagePlace(token);
	        }
	    }
	
	

}
