package com.gwidgets.client;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.gwidgets.client.views.LoginView;
import com.gwidgets.client.views.MainPageView;

public class ClientFactoryImpl implements ClientFactory {
	LoginView login = new LoginView();
	MainPageView mainPage = new MainPageView();
	HandlerManager controllerBus = new HandlerManager(null);
	EventBus eventBus = new SimpleEventBus();
	PlaceController controller = new PlaceController(eventBus);

	@Override
	public LoginView getLoginView() {
		return login;
	}

	@Override
	public MainPageView getMainPageView() {
		return mainPage;
	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return controller;
	}

}
