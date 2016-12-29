package com.gwidgets.client.placesAndactivities;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.view.client.CellPreviewEvent;
import com.google.gwt.view.client.CellPreviewEvent.Handler;
import com.gwidgets.client.ClientFactory;
import com.gwidgets.client.views.MainPageView;

public class MainPageActivity extends AbstractActivity implements MainPageView.Presenter {
	
	ClientFactory factory;
	
	String name;
	
	MainPageView view;
	
	public MainPageActivity(MainPagePlace mainPagePlace, ClientFactory clientFactory){
		this.factory = clientFactory;
		this.name = mainPagePlace.getPlaceName();
		view = clientFactory.getMainPageView();
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		MainPageView view = factory.getMainPageView();
        view.setPresenter(this);
		panel.setWidget(view.asWidget());
		bindEvents();
	}
	
	public void bindEvents(){
		LogoutButtonClick();
		CellClickEvent();
	}
	
	@Override
	public void goTo(Place place) {
		factory.getPlaceController().goTo(place);
		
	}

	@Override
	public void LogoutButtonClick() {
		view.getLogoutButton().addClickHandler(new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				goTo(new LoginPlace("login"));
               
			}
		});
	}

	@Override
	public void CellClickEvent() {

		view.getCellTable().addCellPreviewHandler(new Handler<String>(){
			@Override
			public void onCellPreview(CellPreviewEvent<String> event) {
				if("click".equals(event.getNativeEvent().getType())){
					factory.getPlaceController().goTo(new MainPagePlace("user-select:" + event.getValue().split(" ")[0]));
					
					if(view.getRightPanel().getWidgetIndex(view.getFormPanel()) == -1){
						view.getRightPanel().add(view.getFormPanel());
					}
					
					String value= event.getValue();
					view.getNameTextBox().setText(value.split(" ")[0]);
					view.getTaskTextBox().setText(value.split(" ")[1]);
					view.getProgressTextBox().setText(value.split(" ")[2]);
				}
			}
			
		});
		
	}

}
