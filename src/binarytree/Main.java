package binarytree;
import java.util.Scanner;


public class Main {
  public static void main(String[] args){
	BTnew element=new BTnew();
	
	Scanner sc=new Scanner(System.in);
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
			case 1:System.out.println("All elements of Periodic table are:");
				element.display(element.head);
				break;
			case 2:System.out.println("Enter block of elements to be displayed 's,p,d,f':");
				s=sc.nextLine();
				element.displayBlock(s,element.head);
				break;
		
			case  3 :   System.out.println("Enter the group name\n 0.Exit \n 1.Alkali metal \n 2.Alkali Earth Metal \n 3.Transition Metal \n 4.Metal \n 5.Non-metal \n 6.Noble Gas \n 7.Halogen  \n 8.Rare Earth : ");
				   s=sc.nextLine();
				   element.displayGroup(s,element.head);
				   break;
			case 4:System.out.println("Enter search choice\n1Atomic number \n2.Atomic mass number \n3.Name \n4.Symbol");
				sch=sc.nextInt();
				switch(sch){
					case 1:System.out.println("Enter atomic number");
						n=sc.nextInt();
						n1=atnumSearch(element.head,n);
						displayElement(n1,element.head);
						break;
					case 2:System.out.println("Enter atomic mass number");
						m=sc.nextFloat();
						n1=atmassSearch(element.head,m);
						displayElement(n1,element.head);
						break;
					case 3:System.out.println("Enter name");
						s=sc.nextLine();
						n1=nameSearch(element.head,s);
						displayElement(n1,element.head);
						break;
					case 4:Syatem.out.println("Enter symbol");
						s=sc.nextLine();
						n1=chemicalSymbolSearch(element.head,s);
						displayElement(n1,element.head);
						break;
					default:System.out.println("Enter correct choice");
				}
				break;
			case 5://quiz
				break;
			default:System.out.println("Enter correct choice");
		}
	}
  }

}
