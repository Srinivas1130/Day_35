package com.bridgelabz.day35;

import org.junit.Test;

public class TestForAddressBookData {
	 @Test
	    public void checkQueryForRetrievedDataIsValidOrNot() {
	        RetrieveAllTheDataFromDB check = new RetrieveAllTheDataFromDB();
	        String query1 = "select * from addressbookforfriends";
	        String ExpectedQuery = check.Query(query1);
	        String actual = query1;
	        Assert.assertEquals(actual, ExpectedQuery);
	    }

	    @Test
	    public void checkUpdatedQueryWeGetValidCityNameOrNot() throws SQLException {
	        UpdatingDetailsOfPerson test = new UpdatingDetailsOfPerson();
	        String query = "pune";
	        String ExpectedCity = test.retrieveData(query);
	        String actual = query;
	        Assert.assertEquals(actual, ExpectedCity);
	    }

	    @Test
	    public void checkRetreivedContactIsValidOrNot() throws SQLException {
	        RetrieveContactsOfPersons test = new RetrieveContactsOfPersons();
	        String contact = "9867546344";
	        String ExpectedContact = test.retrieveContact(contact);
	        String actual = contact;
	        Assert.assertEquals(actual, ExpectedContact);
	    }

	    @Test
	    public void checkUpdatedQueryWeGetValidPhoneNumberOrNot() throws SQLException {
	        RetrievingNumberOfContacts test = new RetrievingNumberOfContacts();
	        String phoneNum = "8600127352";
	        String ExpectedCity = test.getContactDetails(phoneNum);
	        String actual = phoneNum;
	        Assert.assertEquals(actual, ExpectedCity);
	    }

}
