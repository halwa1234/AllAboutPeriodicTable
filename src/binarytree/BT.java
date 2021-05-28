package binarytree;
import java.util.Scanner;

public class BT {
	Element head;
	
	BT(){
		head=null;
	}
	
	void createByAtomicNo(Element falsehead, Element now) {
		if (head==null)	head=now;
		else if(falsehead.atomicNo>now.atomicNo) createByAtomicNo(falsehead.right,now);
		else createByAtomicNo(falsehead.left,now);
	}
	
	void createByName(Element falsehead, Element now) {
		if (head==null)	head=now;
		else if(falsehead.name.compareTo(head.name)>0) createByAtomicNo(falsehead.right,now);
		else createByAtomicNo(falsehead.left,now);
	}
	//search by atomic number
	 public Element atnumSearch(int d) {
		 return atnumSearch(head,d);
		  
	  }
	  private Element atnumSearch(Element n,int d) {
		  if(n==null || n.atomicNo==d)
			  return n;
		  if(n.atomicNo<d)
			  return atnumSearch(n.right,d);
		  return atnumSearch(n.left,d);
	  }
	  //search by atomic mass number
	  public Element atmassSearch(float d) {
		  return atmassSearch(head,d);
	  }
	  private Element atmassSearch(Element n,float d) {
		  if(n==null || n.atomicMass==d)
			  return n;
		  if(n.atomicMass<d)
			  return atmassSearch(n.right,d);
		  return atmassSearch(n.left,d);
	  }
	  //search by name
	  public Element nameSearch(String n) {
		  return nameSearch(head,n);
	  }
	  private Element nameSearch(Element r,String n) {
		  if(r==null || r.name.compareTo(n)==0)
			  return r;
		  if(r.name.compareTo(n)<0)
			  return nameSearch(r.right,n);
		  return nameSearch(r.left,n);
	  }
	  //search by chemicalSymbol
	  public Element chemicalSymbolSearch(String n) {
		  return chemicalSymbolSearch(head,n);
	  }
	  private Element chemicalSymbolSearch(Element r,String n) {
		  if(r==null || r.chemicalSymbol.compareTo(n)==0)
			  return r;
		  if(r.chemicalSymbol.compareTo(n)<0)
			  return nameSearch(r.right,n);
		  return nameSearch(r.left,n);
	  }
	  //driver search function
	  public void search() {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the type of search:");
		  System.out.println("1.By name\n2.By atomic number\n3.By atomic mass number\n4.By chemicalSymbol\n0.exit");
		  int ch,n;
		  Element c=new Element();
		  String s;
		  float m;
		  System.out.println("Enter choice:");
		  ch=sc.nextInt();
		  do {
			  switch(ch) {
			  case 1:
				 System.out.println("Enter name of Element:");
				 s=sc.nextLine();
				 c= nameSearch(s); 
				 break;
			  case 2:
				  System.out.println("Enter atomic number of Element:");
				  n=sc.nextInt();
				  c=atnumSearch(n);
				  break;
			  case 3:
				  System.out.println("Enter atomic mass number of Element:");
				  m=sc.nextFloat();
				  c= atmassSearch(m);
				  break;
			  case 4:
				  System.out.println("Enter chemicalSymbol of Element:");
				  s=sc.nextLine();
				  c= chemicalSymbolSearch(s);
				  break;
			  case 0:
				  break;
			  default :
				  System.out.println("Enter correct choice:");
			  }
			  display_search(c);
			  System.out.println("Enter choice:");
			  ch=sc.nextInt();
		  }while(ch!=0);
		  //return c;
	  }
	//Display by block
	//assuming class name as Periodic
	void display(Element head){
	Element temp=head;
	Scanner sc=new Scanner(System.in);
	int choice=0;

	do{
	System.out.println(" \n Enter 1 to display the Elements blockwise \n Enter 2 to display all the Elements of periodic table \n Enter 3 to display the Elements according to name \n Enter 4 to get Elements by group");
	System.out.println("Enter your choice : ");
	choice=sc.nextInt();
	switch(choice){
		case  1 : 	System.out.println("\n Enter s for s-block \n Enter p for p-block \n Enter d for d-block \n Enter f for f-block" );
					System.out.println("Enter your choice : ");
					String ch = sc.next();
				
					switch(ch){
						case "s": displays(temp);
									break;
						case "p": displayp(temp);
									break;
						case "d":System.out.println(" d - block Elements are : "); 
									System.out.println(" Element \t\t  chemicalSymbol \t\t Atomic No. \t\t Atomic mass \t\t group \t\t   Oxidation state \t\t Electronic configuration");
									displayd(temp);
									break;
						case "f": displayf(temp);
									break;
					}
				
					break;
	
		case 2: System.out.println("Elements of Periodic table : ");
			System.out.println(" Element \t\t  chemicalSymbol \t\t Atomic No. \t\t Atomic mass \t\t group \t\t   Oxidation state \t\t Electronic configuration");
			displayall(temp);
		break; 
	
		case  3 : System.out.println("Elements of periodic table according to names : ");
			display_name(temp);
		break;
	
		case 4 : System.out.println("Get the Elements by group :  \n1.Alkali metal \n2.Alkaline-earth metals \n3.Transition metal \n 4. Metals \n5. Non-metals \n 6. Halogens \n 7. Noble gases \n8.Rare-earth Elements ");
		System.out.println("Enter the group choice : ");
		int op = sc.nextInt();
		switch(op)
		{
		case 1:System.out.println("Alkali metal : "); 
		display_alkalli(temp);
		break;
		case 2:System.out.println("Alkaline-earth metals : "); 
		display_alkaline(temp);
		break;
		case 3:System.out.println("Transition metals : "); 
		display_tran(temp);
		break;
		case 4:System.out.println("Metals : "); 
		display_metal(temp);
		break;
		case 5:System.out.println("Non-Metals : "); 
		display_nonm(temp);
		break;
		case 6:System.out.println("Halogens : "); 
		 display_hal(temp);
		break;
		case 7:System.out.println("Noble gases : ");  
		display_nobal(temp);
		break;
		case 8:System.out.println("Rare-earth Elements : ");  
		display_rare(temp);
		break;
		//case 9:System.out.println("Actinoids: "); 
		//display_Act(temp);
		//break;
		default:System.out. println("Invalid…");
		break;
		}
	
		break;
		}
	}while(choice!=0);

	}

	//____________________

	void  displayd(Element head){



	if (head == null) 
	{
	 return; 
	} 
	displayd(head.left); 
	if((head.block).compareTo("d")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");

	}
	displayd(head.right);

	}

	//_____________________

	void  displays(Element head){
	if(head==null)
	{
	return;
	}
	displays(head.left);
	if((head.block).compareTo("s")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");

	}
	displays(head.right);

	}
	//_______________________

	void displayp(Element head){
	if(head==null)
	{
	return;
	}
	displayp(head.left);
	if((head.block).compareTo("p")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	displayp(head.right);
	}

	//_____________________

	void displayf(Element head){
	if(head==null)
	{
	return;
	}
	displayf(head.left);
	if((head.block).compareTo("f")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	displayf(head.right);
	}

	void displayall(Element head){
	if(head==null){
	return;
	}
	displayall(head.left);

	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");

	displayall(head.right);
	}

	//____________________
	//display fun after searching

	void  display_search(Element node){
	System.out.println(" Element Information : ");
	System.out.println("\n NAME : “+node.name+” \n chemicalSymbol : “+node.chemicalSymbol+” \n ATOMIC NO (Z) : “+node.atnum+” \n ATOMIC MASS (A) : “+node.atmass+” \n group : “+node.group+” \n BLOCK : “+node.block+” \n OXIDATION STATE : “+node.os+” \n ELECTRONIC CONFIGURATION : “+node.ele_con");
	}

	//___________-
	// display function by group

	void  display_alkalli(Element temp){
	if (head == null) 
	{
	 return; 
	} 
	display_alkalli(head.left); 
	if((head.group).compareTo("Alkali")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	display_alkalli(head.right);


	}

	void display_alkaline(Element temp){
	if (head == null) 
	{
	 return; 
	} 
	display_alkaline(head.left); 
	if((head.group).compareTo("Alkali Earth Metal")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	display_alkaline(head.right);
	}

	void display_tran(Element temp){
	if (head == null) 
	{
	 return; 
	} 
	display_tran(head.left); 
	if((head.group).compareTo("Transition Metal")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	display_tran(head.right);
	}

	void display_metal(Element temp){
	if (head == null) 
	{
	 return; 
	} 
	display_metal(head.left); 
	if((head.group).compareTo("Metal")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	display_metal(head.right);
	}

	void display_nonm(Element temp){
	if (head == null) 
	{
	 return; 
	} 
	display_nonm(head.left); 
	if((head.group).compareTo("Non-metal")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	display_nonm(head.right);
	}

	void display_hal(Element temp){
	if (head == null) 
	{
	 return; 
	} 
	display_hal(head.left); 
	if((head.group).compareTo("Halogen")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	display_hal(head.right);
	}

	void display_nobal(Element temp){
	if (head == null) 
	{
	 return; 
	} 
	display_nobal(head.left); 
	if((head.group).compareTo("Noble Gas")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	display_nobal(head.right);
	}



	//for actinoids rare earth
	void display_rare(Element temp){
	if (head == null) 
	{
	 return; 
	} 
	display_rare(head.left); 
	if((head.group).compareTo("Rare Earth")==0)
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	display_rare(head.right);

	}

	/*//for lanthanoids
	void display_rare(Element temp){

	if(((head.group).compareTo("Rare earth")==0) || ((head.group).compareTo("lanthanoids")==0) );
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");
	}
	display_rare(head.right);


	}*/

	//___________________
	void  display_name(Element temp){
	if(head==null){
	return;
	}
	display_name(head.left);

	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,head.name,head.chemicalSymbol,head.atomicNo,head.atomicMass,head.group,head.oxidation_state,head.electronic_configuration");

	display_name(head.right);
	}


}
