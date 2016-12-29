package com.gwidgets.client.views;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MainPageView extends Composite implements IsWidget {

	VerticalPanel container;
	HorizontalPanel leftPanel;
	private HorizontalPanel rightPanel;
	private HorizontalPanel formPanel;
	Button logout;
	final List<String> data = Arrays.asList("Mohamed bugs 70%", "John UI 30% ", "Zakaria backend 70%", "Amine ORM 90%", "Josh CI 50%");
	private Presenter presenter;
	CellTable<String> table;
	
	  private final TextBox nameTextBox = new TextBox();
	 
	  private final TextBox taskTextBox = new TextBox();
	  
	  private final TextBox progressTextBox = new TextBox();
	  
	  Button button = new Button("Modify");

	
	public MainPageView(){
			leftPanel = new HorizontalPanel();
			rightPanel = new HorizontalPanel();
			formPanel = new HorizontalPanel();
		  Label nameLabel = new Label("Name");
		
		  Label taskLabel = new Label("Task");
		  
		  Label progressLabel = new Label("Progress");
		  
		  Button button = new Button("Modify");
		  
		  getFormPanel().add(nameLabel);
		  getFormPanel().add(nameTextBox);
		  getFormPanel().add(taskLabel);
		  getFormPanel().add(taskTextBox);
		  getFormPanel().add(progressLabel);
		  getFormPanel().add(progressTextBox);
		  getFormPanel().add(button);
		  
         table = new CellTable<String>();
		
		TextColumn<String> column1 = new TextColumn<String>(){
			@Override
			public String getValue(String object) {
				// TODO Auto-generated method stub
				return object.split(" ")[0];
			}
			
		};
		
		TextColumn<String> column2 = new TextColumn<String>(){
			@Override
			public String getValue(String object) {
				return object.split(" ")[1];
			}
			
		};
		
		TextColumn<String> column3 = new TextColumn<String>(){
			@Override
			public String getValue(String object) {
				return object.split(" ")[2];
			}
			
		};
		
		table.addColumn(column1, "Name");
		table.addColumn(column2, "Task");
		table.addColumn(column3, "Progress");
		
		
		
		table.setRowData(data);
		getRightPanel().add(table);
		container = new VerticalPanel();
		logout = new Button("Logout");
		container.add(logout);
		container.add(leftPanel);
		container.add(getRightPanel());
	}

	@Override
	public Widget asWidget() {
		return container;
	}

	public Button getLogoutButton() {
		return logout;
	}
	
	public CellTable<String> getCellTable(){
		return table;
	}
	
	public Presenter getPresenter() {
		return presenter;
	}

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	public HorizontalPanel getFormPanel() {
		return formPanel;
	}


	public HorizontalPanel getRightPanel() {
		return rightPanel;
	}


	public TextBox getNameTextBox() {
		return nameTextBox;
	}


	public TextBox getTaskTextBox() {
		return taskTextBox;
	}


	public TextBox getProgressTextBox() {
		return progressTextBox;
	}


	public interface Presenter{
	    public void LogoutButtonClick();	
	    public void CellClickEvent();
		public void goTo(Place place);
	}
}
