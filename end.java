import java.util.*;
import java.io.*;




class indicator implements Serializable
{
	private static final long serialVersionUID = 1L;
}


public class end  {
	 
	public static void main(String[] args) throws IOException,FileNotFoundException,ClassNotFoundException  {
                System.out.print("\u001B[2J");
		
	//	File f= new File("animal.txt");
	//	f.createNewFile();
	//	FileOutputStream fi= new FileOutputStream (f);
	//	ObjectOutputStream oi= new ObjectOutputStream(fi);
	//	oi.writeObject(new indicator());
	//	oi.close();

        //	File g= new File("child.txt");
	//	g.createNewFile();
	//	FileOutputStream gi= new FileOutputStream (g);
	//	ObjectOutputStream pi= new ObjectOutputStream(gi);
	//	pi.writeObject(new indicator());
	//	pi.close();

	//	File h= new File("old.txt");
	//	h.createNewFile();
	//	FileOutputStream hi= new FileOutputStream (h);
	//	ObjectOutputStream qi= new ObjectOutputStream(hi);
	//	qi.writeObject(new indicator());
	//	qi.close();
		
	//	File i= new File("women.txt");
	//	i.createNewFile();
	//	FileOutputStream ii= new FileOutputStream (i);
	//	ObjectOutputStream ri= new ObjectOutputStream(ii);
	//	ri.writeObject(new indicator());
	//	ri.close();

	
		
		Scanner sc= new Scanner(System.in);
		
		
		Animal animal[]= new Animal[100];
		Oldage oldage[]= new Oldage[100];
		Child_care child[]= new Child_care[100];
		Women_welfare women[]= new Women_welfare[100];
		
		try
		{
		 
		 
         FileInputStream f11 = new FileInputStream("animal.txt");
         ObjectInputStream o11 = new ObjectInputStream(f11);
         


         FileInputStream f22 = new FileInputStream(new File("child.txt"));
         ObjectInputStream o22 = new ObjectInputStream(f22);
         
        
        
         FileInputStream f33 = new FileInputStream(new File("women.txt"));
         ObjectInputStream o33 = new ObjectInputStream(f33);
         

        FileInputStream f44 = new FileInputStream(new File("old.txt"));
        ObjectInputStream o44 = new ObjectInputStream(f44);
      
         ArrayList<Animal> animalli
         = new ArrayList<Animal>();
         
    
      Object v= null;
      
       	 while( ((v = o11.readObject()) instanceof indicator) !=true )    
       	 {
      	     
      		 animalli.add((Animal)v);
      		 v=null;
      		
         }
         
         o11.close();
         
    /////////////////////////////////////     
         ArrayList<Child_care> childli
         = new ArrayList<Child_care>();
         
    
      Object w= null;
      
       	 while( ((w = o22.readObject()) instanceof indicator) !=true )    
       	 {
      	     
      		 childli.add((Child_care)w);
      		 w=null;
      		
         }
         
         o22.close();
         
      //////////////////////////////////////////   
         ArrayList<Oldage> oldli
         = new ArrayList<Oldage>();
         
    
      Object x= null;
      
       	 while( ((x = o44.readObject()) instanceof indicator) !=true )    
       	 {
      	     
      		 oldli.add((Oldage)x);
      		 x=null;
      		
         }
         
         o44.close();
         
   ///////////////////////////////////////////////////////////////////////
         ArrayList<Women_welfare> womenli
         = new ArrayList<Women_welfare>();
         
    
      Object y= null;
      
       	 while( ((y = o33.readObject()) instanceof indicator) !=true )    
       	 {
      	     
      		 womenli.add((Women_welfare)y);
      		 y=null;
      		
         }
         
         o33.close();
//////////////////////////////////////////////////////////////
         
         
         

		System.out.println("\t\t*********************************************************\t\t");
		System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
		System.out.println("");
		System.out.println("\t\t                 NGO DATABASE WELCOMES YOU                \t\t");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t**********************************************************\t\t");
		
		int t=0;
		
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t               --- press 1 to continue ---                  \t\t");
		int press = sc.nextInt();
		
		
		

          if(press==1)
          {
               
		
		int animalcount=0,oldagecount=0,childcount=0,womencount=0;
		int counter=0;
		
		while(t==0)
		{
                        System.out.print("\u001B[2J");
			int temp;
		        System.out.println(" Are you a donator(1) or a NGO Owner(2)? ");
		        temp=sc.nextInt();
		
		
		      if(temp==2)	
		      {

			int t3;
			System.out.println(" Do you want to register(5) or check funds of your existing NGO(6)?");
			t3=sc.nextInt();
			if(t3==5)
			{
			System.out.print("\u001B[2J");
			System.out.println(" Which type of NGO you want to register? ");
			
			int choice_ngoowner;
			System.out.println(" 1: Animal Welfare");
			System.out.println(" 2: Old age welfare");
			System.out.println(" 3: Child welfare");
			System.out.println(" 4: Women welfare");
			choice_ngoowner=sc.nextInt();
			
			
			
			switch(choice_ngoowner)
			{
			   case 1:
			           System.out.print("\u001B[2J");
				   animal[animalcount]=new Animal();
				   
				   animal[animalcount].getinfo();
				   animal[animalcount].set_registration_number(animalli.size());
				   
				   FileOutputStream f1 =  new FileOutputStream( "animal.txt");
					 
					 ObjectOutputStream o1 = new ObjectOutputStream(f1);
				   
//				   o1.writeObject(animal[animalcount]);
			    animalli.add(animal[animalcount]);
				   int siz= animalli.size();
				   for(int d=0;d<siz;d++)
				   {
					 o1.writeObject(animalli.get(d)); 
				   }
				   o1.writeObject(new indicator());
				   o1.close();
				   
		                    System.out.println();
                         System.out.println();
				   System.out.println("your registration number is:  "+ animal[animalcount].get_registration_number());
				   
                                   animalcount++;
                                   counter++;
                                   break;
                    
			   case 2:
				   System.out.print("\u001B[2J");
				   oldage[oldagecount]= new Oldage();
				   oldage[oldagecount].getinfo();
				   oldage[oldagecount].set_registration_number(oldli.size());
				   
		       FileOutputStream f4 = new FileOutputStream(new File("old.txt"));
				 ObjectOutputStream o4 = new ObjectOutputStream(f4);
				 
				 oldli.add(oldage[oldagecount]);
				   int siz2= oldli.size();
				   for(int c=0;c<siz2;c++)
				   {
					 o4.writeObject(oldli.get(c));   
				   }
				  o4.writeObject(new indicator());
				   o4.close();
				   
				   
				   System.out.println();
                                   System.out.println();
				   System.out.println("your registration number is:  "+ oldage[oldagecount].get_registration_number());
			           oldagecount++;
			           counter++;
			           break;
			        
			   case 3:
				   System.out.print("\u001B[2J");
				   child[childcount]=new Child_care();
				   child[childcount].getinfo();
				   child[childcount].set_registration_number(childli.size());
				   
			         FileOutputStream f2 = new FileOutputStream(new File("child.txt"));
					 ObjectOutputStream o2 = new ObjectOutputStream(f2);
					 childli.add(child[childcount]);
					   int siz1= childli.size();
					   for(int e=0;e<siz1;e++)
					   {
						 o2.writeObject(childli.get(e));   
					   }
					  o2.writeObject(new indicator());
					   o2.close();
				   
				   
				   
				   System.out.println();
                         System.out.println();
				   System.out.println("your registration number is:  "+ child[childcount].get_registration_number());
				   childcount++;
				   counter++;
				   break;
				   
			   case 4:
			           System.out.print("\u001B[2J");
				   women[womencount]= new Women_welfare();
				   women[womencount].getinfo();
				   women[womencount].set_registration_number(womenli.size());
				   
				   
				   FileOutputStream f3 = new FileOutputStream(new File("women.txt"));
					 ObjectOutputStream o3 = new ObjectOutputStream(f3);
					 womenli.add(women[womencount]);
					   int siz3= womenli.size();
					   for(int z=0;z<siz3;z++)
					   {
						 o3.writeObject(womenli.get(z));   
					   }
					  o3.writeObject(new indicator());
					   o3.close();
				   
				   
				   
				   System.out.println();
                                   System.out.println();
				   System.out.println("your registration number is:  "+ women[womencount].get_registration_number());
				   womencount++;
				   counter++;
				   break;
			}
                         System.out.println();
                         System.out.println();
                         System.out.println("  ---press 1 to continue---  ");
                         press = sc.nextInt();
			
			}
			
			else if(t3==6)
			{
				System.out.print("\u001B[2J");
				System.out.println(" Which type of NGO you have ");
				
				int choice_ngoowner1;
				System.out.println(" 1: Animal Welfare");
				System.out.println(" 2: Old age welfare");
				System.out.println(" 3: Child welfare");
				System.out.println(" 4: Women welfare");
				choice_ngoowner1=sc.nextInt();
				int t4;
				switch(choice_ngoowner1)
				{
			      
				case 1:
				      System.out.println(""); 
				      System.out.println("enter your registration number(it should be between 0-99)");
				      t4=sc.nextInt();
				      System.out.println("your funds are: "+ animalli.get(t4).get_balance());
				      break;
				
				case 2:
				      System.out.println("");
				      System.out.println("enter your registration number(it should be between 0-99)");
				      t4=sc.nextInt();
				      System.out.println("your funds are: "+oldli.get(t4).get_balance());
				      break;
				case 3: 
				      System.out.println("");  
					System.out.println("enter your registration number(it should be between 0-99)");
				      t4=sc.nextInt();
				      System.out.println("your funds are: "+childli.get(t4).get_balance());
				      break;
				case 4:
				      System.out.println("");
					System.out.println("enter your registration number(it should be between 0-99)");
				      t4=sc.nextInt();
				      System.out.println("your funds are: "+womenli.get(t4).get_balance());
				      break;
				
				}
                                System.out.println();
                                System.out.println();
				System.out.println("  ---press 1 to continue---  ");
                                press = sc.nextInt();
				
			}

			
		}
		
		
		else if(temp==1)
		{
			int choice_ngo=0;


				int t2=0;
				while(t2==0)
				{
				        System.out.print("\u001B[2J");
				        System.out.println(" 1: Animal Welfare");
					System.out.println(" 2: Old age welfare");
					System.out.println(" 3: Child welfare");
					System.out.println(" 4: Women welfare");
					choice_ngo=sc.nextInt();
					System.out.print("\u001B[2J");
					switch(choice_ngo)
					{
					
					   case 1: 
						   
//						 
						   
							   for(int j=0;j<animalli.size();j++)
							   {
								animalli.get(j).show(1);
								System.out.println("");
								System.out.println("");
							   }
						   
						  
				            
						   
						   break;
						   
					   case 2:
//						 
						   
						   for(int j=0;j<oldli.size();j++)
						   {
							oldli.get(j).show(2);
							System.out.println("");
								System.out.println("");
						   }
						   break;
						   
					   case 3:
//						 
						   for(int j=0;j<childli.size();j++)
						   {
							childli.get(j).show(3);
							System.out.println("");
								System.out.println("");
						   }
						   
						   break;
						   
					   case 4:
//					
						   
						   for(int j=0;j<womenli.size();j++)
						   {
							womenli.get(j).show(4);
							System.out.println("");
								System.out.println("");
						   }
						   
						   break;
						   
					}
					
					System.out.println("do you want to see more lists?? press(0) else you want to donate now press(1)");
					t2=sc.nextInt();
					
					
				}
				
				if(choice_ngo==1)
				{
					int t5=0;
					double Ammount_deposit=0.0;
					System.out.println("enter the registration number of your animal NGO");
					t5=sc.nextInt();
					System.out.println(" Enter the amount you want to donate ");
					Ammount_deposit=sc.nextDouble();
					
					
					
					animalli.get(t5).add_balance(Ammount_deposit);
					   
					   FileOutputStream f1 =  new FileOutputStream( "animal.txt");
						 
						 ObjectOutputStream o1 = new ObjectOutputStream(f1);
					   
				   
					   int siz= animalli.size();
					   for(int ai=0;ai<siz;ai++)
					   {
						 o1.writeObject(animalli.get(ai));   
					   }
					  o1.writeObject(new indicator());
					   o1.close();
					


				}
				
				else if(choice_ngo==3)
				{
					int t6=0;
					double Ammount_deposit1=0.0;
					System.out.println("enter the registration number of your child NGO");
					t6=sc.nextInt();
					System.out.println(" Enter the amount you want to donate ");
					Ammount_deposit1=sc.nextDouble();
					childli.get(t6).add_balance(Ammount_deposit1);
					 FileOutputStream f2 =  new FileOutputStream( "child.txt");
					 
					 ObjectOutputStream o2 = new ObjectOutputStream(f2);
				   
			   
				   int siz= childli.size();
				   for(int bi=0;bi<siz;bi++)
				   {
					 o2.writeObject(childli.get(bi));   
				   }
				  o2.writeObject(new indicator());
				   o2.close();
					
					
					
					
				}
				
				else if(choice_ngo==2)
				{
					int t7=0;
					double Ammount_deposit2=0.0;
					System.out.println("enter the registration number of your oldage NGO");
					t7=sc.nextInt();
					System.out.println(" Enter the amount you want to donate ");
					Ammount_deposit2=sc.nextDouble();
					
					oldli.get(t7).add_balance(Ammount_deposit2);
					 FileOutputStream f4 =  new FileOutputStream( "old.txt");
					 
					 ObjectOutputStream o4 = new ObjectOutputStream(f4);
				   
			   
				   int siz= oldli.size();
				   for(int ci=0;ci<siz;ci++)
				   {
					 o4.writeObject(oldli.get(ci));   
				   }
				  o4.writeObject(new indicator());
				   o4.close();
					
					
					
					
					
				}
				else if(choice_ngo==4)
				{
					int t8=0;
					double Ammount_deposit3=0.0;
					System.out.println("enter the registration number of your women welfare NGO");
					t8=sc.nextInt();
					System.out.println(" Enter the amount you want to donate ");
					Ammount_deposit3=sc.nextDouble();
					womenli.get(t8).add_balance(Ammount_deposit3);
					 FileOutputStream f3 =  new FileOutputStream( "women.txt");
					 
					 ObjectOutputStream o3 = new ObjectOutputStream(f3);
				   
			   
				   int siz= womenli.size();
				   for(int di=0;di<siz;di++)
				   {
					 o3.writeObject(womenli.get(di));   
				   }
				  o3.writeObject(new indicator());
				   o3.close();
				}
				System.out.println();
                                System.out.println();
				System.out.println("   ---Thanks for donation--- ");
                                System.out.println();
				System.out.println("   ---press 1 to continue---  ");
                                press = sc.nextInt();
				
		} 
		
		System.out.print("\u001B[2J");
		System.out.println("Do you want to operate again?? Press(0) else press(1)");
		t=sc.nextInt();
                if(t!=0)
                {
                    System.out.println("   ---Thanks for your visit---   ");
                }


		
		}	
		}
		sc.close();
	      
		
	
		}
		catch (Exception e)
		{
			System.out.println(" caught: "+ e);
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////


class NGO implements Balance,Serializable{
	
	transient Scanner sc=new Scanner(System.in);
	 private static final long serialVersionUID = 1L;

	String name;
	
	String address;
	int staff_members;
	String contact_number;
	String email;
	double balance;
	String info;
        int registration_number;
	
	public NGO()
	{
	   name="";
	   address="";
	   staff_members=0;
	   contact_number="";
	   email="";
	   balance=0.0;
	   info="";
	  
			   
	}
	
	public void getinfo()
	{

            sc.nextLine();   
		System.out.print("Enter the name of your NGO::  ");
		name=sc.nextLine();
		
		sc.nextLine();   
		System.out.print("Enter the office address of the NGO:: ");
		address= sc.nextLine();
		
		sc.nextLine();   
		System.out.print("Enter the present number of people in the NGO:: ");
		staff_members=sc.nextInt();
		
		   
		System.out.print("Enter NGO's contact number:: ");
		contact_number=sc.nextLine();
		
		sc.nextLine();   
		System.out.print("Enter the NGO's official email address:: ");
		email=sc.nextLine();
		
		

		System.out.print("Enter the current Funds of the NGO:: ");
		balance=sc.nextDouble();
		
		sc.nextLine();       
		System.out.print("Write something about the NGO:: ");
		info=sc.nextLine();
		sc.nextLine();   
		
	}
	
	public void set_registration_number(int a)
	{
		registration_number=a;
	}
	
	public int get_registration_number()
	{
		return(registration_number);
	}
	
	
	public void show(int type)
	{
		System.out.println("Name of NGO: "+name);
		System.out.print("Type of NGO: ");
		if(type==1)
		{
			System.out.println("Animal");
		}
		else if(type==2)
		{
			System.out.println("Old age");
		}
		else if(type==3)
		{
			System.out.println("Child care");
		}
		else
		{
			System.out.println("Women welfare");
		}
		
		System.out.println("Address: "+address);
		System.out.println("total staff members: "+staff_members);
		System.out.println("Contact number: "+contact_number);
		System.out.println("Email is: "+ email);
		System.out.println("Current balance: "+ balance);
		System.out.println("info: " +info);
		System.out.println("REGISTRATION NUMBER: "+registration_number);
		
		
	}
	public void add_balance(double amt) 
	 {
		 
		 balance+=amt;	 
	 }
	 
	public  double get_balance()
	 {
		 return(balance);
	 }
	 	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Animal extends NGO implements Serializable {
	private static final long serialVersionUID = 1L;
	 transient Scanner sc=new Scanner(System.in);
	 
	 
	 int dogs;
	 int cats;
	 int cows;
	 
	public Animal()
	{
		
		dogs=0;
		cats=0;
		cows=0;
	}
	public void getinfo()  //method overriding//
	{
		super.getinfo();
		
		System.out.print("Number of dogs,cats,cows in the NGO respectively : ");
		dogs=sc.nextInt();
		cats=sc.nextInt();
		cows=sc.nextInt();
		
		
	}
	
	public void show(int type)
	{
		super.show(1);
		System.out.println("Number of dogs,cats and cows presently in the firm are : "+ dogs +" "+cats+" "+cows+" ");
		
	}
	
	

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Child_care extends NGO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	transient Scanner sc=new Scanner(System.in);
	
	int kids;
	int teenagers;
	
	
	public Child_care()
	{
		kids=0;
		teenagers=0;
		
	}
	
	public void getinfo()
	{
		super.getinfo();
		System.out.println("Number of kids and teenagers ");
		kids=sc.nextInt();
		teenagers=sc.nextInt();
		
	}
	
	public void show(int type)
	{
		super.show(3);
		System.out.println("Number of kids and teenagers are "+ kids+" "+teenagers);
	}
	

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





class Oldage extends NGO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	transient Scanner sc=new Scanner(System.in);
	 
	 
	 int men;
	 int women;
	 
	 int pension_people;
	 
	 int suffering_people;
	 
	 
	 public Oldage()
	 {
		 men=0;
		 women=0;
		 pension_people=0;
		 suffering_people=0;
	 }
	 
	 public void getinfo()
	 {
		 super.getinfo();
		 System.out.println("Number of people who are getting pensions ");
		 pension_people=sc.nextInt();
		 System.out.println("Number of suffering people");
		 suffering_people=sc.nextInt();
	 }
	 
	 
	 
	 public void show(int type)
		{
			super.show(2);
			System.out.println("Number of people who are getting pension presently in the firm are : "+pension_people+" ");
			
		}
	 
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Women_welfare extends NGO implements Serializable {
	
	
	int women;
	private static final long serialVersionUID = 1L;
	transient Scanner sc= new Scanner(System.in);
	
	public Women_welfare()
	{
		women=0;
		
	}
	
	public void getinfo()
	{
		super.getinfo();
		System.out.println("Number of womens NGO is currently helping");
		
		women=sc.nextInt();
			
		
	}
	public void show(int type)
	{
		super.show(4);
		System.out.println("Number of women are :" +women);
	}

}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
interface Balance {
	
	public void add_balance(double amt);
        public double get_balance();

}



