package com.gwidgets.client;



import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.gwidgets.client.placesAndactivities.LoginPlace;
import com.gwidgets.client.placesAndactivities.MainPagePlace;

@WithTokenizers({LoginPlace.Tokenizer.class, MainPagePlace.Tokenizer.class})
public interface MyHistoryMapper extends PlaceHistoryMapper  {

}

