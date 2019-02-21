package com.cg.reservationservice;

import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.cg.reservationservice.pojo.Reservation;

public class ResevationPOJOTest {

	@Test
	public void testShouldConstruct() {
		Reservation reservation = new Reservation("1", "Mario");

		Assert.assertEquals("1", reservation.getId());
		Assert.assertThat(reservation.getReservationName(), Matchers.equalToIgnoringCase("mario"));

		Assertions.assertThat(reservation).as("not a null reference").isNotNull();

		Assertions.assertThat(reservation.getReservationName()).as("A name populated").isNotBlank();

	}

}