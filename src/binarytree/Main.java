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
		int x=1;
		while (x!=0) {
			System.out.print("\n1. View elements by name \2 View elements by atomic number \nEnter your choice");
			try {
				x=sc.nextInt();
				switch(x) {
					case 0: System.out.println("Going back");
							break;
					case 1: treename.display(treename.gethead());
							break;
					case 2: treenum.display(treenum.gethead());
							break;
					default: System.out.println("Enter valid value.");
				}
			}
			catch(IllegalStateException E){
				System.out.println("Enter valid value.");
			}
			
		}
	}
	
	static void search() {
		int x=1;
		int check=0;
		while(x!=0) {
			try {
				if (check==0) {
					System.out.println("\nSEARCH BY-\n0. Go back \n1. Atomic number \n2. Atomic mass number \n3. Name \n4. Symbol \n Enter choice:");
					x=sc.nextInt();
				}
				switch(x){
					case 0: System.out.println("\nGoing back");
							break;
					case 1:try {
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
					case 2:try {
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
					case 3:try {
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
					case 4:try {
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
			catch(IllegalStateException E) {
				System.out.println("Enter valid value.");
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
			case 2:System.out.println("Enter block of elements to be displayed 's,p,d,f':");
					s=sc.nextLine();
					element.displayBlock(s,element.head);
					break;
		
			case  3 :   System.out.println("Enter the group name\n 0.Exit \n 1.Alkali metal \n 2.Alkali Earth Metal \n 3.Transition Metal \n 4.Metal \n 5.Non-metal \n 6.Noble Gas \n 7.Halogen  \n 8.Rare Earth : ");
				   s=sc.nextLine();
				   element.displayGroup(s,element.head);
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
