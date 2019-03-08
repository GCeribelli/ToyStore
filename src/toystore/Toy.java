package toystore;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
            name = "Car";
            count = 12;
	}

	public Toy( String nm , int cnt)
	{
            name = nm;
            count = cnt;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
            count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
            name = nm;
	}

	public String toString()
	{
	   return "The store has " + count + " " + name + "(s)";
	}
}