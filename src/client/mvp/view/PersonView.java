package client.mvp.view;

import client.eventbus.CEvent;
import client.eventbus.ClickEventHandler;
import client.mvp.presenter.PersonPresenter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;

public class PersonView extends Composite implements PersonPresenter.Display {
    interface PersonViewUiBinder extends UiBinder<HTMLPanel, PersonView> {
    }

    private static PersonViewUiBinder uiBinder = GWT.create(PersonViewUiBinder.class);
    private PersonPresenter presenter;
    private SimpleEventBus eventBus;

    public PersonView() {
        initWidget(uiBinder.createAndBindUi(this));
        init();
    }

    private void init(){
        eventBus = new SimpleEventBus();
        eventBus.addHandler(CEvent.TYPE, new ClickEventHandler() {
            @Override
            public void onClick(CEvent clickEvent) {
                presenter.setFullName();
            }
        }
        );
    }

    @UiField
    Button button;
    @UiField
    Label name;

    @UiHandler("button")
    void onClick(ClickEvent e) {
        if (presenter != null) {
//            presenter.setFullName();
            eventBus.fireEvent(new CEvent());
        }
    }

    public PersonView(String firstName) {
        initWidget(uiBinder.createAndBindUi(this));
        button.setText(firstName);
    }

    @Override
    public void clear() {
        name.setText("");
    }

    @Override
    public void setName(String name) {
        this.name.setText(name);
    }

    @Override
    public void setPresenter(PersonPresenter presenter) {
        this.presenter = presenter;
    }

}