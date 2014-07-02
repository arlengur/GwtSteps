package client.eventbus;

import com.google.gwt.event.shared.GwtEvent;

public class CEvent extends GwtEvent<ClickEventHandler> {
    public static final Type<ClickEventHandler> TYPE = new Type<ClickEventHandler>();

    @Override
    public Type<ClickEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ClickEventHandler handler) {
        handler.onClick(this);
    }
}
