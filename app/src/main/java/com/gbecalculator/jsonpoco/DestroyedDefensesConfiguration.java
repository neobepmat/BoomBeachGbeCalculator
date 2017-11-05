package com.gbecalculator.jsonpoco;

public class DestroyedDefensesConfiguration
{
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
