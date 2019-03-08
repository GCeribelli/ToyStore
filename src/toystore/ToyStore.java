package toystore;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
            toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
            String str[] = toys.split(" ");
            ArrayList<String> t = new ArrayList<String>();
            boolean there = false;
            
            for(int i = 0; i < str.length; i++)
                t.add(str[i]);
            for(int n = 0; n < t.size(); n++){
                for(int x = 0; x < toyList.size(); x++){
                    if(t.get(n).equals(toyList.get(x).getName())){
                        toyList.get(x).setCount(toyList.get(x).getCount()+1);
                        there = true;
                    }
                }
                if(!there){
                    toyList.add(new Toy(t.get(n),1));}
                    there = false;
                
            }
	}
  
  	public Toy getThatToy( String nm )
        {
            for(Toy t: toyList){
                if(t.getName().equals(nm)){
                    return t;
                }
            }
            return null;
  	}
  
  	public String getMostFrequentToy()
  	{
            String name = " ";
            int tot = 0;
            for(Toy i: toyList){
                if(i.getCount() > tot){
                    tot = i.getCount();
                    name = i.getName();
                }
            }
  		return name;
  	}  
  
  	public void sortToysByCount()
  	{
            Toy temp;
            for(int t = 1; t < toyList.size(); t++){
                if(toyList.get(t).getCount()>toyList.get(t-1).getCount()){
                    temp = toyList.get(t-1);
                    toyList.set(t-1, toyList.get(t));
                    toyList.set(t, temp);
                }
            }
  	}  
  	  
	public String toString()
	{
            String s = "The store has ";
            for(Toy t: toyList){
                s += t.getCount() + " " + t.getName() + "(s), ";
            }
            
	   return s;
	}
}