package com.selenium.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.selenium.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		System.out.println("inside the print method of the phoneNumberFormatter");

		return phone.getCountryCode() + "-" + phone.getUserNumber();

	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

		System.out.println("inside the pasre method of the PhoneNumberFormatter");
		Phone phone = new Phone();
		// split the string received from the user

		String[] phoneNumberArray = completePhoneNumber.split("-");

		// whether the number consists of

		int index = completePhoneNumber.indexOf("-");

		if (index == -1 || completePhoneNumber.startsWith("-")) {

			// if the '-' is not found then add 91 as the deafault country code

			phone.setCountryCode("91");
			if (completePhoneNumber.startsWith("-")) {

				phone.setUserNumber(phoneNumberArray[1]);
			} else {
				phone.setUserNumber(phoneNumberArray[0]);
			}

		} else {

			// Extract the country code and set it to the phone class property

			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}

		return phone;
	}

}
