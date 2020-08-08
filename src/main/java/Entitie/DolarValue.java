package Entitie;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;
import java.util.Date;

public class DolarValue {
    @SerializedName("d")
    private Date fecha;
    @SerializedName("v")
    private float value;

    public DolarValue(){

    }

    public DolarValue(Date fecha, float value) {
        this.fecha = fecha;
        this.value = value;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
