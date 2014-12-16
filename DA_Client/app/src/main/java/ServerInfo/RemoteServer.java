package ServerInfo;

/**
 * Created by tut_slz on 16/12/2014.
 */
public class RemoteServer {
    private String IPAddr;
    private String UrlHotFood;
    private String UrlRestaurant;
    private String UrlResFood;
    private String UrlOrder;

    public RemoteServer(){
        IPAddr="192.168.56.1";
        UrlHotFood="/rest/items";
        UrlRestaurant="/rest/items";
        UrlResFood="/rest/store/";
        UrlOrder="/rest/restaurants";
    }
    public String getIPAddr() {
        return IPAddr;
    }

    public String getUrlHotFood() {
        return UrlHotFood;
    }

    public String getUrlRestaurant() {
        return UrlRestaurant;
    }

    public String getUrlResFood() {
        return UrlResFood;
    }

    public String getUrlOrder() {
        return UrlOrder;
    }
}
