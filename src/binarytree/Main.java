package binarytree;
import java.util.InputMismatchException;
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
	
	static void clearscreen() {
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}

	static void viewelements() {

				String x="";
		do{
			System.out.println("\n\n\t\t|---------------------------------------------");
			System.out.println("\t\t|   How you want to get the elements ?       |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|   1.  |     By Name                        |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|   2.  |     By Atomic                      |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|   0.  |     Exit                           |");
			System.out.println("\t\t|--------------------------------------------|\n");
			System.out.println("\n\t__________________________________________________________________________________________________\n");
			System.out.print("\t\tEnter your choice : ");

				x=sc.next();
				switch(x) {
					case "0": System.out.println("Going back");
							break;
					case "1": System.out.println("\n\t\t_________________________________________________");
						
						System.out.println(" \t\t Elements of Periodic Table are :               ");
						System.out.println("\t\t _________________________________________________\n\n");
						treename.display(treename.gethead());
							break;
					case "2": System.out.println("\n\t\t_________________________________________________");
						
						System.out.println(" \t\t Elements of Periodic Table are :               ");
						System.out.println("\t\t _________________________________________________\n\n");
						treenum.display(treenum.gethead());
							break;
					default: System.out.println("Enter valid value.");
				}

		}while(x.compareTo("0") > 0);
	}

	static void viewgroup() {
		String x="";
		do{
			System.out.println("\n\t\t|--------------------------------------------|");
			System.out.println("\t\t|             Choose the Group               |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|  1.  |  Alkali Metal                       |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|  2.  |  Alkali Earth Metal                 |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|  3.  |  Non-Metal                          |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|  4.  |  Metal                              |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|  5.  |  Halogen                            |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|  6.  | Noble Gas                           |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|  7.  |  Transition Metal                   |");
			System.out.println("\t\t|--------------------------- ----------------|");
			System.out.println("\t\t|  8.  |  Rare Earth metal                   |");
			System.out.println("\t\t|--------------------------------------------|");
			System.out.println("\t\t|  0.  |  EXIT                               |");
			System.out.println("\t\t|--------------------------------------------|\n");
			//System.out.println("Enter choice:\n0.Go back \n1.Alkali Metal \n2.Alkali Earth Metal \n3.Non-Metal \n4.Metal \n5.Halogen \n6.Noble Gas \n7.Transition Metal \n8.Rare Earth metal");
			System.out.println("\n\t__________________________________________________________________________________________________\n");
			System.out.print("\t\t Enter your choice : ");

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

		}while(x.compareTo("0") > 0);
	}

	static void viewBlock()
	{

			String x="";
			do{
				System.out.println("\n\n\t\t|----------------------------------|");
				System.out.println("\t\t|        Choose the Block          |");
				System.out.println("\t\t|----------------------------------|");
				System.out.println("\t\t|  1. | s - block                  |");
				System.out.println("\t\t|----------------------------------|");
				System.out.println("\t\t|  2. | p - block                  |");
				System.out.println("\t\t|----------------------------------|");
				System.out.println("\t\t|  3. | d - block                  |");
				System.out.println("\t\t|----------------------------------|");
				System.out.println("\t\t|  4. | f - block                  |");
				System.out.println("\t\t|----------------------------------|");
				System.out.println("\t\t|  0. | EXIT                       |");
				System.out.println("\t\t|----------------------------------|\n");
				System.out.println("\n\t__________________________________________________________________________________________________\n");
				//System.out.println("\n1. s - block \n 2. p - block \n 3. d - block \n 4. f - block ");
				System.out.print("\t\t Enter your choice : ");

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


			}while(x.compareTo("0") > 0);
	}

	static void search() {
		String x="";
		int check=0;
		do{

				if (check==0) {
					System.out.println("\n\n\t\t|--------------------------------------|");
					System.out.println("\t\t|  Choose the Search By option :       |");
					System.out.println("\t\t|--------------------------------------|");
					System.out.println("\t\t|  1. |  Atomic Number                 |");
					System.out.println("\t\t|--------------------------------------|");
					System.out.println("\t\t|  2. |  Atomic mass number            |");
					System.out.println("\t\t|--------------------------------------|");
					System.out.println("\t\t|  3. |  Name                          |");
					System.out.println("\t\t|--------------------------------------|");
					System.out.println("\t\t|  4. |  Symbol                        |");
					System.out.println("\t\t|--------------------------------------|");
					System.out.println("\t\t|  0. |  EXIT                          |");
					System.out.println("\t\t|--------------------------------------|\n");
					//System.out.println("\nSEARCH BY-\n0. Go back \n1. Atomic number \n2. Atomic mass number \n3. Name \n4. Symbol \n Enter choice:");
					System.out.println("\n\t__________________________________________________________________________________________________\n");
					System.out.print("\t\t Enter your choice : ");
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
							catch(InputMismatchException E) {
								sc.next();
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
							catch(InputMismatchException E) {
								sc.next();
								System.out.println("\nEnter valid value.");
								check=1;
							}
							break;
					case "3":try {
								System.out.print("\nEnter atomic name:");
								String n=sc.next();
								check=0;
								int y=treename.nameSearch(treename.gethead(),n);
								if(y!=0) special.displaySpecial(y);
								else {
									check=1;
									System.out.println("\nElement with this name does not exist.");
								}
							}
							catch(InputMismatchException E) {
								sc.next();
								System.out.println("\nEnter valid value.");
								check=1;
							}
							break;
					case "4":try {
								System.out.print("\nEnter atomic symbol:");
								String n=sc.next();
								check=0;
								int y=treename.chemicalSymbolSearch(treename.gethead(),n);
								if(y!=0) special.displaySpecial(y);
								else {
									check=1;
									System.out.println("\nElement with this atomic symbol does not exist.");
								}
							}
							catch(InputMismatchException E) {
								sc.next();
								System.out.println("\nEnter valid value.");
								check=1;
							}
							break;
					default:System.out.println("Enter valid value.");
				}

		}while(x.compareTo("0") > 0);
	}

  public static void main(String[] args){

	initialize();

	String s="";
	int ch=1,n,n1;
	float m;
	while(ch!=0){
		try {
			System.out.println("\t\t\t ________________________________________________________");
			System.out.println("\t\t\t|                                                        |");
			System.out.println("\t\t\t|               ALL ABOUT PERIODIC TABLE                 |");
			System.out.println("\t\t\t|________________________________________________________|");
			System.out.println("\n\t\t\tGet Everything you want about Periodic table in easy way !");
			System.out.println("\t__________________________________________________________________________________________________");
			
			System.out.println("\n");
			System.out.println("\t\t|----------------------------------------------------------------------------|");
			System.out.println("\t\t|                                 MENU                                       |");
			System.out.println("\t\t|----------------------------------------------------------------------------|");
			System.out.println("\t\t|  1. |       View all Elements                                              |");
			System.out.println("\t\t|----------------------------------------------------------------------------|");
			System.out.println("\t\t|  2. |       View Elements By Block                                         |");
			System.out.println("\t\t|----------------------------------------------------------------------------|");
			System.out.println("\t\t|  3. |       View Elements By Group                                         |");
			System.out.println("\t\t|----------------------------------------------------------------------------|");
			System.out.println("\t\t|  4. |       View Information of Particular Element                         |");
			System.out.println("\t\t|----------------------------------------------------------------------------|");
			//System.out.println("**********MENU**************");
			//System.out.println(" 1. View all elements \n 2. View elements by block \n 3. View elements by group \n 4. View information of particular element \n 5. Play Quiz \n 0.Exit");
			System.out.println("\n\t__________________________________________________________________________________________________\n");
			System.out.print("\n\t\tEnter your choice : ");
			
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
		}catch(InputMismatchException E) {
			System.out.println("Enter valid value.");
		}

	}

}
