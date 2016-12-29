package com.gwidgets.client.placesAndactivities;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class LoginPlace extends Place {
	
	String name;
	
	public LoginPlace(String placeName){
		
		this.name = placeName;
	}
	
	public String getPlaceName(){
		
		return name;
	}
	
	 public static class Tokenizer implements PlaceTokenizer<LoginPlace> {
	        @Override
	        public String getToken(LoginPlace place) {
	            return place.getPlaceName();
	        }

	        @Override
	        public LoginPlace getPlace(String token) {
	            return new LoginPlace(token);
	        }
	    }
	
	

}
