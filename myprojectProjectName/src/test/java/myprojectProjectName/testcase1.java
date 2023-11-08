package myprojectProjectName;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class testcase1 {


void Duplication() {
		int[] a= {6,1,6,2,6,0,2,1 };
		int[] c_v=new int[a.length];    //c_v--count_value
			
		
				//System.out.println("The duplicate values are");
			for(int i=0;i<a.length;i++)
			{
				int count=1;
				for(int j=i+1;j<a.length;j++)
				{						
					if(a[i]==a[j]) 
					{
						count++;
						c_v[j]=-1;
					}
				}
				if(c_v[i]!=-1)
				{
					c_v[i]=count;
				
				System.out.println(a[i]+" --> "+c_v[i]+" count");
				}
				if(c_v[i]>=2) {
					//System.out.println(a[i]);
				}
			}
		}
public static void main(String[] args) {
	testcase1 obj=new testcase1();
	obj.Duplication();
}}