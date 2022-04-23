package TestFiles;

import static org.junit.Assert.*;

import org.junit.Test;

import SourceFiles.EquilibriumCheck;

public class EquilibriumTests {
	@Test
	public void Test1() {
		EquilibriumCheck e = new EquilibriumCheck();
		int n=3;
		int[] x= {3,-5,2};
		int[] y= {-1,2,-1};
		int[] z= {7,-4,-3};
		assertEquals("YES", e.inEquilibrium(n,x,y,z));
		
	}

	
	@Test
	public void Test2() {
		EquilibriumCheck e = new EquilibriumCheck();
		int n=13;
		int[] x= {-3,-11,42,9,-29,3,-35,14,-13,-48,50,21,0};
		int[] y= {-36,-50,-11,42,-12,9,13,43,8,-15,9,0,0};
		int[] z= {-46,37,-15,44,24,-40,50,18,24,10,-50,-50,-6};
		assertEquals("YES", e.inEquilibrium(n,x,y,z));
		
	}
	@Test
	public void Test3() {
		EquilibriumCheck e = new EquilibriumCheck();
		int n=14;
		int[] x= {43,4,5,-43,47,50,2,37,4,17,-50,-50,-50,-16};
		int[] y= {23,17,-5,-7,-48,47,14,-30,-17,9,-3,0,0,0};
		int[] z= {17,44,-16,-6,12,-45,43,15,-11,-45,-8,0,0,0};
		assertEquals("YES", e.inEquilibrium(n,x,y,z));
		
	}
	@Test
	public void Test4() {
		EquilibriumCheck e = new EquilibriumCheck();
		int n=13;
		int[] x= {29,38,25,-11,23,45,-3,-13,-30,34,-50,-50,-37};
		int[] y= {49,-11,1,28,-19,-41,0,-33,0,17,9,0,0};
		int[] z= {-11,-20,-40,11,1,-17,-19,49,28,45,-27,0,0};
		assertEquals("YES", e.inEquilibrium(n,x,y,z));
		
	}
	

}
