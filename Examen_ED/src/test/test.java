package test;

import codigo.Menor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;





public class test {

	Menor menor = new Menor();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		menor.setA(15);
		menor.setB(1);
	}

	@Test
	public void test() {
		menor.menor();
	}

}
