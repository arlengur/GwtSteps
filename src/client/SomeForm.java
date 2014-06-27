package client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class SomeForm extends Composite{
    interface SomeFormUiBinder extends UiBinder<HTMLPanel, SomeForm> {
    }

    private static SomeFormUiBinder ourUiBinder = GWT.create(SomeFormUiBinder.class);

    public SomeForm() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}