package binarytree;
import java.util.Scanner;


public class Main {
	static Scanner sc=new Scanner(System.in);
	static FileIO special=new FileIO();

	static BTnew treename=new BTnew();
	static BTnew treenum=new BTnew();
	
	static void initialize() {
		treename.automateName();
		treenum.automateNumber();
	}

	
	static void viewelements() {
		String x;
		while (x!="0") {
			System.out.print("\n1. View elements by name \2 View elements by atomic number \nEnter your choice");
			
				x=sc.next();
				switch(x) {
					case "0": System.out.println("Going back");
							break;
					case "1": treename.display(treename.gethead());
							break;
					case "2": treenum.display(treenum.gethead());
							break;
					default: System.out.println("Enter valid value.");
				}
			
			
			
		}
	}
	
	static void viewgroup() {
		String x;
		while(x!="0") {
			System.out.println("Enter choice:\n0.Go back \n1.Alkali Metal \n2.Alkali Earth Metal \n3.Non-Metal \n4.Metal \n5.Halogen \n6.Noble Gas \n7.Transition Metal \n8.Rare Earth metal");
			
				x=sc.next();
				switch(x) {
				case "0":System.out.println("Going back");
					   break;
				case "1":System.out.println("Alkali group elements");
					treename.displayGroup("Alkali",treename.gethead());
					   break;
				case "2":System.out.println("Alkali Earth Metal group elements");
					treename.displayGroup("Alkali Earth Metal",treename.gethead());
					   break;
				case "3":System.out.println("Non-Metal group elements");
					treename.displayGroup("Non-Metal",treename.gethead());
					   break;
				case "4":System.out.println("Metal group elements");
					treename.displayGroup("Metal",treename.gethead());
					   break;
				case "5":System.out.println("Halogen group elements");
					treename.displayGroup("Halogen",treename.gethead());
					   break;
				case "6":System.out.println("Noble Gas group elements");
					treename.displayGroup("Noble Gas",treename.gethead());
					   break;
				case "7":System.out.println("Transition Metal group elements");
					treename.displayGroup("Transition Metal",treename.gethead());
					   break;
				case "8":System.out.println("Rare Earth group elements");
					treename.displayGroup("Rare Earth",treename.gethead());
					   break;
				default:System.out.println("Enter correct choice");
				}
			
		}
	}
	
	static void viewBlock()
	{
		
			String x;
			while(x!="0"){
				System.out.println("\n1. s - block \n 2. p - block \n 3. d - block \n 4. f - block ");
				
					x=sc.next();
					switch(x) {
						case "1": System.out.println(" s - block  Elements : ");
	                            treename.displayBlock("s",treename.gethead());
						break;

						case "2": System.out.println(" p - block	 Elements :");
							  treename.displayBlock("p",treename.gethead());
						                       break;
						case "3": System.out.println(" d - block Elements :");
							  treename.displayBlock("d",treename.gethead());
						break;

	                                                           case "4":System.out.println(" f - block Elements :");
							  treename.displayBlock("f",treename.gethead());
	                                                           break;

						default: System.out.println("Enter valid value.");
					}
					System.out.println("Do you want to continue ? \n Enter 1 for yes \n Enter 0 for no ");
					x=sc.next();
				
			}
	}
	
	static void search() {
		String x;
		int check=0;
		while(x!="0") {
			
				if (check==0) {
					System.out.println("\nSEARCH BY-\n0. Go back \n1. Atomic number \n2. Atomic mass number \n3. Name \n4. Symbol \n Enter choice:");
					x=sc.next();
				}
				switch(x){
					case "0": System.out.println("\nGoing back");
							break;
					case "1":try {
								System.out.println("\nEnter atomic number");
								int n=sc.nextInt();
								check=0;
								int y=treenum.atnumSearch(treenum.gethead(),n);
								if(y!=0) special.displaySpecial(y);
								else {
									check=1;
									System.out.println("\nElement with this atomic number does not exist.");
								}
							}
							catch(IllegalStateException E) {
								System.out.println("\nEnter valid value.");
								check=1;
							}
							break;
					case "2":try {
								System.out.println("\nEnter atomic mass");
								int n=sc.nextInt();
								check=0;
								int y=treenum.atMassSearch(treenum.gethead(),n);
								if(y!=0) special.displaySpecial(y);
								else {
									check=1;
									System.out.println("\nElement with this atomic mass does not exist.");
								}
							}
							catch(IllegalStateException E) {
								System.out.println("\nEnter valid value.");
								check=1;
							}
							break;
					case "3":try {
								System.out.print("\nEnter atomic name:");
								String n=sc.next();
								check=0;
								int y=treename.nameSearch(treenum.gethead(),n);
								if(y!=0) special.displaySpecial(y);
								else {
									check=1;
									System.out.println("\nElement with this name does not exist.");
								}
							}
							catch(IllegalStateException E) {
								System.out.println("\nEnter valid value.");
								check=1;
							}
							break;
					case "4":try {
								System.out.print("\nEnter atomic symbol:");
								String n=sc.next();
								check=0;
								int y=treename.chemicalSymbolSearch(treenum.gethead(),n);
								if(y!=0) special.displaySpecial(y);
								else {
									check=1;
									System.out.println("\nElement with this atomic symbol does not exist.");
								}
							}
							catch(IllegalStateException E) {
								System.out.println("\nEnter valid value.");
								check=1;
							}
							break;
					default:System.out.println("Enter valid value.");
				}
			
		}
	}
	
  public static void main(String[] args){
	
	initialize();
	
	String s;
	int ch=1,n,n1;
	float m;
	while(ch!=0){
		System.out.println("**********MENU**************");
		System.out.println(" 1. View all elements \n 2. View elements by block \n 3. View elements by group \n 4. View information of particular element \n 5. Play Quiz \n 0.Exit");
		System.out.println("Enter your choice : ");
		ch=sc.nextInt();
		int sch=0;
		switch(ch){
			case 0:System.out.println("\n\nExiting...");
					System.exit(0);
			case 1: viewelements();
					break;
			case 2:viewgroup();
					break;
		
			case  3 :viewBlock();
				        break;
			case 4: search();
					break;
			case 5://quiz
				break;
			default:System.out.println("Enter correct choice");
		}
	}
  }

}
