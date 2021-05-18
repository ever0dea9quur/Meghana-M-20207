package com.maven.collection;

public class Mainclass {
	public static void main(String[] args)
    {
        Framework<Integer> list = new Framework<Integer>();
 
        //Add elements
        list.add(78);
        list.add(45);
        list.add(90);
       
         
        //Remove elements from index
        list.remove(2);
       
         
        //Get element with index
        System.out.println( list.Get_element(0) );
        System.out.println( list.Get_element(1) );
       
        //List Size
        System.out.println(list.get_size());
    }
}


