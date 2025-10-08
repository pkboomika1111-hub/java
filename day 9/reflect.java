package com.p1;
import java.lang.reflect.*;

public class reflectexample{
  String name;
   int age;
   void show(){
	   System.out.println("Name:"+name);
	   System.out.println("Age:"+age);
   }
}
class reflect{
	public static void main(String[] args) {
   reflect r=new reflect();
   Class a=r.getClass();
    System.out.println("Classname:"+a.getName());
    System.out.println("\nFields inside the object:");
    Field fields[]=a.getDeclaredFields();
    for(Field f:fields){
    	 System.out.println(f.getName()+":"+f.getType().getSimpleName());
    }
    System.out.println("\nmethods inside the object:");
    Method methods[]=a.getDeclaredMethods();
    for(Method m:methods){
    	 System.out.println(m.getName());
    }
	}

}
