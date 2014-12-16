package Items;

/**
 * Created by tut_slz on 16/12/2014.
 */
public class ResItem {
    private String email;
    private String code;
    private String name;
    private String password;
    private String img_url;

    public ResItem(String sEmail, String sCode, String sName, String sPass, String sImg){
        email=sEmail;
        code=sCode;
        name=sName;
        password=sPass;
        img_url=sImg;
    }

    public String getEmail() {
        return email;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getImg_url() {
        return img_url;
    }
}
