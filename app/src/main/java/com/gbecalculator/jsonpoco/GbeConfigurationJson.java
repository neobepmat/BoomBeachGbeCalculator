package com.gbecalculator.jsonpoco;

/**
 * Created by beppe on 05/11/17.
 */
public class GbeConfigurationJson
{
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



