
public class Cars extends Vehicles
{
private int Max_people;

public Cars()
{
	super();
	this.Max_people = 5;
	
}
public Cars(String Make , String Model, int YOP,int max_people)
{
	super(Make,Model,YOP);
	this.Max_people = max_people;
}
public void setMax_People(int max_people)
{
	this.Max_people = max_people;
}
public int getMax_People()
{
	return this.Max_people;
}
public Cars(Cars obj)
{
	super(obj);
	this.Max_people = obj.getMax_People();
}

public String toString()
{
	return super.toString() + " the Max amount of people is "+ this.Max_people;

}
public boolean equals(Object obj)
{
	if(obj == null || !(obj instanceof Cars))
		return false;
	Cars obj2 = (Cars) obj;
	
	return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.Max_people == obj2.Max_people;
	
}
public void Plate_Number()
{
	
}


}
