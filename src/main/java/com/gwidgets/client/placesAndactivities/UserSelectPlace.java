package com.gwidgets.client.placesAndactivities;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class UserSelectPlace extends Place {
	
	
	private String name;
	
	public UserSelectPlace(String name){
		this.name = name;
		
	}

	public String getName() {
		return name;
	}


	public static class Tokenizer implements PlaceTokenizer<UserSelectPlace> {
        @Override
        public String getToken(UserSelectPlace place) {
            return place.getName();
        }

        @Override
        public UserSelectPlace getPlace(String token) {
            return new UserSelectPlace(token);
        }
    }
}
