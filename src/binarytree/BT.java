package binarytree;

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
	 public element atnumSearch(int d) {
		 return atnumSearch(root,d);
		  
	  }
	  private element atnumSearch(element n,int d) {
		  if(n==null || n.atomic_no==d)
			  return n;
		  if(n.atomic_no<d)
			  return atnumSearch(n.right,d);
		  return atnumSearch(n.left,d);
	  }
	  //search by atomic mass number
	  public element atmassSearch(float d) {
		  return atmassSearch(root,d);
	  }
	  private element atmassSearch(element n,float d) {
		  if(n==null || n.atomic_mass==d)
			  return n;
		  if(n.atomic_mass<d)
			  return atmassSearch(n.right,d);
		  return atmassSearch(n.left,d);
	  }
	  //search by name
	  public element nameSearch(String n) {
		  return nameSearch(root,n);
	  }
	  private element nameSearch(element r,String n) {
		  if(r==null || r.name.compareTo(n)==0)
			  return r;
		  if(r.name.compareTo(n)<0)
			  return nameSearch(r.right,n);
		  return nameSearch(r.left,n);
	  }
	  //search by symbol
	  public element symbolSearch(String n) {
		  return symbolSearch(root,n);
	  }
	  private element symbolSearch(element r,String n) {
		  if(r==null || r.symbol.compareTo(n)==0)
			  return r;
		  if(r.symbol.compareTo(n)<0)
			  return nameSearch(r.right,n);
		  return nameSearch(r.left,n);
	  }
	  //driver search function
	  public void search() {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the type of search:");
		  System.out.println("1.By name\n2.By atomic number\n3.By atomic mass number\n4.By symbol\n0.exit");
		  int ch,n;
		  element c=new element();
		  String s;
		  float m;
		  System.out.println("Enter choice:");
		  ch=sc.nextInt();
		  do {
			  switch(ch) {
			  case 1:
				 System.out.println("Enter name of element:");
				 s=sc.nextLine();
				 c= nameSearch(s); 
				 break;
			  case 2:
				  System.out.println("Enter atomic number of element:");
				  n=sc.nextInt();
				  c=atnumSearch(n);
				  break;
			  case 3:
				  System.out.println("Enter atomic mass number of element:");
				  m=sc.nextFloat();
				  c= atmassSearch(m);
				  break;
			  case 4:
				  System.out.println("Enter symbol of element:");
				  s=sc.nextLine();
				  c= symbolSearch(s);
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
	void display(element root){
	element temp=root;
	Scanner sc=new Scanner(System.in);
	int choice=0;

	do{
	System.out.println(" \n Enter 1 to display the elements blockwise \n Enter 2 to display all the elements of periodic table \n Enter 3 to display the elements according to name \n Enter 4 to get elements by property");
	System.out.println("Enter your choice : ");
	choice=sc.nextInt();
	switch(choice){

	case  1 : System.out.println("\n Enter s for s-block \n Enter p for p-block \n Enter d for d-block \n Enter f for f-block" );
	System.out.println("Enter your choice : ");
	String ch = sc.next();

	switch(ch)
	{
	case "s": displays(temp);
	break;
	case "p": displayp(temp);
	break;
	case "d":System.out.println(" d - block elements are : "); 
		  System.out.println(" Element \t\t  Symbol \t\t Atomic No. \t\t Atomic mass \t\t Property \t\t   Oxidation state \t\t Electronic configuration");
	displayd(temp);
	break;
	case "f": displayf(temp);
	break;
	}

	break;

	case 2: System.out.println("Elements of Periodic table : ");
		System.out.println(" Element \t\t  Symbol \t\t Atomic No. \t\t Atomic mass \t\t Property \t\t   Oxidation state \t\t Electronic configuration");
		displayall(temp);
	break; 

	case  3 : System.out.println("Elements of periodic table according to names : ");
		display_name(temp);
	break;

	case 4 : System.out.println("Get the elements by property :  \n1.Alkali metal \n2.Alkaline-earth metals \n3.Transition metal \n 4. Metals \n5. Nonmetals \n 6. Halogens \n 7. Nobal gases \n8.Rare-earth elements and Lanthanoid elements \n9. Actinoid elements ");
	System.out.println("Enter the property choice : ");
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
	case 7:System.out.println("Nobal gases: ");  
	display_nobal(temp);
	break;
	case 8:System.out.println("Rare-earth elements and lanthanoids: ");  
	display_rare(temp);
	break;
	case 9:System.out.println("Actinoids: "); 
	display_Act(temp);
	break;
	default:System.out. println("Invalid…");
	break;
	}

	break;
	}
	}while(choice!=0);

	}

	//____________________

	void  displayd(element root){



	if (root == null) 
	{
	 return; 
	} 
	displayd(root.left); 
	if((root.block).compareTo("d")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");

	}
	displayd(root.right);

	}

	//_____________________

	void  displays(element root){
	if(root==null)
	{
	return;
	}
	displays(root.left);
	if((root.block).compareTo("s")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");

	}
	displays(root.right);

	}
	//_______________________

	void displayp(element root){
	if(root==null)
	{
	return;
	}
	displayp(root.left);
	if((root.block).compareTo("p")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	displayp(root.right);
	}

	//_____________________

	void displayf(element root){
	if(root==null)
	{
	return;
	}
	displayf(root.left);
	if((root.block).compareTo("f")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	displayf(root.right);
	}

	void displayall(element root){
	if(root==null){
	return;
	}
	displayall(root.left);

	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");

	displayall(root.right);
	}

	//____________________
	//display fun after searching

	void  display_search(element node){
	System.out.println(" Element Information : ");
	System.out.println("\n NAME : “+node.name+” \n SYMBOL : “+node.symbol+” \n ATOMIC NO (Z) : “+node.atnum+” \n ATOMIC MASS (A) : “+node.atmass+” \n PROPERTY : “+node.property+” \n BLOCK : “+node.block+” \n OXIDATION STATE : “+node.os+” \n ELECTRONIC CONFIGURATION : “+node.ele_con");
	}

	//___________-
	// display function by property

	void  display_alkalli(element temp){
	if (root == null) 
	{
	 return; 
	} 
	display_alkalli(root.left); 
	if((root.property).compareTo("alkali")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	display_alkalli(root.right);


	}

	void display_alkaline(element temp){
	if (root == null) 
	{
	 return; 
	} 
	display_alkaline(root.left); 
	if((root.property).compareTo("alkaline")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	display_alkaline(root.right);
	}

	void display_tran(element temp){
	if (root == null) 
	{
	 return; 
	} 
	display_tran(root.left); 
	if((root.property).compareTo("Transition")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	display_tran(root.right);
	}

	void display_metal(element temp){
	if (root == null) 
	{
	 return; 
	} 
	display_metal(root.left); 
	if((root.property).compareTo("Metals")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	display_metal(root.right);
	}

	void display_nonm(element temp){
	if (root == null) 
	{
	 return; 
	} 
	display_nonm(root.left); 
	if((root.property).compareTo("Nonmetals")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	display_nonm(root.right);
	}

	void display_hal(element temp){
	if (root == null) 
	{
	 return; 
	} 
	display_hal(root.left); 
	if((root.property).compareTo("Halogens")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	display_hal(root.right);
	}

	void display_nobal(element temp){
	if (root == null) 
	{
	 return; 
	} 
	display_nobal(root.left); 
	if((root.property).compareTo("Nobal")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	display_nobal(root.right);
	}



	//for actinoids
	void display_Act(element temp){
	if (root == null) 
	{
	 return; 
	} 
	display_Act(root.left); 
	if((root.property).compareTo("actinoids")==0);
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	display_Act(root.right);

	}

	//for lanthanoids
	void display_rare(element temp){

	if(((root.property).compareTo("Rare earth")==0) || ((root.property).compareTo("lanthanoids")==0) );
	{
	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");
	}
	display_rare(root.right);


	}

	//___________________
	void  display_name(element temp){
	if(root==null){
	return;
	}
	display_name(root.left);

	System.out.printf("%8s %5s %4d %4f  %8s %10s %20s”,root.name,root.symbol,root.atomic_no,root.atomic_mass,root.property,root.oxidation_state,root.electronic_configuration");

	display_name(root.right);
	}


}
