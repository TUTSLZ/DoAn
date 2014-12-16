package ConnectToServer;

import android.os.AsyncTask;
import android.widget.Toast;

import com.example.tut_slz.da_client.ClientDA;
import com.example.tut_slz.da_client.Food;
import com.example.tut_slz.da_client.Order;
import com.example.tut_slz.da_client.Restaurant;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpHead;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import Items.Item;
import Items.ResItem;

/**
 * Created by tut_slz on 16/12/2014.
 */
public class PostToServer extends AsyncTask<String, Void,Boolean> {
    @Override
    protected Boolean doInBackground(String... params) {
        try {
            Socket s=new Socket(ClientDA.rsInfo.getIPAddr(),8080);
            s.close();
            final String url = params[0];
            final String sJson=params[1];
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders hHeader=new HttpHeaders();
            hHeader.setContentType(MediaType.APPLICATION_JSON);
            org.springframework.http.HttpEntity<String> httpRequest=new org.springframework.http.HttpEntity<String>(sJson,hHeader);
            Order.OrderResult=restTemplate.postForObject(url,httpRequest,String.class);
            //Order.OrderResult=restTemplate.getForObject(url,String.class);
            Toast.makeText(Order.OContext,Order.OrderResult,Toast.LENGTH_LONG).show();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
