package com.gbecalculator.jsonpoco;

/**
 * Created by beppe on 05/11/17.
 */
public class ArtilleryConfiguration
{
    private String[] values;

    private String delta;

    public String[] getValues ()
    {
        return values;
    }

    public void setValues (String[] values)
    {
        this.values = values;
    }

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
        return "ClassPojo [values = "+values+", delta = "+delta+"]";
    }
}