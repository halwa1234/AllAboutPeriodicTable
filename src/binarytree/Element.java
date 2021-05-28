package binarytree;







public class Element {
	FileIO elementlist=new FileIO();
	
	String name;
	String chemicalSymbol;
	String block;
	String group;
	
	float atomicMass;
	int atomicNo;
	
	Element right;
	Element left;
	
	Element(){
		name="";
		chemicalSymbol="";
		block="";
		group="";
		
		atomicMass=0;
		atomicNo=0;
		
		right=null;
		left=null;
		
	}
	
	Element(int i){
		name=elementlist.ReadCellData(i+2, 0);
		chemicalSymbol=elementlist.ReadCellData(i+2, 1);
		block="";
		group=elementlist.ReadCellData(i+2, 3);
		
		atomicMass=Integer.parseInt(elementlist.ReadCellData(i+2, 5));
		atomicNo=Integer.parseInt(elementlist.ReadCellData(i+2, 2));
		
		right=null;
		left=null;
	}
	
	void display(){
		System.out.println(name+ " ("+chemicalSymbol+")\n Group- "+group
				+ "\n Atomic Number-"+ atomicNo+ "\n Atomic Mass-"+ atomicMass);
	}
	
	
	public static void main(String[] args) {
		Element one=new Element(1);
		one.display();
	}
}


 
 






