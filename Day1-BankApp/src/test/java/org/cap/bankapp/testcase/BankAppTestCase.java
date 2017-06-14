package org.cap.bankapp.testcase;
import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BankAppTestCase {
	
	private int[] input;
	private int output;

	public BankAppTestCase(int[] input, int output) {
		super();
		this.input = input;
		this.output = output;
	}

	@Parameters
	public List<Object[]> myParams() {
		return Arrays.asList(new Object[][] {

		});
	}

}
