package Controller;

import Entitie.DolarValue;
import com.google.gson.Gson;

public class Convert {


    public DolarValue[] Convert(){

        String a = new Connect().getDolarValue();
        Gson g = new Gson();
        DolarValue dv[] = g.fromJson(a,DolarValue[].class);
        return dv;
    }

}
