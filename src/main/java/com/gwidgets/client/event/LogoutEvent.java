package com.gwidgets.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class LogoutEvent extends GwtEvent<LogoutEventHandler>{
	
	 public static Type<LogoutEventHandler> TYPE = new Type<LogoutEventHandler>();

	@Override
	public Type<LogoutEventHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(LogoutEventHandler handler) {
		handler.onLogout(this);
		
	}

}
