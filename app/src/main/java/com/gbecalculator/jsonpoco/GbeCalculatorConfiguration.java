package com.gbecalculator.jsonpoco;

/**
 * Created by beppe on 05/11/17.
 */

public class GbeCalculatorConfiguration
{
    private CrittersConfiguration CrittersConfiguration;

    private SmokeScreenConfiguration SmokeScreenConfiguration;

    private BattleOrdersConfiguration BattleOrdersConfiguration;

    private BarrageConfiguration BarrageConfiguration;

    private TauntConfiguration TauntConfiguration;

    private FlareConfiguration FlareConfiguration;

    private DestroyedDefensesConfiguration DestroyedDefensesConfiguration;

    private ShockBombConfiguration ShockBombConfiguration;

    private ArtilleryConfiguration ArtilleryConfiguration;

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