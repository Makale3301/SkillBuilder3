
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    public static int DEFAULT_POWER = 10;

    private int power;
    private String name;

    public PowerPill(String name)
    {
        this.name = name;
        this.power = DEFAULT_POWER;
    }

    public PowerPill(String name, int power)
    {
        this.name = name;
        this.power = power;
    }

    public String getName()
    {
        return name;
    }

    public int getPower()
    {
        return power;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    public String toString()
    {
        return "PowerPill " + name + " = " + power;
    }


}