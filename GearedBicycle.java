public class GearedBicycle extends Bicycle
{
    private int gear;

    public GearedBicycle()
    {
        gear = 1;
    }

    public void setGear(int newGear)
    {
        gear = newGear;
    }

    public int getGear()
    {
        return gear;
    }

    @Override
    public void accelerate()
    {
        // geared bicycle speeds up more based on gear
        for (int i = 0; i < gear; i++)
        {
            super.accelerate();
        }
    }

    @Override
    public void brake()
    {
        // geared bicycle brakes twice as fast
        super.brake();
        super.brake();
    }
}
