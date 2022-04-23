package TestFiles;

import static org.junit.Assert.*;

import org.junit.Test;

import SourceFiles.EquilibriumCheck;

public class NotEquilbriumTests {

	@Test
	public void Test1() {
		EquilibriumCheck e = new EquilibriumCheck();
		int n=3;
		int[] x= {4,-2,1};
		int[] y= {1,4,-5};
		int[] z= {7,-1,3};
		assertEquals("NO", e.inEquilibrium(n,x,y,z));
		
	}

	@Test
	public void Test2() {
		EquilibriumCheck e = new EquilibriumCheck();
		int n=10;
		int[] x= {21,43,42,22,-27,-4,-40,-13,-21,-32};
		int[] y= {32,-35,2,40,-9,1,6,-2,34,-29};
		int[] z= {-46,21,-50,20,38,1,-31,34,-12,41};
		assertEquals("NO", e.inEquilibrium(n,x,y,z));
		
	}
	@Test
	public void Test3() {
		EquilibriumCheck e = new EquilibriumCheck();
		int n=10;
		int[] x= {25,-27,-35,41,49,-49,-19,8,8,-11};
		int[] y= {-33,-42,20,-42,-39,-22,29,-27,34,-3};
		int[] z= {43,28,19,-1,-4,7,41,-43,9,33};
		assertEquals("NO", e.inEquilibrium(n,x,y,z));
		
	}
}
