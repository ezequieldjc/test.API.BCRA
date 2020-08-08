package Terminal;

import Controller.Convert;
import Entitie.DolarValue;
import com.google.gson.Gson;

public class Main {



    public static void main (String[] args){

        Convert c = new Convert();
        DolarValue dv[] = c.Convert();

        for (int x = 0 ; x<3; x++){
            System.out.println(dv[x].getFecha());
        }

        /*
        //Convert only value
        String test = "{\"d\":\"2002-03-04\",\"v\":2.01}";
        Gson g = new Gson();
        DolarValue dv = new DolarValue();
        dv = g.fromJson(test,DolarValue.class);
        System.out.println(dv.getFecha());
        System.out.println(dv.getValue());
        */





    }
}
