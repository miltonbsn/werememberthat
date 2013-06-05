package com.todo.list.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Login extends Composite {

	@UiField HTMLPanel main; 
	
	private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);

	interface LoginUiBinder extends UiBinder<Widget, Login> {
	}

	public Login() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
		
		loginTextBox.getElement().appendChild(new TextBox().getElement());
		
		main.getElement().setId("mainA");
	}
	
	@UiField Anchor enterLoginButton;
	@UiField TextBox loginTextBox;
	@UiField PasswordTextBox passTextBox;
	@UiField Anchor registerUser;
	
	@UiField Anchor saveButton;
	@UiField Anchor cancelAnchor;
	@UiField TextBox registerTextBox;
	@UiField PasswordTextBox passwordTextBox;
	

	public Anchor getSaveButton() {
		return saveButton;
	}

	public Anchor getCancelAnchor() {
		return cancelAnchor;
	}

	public void setCancelAnchor(Anchor cancelAnchor) {
		this.cancelAnchor = cancelAnchor;
	}

	public TextBox getLoginTextBox() {
		return loginTextBox;
	}

	public void setLoginTextBox(TextBox loginTextBox) {
		this.loginTextBox = loginTextBox;
	}

	public PasswordTextBox getPasswordTextBox() {
		return passwordTextBox;
	}

	public void setPasswordTextBox(PasswordTextBox passwordTextBox) {
		this.passwordTextBox = passwordTextBox;
	}


	public Anchor getEnterLoginButton() {
		return enterLoginButton;
	}

	public Anchor getRegisterUser() {
		return registerUser;
	}

	public void setRegisterUser(Anchor registerUser) {
		this.registerUser = registerUser;
	}

	public String getUserNameText(){
		return loginTextBox.getText();
	}
	
	public String getPasswordText(){
		return passTextBox.getText();
	}
	
}
