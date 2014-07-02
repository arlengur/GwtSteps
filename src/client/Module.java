package client;

import client.eventbus.CEvent;
import client.eventbus.ClickEventHandler;
import client.mvp.presenter.PersonPresenter;
import client.mvp.presenter.Presenter;
import client.mvp.shared.Person;
import client.mvp.view.PersonView;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.*;


public class Module implements EntryPoint {

    @Override
    public void onModuleLoad() {
        SimpleEventBus eventBus = new SimpleEventBus();
        Person person = new Person();
        PersonPresenter.Display view = new PersonView();
        Presenter presenter = new PersonPresenter(person, view);
        presenter.go(RootPanel.get());
    }
}