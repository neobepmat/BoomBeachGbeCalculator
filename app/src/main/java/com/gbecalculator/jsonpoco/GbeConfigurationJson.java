package com.gbecalculator.jsonpoco;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by beppe on 05/11/17.
 */
public class GbeConfigurationJson
{
    @SerializedName("GbeCalculatorConfiguration")
    @Expose
    private GbeCalculatorConfiguration GbeCalculatorConfiguration;

    public GbeCalculatorConfiguration getGbeCalculatorConfiguration ()
    {
        return GbeCalculatorConfiguration;
    }

    public void setGbeCalculatorConfiguration (GbeCalculatorConfiguration GbeCalculatorConfiguration)
    {
        this.GbeCalculatorConfiguration = GbeCalculatorConfiguration;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GbeCalculatorConfiguration = "+GbeCalculatorConfiguration+"]";
    }
}



