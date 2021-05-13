package java8programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListJava8 {
	public static void main(String args[])
	{
	
	List<Student> alist=new ArrayList<Student>();
	alist.add(new Student(100,"ram","delhi",5555));
	alist.add(new Student(200,"hari","bhopal",9999));
	alist.add(new Student(300,"om","gurugram",7777));
	alist.add(new Student(150,"aa","abacaus",73333));
	alist.stream().filter(a-> a.getName().equalsIgnoreCase("ram")).
	collect(Collectors.toList()).forEach(a->System.out.println(" hh "+a.getName()));
	
	//alist.forEach((alistresult)-> System.out.println("list value :"+alistresult.getName()));
	//alist.forEach((a)->System.out.println(" gg "+a.getName()));    
	
 //alist.stream().filter(a-> a.getId()>50).collect(Collectors.toList()).
 //forEach(list->System.out.println(list.getName()+" idd "+list.getId()) );
 	
//first way to sorting on basis on name
 alist.sort(Comparator.comparing(Student::getName));
 alist.forEach(stdlist->System.out.println(stdlist.getName()));
//first way to sorting on basis on name 
alist.sort((Student s1,Student s2)->s1.getId()-s2.getId());
alist.forEach(oklist->System.out.println(oklist.getId()+" s "+oklist.getName())); 



 
Map<Integer, String> hm=new HashMap<Integer, String>();
hm.put(100, "RAM");
hm.put(200,"HARI");
hm.put(300,"Sita");

//hm.entrySet().stream().sorted(comparator)
 
	}

}
