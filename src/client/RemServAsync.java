package client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RemServAsync {
    void getInt(AsyncCallback<Integer> async);
}
