package binarytree;







public class Element {
	FileIO elementlist=new FileIO();
	int h;
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
		h=0;
		atomicMass=0;
		atomicNo=0;
		
		right=null;
		left=null;
		
	}
	
	Element(int i){
		name=elementlist.StringReadCellData(i, 0);
		chemicalSymbol=elementlist.StringReadCellData(i, 1);
		block=elementlist.StringReadCellData(i, 4);
		group=elementlist.StringReadCellData(i, 3);
		
		atomicMass=(float) elementlist.IntReadCellData(i, 6);
		atomicNo=(int) elementlist.IntReadCellData(i, 2);
		
		right=null;
		left=null;
	}
	
	void display(){
		System.out.println(name+ " ("+chemicalSymbol+")\n Group- "+group+"          Block- "+block
				+ "\n Atomic Number-"+ atomicNo+ "\n Atomic Mass-"+ atomicMass);
	}
	
	
	public static void main(String[] args) {
		Element one=new Element(1);
		one.display();
	}
}


 
 






