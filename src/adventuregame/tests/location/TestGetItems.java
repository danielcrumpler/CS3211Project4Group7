package adventuregame.tests.location;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import adventuregame.model.Location;

class TestGetItems {

	@Test
	void testGetItemsWithOneEntry() {
		Location place = new Location("placea", "placea.jpg", true, "plunger");
		place.addItem("jim", "boy genius");
		assertEquals("jim", place.getItems().get(0).getName());
		assertEquals("boy genius", place.getItems().get(0).getDescription());
	}

	@Test
	void testGetItemsWithNoEntry() {
		Location place = new Location("placeb", "placeb.jpg", true, "fork");
		assertEquals(0, place.getItems().size());
	}

	@Test
	void testGetItemsWithMultipleEntries() {
		Location place = new Location("placec", "placec.jpg", true, "spork");
		place.addItem("jim", "boy genius");
		place.addItem("carl", "Llama lord");
		assertEquals("jim", place.getItems().get(0).getName());
		assertEquals("boy genius", place.getItems().get(0).getDescription());
		assertEquals("carl", place.getItems().get(1).getName());
		assertEquals("Llama lord", place.getItems().get(1).getDescription());
	}

}
