package java8programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamArraylistIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<Student> a=new ArrayList<>();		
a.add(new Student(100,"ram","delhi",5555));
a.add(new Student(200,"om","gurgaon",8888));
a.add(new Student(500,"hari","himalaya",666));
a.add(new Student(600,"hmmm","jhhmm",444));


a.stream().filter(alist-> alist.getId()>100).forEach(alistiterate->System.out.println(alistiterate.getName()+" address "+alistiterate.getAddress()));;

ArrayList<String> names = new ArrayList<>(Arrays.asList("A","B","C","D","A")); 
//names.forEach(std->System.out.println(std));	  

//filter and forEach 
names.stream().filter(std1 -> "A".equals(std1)).forEach(value->System.out.println("values are "+value));

//filter and collect  
a.stream().filter(std->std.getId()>100 ).collect(Collectors.toList())
 .forEach(s-> System.out.println("dddd "+s.getAddress()));

List<Student> alist= a.stream().filter(std->std.getId()>100 ).collect(Collectors.toList());

alist.forEach(s->System.out.println("values address ---"+s.getAddress()+" mobile "+s.getMobile()));

////  Map 

Map<Integer,String> m=new HashMap<Integer,String>();
m.put(5,"hmhm");
m.put(1,"RAM");
m.put(2,"OM");
m.put(3,"BADAN");
m.put(4,"Hari");
// Key sorted 
m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

// value sorted 
m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

System.out.println("not maintain the order using hashmap  " +m.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap( e-> e.getKey(), e-> e.getValue())));


System.out.println("maintain order using linked hashmap : "+m.entrySet() .stream().sorted(Map.Entry.comparingByValue()) .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new)));

m.entrySet() .stream().sorted(Map.Entry.comparingByValue()) .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

//
a.sort(Comparator.comparing(Student::getId).thenComparing(Student::getId));

//m.entrySet().stream().sorted(Map.Entry.comparingByKey().Comparator.comparing(Student::getId));// @formatter:off
// compare by 
	}
	
	
}
