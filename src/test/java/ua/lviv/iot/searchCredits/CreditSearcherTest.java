package ua.lviv.iot.searchCredits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CreditSearcherTest {
	@Test
	public void testCreditSearcher() {

		String input = "Diners Club 4567 8349 6573 1239 Discover 1122334455668495 Discover 6011000990139424 JCB 3530111333300000 JCB";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		String foundCredits = CreditSearcher.findCredits(input);
		assertEquals("4567 8349 6573 1239 " + "1122334455668495 " + "6011000990139424 " + "3530111333300000 ",
				foundCredits);
	}
}
