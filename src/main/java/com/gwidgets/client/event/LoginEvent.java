package com.gwidgets.client.event;


import com.google.gwt.event.shared.GwtEvent;

public class LoginEvent extends GwtEvent<LoginEventHandler>{
	public static Type<LoginEventHandler> TYPE = new Type<LoginEventHandler>();
	
	@Override
	public Type<LoginEventHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(LoginEventHandler handler) {
		// TODO Auto-generated method stub
		handler.onLogin(this);
	}



}
