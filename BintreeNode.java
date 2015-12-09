public class BintreeNode{

	int value = null;
	BintreeNode left = null;
	BintreeNode right = null;

	//Adding the left Child
	boolean add_left_child(BintreeNode parent, int newValue){
	
		if(parent.left == null){
			parent.left = new BintreeNode();
			left.value = newValue;	

			return true;
		}
		else{
			return false;
		}
	}

	//adding the right Child
	boolean add_right_child(BintreeNode parent, int newValue){
	
		if(parent.right==null){
			parent.right = new BintreeNode();
			right.value = newValue;

			return true;
		}
		else{
			return false;
		}
	}

	//Creating the Tree
	BintreeNode create_tree(int[] elements){
	
		for(int i=0;i<elements.length;i++){
			this.value = elements[0];
		}

	}
}
