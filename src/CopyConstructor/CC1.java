package CopyConstructor;

class Tree{
	String treeName;
	int treeLengthSize;
	public Tree(String treeName,int treeLengthSize) {
		this.treeLengthSize=treeLengthSize;//considering length in meters
		this.treeName=treeName;
	}
	public Tree(Tree tree)
	{
		this.treeLengthSize=tree.treeLengthSize;
		this.treeName=tree.treeName;
	}
	public void getDetails() {
		System.out.println("Tree Name:"+treeName+"Tree's Length(in meters):"+treeLengthSize);
	}
}
public class CC1 {

	public static void main(String[] args) {
		Tree t1=new Tree("UK Liptis",9);
		t1.getDetails();
		Tree t2=new Tree(t1);
		t2.getDetails();			
	}
}
