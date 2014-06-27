package client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.core.client.GWT;

@RemoteServiceRelativePath("RemServ")
public interface RemServ extends RemoteService {
    public Integer getInt();
    /**
     * Utility/Convenience class.
     * Use RemServ.App.getInstance() to access static instance of RemServAsync
     */
    public static class App {
        private static final RemServAsync ourInstance = (RemServAsync) GWT.create(RemServ.class);

        public static RemServAsync getInstance() {
            return ourInstance;
        }
    }
}
