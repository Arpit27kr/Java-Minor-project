package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class append {
	
	
	private static String Username = "anshika";
	private static String Password = "abc";
	
	public static void appendtext(String filecontent)
	{
		
		//String path=System.getProperty("user.dir")+"\\"+fileName;
		//System.out.println(path);
		
		try
		{
			FileWriter fw=new FileWriter("student.txt",true);
			//fw.append('\n');
			fw.write("\n"+filecontent);
			
			fw.close();
			System.out.println("Name of student saved !!!!!!!");
			
			
		}catch(IOException e)
		{
			System.out.println("");
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void readfile(String readfile)
	{
		try {
			File myobj= new File(readfile);
		Scanner read=new Scanner(myobj);
		while(read.hasNextLine())
		{
			String data=read.nextLine();
			System.out.println(data);
		}
		System.out.println("*******************************************************************");
		System.out.println("done");
		
		
	}catch(IOException e)
		{
		System.out.println("An error occoured.");
		e.printStackTrace();
		}
		
		
	}
	
	public static void council() throws Exception
	{
		

		List<String> lines = Collections.emptyList();
		try 
		{
			lines = Files.readAllLines(Paths.get("student.txt"), StandardCharsets.UTF_8);
			}
		catch (IOException e) 
		{ // TODO Auto-generated catch block
			e.printStackTrace(); 
			} 
		//System.out.println("Content of List:");
		//System.out.println(lines);
	
		// reading text file into ArrayList 
		
		BufferedReader bufReader = new BufferedReader(new FileReader("skills.txt"));
		List<String>al = new ArrayList<>();
		
		String line = bufReader.readLine();
		
		while (line != null)
		{ 
			al.add(line);
			line = bufReader.readLine();
			}
		bufReader.close();
		
		
		
		
		//System.out.println("Content of ArrayLiList:");
	//	System.out.println(al);
		
		System.out.println("Enter Roll number of student you want to council");
		Scanner ro = new Scanner(System.in);
		int rol=ro.nextInt();
		if(rol==1)
			
		{
		
		Scanner rm1 = new Scanner(new File("Marks1.txt"));

        ArrayList<Double> m1 = new ArrayList<Double>();

        while(rm1.hasNextDouble())
        {
            m1.add(rm1.nextDouble());
        }
        rm1.close();

        System.out.println("Marks of class 1 are \t"+m1);
		
        //2nd class 
        Scanner rm2 = new Scanner(new File("Marks2.txt"));

        ArrayList<Double> m2 = new ArrayList<Double>();

        while(rm2.hasNextDouble())
        {
            m2.add(rm2.nextDouble());
        }
        rm2.close();

        System.out.println("Marks of class 2 are \t"+m2);
        
        //class 3
        Scanner rm3 = new Scanner(new File("Marks3.txt"));

        ArrayList<Double> m3 = new ArrayList<Double>();

        while(rm3.hasNextDouble())
        {
            m3.add(rm3.nextDouble());
        }
        rm3.close();
        
        System.out.println("Marks of class 3 are \t"+m3);
        
        
        //class 4
        Scanner rm4 = new Scanner(new File("Marks4.txt"));

        ArrayList<Double> m4 = new ArrayList<Double>();

        while(rm4.hasNextDouble())
        {
            m4.add(rm4.nextDouble());
        }
        rm4.close();
        
        System.out.println("Marks of class 4 are \t"+m4);
        
        //class 5
        
        Scanner rm5 = new Scanner(new File("Marks5.txt"));

        ArrayList<Double> m5 = new ArrayList<Double>();

        while(rm5.hasNextDouble())
        {
            m5.add(rm5.nextDouble());
        }
        rm5.close();
        
        System.out.println("Marks of class 5 are \t"+m5);
        
        
        
        
        
        
        
        //6 class 
        Scanner rm6 = new Scanner(new File("Marks6.txt"));

        ArrayList<Double> m6 = new ArrayList<Double>();

        while(rm6.hasNextDouble())
        {
            m6.add(rm6.nextDouble());
        }
        rm6.close();

        System.out.println("Marks of class 6 are \t"+m6);
		
        
        
       //7
        Scanner rm7 = new Scanner(new File("Marks7.txt"));

        ArrayList<Double> m7 = new ArrayList<Double>();

        while(rm7.hasNextDouble())
        {
            m7.add(rm7.nextDouble());
        }
        rm7.close();

        System.out.println("Marks of class 7 are \t"+m7);
		
        //8
        Scanner rm8 = new Scanner(new File("Marks8.txt"));

        ArrayList<Double> m8 = new ArrayList<Double>();

        while(rm8.hasNextDouble())
        {
            m8.add(rm8.nextDouble());
        }
        rm8.close();

        System.out.println("Marks of class 8 are \t"+m8);
		
        //9
        Scanner rm9 = new Scanner(new File("Marks9.txt"));

        ArrayList<Double> m9 = new ArrayList<Double>();

        while(rm9.hasNextDouble())
        {
            m9.add(rm9.nextDouble());
        }
        rm9.close();

        System.out.println("Marks of class 9 are \t"+m9);
		
        //10
        Scanner rm10 = new Scanner(new File("Marks10.txt"));

        ArrayList<Double> m10 = new ArrayList<Double>();

        while(rm10.hasNextDouble())
        {
            m10.add(rm10.nextDouble());
        }
        rm10.close();

        System.out.println("Marks of class 10 are \t"+m10);
		
        
        

        
        
        
        
	
	ArrayList<Integer>al2=new ArrayList<>();
	for(int i=0;i<al.size();i++)
	{
		al2.add((int) (m1.get(i)+m2.get(i)+m3.get(i)+m4.get(i)+m5.get(i)+m6.get(i)+m7.get(i)+m8.get(i)+m9.get(i)+m10.get(i)));
	}
	System.out.println(al2);
	bufReader.close();
	
	
	
	
	FileWriter writer = new FileWriter("output.txt"); 
	for(int str: al2) {
	  writer.write(str + System.lineSeparator());
	}
	writer.close();
	

		Scanner scanner = new Scanner(new File("output.txt"));
		int [] tall = new int [10];
		int f = 0;
		while(scanner.hasNextInt())
		{
		     tall[f++] = scanner.nextInt();
		}

		
		
	
		
		
		
		
		/*  if i want to delete file content
		PrintWriter wr = new PrintWriter("output.txt");
		wr.print("");
		wr.close();
		*/
		int maxi= maxnumber(tall);
	
		
							
		
		
		System.out.println(lines.get(rol)+" Should go in " +al.get(maxi) +" field as anecdotal marks of amit is " +tall[maxi]);
		
	
		}
		
		 else 
		{
			
			
			
			
			
			System.out.println("No Data found for roll number " +rol+" please insert the data for this");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		}
	
	

		
		
	

	private static int maxnumber(int[] tall) {
		// TODO Auto-generated method stub
		int largest = 0;
		for ( int i = 1; i < tall.length; i++ )
		{
		if ( tall[i] > tall[largest] ) 
			largest = i;
		}
		return largest; // position of the first largest found.
		}
	
	

	private static HashMap<Integer,String>
	convertArrayListToHashMap(List<String> lines)
	{

		int k=1;
		HashMap<Integer,String> hashMap = new HashMap<>();

		for (String str : lines) {

			hashMap.put(k, str);
			k++;
		}

		return hashMap;
	}
	
	public static void mark(String filecontent,int m1,int m2,int m3,int m4,int m5)
	{
		System.out.println();
		try
		{
			FileWriter fw=new FileWriter("marks1.1.txt",true);
			//fw.append('\n');
			fw.write("\n"+m1);
		
			fw.close();
			
			
			
			FileWriter fw2=new FileWriter("marks1.2.txt",true);
			
			fw2.write("\n"+m2);
			
			fw2.close();
		
			
			FileWriter fw3=new FileWriter("marks1.3.txt",true);
			//fw.append('\n');
			fw3.write("\n"+m3);
			
			fw3.close();
			
			
			
			FileWriter fw4=new FileWriter("marks1.4.txt",true);
			//fw.append('\n');
			fw4.write("\n"+m4);
			
			fw4.close();
			
			
			FileWriter fw5=new FileWriter("marks1.5.txt",true);
			//fw.append('\n');
			fw5.write("\n"+m5);
			
			fw5.close();
			
			
			System.out.println("Marks of "+ filecontent +" for all class are  saved !!!!!!!");
			
			
			
			
		}catch(IOException e)
		{
			System.out.println("");
			e.printStackTrace();
		}
	}

	

	

 
		public static boolean login()
	{
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("                                                                                 |");
			System.out.println("                         ADMIN  LOGIN                                            |");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Please enter username                                                            |");
			Scanner in = new Scanner(System.in);
			String UN = in.nextLine();
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
		    System.out.println("Please enter password                                                            |");
		    Scanner inn = new Scanner(System.in);
		    String PW = inn.nextLine();
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			 if ((UN.equals(Username) && PW.equals(Password)))
			    {
				 
		    System.out.println(" You have Successfully SIGNED IN                                                 |");
			
			    }
			 else
			 {
		    System.out.println(" Credentials are wrong                                                           |");
			 }
			System.out.println("                                                                                 |");
		    System.out.println("---------------------------------------------------------------------------------");
		    
		    
		    
		    if ((UN.equals(Username) && PW.equals(Password)))
		    {
		        return true;
		    }
		    else
		    {
		    	return false;
		    }
		
	}
	
		
		public static void parentalguide() throws IOException
		{
			List<String> lines =new ArrayList<>();
			List<String> lines2 =new ArrayList<>();
		
		  
		try {
	
			lines = Files.readAllLines(Paths.get("student.txt"), StandardCharsets.UTF_8);
			lines2=Files.readAllLines(Paths.get("parentalguide.txt"), StandardCharsets.UTF_8);
			
		    } catch (FileNotFoundException e) {
		      
		      e.printStackTrace();
		    }
		HashMap<Integer,String> languageMap = convertArrayListToHashMap(lines);
		HashMap<Integer,String> languageMap2 = convertArrayListToHashMap(lines2);
		// printing the HashMap
		System.out.println("Roll No : Student name");
		for (Entry<Integer, String> entry : languageMap.entrySet()) {

			
			System.out.println(  entry.getKey() + " \t: \t "
							+        entry.getValue());
		
		}
		
		

System.out.println("Enter the Roll number of student to search his details ");
Scanner input2=new Scanner(System.in);
int t=input2.nextInt();
if(languageMap.containsKey(t))
{
	System.out.println("Roll no.\tStudent name \t Fathers name \t Contact Number ");
System.out.println(languageMap2.get(t));
	}
else
{
	System.out.println("Enter the valid Roll number");
}


		}
		
		
		
		
		
	
	public static void main(String[] args ) throws Exception {
		// TODO Auto-generated method stub
	
		
		
		if(login()==true)
		{
			System.out.println("                                                                                 |");
			System.out.println("                                                                                 |");
			System.out.println("                        ADMIN CONSOLE                                            |");
			System.out.println("--------------------------------------------------------------------------------- ");
			Scanner input=new Scanner(System.in);
			Scanner ins=new Scanner(System.in);
			System.out.println("Hi Admin please enter 1 if you want to use our system Or Enter 5 if you want to exit");
			int press=ins.nextInt();
			System.out.println("---------------------------------------------------------------------------------");
			while(press!=5)
			{
			System.out.println("");
			System.out.println("You have following choices in our applications ");
			System.out.println("1.Insert the record");
			System.out.println("2.Council the System");
			System.out.println("3.Read the files");
			System.out.println("4.Parental Guide ");
			System.out.println("5.EXIT");
			
			
			System.out.println("Enter the choice " );
			int choice=input.nextInt();	
			
			
			if(choice==1)
			{
				Scanner input2=new Scanner(System.in);
		
					
			System.out.println("Please Enter Name of student");
			String filecontent=input2.nextLine();
			
			appendtext(filecontent);
			System.out.println();
			Scanner input4=new Scanner(System.in);
			System.out.println("enter the marks of class 1");
			int m1=input4.nextInt();
			System.out.println("enter the marks of class 2");
			int m2=input4.nextInt();
			
			System.out.println("enter the marks of class 3");
			int m3=input4.nextInt();
			
			System.out.println("enter the marks of class 4");
			int m4=input4.nextInt();
			
			System.out.println("enter the marks of class 5");
			int m5=input4.nextInt();
			
			
			
			mark(filecontent,m1,m2,m3,m4,m5);
			
			
			
			}
			
			else if (choice==2)
			{
				
				
				council();
				
							
			}
		
			else if(choice==3)
			{
				Scanner input3=new Scanner(System.in);
				System.out.println("Enter the name of file you want to read");
				String readfile=input.next();
				readfile(readfile);
				

			}
			
			else if(choice==4)
			{
				
				parentalguide();
				
			}
			
			
			
			
			else if(choice==5)
			{
				System.out.println("you have exited the application can close it");
				return;
			}
			
			
			
			
		}

         System.out.println("thanks for using ");
		
			
		}
		
		else 
		{
			System.out.println("You are not a admin please contact to Admin");
		}
	
		
		
	}

}
