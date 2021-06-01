package binarytree;
import java.util.Scanner;

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
			createByName(head, n);
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
	void createByName(Element falsehead, Element now) {
		if (head==null)	head=now;
		else if(falsehead.name.compareTo(head.name)>0) {
			if (falsehead.right==null) falsehead.right=now;
			else createByName(falsehead.right,now);
		}
		else {
			if (falsehead.left==null) falsehead.left=now;
			else createByName(falsehead.left,now);
		}
	}
	//search by atomic number




//################# SEARCHING ELEMENTS ######################
	/*void display(Element falsehead){
		if (falsehead.left!=null) display(falsehead.left);
		falsehead.display();
		System.out.println("");
		if (falsehead.right!=null) display(falsehead.right);

	}*/
	void display(Element falsehead){
	if (falsehead.left!=null) display(falsehead.left);
	falsehead.display();
	System.out.println("..............................................................................................................");
	System.out.println("Name: "+falsehead.name+"\t"+"Chemical Symbol: "+falsehead.chemicalSymbol+"\t"+"\n"+"Block: "+falsehead.block+"\t"+"Group: "+falsehead.group+"\n"+"Atomic number: "+falsehead.atomicNo+"\t"+"Atomic mass number"+falsehead.atomicMass);
	System.out.println("..............................................................................................................");
	if (falsehead.right!=null) display(falsehead.right);

}

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




//################# MAIN METHOD ######################

	public static void main (String[] args) {
		FileIO special=new FileIO();

		BTnew tree=new BTnew();
		System.out.println("Automating");

		tree.automateName();
		System.out.println("Displaying");

		tree.display(tree.gethead());
		System.out.println("\nDone.\n");
	/*
		tree.displayGroup("Non-Metal",tree.gethead());
		System.out.println("\nDone. Starting next\n");

		tree.displayBlock("s",tree.gethead());

		*/
		//special.displaySpecial(tree.atnumSearch(tree.gethead(), 3));
		special.displaySpecial(tree.nameSearch(tree.gethead(),"Lithium" ));

		//special.displaySpecial(5);

	}

}
