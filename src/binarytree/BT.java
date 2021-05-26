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
}