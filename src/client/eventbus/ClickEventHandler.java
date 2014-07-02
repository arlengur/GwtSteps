package client.eventbus;

import com.google.gwt.event.shared.EventHandler;

public interface ClickEventHandler extends EventHandler {
    public void onClick(CEvent clickEvent);
}
