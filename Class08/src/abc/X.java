package abc;

public class X implements Y { // because X class is non abstract class, when we tried to implement Y in X:
							// it gives us error, and two way to fix it : unimplement methods or chage the class to Abstract
							// because Y is interface and contain abstracts methods
	public static void main(String[] args) {
		
    X objectX = new X();
    objectX.jkl();
	}

@Override
public void Zero() {
	// TODO Auto-generated method stub
	
}

@Override
public void one() {
	// TODO Auto-generated method stub
	
}

@Override
public void jkl() {
	System.out.println("override jkl");  // we overrided jkl 
}

@Override
public void two() {  
	// TODO Auto-generated method stub
	
}

@Override
public void three() {
	// TODO Auto-generated method stub
	
}

}
