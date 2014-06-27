package server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import client.RemServ;

/**
 * Created with IntelliJ IDEA.
 * User: ruinalga
 * Date: 26.06.14
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
public class RemServImpl extends RemoteServiceServlet implements RemServ {
    @Override
    public Integer getInt() {
        return (int)(Math.random()*1000);
    }
}