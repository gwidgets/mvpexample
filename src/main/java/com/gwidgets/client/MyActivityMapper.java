package com.gwidgets.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.gwidgets.client.placesAndactivities.LoginActivity;
import com.gwidgets.client.placesAndactivities.LoginPlace;
import com.gwidgets.client.placesAndactivities.MainPageActivity;
import com.gwidgets.client.placesAndactivities.MainPagePlace;
import com.gwidgets.client.placesAndactivities.UserSelectPlace;

public class MyActivityMapper implements ActivityMapper {
	private ClientFactory clientFactory;  
	
	public MyActivityMapper(ClientFactory factory){
		this.clientFactory = factory;
	  
	}
	@Override
	public Activity getActivity(Place place) {
		if(place instanceof LoginPlace){
			return new LoginActivity((LoginPlace) place, clientFactory);
		}else if(place instanceof MainPagePlace){
			return new MainPageActivity((MainPagePlace)place, clientFactory);
		}else if(place instanceof UserSelectPlace){
			return new MainPageActivity((MainPagePlace)place, clientFactory);
		}
		   return null;
	}
}
