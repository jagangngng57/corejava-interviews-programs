package com.selenuim.strings.programs;

public final class EmployeeCustomImmutableTest {

	final String panCard;

	public EmployeeCustomImmutableTest(String panCard) {
		this.panCard = panCard;

	}

	public String getPanCard() {

		return panCard;
	}

}