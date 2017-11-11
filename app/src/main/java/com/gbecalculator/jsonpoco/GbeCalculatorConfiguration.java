package com.gbecalculator.jsonpoco;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by beppe on 05/11/17.
 */

public class GbeCalculatorConfiguration
{
    @SerializedName("CrittersConfiguration")
    @Expose
    private CrittersConfiguration CrittersConfiguration;

    @SerializedName("SmokeScreenConfiguration")
    @Expose
    private SmokeScreenConfiguration SmokeScreenConfiguration;

    @SerializedName("BattleOrdersConfiguration")
    @Expose
    private BattleOrdersConfiguration BattleOrdersConfiguration;

    @SerializedName("BarrageConfiguration")
    @Expose
    private BarrageConfiguration BarrageConfiguration;

    @SerializedName("TauntConfiguration")
    @Expose
    private TauntConfiguration TauntConfiguration;

    @SerializedName("FlareConfiguration")
    @Expose
    private FlareConfiguration FlareConfiguration;

    @SerializedName("DestroyedDefensesConfiguration")
    @Expose
    private DestroyedDefensesConfiguration DestroyedDefensesConfiguration;

    @SerializedName("ShockBombConfiguration")
    @Expose
    private ShockBombConfiguration ShockBombConfiguration;

    @SerializedName("ArtilleryConfiguration")
    @Expose
    private ArtilleryConfiguration ArtilleryConfiguration;

    @SerializedName("MedkitConfiguration")
    @Expose
    private MedkitConfiguration MedkitConfiguration;

    public CrittersConfiguration getCrittersConfiguration ()
    {
        return CrittersConfiguration;
    }

    public void setCrittersConfiguration (CrittersConfiguration CrittersConfiguration)
    {
        this.CrittersConfiguration = CrittersConfiguration;
    }

    public SmokeScreenConfiguration getSmokeScreenConfiguration ()
    {
        return SmokeScreenConfiguration;
    }

    public void setSmokeScreenConfiguration (SmokeScreenConfiguration SmokeScreenConfiguration)
    {
        this.SmokeScreenConfiguration = SmokeScreenConfiguration;
    }

    public BattleOrdersConfiguration getBattleOrdersConfiguration ()
    {
        return BattleOrdersConfiguration;
    }

    public void setBattleOrdersConfiguration (BattleOrdersConfiguration BattleOrdersConfiguration)
    {
        this.BattleOrdersConfiguration = BattleOrdersConfiguration;
    }

    public BarrageConfiguration getBarrageConfiguration ()
    {
        return BarrageConfiguration;
    }

    public void setBarrageConfiguration (BarrageConfiguration BarrageConfiguration)
    {
        this.BarrageConfiguration = BarrageConfiguration;
    }

    public TauntConfiguration getTauntConfiguration ()
    {
        return TauntConfiguration;
    }

    public void setTauntConfiguration (TauntConfiguration TauntConfiguration)
    {
        this.TauntConfiguration = TauntConfiguration;
    }

    public FlareConfiguration getFlareConfiguration ()
    {
        return FlareConfiguration;
    }

    public void setFlareConfiguration (FlareConfiguration FlareConfiguration)
    {
        this.FlareConfiguration = FlareConfiguration;
    }

    public DestroyedDefensesConfiguration getDestroyedDefensesConfiguration ()
    {
        return DestroyedDefensesConfiguration;
    }

    public void setDestroyedDefensesConfiguration (DestroyedDefensesConfiguration DestroyedDefensesConfiguration)
    {
        this.DestroyedDefensesConfiguration = DestroyedDefensesConfiguration;
    }

    public ShockBombConfiguration getShockBombConfiguration ()
    {
        return ShockBombConfiguration;
    }

    public void setShockBombConfiguration (ShockBombConfiguration ShockBombConfiguration)
    {
        this.ShockBombConfiguration = ShockBombConfiguration;
    }

    public ArtilleryConfiguration getArtilleryConfiguration ()
    {
        return ArtilleryConfiguration;
    }

    public void setArtilleryConfiguration (ArtilleryConfiguration ArtilleryConfiguration)
    {
        this.ArtilleryConfiguration = ArtilleryConfiguration;
    }

    public MedkitConfiguration getMedkitConfiguration ()
    {
        return MedkitConfiguration;
    }

    public void setMedkitConfiguration (MedkitConfiguration MedkitConfiguration)
    {
        this.MedkitConfiguration = MedkitConfiguration;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CrittersConfiguration = "+CrittersConfiguration+", SmokeScreenConfiguration = "+SmokeScreenConfiguration+", BattleOrdersConfiguration = "+BattleOrdersConfiguration+", BarrageConfiguration = "+BarrageConfiguration+", TauntConfiguration = "+TauntConfiguration+", FlareConfiguration = "+FlareConfiguration+", DestroyedDefensesConfiguration = "+DestroyedDefensesConfiguration+", ShockBombConfiguration = "+ShockBombConfiguration+", ArtilleryConfiguration = "+ArtilleryConfiguration+", MedkitConfiguration = "+MedkitConfiguration+"]";
    }
}