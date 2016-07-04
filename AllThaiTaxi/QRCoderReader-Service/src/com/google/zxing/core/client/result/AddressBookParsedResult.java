package com.google.zxing.core.client.result;

public final class AddressBookParsedResult extends ParsedResult {

	private final String[] names;
	private final String pronunciation;
	private final String[] phoneNumbers;
	private final String[] emails;
	private final String note;
	private final String[] addresses;
  	private final String org;
  	private final String birthday;
  	private final String title;
  	private final String url;

  	public AddressBookParsedResult(String[] names, String pronunciation, String[] phoneNumbers, String[] emails, String note, String[] addresses, String org, String birthday, String title, String url) {
  		
  		super(ParsedResultType.ADDRESSBOOK);
  		this.names = names;
  		this.pronunciation = pronunciation;
  		this.phoneNumbers = phoneNumbers;
  		this.emails = emails;
  		this.note = note;
  		this.addresses = addresses;
  		this.org = org;
  		this.birthday = birthday;
  		this.title = title;
  		this.url = url;
  	}

  	public String[] getNames() {
  		return names;
  	}

  	/**
  	 * In Japanese, the name is written in kanji, which can have multiple readings. Therefore a hint
  	 * is often provided, called furigana, which spells the name phonetically.
  	 *
  	 * @return The pronunciation of the getNames() field, often in hiragana or katakana.
  	 */
  	public String getPronunciation() {
  		return pronunciation;
  	}

  	public String[] getPhoneNumbers() {
  		return phoneNumbers;
  	}

  	public String[] getEmails() {
  		return emails;
  	}

  	public String getNote() {
  		return note;
  	}

  	public String[] getAddresses() {
  		return addresses;
  	}

  	public String getTitle() {
  		return title;
  	}

  	public String getOrg() {
  		return org;
  	}

  	public String getURL() {
  		return url;
  	}

  	/**
  	 * @return birthday formatted as yyyyMMdd (e.g. 19780917)
  	 */
  	public String getBirthday() {
  		return birthday;
  	}

  	public String getDisplayResult() {
    
  		StringBuffer result = new StringBuffer(100);
  		maybeAppend(names, result);
  		maybeAppend(pronunciation, result);
  		maybeAppend(title, result);
  		maybeAppend(org, result);
  		maybeAppend(addresses, result);
  		maybeAppend(phoneNumbers, result);
  		maybeAppend(emails, result);
  		maybeAppend(url, result);
  		maybeAppend(birthday, result);
  		maybeAppend(note, result);
  		return result.toString();
  	}

}
