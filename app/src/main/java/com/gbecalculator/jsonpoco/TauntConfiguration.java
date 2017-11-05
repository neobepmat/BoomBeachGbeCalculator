package com.gbecalculator.jsonpoco;

public class TauntConfiguration
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
