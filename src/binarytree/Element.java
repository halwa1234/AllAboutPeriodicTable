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
		name=elementlist.StringReadCellData(i, 0);
		chemicalSymbol=elementlist.StringReadCellData(i, 1);
		block="";
		group=elementlist.StringReadCellData(i, 3);
		
		atomicMass=(float) elementlist.IntReadCellData(i, 5);
		atomicNo=(int) elementlist.IntReadCellData(i, 2);
		
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


 
 






