package Controller;

import Entitie.DolarValue;
import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Connect {

    private String url = "https://api.estadisticasbcra.com/usd_of?d=2020-03-04";
    private String token = "BEARER eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2Mjc0MjMyNDQsInR5cGUiOiJleHRlcm5hbCIsInVzZXIiOiJlemVxdWllbC5kamNAZ21haWwuY29tIn0.54RtmT6EF8BwQ212VKN1hv0dYEf5jvt1osDbN_cN4IJOdikwVaefmrgtPUItQvUiCk9m-aX9is__Z0p7SvzFXA";

    public String getDolarValue(){
        HttpsURLConnection con = null;
        try {
            URL u = new URL(url);
            con = (HttpsURLConnection) u.openConnection();
            //con.setRequestProperty("d","2008-01-01");
            con.setRequestProperty("Authorization",token);
            //con.setRequestProperty("d","\"2019-12-13\"");
            con.connect();

            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            //System.out.println(sb.toString());
            return sb.toString();
            /*Gson g = new Gson();
            DolarValue dv = g.fromJson(sb.toString(),DolarValue.class);
            String rta = g.toJson(dv);*/
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                try {
                    con.disconnect();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }



    }








}
