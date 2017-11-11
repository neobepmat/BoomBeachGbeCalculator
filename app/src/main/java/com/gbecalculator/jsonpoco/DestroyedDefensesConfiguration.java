package com.gbecalculator.jsonpoco;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DestroyedDefensesConfiguration
{
    @SerializedName("delta")
    @Expose
    private String delta;

    public String getDelta ()
    {
        return delta;
    }

    public void setDelta (String delta)
    {
        this.delta = delta;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [delta = "+delta+"]";
    }
}
