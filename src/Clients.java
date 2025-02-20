
public class Clients
{
    private String name;
    private static int id;
    private Vehicles[] vehicles = new Vehicles[10];
    //Create client objeccts nnand store vehicles arrays inside
//Ex Client josh = new CLient()
//this.vehicles[] and we can put the adddition and subtraction of array size in here too
//
    public Clients()
    {
      this.name = "";
      id++;
    }
    public Clients(String name)
    {
        this.name = name;
        id++;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public int getId()
    {
        return this.id;
    }
    public void setId()
    {

    }
    public void setVehicles(Vehicles obj)
    {
       //Vehicles
    }
}
