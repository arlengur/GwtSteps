package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;

public class World implements EntryPoint {

    SomeForm someForm = new SomeForm();
    public void onModuleLoad() {
        Button button = new Button("1111");
        RootPanel.get().add(someForm);


        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                RemServ.App.getInstance().getInt(new AsyncCallback<Integer>() {
                    @Override
                    public void onFailure(Throwable caught) {}

                    @Override
                    public void onSuccess(Integer result) {
                        Window.alert(""+result);
                    }
                });
            }
        });
    }
}
