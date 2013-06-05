package com.todo.list.client;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.todo.list.shared.TaskDTO;
import com.todo.list.shared.UserDTO;

public class List extends Composite {

	private static ListUiBinder uiBinder = GWT.create(ListUiBinder.class);

	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
	
	interface ListUiBinder extends UiBinder<Widget, List> {}
	
	UserDTO userDTO = null;

	public List(UserDTO dto) {
		initWidget(uiBinder.createAndBindUi(this));
		userDTO = dto;
		
		descTextBox.getElement().setAttribute("friend", "myfriend");
		
		bind();
	}


	public void addTaskToView(final TaskDTO dto) {
		final WidgetItem widgetList = new WidgetItem();
		
		widgetList.setDescription(dto.getDescription());
		
		remindersList.add(widgetList);
		
		descTextBox.setText("");
		
		widgetList.getDeleteButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				
				widgetList.removeFromParent();
				
			}
		});
	}
	
	private void bind() {
		addButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				String input = descTextBox.getText();
				if(!input.equals("")){
					saveTask(input);
				}
			}
		});
		
		descTextBox.addKeyDownHandler(new KeyDownHandler() {
		    @Override
		    public void onKeyDown(KeyDownEvent event) {
		        if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
					String input = descTextBox.getText();
					if(!input.equals("")){
						saveTask(input);
					}
		        }
		    }
		});
	}

	private void saveTask(String input){
		TaskDTO td = new TaskDTO();
		td.setDescription(input);
		WidgetItem item = new WidgetItem();
		item.setDescription(input);
		remindersList.add(item);
	}
	
	@UiField Anchor addButton;
	@UiField TextBox descTextBox;
	@UiField HTMLPanel remindersList;
	
}
