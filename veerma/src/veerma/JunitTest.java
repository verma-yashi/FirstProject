package veerma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	public void sample()
	{
		Samplesdk bk=new Samplesdk();
		int result=bk.Sample(10, 20);
		assertEquals(30, result);
	}

}
