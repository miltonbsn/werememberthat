package com.todo.list.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class WidgetItem extends Composite {

	private static WidgetItemUiBinder uiBinder = GWT
			.create(WidgetItemUiBinder.class);

	interface WidgetItemUiBinder extends UiBinder<Widget, WidgetItem> {
	}

	public WidgetItem() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField Label description;
	@UiField Anchor deleteButton;
	
	public void setDescription(String text) {
		description.setText(text);
	}

	public Anchor getDeleteButton() {
		return deleteButton;
	}
	
}
