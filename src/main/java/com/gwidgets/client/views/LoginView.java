package com.gwidgets.client.views;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginView extends Composite implements IsWidget {
	HorizontalPanel container;
	Label loginLabel;
	Label passwordLabel;
	TextBox loginField;
	PasswordTextBox passwordField;
	Button loginButton;
	private Presenter presenter;

	
	public HasClickHandlers getLoginButton() {
		return loginButton;
	}
	
	public LoginView(){
		container = new HorizontalPanel();
		loginField = new TextBox();
		loginButton = new Button("Login");
		passwordField = new PasswordTextBox();
		loginLabel = new Label("Login");
		passwordLabel = new Label("Password");
		
		container.add(loginLabel);
		container.add(loginField);
		container.add(passwordLabel);
		container.add(passwordField);
		container.add(loginButton);
		
	}

	@Override
	public Widget asWidget() {
		return container;
	}
	
	public Presenter getPresenter() {
		return presenter;
	}

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	public interface Presenter{
	       public void goTo(Place place);
	       public void loginButtonEvent();
	}

}
