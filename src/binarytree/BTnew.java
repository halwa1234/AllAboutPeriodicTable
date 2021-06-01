package binarytree;
import java.util.Scanner;
import java.lang.Math;
public class BTnew {
	Element head;

	BTnew(){
		head=null;
	}

	Element gethead() {
		return head;
	}
//################ CREATING TREE ######################

	void automateNumber() {
		int i=1;
		Element n;
		while(i<10) {
			n=new Element(i);
			createByAtomicNo(head, n);
			i++;
		}
		System.out.println("Created!!");
	}
	void automateName() {
		int i=1;
		Element n;
		while(i<10) {
			n=new Element(i);
			createByName(n);
			i++;
		}
		System.out.println("Created!!");
	}
	void createByAtomicNo(Element falsehead, Element now) {
		if (falsehead==null) head=now;
		else if(falsehead.atomicNo<now.atomicNo) {
			if (falsehead.right==null) falsehead.right=now;
			else createByAtomicNo(falsehead.right,now);
		}
		else {
			if (falsehead.left==null) falsehead.left=now;
			else createByAtomicNo(falsehead.left,now);
		}
	}
	void createByName(Element now) {
		head=insert(head,now);
	}
	/*void createByName(Element falsehead, Element now) {
		if (head==null)	head=now;
		else if(falsehead.name.compareTo(now.name)<0) {
			if (falsehead.right==null) falsehead.right=now;
			else createByName(falsehead.right,now);
		}
		else {
			if (falsehead.left==null) falsehead.left=now;
			else createByName(falsehead.left,now);
		}
      }*/
			int height (Element root)       //tree height     
	    {
		      int lh,rh;             
		      if(root==null)
		      {
			      return 0;
		      }
		      if(root.left==null)
		      {
			       lh=0;
		      }
		     else
		      {
			       lh = 1+height(root.left);
		      }
		     if(root.right==null)
		     {
			      rh=0;
		     }
		     else
		     {
			      rh = 1+height(root.right);
		     }
		     if(lh>rh)
		     {
			      return lh;
		     }
		    else
		    {
			     return rh;
		    }
	}
	int balance(Element root) //get balance factor
	{
		int bf,lh,rh;
		if(root==null)
		{
			return 0;
		}
		if(root.left==null)
		{
			lh=0;
		}
		else
		{
			lh = 1+height(root.left);
		}
		if(root.right==null)
		{
			rh=0;
		}
		else
		{
			rh = 1+height(root.right);
		}
		bf=lh-rh;
		
		return bf;
	}

	public Element RR(Element root)//left rotation         
	{

	         Element temp=root.right;
	         root.right=temp.left;
	         temp.left=root;
	         temp.h=height(temp);
	         root.h=height(root);
	         return temp;
	}
	public Element RL(Element root)
	{
	     	root.right=LL(root.right);
	     	root=RR(root);
	     	return root;
	}
	public Element LL(Element root)//right rotation         
	{      
	       Element temp=root.left; 
	       root.left=temp.right;
	       temp.right=root;
	       temp.h=height(temp);
	       root.h=height(root);
	       return temp;
	}

	public Element LR(Element root)
	{     
		    root.left=RR(root.left);//call RR
	     root=LL(root);//call LL
	     return root;
	}


	public Element insert(Element root,Element temp)     //insert
	{                       
		  if (root==null) 
			return temp;
		    if ((temp.name).compareTo(root.name)<0) 
		     {
			      root.left=insert(root.left,temp);
			      int bal=balance(root);
			      if(bal==2||bal==-2) //tree is unbalanced
			      {
				    if((temp.name).compareTo(root.left.name)<0) 
				      {
					     root=LL(root) ;
					    // System.out.println("LL applied");
				      }
				    else 
				     {
					root=LR(root);
					//System.out.println("LR applied");
				      }
			      }
		     }
		    else
		     {
			     root.right=insert(root.right,temp);//otherwise insert into right of root
			     int bal = balance(root);
			     if(bal==2||bal==-2)//tree is unbalanced
			         {
				       if((temp.name).compareTo(root.right.name)>0)
				         {
					       root=RR(root);//call RR
					      // System.out.println("RR applied");
				         }
				       else
				         {
					       root=RL(root);
					      // System.out.println("RL applied");
				         }
			         }
		      }
		root.h = height(root);
		return(root);

	}
	
	//search by atomic number




//################# DISPLAYING ELEMENTS ######################
	void display(Element falsehead){
		if (falsehead.left!=null) display(falsehead.left);
		falsehead.display();
		System.out.println("");
		if (falsehead.right!=null) display(falsehead.right);
	}
	/*
	void display(Element falsehead){
		if (falsehead.left!=null) display(falsehead.left);
		falsehead.display();
		System.out.println("..............................................................................................................");
		System.out.println("Name: "+falsehead.name+"\t"+"Chemical Symbol: "+falsehead.chemicalSymbol+"\t"+"\n"+"Block: "+falsehead.block+"\t"+"Group: "+falsehead.group+"\n"+"Atomic number: "+falsehead.atomicNo+"\t"+"Atomic mass number"+falsehead.atomicMass);
		System.out.println("..............................................................................................................");
		if (falsehead.right!=null) display(falsehead.right);

	}
*/

	 void displayGroup(String g, Element falsehead) {
		if (falsehead.left!=null) displayGroup(g,falsehead.left);
		if (falsehead.group.compareTo(g)==0) falsehead.display();
		if (falsehead.right!=null) displayGroup(g,falsehead.right);

	 }

	 void displayBlock(String g, Element falsehead) {
			if (falsehead.left!=null) displayBlock(g,falsehead.left);
			if (falsehead.block.compareTo(g)==0) falsehead.display();
			if (falsehead.right!=null) displayBlock(g,falsehead.right);

		 }

	 void displayElement(int i, Element falsehead) {
			if (falsehead.left!=null) displayElement(i,falsehead.left);
			if (falsehead.atomicNo==i) falsehead.display();
			if (falsehead.right!=null) displayElement(i,falsehead.right);
	}

//################# SEARCHING ELEMENTS ######################
	 public int atnumSearch(Element n,int d) {
		  if(n.atomicNo==d)
			  return n.atomicNo;
		  else if(n.atomicNo<d)
			  if (n.right!=null) return atnumSearch(n.right,d);
		  if(n.left!=null) return atnumSearch(n.left,d);
		  return 0;
	  }
	 
	 public int nameSearch(Element n,String d) {
		  if(n.name.compareTo(d)==0)
			  return n.atomicNo;
		  else if(n.name.compareTo(d)<0)
			  if (n.right!=null) return nameSearch(n.right,d);
		  if(n.left!=null) return nameSearch(n.left,d);
		  return 0;
	  }
	 
	 public int chemicalSymbolSearch(Element n,String d) {
		 int x=0;
		 
		  if(n.chemicalSymbol.compareTo(d)==0)
		  {
			  x=n.atomicNo; return x;
		  }
		  
		  else {
			  if (n.right!=null && x==0) {
				   x= chemicalSymbolSearch(n.right,d);
			  }
			  if (n.left!=null && x==0) {
				   x= chemicalSymbolSearch(n.left,d);
			  }
		  }  
		  return x;
	  }

	 public int atMassSearch(Element n,int d) {
		 
		  if((int) Math.ceil(n.atomicMass)==d || (int) Math.floor(n.atomicMass)==d) return n.atomicNo;
		  else if(Math.floor(n.atomicMass)<d)
			  if (n.right!=null) return atMassSearch(n.right,d);
		  if(n.left!=null) return atMassSearch(n.left,d);
		  return 0;
	  }
//################# MAIN METHOD ######################
/*
	public static void main (String[] args) {
		FileIO special=new FileIO();

		BTnew treename=new BTnew();
		BTnew treenum=new BTnew();
		System.out.println("Automating");

		treename.automateName();
		treenum.automateNumber();
		System.out.println("Displaying");
		
		
		treenum.display(treenum.gethead());
		System.out.println("\n\n\n");
		treename.display(treename.gethead());

		System.out.println("\nDone.\n");
	
		tree.displayGroup("Non-Metal",tree.gethead());
		System.out.println("\nDone. Starting next\n");

		tree.displayBlock("s",tree.gethead());

		
		//special.displaySpecial(treenum.atnumSearch(treenum.gethead(), 1));
		//special.displaySpecial(treename.nameSearch(treename.gethead(),"Hydrogen" ));
		//special.displaySpecial(treename.chemicalSymbolSearch(treename.gethead(),"Li" ));

		special.displaySpecial(treenum.atMassSearch(treename.gethead(),1 ));
		special.displaySpecial(treenum.atMassSearch(treename.gethead(),7 ));
		//special.displaySpecial(5);

	}
*/
}
