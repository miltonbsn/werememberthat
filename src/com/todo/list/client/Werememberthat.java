package com.todo.list.client;

import com.todo.list.shared.FieldVerifier;
import com.todo.list.shared.UserDTO;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Werememberthat implements EntryPoint {
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	public void onModuleLoad() {
		
		final Login logingwt = new Login();
		

		RootPanel.get("todo-container").clear();
		RootPanel.get("todo-container").add(logingwt);

		logingwt.getEnterLoginButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				
				UserDTO dto = new UserDTO();
				
				RootPanel.get("todo-container").clear();
				RootPanel.get("todo-container").add(new List(dto));
				
			}
		});
		
		logingwt.getRegisterUser().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				
				// make de action here
				
			}
		});
		
		logingwt.getSaveButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				String rlogin = logingwt.getLoginTextBox().getText();
				String rsenha = logingwt.getPasswordTextBox().getText();
				
				UserDTO dto = new UserDTO();
				dto.setEmail(rlogin);
				dto.setPassword(rsenha);
				
				// make the action here
				
			}
		});
		
		logingwt.getCancelAnchor().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				
				// make the action here
				
			}
		});
		
	}
}
