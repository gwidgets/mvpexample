package com.gwidgets.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.gwidgets.client.views.LoginView;
import com.gwidgets.client.views.MainPageView;

public interface ClientFactory {
     LoginView getLoginView();
     MainPageView getMainPageView();
     EventBus getEventBus();
     PlaceController getPlaceController();
}
