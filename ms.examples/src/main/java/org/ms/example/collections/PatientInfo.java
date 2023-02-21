package org.ms.example.collections;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@XmlRootElement
public class PatientInfo implements Serializable {

	private static final long serialVersionUID = 8756351446589245529L;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "NO")
	private String dfn;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "DESIGNEE_EMAIL")
	private String designeeEmail;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "DESIGNEE_USERNAME")
	private String designeeUserName;



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "PATIENT_WEB_ACCESS")
	private String isPatientWebAccessRequested;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "DESIGNEE_WEB_ACCESS")
	private String isDesigneeWebAccessRequested;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "NO")
	private String isSelectedPatientHasWebAccess;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "NO")
	private String isSelectedDesigneeHasWebAccess;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "NO")
	private String patientICareId;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "DESIGNEE_ICAREID")
	private String designeeICareId;

	@UIGroup(name = "NO")
	private String isPatientEmailIdChanged;

	@UIGroup(name = "NO")
	private String isDesigneeEmailIdChanged;

	@UIGroup(name = "NO")
	private String designeeOldEmailId;;

	@UIGroup(name = "NO")
	private String patientOldEmailId;

	@UIGroup(name = "NO")
	private String patientOldName;

	@UIGroup(name = "NO")
	private String patientRole;

	@UIGroup(name = "NO")
	private String designeeRole;

	@UIGroup(name = "PRIMARYPROVIDER")
	private int primaryProvider;

	/// added by Snehalata

	@UIGroup(name = "PATIENT_EMAIL")
	private String userName;

	@UIGroup(name = "HIPAA")
	private String signOnFileHipaa;

	@UIGroup(name = "HIPAA")
	private String dateOfSof;



	public String getSignOnFileHipaa() {
		return signOnFileHipaa;
	}
	public void setSignOnFileHipaa(String signOnFileHipaa) {
		this.signOnFileHipaa = signOnFileHipaa;
	}
	public String getDateOfSof() {
		return dateOfSof;
	}
	public void setDateOfSof(String dateOfSof) {
		this.dateOfSof = dateOfSof;
	}

	public int getPrimaryProvider() {
		return primaryProvider;
	}

	public void setPrimaryProvider(int primaryProvider) {
		this.primaryProvider = primaryProvider;
	}



	public String getIsDesigneeEmailIdChanged() {
		return isDesigneeEmailIdChanged;
	}

	public void setIsDesigneeEmailIdChanged(String isDesigneeEmailIdChanged) {
		this.isDesigneeEmailIdChanged = isDesigneeEmailIdChanged;
	}

	public String getDesigneeOldEmailId() {
		return designeeOldEmailId;
	}

	public void setDesigneeOldEmailId(String designeeOldEmailId) {
		this.designeeOldEmailId = designeeOldEmailId;
	}

	public String getPatientOldEmailId() {
		return patientOldEmailId;
	}

	public void setPatientOldEmailId(String patientOldEmailId) {
		this.patientOldEmailId = patientOldEmailId;
	}

	public String getPatientOldName() {
		return patientOldName;
	}

	public void setPatientOldName(String patientOldName) {
		this.patientOldName = patientOldName;
	}

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "NO")
	private String designeeMailAddress;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	@UIGroup(name = "DEMOGRAPHIC")
	private String firstName;

	@NotNull
	@Size(min = 1, max = 30, message = "1-30 characters.")
	// @Pattern(regexp = "[A-Za-z ]*", message = "Only letters and spaces")
	@UIGroup(name = "DEMOGRAPHIC")
	private String lastName;

	//@NotNull
	//@Size(min = 9, max = 9, message = "9 digits.")
	// @Digits(fraction = 0, integer = 9, message = "Not valid")
	@UIGroup(name = "DEMOGRAPHIC")
	private String ssn;

	@UIGroup(name = "ALIAS")
	private String aliasSsn;

	// @NotNull
	// @Pattern(regexp = "[A-Za-z ]*", message = "Only letters and spaces")
	@UIGroup(name = "DEMOGRAPHIC")
	private String sex;

	@UIGroup(name = "DEMOGRAPHIC")
	private String pharmacyId;

	@UIGroup(name = "NO")
	private String pharmacyName;

	@UIGroup(name = "DEMOGRAPHIC")
	private String communicationPreference;

	@UIGroup(name = "ALIAS")
	private String aliasName;

	@UIGroup(name = "ALIAS")
	private String aliasIEN;

	@NotNull
	// @Temporal(TemporalType.DATE)
	@Pattern(regexp = "(0[1-9]|1[012]|[1-9])-(0[1-9]|[1-9]|[12][0-9]|3[01])-(18|19|20)\\d{2}", message = "Date must be in format: mm/dd/yyyy.")
	@UIGroup(name = "DEMOGRAPHIC")
	private String dob;

	@UIGroup(name = "DEMOGRAPHIC")
	private String dobTime;

	@UIGroup(name = "NO")
	private String type;

	@UIGroup(name = "NO")
	private String vaflag;

	@UIGroup(name = "NO")
	private String vetStatus;

	@UIGroup(name = "NO")
	private String serviceConnected;

	@UIGroup(name = "REG")
	private String multipleBirth;

	@UIGroup(name = "REG")
	private String birthOrder;

	@UIGroup(name = "REG")
	private String maritalStatus;

	@UIGroup(name = "REG")
	private String city;

	@UIGroup(name = "REG")
	private String state;

	@UIGroup(name = "REG")
	private String zip;

	@UIGroup(name = "REG")
	private String phone;

	@UIGroup(name = "REG")
	private String phoneWork;

	@UIGroup(name = "REG")
	private String email;

	@UIGroup(name = "REG")
	private String phoneCell;

	@UIGroup(name = "REG")
	private String employStatus;

	@UIGroup(name = "REG")
	private String employer;

	@UIGroup(name = "REG")
	private String employerAddr;

	@UIGroup(name = "REG")
	private String employerAddr2;

	@UIGroup(name = "REG")
	private String employerAddr3;

	@UIGroup(name = "REG")
	private String employerCity;

	@UIGroup(name = "REG")
	private String employerState;

	@UIGroup(name = "REG")
	private String employerZip;

	@UIGroup(name = "REG")
	private String employerZip4;

	@UIGroup(name = "REG")
	private String employerPhone;

	@UIGroup(name = "REG")
	private String coveredByHealthInsurance;

	@UIGroup(name = "REG")
	private String county;

	@UIGroup(name = "REG")
	private String dupeOverride;

	@UIGroup(name = "REG")
	private String patientId;

	@UIGroup(name = "REG")
	private String regDFN;

	@UIGroup(name = "REG")
	private String thinkOfSelf;

	@UIGroup(name = "REG")
	private String otherThinkOfSelf;

	@UIGroup(name = "REG")
	private String genderIdentity;

	@UIGroup(name = "REG")
	private String hasElectronicAccess;

	@UIGroup(name = "REG")
	private String otherGender;

	// Disposition
	@UIGroup(name = "DISPOSITION")
	private String followClinic;

	@UIGroup(name = "DISPOSITION")
	private String examToday;

	@UIGroup(name = "DISPOSITION")
	private String regDate;

	@UIGroup(name = "DISPOSITION")
	private String regHr;

	@UIGroup(name = "DISPOSITION")
	private String regMin;

	@UIGroup(name = "DISPOSITION")
	private String typeBenefit;

	@UIGroup(name = "DISPOSITION")
	private String typeCare;

	@UIGroup(name = "DISPOSITION")
	private String eligCode;

	@UIGroup(name = "DISPOSITION")
	private String accident;

	@UIGroup(name = "DISPOSITION")
	private String scPercentage;

	@UIGroup(name = "REG")
	private String occupation;

	// FULL registration form fields
	@UIGroup(name = "NAMECOMPONENTS")
	private String prefix;

	@UIGroup(name = "NAMECOMPONENTS")
	private String suffix;

	@UIGroup(name = "NAMECOMPONENTS")
	private String degree;

	@UIGroup(name = "NAMECOMPONENTS")
	private String middleName;

	@UIGroup(name = "RACE")
	private String[] race;

	@UIGroup(name = "GRANULARRACE")
	private String[] granularRace;

	@UIGroup(name = "ETHNICITY")
	private String ethnicity;

	@UIGroup(name = "ETHNICITY")
	private String ethnicityIEN;

	@UIGroup(name = "ETHNICITY")
	private String ethnicityRecordIEN;

	@UIGroup(name = "ETHNICITY")
	private String collectionMethod;

	@UIGroup(name = "REG")
	private String religion;

	@UIGroup(name = "REG")
	private String comments;

	@UIGroup(name = "REG")
	private String birthCity;

	@UIGroup(name = "REG")
	private String birthState;

	@UIGroup(name = "REG")
	private String pagerNumber;

	@UIGroup(name = "REG")
	private String fatherName;

	@UIGroup(name = "REG")
	private String motherName;

	@UIGroup(name = "REG")
	private String motherMaidenName;

	@UIGroup(name = "DEATH")
	private String dateofDeath;

	@UIGroup(name = "ALIAS")
	private String alias;

	@UIGroup(name = "REG")
	private String isRatedIncompetent;

	@UIGroup(name = "REG")
	private String addressLine1;

	@UIGroup(name = "REG")
	private String addressLine2;

	@UIGroup(name = "REG")
	private String addressLine3;

	@UIGroup(name = "CONFIDENTIALADDRESS")
	private String confidentialAddressCategory;

	@UIGroup(name = "CONFIDENTIALADDRESS")
	private String isConfidentialAddressActive;

	@UIGroup(name = "CONFIDENTIALADDRESS")
	private String confIEN;

	@UIGroup(name = "REG")
	private String confidentialAddressStreetLine1;

	@UIGroup(name = "REG")
	private String confidentialAddressStreetLine2;

	@UIGroup(name = "REG")
	private String confidentialAddressStreetLine3;

	@UIGroup(name = "REG")
	private String confidentialAddressCity;

	@UIGroup(name = "REG")
	private String confidentialAddressState;

	@UIGroup(name = "REG")
	private String confidentialAddressZipcode;

	@UIGroup(name = "REG")
	private String confidentialStartDate;

	@UIGroup(name = "REG")
	private String confidentialEndDate;

	@UIGroup(name = "REG")
	private String confidentialAddressCounty;

	@UIGroup(name = "REG")
	private String nameofPrimaryNextOfKin;

	@UIGroup(name = "REG")
	private String primaryNextOfKinRelationshipToPatient;

	@UIGroup(name = "REG")
	private String isPriamryNextOfKinAddressSameAsPatient;

	@UIGroup(name = "REG")
	private String primaryNextOfKinAddressStreetLine1;

	@UIGroup(name = "REG")
	private String primaryNextOfKinAddressStreetLine2;

	@UIGroup(name = "REG")
	private String primaryNextOfKinAddressStreetLine3;

	@UIGroup(name = "REG")
	private String primaryNextOfKinAddressCity;

	@UIGroup(name = "REG")
	private String primaryNextOfKinState;

	@UIGroup(name = "REG")
	private String primaryNextOfKinZipcode;

	@UIGroup(name = "REG")
	private String primaryNextOfKinZipcode4;

	@UIGroup(name = "REG")
	private String primaryNextOfKinPhoneNumber;

	@UIGroup(name = "REG")
	private String primaryNextOfKinPhoneNumberWork;

	@UIGroup(name = "REG")
	private String nameofSecondaryNextOfKin;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinRelationshipToPatient;

	@UIGroup(name = "REG")
	private String isSecondaryNextOfKinAddressSameAsPatient;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinAddressStreetLine1;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinAddressStreetLine2;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinAddressStreetLine3;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinAddressCity;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinState;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinZipcode;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinZipcode4;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinPhoneNumber;

	@UIGroup(name = "REG")
	private String secondaryNextOfKinPhoneNumberWork;

	@UIGroup(name = "DESIGNEE")
	private String isDesigneeSameAsNextOfKin;

	@UIGroup(name = "DESIGNEE")
	private String nameofDesignee;

	@UIGroup(name = "DESIGNEE")
	private String designeeRelationshipToPatient;

	@UIGroup(name = "DESIGNEE")
	private String isdesigneeAddressSameAsPatient;

	@UIGroup(name = "DESIGNEE")
	private String designeeAddressStreetLine1;

	@UIGroup(name = "DESIGNEE")
	private String designeeAddressStreetLine2;

	@UIGroup(name = "DESIGNEE")
	private String designeeAddressStreetLine3;

	@UIGroup(name = "DESIGNEE")
	private String designeeCity;

	@UIGroup(name = "DESIGNEE")
	private String designeeState;

	@UIGroup(name = "DESIGNEE")
	private String designeeZipcode;

	@UIGroup(name = "DESIGNEE")
	private String designeeZipcode4;

	@UIGroup(name = "DESIGNEE")
	private String designeePhoneNumber;

	@UIGroup(name = "DESIGNEE")
	private String designeePhoneNumberWork;

	@UIGroup(name = "REG")
	private String isEmergencyContactSameAsNextOfKin;

	@UIGroup(name = "REG")
	private String nameofEmergencyContact;

	@UIGroup(name = "REG")
	private String emergencyContactRelationshipToPatient;

	@UIGroup(name = "REG")
	private String emergencyContactAddressStreetLine1;

	@UIGroup(name = "REG")
	private String emergencyContactAddressStreetLine2;

	@UIGroup(name = "REG")
	private String emergencyContactAddressStreetLine3;

	@UIGroup(name = "REG")
	private String emergencyContactCity;

	@UIGroup(name = "REG")
	private String emergencyContactState;

	@UIGroup(name = "REG")
	private String emergencyContactZipcode;

	@UIGroup(name = "REG")
	private String emergencyContactZipcode4;

	@UIGroup(name = "REG")
	private String emergencyContactPhoneNumber;

	@UIGroup(name = "REG")
	private String emergencyContactPhoneNumberWork;

	@UIGroup(name = "REG")
	private String nameofSecondaryEmergencyContact;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactRelationshipToPatient;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactAddressStreetLine1;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactAddressStreetLine2;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactAddressStreetLine3;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactCity;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactState;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactZipcode;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactZipcode4;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactPhoneNumber;

	@UIGroup(name = "REG")
	private String secondaryEmergencyContactPhoneNumberWork;

	@UIGroup(name = "REG")
	private String fugitiveFelonFlag;

	@UIGroup(name = "REG")
	private String fugitiveFelonFlagRemovalRemarks;

	@UIGroup(name = "REG")
	private String spousesOccupation;

	@UIGroup(name = "REG")
	private String spousesRetirementDate;

	@UIGroup(name = "REG")
	private String spousesEmploymentStatus;

	@UIGroup(name = "REG")
	private String spousesEmployerName;

	@UIGroup(name = "REG")
	private String spousesEmployerStreetLine1;

	@UIGroup(name = "REG")
	private String spousesEmployerStreetLine2;

	@UIGroup(name = "REG")
	private String spousesEmployerStreetLine3;

	@UIGroup(name = "REG")
	private String spousesEmployersCity;

	@UIGroup(name = "REG")
	private String spousesEmployersState;

	@UIGroup(name = "REG")
	private String spousesEmployersZipCode;

	@UIGroup(name = "REG")
	private String spousesEmployersZipCode4;

	@UIGroup(name = "REG")
	private String spousesEmployersPhoneNumber;

	@UIGroup(name = "REG")
	private String spousePhoneNumberWork;

	@UIGroup(name = "REG")
	private String ineligibleDate;

	@UIGroup(name = "DISPOSITION")
	private String eligibleForMedicalId;

	@UIGroup(name = "DISPOSITION")
	private String dateMedicalIdLastAsked;

	@UIGroup(name = "DISPOSITION")
	private String medicalIdNumber;

	@UIGroup(name = "DISPOSITION")
	private String dispositionLog;

	@UIGroup(name = "DISPOSITION")
	private String followedInClinic;

	@UIGroup(name = "DISPOSITION")
	private String examinedToday;

	@UIGroup(name = "DISPOSITION")
	private String dateTime;

	@UIGroup(name = "DISPOSITION")
	private String facility;

	@UIGroup(name = "DISPOSITION")
	private String typeofcare;

	@UIGroup(name = "DISPOSITION")
	private String typeofbenifits;

	@UIGroup(name = "DISPOSITION")
	private String eligibilityCode;

	@UIGroup(name = "DISPOSITION")
	private String relatedtoaccident;

	@UIGroup(name = "DISPOSITION")
	private String relatedtooccupation;


	@UIGroup(name = "REG")
	private String ruledIncompetent;

	@UIGroup(name = "REG")
	private String dateRuledIncompetent;

	@UIGroup(name = "REG")
	private String guardianRelationship;

	@UIGroup(name = "REG")
	private String guardianInstitution;

	@UIGroup(name = "REG")
	private String guardian;

	@UIGroup(name = "REG")
	private String guardianAddressStreetLine1;

	@UIGroup(name = "REG")
	private String guardianAddressStreetLine2;

	@UIGroup(name = "REG")
	private String guardianCity;

	@UIGroup(name = "REG")
	private String guardianState;

	@UIGroup(name = "REG")
	private String guardianZipcode;

	@UIGroup(name = "REG")
	private String guardianZipcode4;

	@UIGroup(name = "REG")
	private String guardianPhoneNumber;

	@UIGroup(name = "REG")
	private String testPatient;

	@UIGroup(name = "NO")
	private String confidentialChangeTimeStamp;

	@UIGroup(name = "NO")
	private String priamryNextOfKinChangeTimeStamp;

	@UIGroup(name = "NO")
	private String secondaryNextOfKinChangeTimeStamp;

	@UIGroup(name = "NO")
	private String designeeChangeTimeStamp;

	@UIGroup(name = "NO")
	private String emergencyContactChangeTimeStamp;

	@UIGroup(name = "NO")
	private String secondaryEmergencyContactChangeTimeStamp;

	@UIGroup(name = "NO")
	private String fugitiveFelonFlagChangeTimeStamp;

	@UIGroup(name = "NO")
	private String dateMedicalIdLastAskedTimestamp;

	@UIGroup(name = "REG")
	private String iCareId;

	@UIGroup(name = "REG")
	private String searchable;

	@UIGroup(name = "REG")
	private String isDummyPatient;

	@UIGroup(name = "REG")
	private String languagePreference;

	@UIGroup(name = "DEATH")
	private String preliminaryCauseOfDeath;

	@UIGroup(name = "DEATH")
	private String sourceOfNotification;

	@UIGroup(name = "NO")
	private String countyFIPS;

	@UIGroup(name = "NO")
	private String confidentialAddressCountyFIPS;

	@UIGroup(name = "NO")
	private String loggedInUserInstitutionId;

	@UIGroup(name = "NO")
	private String loggedInUserCustomerId;

	@UIGroup(name = "NO")
	private String customerId;

	@UIGroup(name = "NO")
	private String customerName;

	@UIGroup(name = "REG")
	private String protectionIndicator;

	@UIGroup(name = "REG")
	private String consentIndicator;

	@UIGroup(name = "REG")
	private String prtIndicatorDate;

	@UIGroup(name = "REG")
	private String isConsentedDate;


	public String getIsConsentedDate() {
		return isConsentedDate;
	}

	public void setIsConsentedDate(String isConsentedDate) {
		this.isConsentedDate = isConsentedDate;
	}


	/*	@UIGroup(name = "INSOURANCE")
        List<Insurance> insurances;
        */
	@UIGroup(name = "HH")
	//private int houseHoldIncome;
	private String houseHoldIncome;
	public String getHouseHoldIncome() {
		return houseHoldIncome;
	}

	public void setHouseHoldIncome(String houseHoldIncome) {
		this.houseHoldIncome = houseHoldIncome;
	}
	@UIGroup(name = "HH")
	private int familyMembers;
	@UIGroup(name = "HH")
	private String employerName;


	@UIGroup(name = "GUARANTOR")
	private String guarantorFirstName;
	@UIGroup(name = "GAURANTOR")
	private String guarantorLastName;
	@UIGroup(name = "GUARANTOR")
	private String guarantorSex;
	@UIGroup(name = "GUARANTOR")
	private String guarantorSSN;
	@UIGroup(name = "GUARANTOR")
	private String guarantorPhone;
	@UIGroup(name = "GUARANTOR")
	private String guarantorAddressStreetLine1;
	@UIGroup(name = "GUARANTOR")
	private String guarantorAddressStreetLine2;
	@UIGroup(name = "GUARANTOR")
	private String guarantorCity;
	@UIGroup(name = "GUARANTOR")
	private String guarantorState;
	@UIGroup(name = "GUARANTOR")
	private String guarantorStateAbbreviation;
	@UIGroup(name = "GUARANTOR")
	private String guarantorZip;
	@UIGroup(name = "GUARANTOR")
	private String guarantorHomePhone;
	@UIGroup(name = "GUARANTOR")
	private String guarantorWorkPhone;
	@UIGroup(name = "HH")
	private String headOfHouseholdFirstName;
	@UIGroup(name = "HH")
	private String headOfHouseholdLastName;
	@UIGroup(name = "HH")
	private String headOfHouseholdSSN;
	@UIGroup(name = "HH")
	private String  guarantorPhoneOne;
	@UIGroup(name = "HH")
	private String hhSex;
	@UIGroup(name = "NO")
	private String referringProvider;
	@UIGroup(name = "HH")
	private String hhPhone;

	@UIGroup(name = "HH")
	private String headOfHouseholdRelation;
	@UIGroup(name = "NO")
	private int    primaryPhysicianId;

	@UIGroup(name = "NO")
	private String institutionName;

	@UIGroup(name = "NO")
	private String medicationCenterDivision;

	@UIGroup(name = "NO")
	private String adminUserName;

	@UIGroup(name = "NO")
	private String adminICareId;
	@UIGroup(name = "GUARANTOR")
	private String guarantorRelation;

	@UIGroup(name = "MRN")
	private String mrn;
	@UIGroup(name = "MRN")
	private String oldMrn;
	@UIGroup(name = "NO")
	private String stateAbbreviation;

	@UIGroup(name = "DEATH")
	private String deathIMOCode;

	@UIGroup(name = "DEATH")
	private String deathIMODescription;

	@UIGroup(name = "DEATH")
	private String deathIMOType;

	@UIGroup(name = "DEATH")
	private String deathIMOValueSet;

	@UIGroup(name = "DEATH")
	private String deathIMOOid;

	/**emergencyContactStateAbbreviation field is added for only Mysql*/
	@UIGroup(name = "NO")
	private String emergencyContactStateAbbreviation;


	@UIGroup(name = "NO")
	private String countyName;

	public String getHasElectronicAccess() {
		return hasElectronicAccess;
	}

	public void setHasElectronicAccess(String hasElectronicAccess) {
		this.hasElectronicAccess = hasElectronicAccess;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getBirthOrder() {
		return birthOrder;
	}

	public void setBirthOrder(String birthOrder) {
		this.birthOrder = birthOrder;
	}

	/**
	 * @return the scPercentage
	 */
	public String getScPercentage() {
		return scPercentage;
	}

	/**
	 * @param scPercentage the scPercentage to set
	 */
	public void setScPercentage(String scPercentage) {
		this.scPercentage = scPercentage;
	}

	/**
	 * @return the emergencyContactStateAbbreviation
	 */
	public String getEmergencyContactStateAbbreviation() {
		return emergencyContactStateAbbreviation;
	}

	public String getIsDummyPatient() {
		return isDummyPatient;
	}

	public void setIsDummyPatient(String isDummyPatient) {
		this.isDummyPatient = isDummyPatient;
	}

	/**
	 * @param emergencyContactStateAbbreviation the emergencyContactStateAbbreviation to set
	 */
	public void setEmergencyContactStateAbbreviation(
			String emergencyContactStateAbbreviation) {
		this.emergencyContactStateAbbreviation = emergencyContactStateAbbreviation;
	}

	public String getOtherGender() {
		return otherGender;
	}

	public void setOtherGender(String otherGender) {
		this.otherGender = otherGender;
	}

	public String getDeathIMOCode() {
		return deathIMOCode;
	}

	public void setDeathIMOCode(String deathIMOCode) {
		this.deathIMOCode = deathIMOCode;
	}

	public String getDeathIMODescription() {
		return deathIMODescription;
	}

	public void setDeathIMODescription(String deathIMODescription) {
		this.deathIMODescription = deathIMODescription;
	}

	public String getDeathIMOType() {
		return deathIMOType;
	}

	public void setDeathIMOType(String deathIMOType) {
		this.deathIMOType = deathIMOType;
	}

	public String getDeathIMOValueSet() {
		return deathIMOValueSet;
	}

	public void setDeathIMOValueSet(String deathIMOValueSet) {
		this.deathIMOValueSet = deathIMOValueSet;
	}

	public String getDeathIMOOid() {
		return deathIMOOid;
	}

	public void setDeathIMOOid(String deathIMOOid) {
		this.deathIMOOid = deathIMOOid;
	}

	public String getDobTime() {
		return dobTime;
	}

	public void setDobTime(String dobTime) {
		this.dobTime = dobTime;
	}

	/**
	 *@return the stateAbbreviation
	 */
	public String getStateAbbreviation() {
		return stateAbbreviation;
	}

	/**
	 * @param stateAbbreviation the stateAbbreviation to set
	 */
	public void setStateAbbreviation(String stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
	}

	public String getMrn() {
		return mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public String getOldMrn() {
		return oldMrn;
	}

	public void setOldMrn(String oldMrn) {
		this.oldMrn = oldMrn;
	}

	public String getGuarantorRelation() {
		return guarantorRelation;
	}

	public void setGuarantorRelation(String guarantorRelation) {
		this.guarantorRelation = guarantorRelation;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getMedicationCenterDivision() {
		return medicationCenterDivision;
	}

	public void setMedicationCenterDivision(String medicationCenterDivision) {
		this.medicationCenterDivision = medicationCenterDivision;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getAdminICareId() {
		return adminICareId;
	}

	public void setAdminICareId(String adminICareId) {
		this.adminICareId = adminICareId;
	}

	public String getReferringProvider() {
		return referringProvider;
	}
	public void setReferringProvider(String referringProvider) {
		this.referringProvider = referringProvider;
	}
	public String getGuarantorPhone() {
		return guarantorPhone;
	}

	public void setGuarantorPhone(String guarantorPhone) {
		this.guarantorPhone = guarantorPhone;
	}

	public String getHhPhone() {
		return hhPhone;
	}

	public void setHhPhone(String hhPhone) {
		this.hhPhone = hhPhone;
	}




	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLoggedInUserInstitutionId() {
		return loggedInUserInstitutionId;
	}

	public void setLoggedInUserInstitutionId(String loggedInUserInstitutionId) {
		this.loggedInUserInstitutionId = loggedInUserInstitutionId;
	}

	public String getLoggedInUserCustomerId() {
		return loggedInUserCustomerId;
	}

	public void setLoggedInUserCustomerId(String loggedInUserCustomerId) {
		this.loggedInUserCustomerId = loggedInUserCustomerId;
	}

	public String getLanguagePreference() {
		return languagePreference;
	}

	public void setLanguagePreference(String languagePreference) {
		this.languagePreference = languagePreference;
	}

	public String getPreliminaryCauseOfDeath() {
		return preliminaryCauseOfDeath;
	}

	public void setPreliminaryCauseOfDeath(String preliminaryCauseOfDeath) {
		this.preliminaryCauseOfDeath = preliminaryCauseOfDeath;
	}

	public String getSourceOfNotification() {
		return sourceOfNotification;
	}

	public void setSourceOfNotification(String sourceOfNotification) {
		this.sourceOfNotification = sourceOfNotification;
	}

	public String getCountyFIPS() {
		return countyFIPS;
	}

	public void setCountyFIPS(String countyFIPS) {
		this.countyFIPS = countyFIPS;
	}

	public String getConfidentialAddressCountyFIPS() {
		return confidentialAddressCountyFIPS;
	}

	public void setConfidentialAddressCountyFIPS(
			String confidentialAddressCountyFIPS) {
		this.confidentialAddressCountyFIPS = confidentialAddressCountyFIPS;
	}



	public String getDateMedicalIdLastAskedTimestamp() {
		return dateMedicalIdLastAskedTimestamp;
	}

	public void setDateMedicalIdLastAskedTimestamp(
			String dateMedicalIdLastAskedTimestamp) {
		this.dateMedicalIdLastAskedTimestamp = dateMedicalIdLastAskedTimestamp;
	}

	public String getiCareId() {
		return iCareId;
	}

	public void setiCareId(String iCareId) {
		this.iCareId = iCareId;
	}

	public String getDfn() {
		return dfn;
	}

	public void setDfn(String dfn) {
		this.dfn = dfn;
	}

	public String getAliasSsn() {
		return aliasSsn;
	}

	public void setAliasSsn(String aliasSsn) {
		this.aliasSsn = aliasSsn;
	}

	public String getRegDFN() {
		return regDFN;
	}

	public void setRegDFN(String regDFN) {
		this.regDFN = regDFN;
	}

	public String getTypeBenefit() {
		return typeBenefit;
	}

	public void setTypeBenefit(String typeBenefit) {
		this.typeBenefit = typeBenefit;
	}

	public String getTypeCare() {
		return typeCare;
	}

	public void setTypeCare(String typeCare) {
		this.typeCare = typeCare;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public String getFollowClinic() {
		return followClinic;
	}

	public void setFollowClinic(String followClinic) {
		this.followClinic = followClinic;
	}

	public String getExamToday() {
		return examToday;
	}

	public void setExamToday(String examToday) {
		this.examToday = examToday;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getEligCode() {
		return eligCode;
	}

	public void setEligCode(String eligCode) {
		this.eligCode = eligCode;
	}

	public String getAccident() {
		return accident;
	}

	public void setAccident(String accident) {
		this.accident = accident;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCommunicationPreference() {
		return communicationPreference;
	}

	public void setCommunicationPreference(String communicationPreference) {
		this.communicationPreference = communicationPreference;
	}
	public String getDob() {
		return dob;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVaflag() {
		return vaflag;
	}

	public void setVaflag(String vaflag) {
		this.vaflag = vaflag;
	}

	public String getServiceConnected() {
		return serviceConnected;
	}

	public void setServiceConnected(String serviceConnected) {
		this.serviceConnected = serviceConnected;
	}

	public String getMultipleBirth() {
		return multipleBirth;
	}

	public void setMultipleBirth(String multipleBirth) {
		this.multipleBirth = multipleBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneWork() {
		return phoneWork;
	}

	public void setPhoneWork(String phoneWork) {
		this.phoneWork = phoneWork;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneCell() {
		return phoneCell;
	}

	public void setPhoneCell(String phoneCell) {
		this.phoneCell = phoneCell;
	}

	public String getEmployStatus() {
		return employStatus;
	}

	public void setEmployStatus(String employStatus) {
		this.employStatus = employStatus;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmployerAddr() {
		return employerAddr;
	}

	public void setEmployerAddr(String employerAddr) {
		this.employerAddr = employerAddr;
	}

	public String getEmployerAddr2() {
		return employerAddr2;
	}

	public void setEmployerAddr2(String employerAddr2) {
		this.employerAddr2 = employerAddr2;
	}

	public String getEmployerAddr3() {
		return employerAddr3;
	}

	public void setEmployerAddr3(String employerAddr3) {
		this.employerAddr3 = employerAddr3;
	}

	public String getEmployerCity() {
		return employerCity;
	}

	public void setEmployerCity(String employerCity) {
		this.employerCity = employerCity;
	}

	public String getEmployerState() {
		return employerState;
	}

	public void setEmployerState(String employerState) {
		this.employerState = employerState;
	}

	public String getEmployerZip() {
		return employerZip;
	}

	public void setEmployerZip(String employerZip) {
		this.employerZip = employerZip;
	}

	public String getEmployerPhone() {
		return employerPhone;
	}

	public void setEmployerPhone(String employerPhone) {
		this.employerPhone = employerPhone;
	}

	public String getDupeOverride() {
		return dupeOverride;
	}

	public void setDupeOverride(String dupeOverride) {
		this.dupeOverride = dupeOverride;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getRegHr() {
		return regHr;
	}

	public void setRegHr(String regHr) {
		this.regHr = regHr;
	}

	public String getRegMin() {
		return regMin;
	}

	public void setRegMin(String regMin) {
		this.regMin = regMin;
	}

	/**
	 * return String - value of every parameter
	 */

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getBirthCity() {
		return birthCity;
	}

	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	public String getBirthState() {
		return birthState;
	}

	public void setBirthState(String birthState) {
		this.birthState = birthState;
	}

	public String getPagerNumber() {
		return pagerNumber;
	}

	public void setPagerNumber(String pagerNumber) {
		this.pagerNumber = pagerNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherMaidenName() {
		return motherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}

	public String getDateofDeath() {
		return dateofDeath;
	}

	public void setDateofDeath(String dateofDeath) {
		this.dateofDeath = dateofDeath;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getIsRatedIncompetent() {
		return isRatedIncompetent;
	}

	public void setIsRatedIncompetent(String isRatedIncompetent) {
		this.isRatedIncompetent = isRatedIncompetent;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getConfidentialAddressCategory() {
		return confidentialAddressCategory;
	}

	public void setConfidentialAddressCategory(
			String confidentialAddressCategory) {
		this.confidentialAddressCategory = confidentialAddressCategory;
	}

	public String getIsConfidentialAddressActive() {
		return isConfidentialAddressActive;
	}

	public void setIsConfidentialAddressActive(
			String isConfidentialAddressActive) {
		this.isConfidentialAddressActive = isConfidentialAddressActive;
	}

	public String getConfidentialAddressStreetLine1() {
		return confidentialAddressStreetLine1;
	}

	public void setConfidentialAddressStreetLine1(
			String confidentialAddressStreetLine1) {
		this.confidentialAddressStreetLine1 = confidentialAddressStreetLine1;
	}

	public String getConfidentialAddressStreetLine2() {
		return confidentialAddressStreetLine2;
	}

	public void setConfidentialAddressStreetLine2(
			String confidentialAddressStreetLine2) {
		this.confidentialAddressStreetLine2 = confidentialAddressStreetLine2;
	}

	public String getConfidentialAddressStreetLine3() {
		return confidentialAddressStreetLine3;
	}

	public void setConfidentialAddressStreetLine3(
			String confidentialAddressStreetLine3) {
		this.confidentialAddressStreetLine3 = confidentialAddressStreetLine3;
	}

	public String getConfidentialAddressCity() {
		return confidentialAddressCity;
	}

	public void setConfidentialAddressCity(String confidentialAddressCity) {
		this.confidentialAddressCity = confidentialAddressCity;
	}

	public String getConfidentialAddressState() {
		return confidentialAddressState;
	}

	public void setConfidentialAddressState(String confidentialAddressState) {
		this.confidentialAddressState = confidentialAddressState;
	}

	public String getConfidentialAddressZipcode() {
		return confidentialAddressZipcode;
	}

	public void setConfidentialAddressZipcode(String confidentialAddressZipcode) {
		this.confidentialAddressZipcode = confidentialAddressZipcode;
	}

	public String getConfidentialStartDate() {
		return confidentialStartDate;
	}

	public void setConfidentialStartDate(String confidentialStartDate) {
		this.confidentialStartDate = confidentialStartDate;
	}

	public String getConfidentialEndDate() {
		return confidentialEndDate;
	}

	public void setConfidentialEndDate(String confidentialEndDate) {
		this.confidentialEndDate = confidentialEndDate;
	}

	public String getNameofPrimaryNextOfKin() {
		return nameofPrimaryNextOfKin;
	}

	public void setNameofPrimaryNextOfKin(String nameofPrimaryNextOfKin) {
		this.nameofPrimaryNextOfKin = nameofPrimaryNextOfKin;
	}

	public String getPrimaryNextOfKinRelationshipToPatient() {
		return primaryNextOfKinRelationshipToPatient;
	}

	public void setPrimaryNextOfKinRelationshipToPatient(
			String primaryNextOfKinRelationshipToPatient) {
		this.primaryNextOfKinRelationshipToPatient = primaryNextOfKinRelationshipToPatient;
	}

	public String getIsPriamryNextOfKinAddressSameAsPatient() {
		return isPriamryNextOfKinAddressSameAsPatient;
	}

	public void setIsPriamryNextOfKinAddressSameAsPatient(
			String isPriamryNextOfKinAddressSameAsPatient) {
		this.isPriamryNextOfKinAddressSameAsPatient = isPriamryNextOfKinAddressSameAsPatient;
	}

	public String getPrimaryNextOfKinAddressStreetLine1() {
		return primaryNextOfKinAddressStreetLine1;
	}

	public void setPrimaryNextOfKinAddressStreetLine1(
			String primaryNextOfKinAddressStreetLine1) {
		this.primaryNextOfKinAddressStreetLine1 = primaryNextOfKinAddressStreetLine1;
	}

	public String getPrimaryNextOfKinAddressStreetLine2() {
		return primaryNextOfKinAddressStreetLine2;
	}

	public void setPrimaryNextOfKinAddressStreetLine2(
			String primaryNextOfKinAddressStreetLine2) {
		this.primaryNextOfKinAddressStreetLine2 = primaryNextOfKinAddressStreetLine2;
	}

	public String getPrimaryNextOfKinAddressStreetLine3() {
		return primaryNextOfKinAddressStreetLine3;
	}

	public void setPrimaryNextOfKinAddressStreetLine3(
			String primaryNextOfKinAddressStreetLine3) {
		this.primaryNextOfKinAddressStreetLine3 = primaryNextOfKinAddressStreetLine3;
	}

	public String getPrimaryNextOfKinAddressCity() {
		return primaryNextOfKinAddressCity;
	}

	public void setPrimaryNextOfKinAddressCity(
			String primaryNextOfKinAddressCity) {
		this.primaryNextOfKinAddressCity = primaryNextOfKinAddressCity;
	}

	public String getPrimaryNextOfKinState() {
		return primaryNextOfKinState;
	}

	public void setPrimaryNextOfKinState(String primaryNextOfKinState) {
		this.primaryNextOfKinState = primaryNextOfKinState;
	}

	public String getPrimaryNextOfKinZipcode() {
		return primaryNextOfKinZipcode;
	}

	public void setPrimaryNextOfKinZipcode(String primaryNextOfKinZipcode) {
		this.primaryNextOfKinZipcode = primaryNextOfKinZipcode;
	}

	public String getPrimaryNextOfKinZipcode4() {
		return primaryNextOfKinZipcode4;
	}

	public void setPrimaryNextOfKinZipcode4(String primaryNextOfKinZipcode4) {
		this.primaryNextOfKinZipcode4 = primaryNextOfKinZipcode4;
	}

	public String getPrimaryNextOfKinPhoneNumberWork() {
		return primaryNextOfKinPhoneNumberWork;
	}

	public void setPrimaryNextOfKinPhoneNumberWork(
			String primaryNextOfKinPhoneNumberWork) {
		this.primaryNextOfKinPhoneNumberWork = primaryNextOfKinPhoneNumberWork;
	}

	public String getNameofSecondaryNextOfKin() {
		return nameofSecondaryNextOfKin;
	}

	public void setNameofSecondaryNextOfKin(String nameofSecondaryNextOfKin) {
		this.nameofSecondaryNextOfKin = nameofSecondaryNextOfKin;
	}

	public String getSecondaryNextOfKinRelationshipToPatient() {
		return secondaryNextOfKinRelationshipToPatient;
	}

	public void setSecondaryNextOfKinRelationshipToPatient(
			String secondaryNextOfKinRelationshipToPatient) {
		this.secondaryNextOfKinRelationshipToPatient = secondaryNextOfKinRelationshipToPatient;
	}

	public String getIsSecondaryNextOfKinAddressSameAsPatient() {
		return isSecondaryNextOfKinAddressSameAsPatient;
	}

	public void setIsSecondaryNextOfKinAddressSameAsPatient(
			String isSecondaryNextOfKinAddressSameAsPatient) {
		this.isSecondaryNextOfKinAddressSameAsPatient = isSecondaryNextOfKinAddressSameAsPatient;
	}

	public String getSecondaryNextOfKinAddressStreetLine1() {
		return secondaryNextOfKinAddressStreetLine1;
	}

	public void setSecondaryNextOfKinAddressStreetLine1(
			String secondaryNextOfKinAddressStreetLine1) {
		this.secondaryNextOfKinAddressStreetLine1 = secondaryNextOfKinAddressStreetLine1;
	}

	public String getSecondaryNextOfKinAddressStreetLine2() {
		return secondaryNextOfKinAddressStreetLine2;
	}

	public void setSecondaryNextOfKinAddressStreetLine2(
			String secondaryNextOfKinAddressStreetLine2) {
		this.secondaryNextOfKinAddressStreetLine2 = secondaryNextOfKinAddressStreetLine2;
	}

	public String getSecondaryNextOfKinAddressStreetLine3() {
		return secondaryNextOfKinAddressStreetLine3;
	}

	public void setSecondaryNextOfKinAddressStreetLine3(
			String secondaryNextOfKinAddressStreetLine3) {
		this.secondaryNextOfKinAddressStreetLine3 = secondaryNextOfKinAddressStreetLine3;
	}

	public String getSecondaryNextOfKinAddressCity() {
		return secondaryNextOfKinAddressCity;
	}

	public void setSecondaryNextOfKinAddressCity(
			String secondaryNextOfKinAddressCity) {
		this.secondaryNextOfKinAddressCity = secondaryNextOfKinAddressCity;
	}

	public String getSecondaryNextOfKinState() {
		return secondaryNextOfKinState;
	}

	public void setSecondaryNextOfKinState(String secondaryNextOfKinState) {
		this.secondaryNextOfKinState = secondaryNextOfKinState;
	}

	public String getSecondaryNextOfKinZipcode() {
		return secondaryNextOfKinZipcode;
	}

	public void setSecondaryNextOfKinZipcode(String secondaryNextOfKinZipcode) {
		this.secondaryNextOfKinZipcode = secondaryNextOfKinZipcode;
	}

	public String getSecondaryNextOfKinZipcode4() {
		return secondaryNextOfKinZipcode4;
	}

	public void setSecondaryNextOfKinZipcode4(String secondaryNextOfKinZipcode4) {
		this.secondaryNextOfKinZipcode4 = secondaryNextOfKinZipcode4;
	}

	public String getSecondaryNextOfKinPhoneNumber() {
		return secondaryNextOfKinPhoneNumber;
	}

	public void setSecondaryNextOfKinPhoneNumber(
			String secondaryNextOfKinPhoneNumber) {
		this.secondaryNextOfKinPhoneNumber = secondaryNextOfKinPhoneNumber;
	}

	public String getSecondaryNextOfKinPhoneNumberWork() {
		return secondaryNextOfKinPhoneNumberWork;
	}

	public void setSecondaryNextOfKinPhoneNumberWork(
			String secondaryNextOfKinPhoneNumberWork) {
		this.secondaryNextOfKinPhoneNumberWork = secondaryNextOfKinPhoneNumberWork;
	}

	public String getIsDesigneeSameAsNextOfKin() {
		return isDesigneeSameAsNextOfKin;
	}

	public void setIsDesigneeSameAsNextOfKin(String isDesigneeSameAsNextOfKin) {
		this.isDesigneeSameAsNextOfKin = isDesigneeSameAsNextOfKin;
	}

	public String getNameofDesignee() {
		return nameofDesignee;
	}

	public void setNameofDesignee(String nameofDesignee) {
		this.nameofDesignee = nameofDesignee;
	}

	public String getDesigneeRelationshipToPatient() {
		return designeeRelationshipToPatient;
	}

	public void setDesigneeRelationshipToPatient(
			String designeeRelationshipToPatient) {
		this.designeeRelationshipToPatient = designeeRelationshipToPatient;
	}

	public String getIsdesigneeAddressSameAsPatient() {
		return isdesigneeAddressSameAsPatient;
	}

	public void setIsdesigneeAddressSameAsPatient(
			String isdesigneeAddressSameAsPatient) {
		this.isdesigneeAddressSameAsPatient = isdesigneeAddressSameAsPatient;
	}

	public String getDesigneeAddressStreetLine1() {
		return designeeAddressStreetLine1;
	}

	public void setDesigneeAddressStreetLine1(String designeeAddressStreetLine1) {
		this.designeeAddressStreetLine1 = designeeAddressStreetLine1;
	}

	public String getDesigneeAddressStreetLine2() {
		return designeeAddressStreetLine2;
	}

	public void setDesigneeAddressStreetLine2(String designeeAddressStreetLine2) {
		this.designeeAddressStreetLine2 = designeeAddressStreetLine2;
	}

	public String getDesigneeAddressStreetLine3() {
		return designeeAddressStreetLine3;
	}

	public void setDesigneeAddressStreetLine3(String designeeAddressStreetLine3) {
		this.designeeAddressStreetLine3 = designeeAddressStreetLine3;
	}

	public String getDesigneeCity() {
		return designeeCity;
	}

	public void setDesigneeCity(String designeeCity) {
		this.designeeCity = designeeCity;
	}

	public String getDesigneeState() {
		return designeeState;
	}

	public void setDesigneeState(String designeeState) {
		this.designeeState = designeeState;
	}

	public String getDesigneeZipcode() {
		return designeeZipcode;
	}

	public void setDesigneeZipcode(String designeeZipcode) {
		this.designeeZipcode = designeeZipcode;
	}

	public String getDesigneeZipcode4() {
		return designeeZipcode4;
	}

	public void setDesigneeZipcode4(String designeeZipcode4) {
		this.designeeZipcode4 = designeeZipcode4;
	}

	public String getDesigneePhoneNumber() {
		return designeePhoneNumber;
	}

	public void setDesigneePhoneNumber(String designeePhoneNumber) {
		this.designeePhoneNumber = designeePhoneNumber;
	}

	public String getDesigneePhoneNumberWork() {
		return designeePhoneNumberWork;
	}

	public void setDesigneePhoneNumberWork(String designeePhoneNumberWork) {
		this.designeePhoneNumberWork = designeePhoneNumberWork;
	}

	public String getIsEmergencyContactSameAsNextOfKin() {
		return isEmergencyContactSameAsNextOfKin;
	}

	public void setIsEmergencyContactSameAsNextOfKin(
			String isEmergencyContactSameAsNextOfKin) {
		this.isEmergencyContactSameAsNextOfKin = isEmergencyContactSameAsNextOfKin;
	}

	public String getNameofEmergencyContact() {
		return nameofEmergencyContact;
	}

	public void setNameofEmergencyContact(String nameofEmergencyContact) {
		this.nameofEmergencyContact = nameofEmergencyContact;
	}

	public String getEmergencyContactRelationshipToPatient() {
		return emergencyContactRelationshipToPatient;
	}

	public void setEmergencyContactRelationshipToPatient(
			String emergencyContactRelationshipToPatient) {
		this.emergencyContactRelationshipToPatient = emergencyContactRelationshipToPatient;
	}

	public String getEmergencyContactAddressStreetLine1() {
		return emergencyContactAddressStreetLine1;
	}

	public void setEmergencyContactAddressStreetLine1(
			String emergencyContactAddressStreetLine1) {
		this.emergencyContactAddressStreetLine1 = emergencyContactAddressStreetLine1;
	}

	public String getEmergencyContactAddressStreetLine2() {
		return emergencyContactAddressStreetLine2;
	}

	public void setEmergencyContactAddressStreetLine2(
			String emergencyContactAddressStreetLine2) {
		this.emergencyContactAddressStreetLine2 = emergencyContactAddressStreetLine2;
	}

	public String getEmergencyContactAddressStreetLine3() {
		return emergencyContactAddressStreetLine3;
	}

	public void setEmergencyContactAddressStreetLine3(
			String emergencyContactAddressStreetLine3) {
		this.emergencyContactAddressStreetLine3 = emergencyContactAddressStreetLine3;
	}

	public String getEmergencyContactCity() {
		return emergencyContactCity;
	}

	public void setEmergencyContactCity(String emergencyContactCity) {
		this.emergencyContactCity = emergencyContactCity;
	}

	public String getEmergencyContactState() {
		return emergencyContactState;
	}

	public void setEmergencyContactState(String emergencyContactState) {
		this.emergencyContactState = emergencyContactState;
	}

	public String getEmergencyContactZipcode() {
		return emergencyContactZipcode;
	}

	public void setEmergencyContactZipcode(String emergencyContactZipcode) {
		this.emergencyContactZipcode = emergencyContactZipcode;
	}

	public String getEmergencyContactZipcode4() {
		return emergencyContactZipcode4;
	}

	public void setEmergencyContactZipcode4(String emergencyContactZipcode4) {
		this.emergencyContactZipcode4 = emergencyContactZipcode4;
	}

	public String getEmergencyContactPhoneNumber() {
		return emergencyContactPhoneNumber;
	}

	public void setEmergencyContactPhoneNumber(
			String emergencyContactPhoneNumber) {
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}

	public String getEmergencyContactPhoneNumberWork() {
		return emergencyContactPhoneNumberWork;
	}

	public void setEmergencyContactPhoneNumberWork(
			String emergencyContactPhoneNumberWork) {
		this.emergencyContactPhoneNumberWork = emergencyContactPhoneNumberWork;
	}

	public String getNameofSecondaryEmergencyContact() {
		return nameofSecondaryEmergencyContact;
	}

	public void setNameofSecondaryEmergencyContact(
			String nameofSecondaryEmergencyContact) {
		this.nameofSecondaryEmergencyContact = nameofSecondaryEmergencyContact;
	}

	public String getSecondaryEmergencyContactRelationshipToPatient() {
		return secondaryEmergencyContactRelationshipToPatient;
	}

	public void setSecondaryEmergencyContactRelationshipToPatient(
			String secondaryEmergencyContactRelationshipToPatient) {
		this.secondaryEmergencyContactRelationshipToPatient = secondaryEmergencyContactRelationshipToPatient;
	}

	public String getSecondaryEmergencyContactAddressStreetLine1() {
		return secondaryEmergencyContactAddressStreetLine1;
	}

	public void setSecondaryEmergencyContactAddressStreetLine1(
			String secondaryEmergencyContactAddressStreetLine1) {
		this.secondaryEmergencyContactAddressStreetLine1 = secondaryEmergencyContactAddressStreetLine1;
	}

	public String getSecondaryEmergencyContactAddressStreetLine2() {
		return secondaryEmergencyContactAddressStreetLine2;
	}

	public void setSecondaryEmergencyContactAddressStreetLine2(
			String secondaryEmergencyContactAddressStreetLine2) {
		this.secondaryEmergencyContactAddressStreetLine2 = secondaryEmergencyContactAddressStreetLine2;
	}

	public String getSecondaryEmergencyContactAddressStreetLine3() {
		return secondaryEmergencyContactAddressStreetLine3;
	}

	public void setSecondaryEmergencyContactAddressStreetLine3(
			String secondaryEmergencyContactAddressStreetLine3) {
		this.secondaryEmergencyContactAddressStreetLine3 = secondaryEmergencyContactAddressStreetLine3;
	}

	public String getSecondaryEmergencyContactCity() {
		return secondaryEmergencyContactCity;
	}

	public void setSecondaryEmergencyContactCity(
			String secondaryEmergencyContactCity) {
		this.secondaryEmergencyContactCity = secondaryEmergencyContactCity;
	}

	public String getSecondaryEmergencyContactState() {
		return secondaryEmergencyContactState;
	}

	public void setSecondaryEmergencyContactState(
			String secondaryEmergencyContactState) {
		this.secondaryEmergencyContactState = secondaryEmergencyContactState;
	}

	public String getSecondaryEmergencyContactZipcode() {
		return secondaryEmergencyContactZipcode;
	}

	public void setSecondaryEmergencyContactZipcode(
			String secondaryEmergencyContactZipcode) {
		this.secondaryEmergencyContactZipcode = secondaryEmergencyContactZipcode;
	}

	public String getSecondaryEmergencyContactZipcode4() {
		return secondaryEmergencyContactZipcode4;
	}

	public void setSecondaryEmergencyContactZipcode4(
			String secondaryEmergencyContactZipcode4) {
		this.secondaryEmergencyContactZipcode4 = secondaryEmergencyContactZipcode4;
	}

	public String getSecondaryEmergencyContactPhoneNumber() {
		return secondaryEmergencyContactPhoneNumber;
	}

	public void setSecondaryEmergencyContactPhoneNumber(
			String secondaryEmergencyContactPhoneNumber) {
		this.secondaryEmergencyContactPhoneNumber = secondaryEmergencyContactPhoneNumber;
	}

	public String getSecondaryEmergencyContactPhoneNumberWork() {
		return secondaryEmergencyContactPhoneNumberWork;
	}

	public void setSecondaryEmergencyContactPhoneNumberWork(
			String secondaryEmergencyContactPhoneNumberWork) {
		this.secondaryEmergencyContactPhoneNumberWork = secondaryEmergencyContactPhoneNumberWork;
	}

	public String getFugitiveFelonFlag() {
		return fugitiveFelonFlag;
	}

	public void setFugitiveFelonFlag(String fugitiveFelonFlag) {
		this.fugitiveFelonFlag = fugitiveFelonFlag;
	}

	public String getFugitiveFelonFlagRemovalRemarks() {
		return fugitiveFelonFlagRemovalRemarks;
	}

	public void setFugitiveFelonFlagRemovalRemarks(
			String fugitiveFelonFlagRemovalRemarks) {
		this.fugitiveFelonFlagRemovalRemarks = fugitiveFelonFlagRemovalRemarks;
	}

	public String getEmployerZip4() {
		return employerZip4;
	}

	public void setEmployerZip4(String employerZip4) {
		this.employerZip4 = employerZip4;
	}

	public String getSpousesOccupation() {
		return spousesOccupation;
	}

	public void setSpousesOccupation(String spousesOccupation) {
		this.spousesOccupation = spousesOccupation;
	}

	public String getSpousesRetirementDate() {
		return spousesRetirementDate;
	}

	public void setSpousesRetirementDate(String spousesRetirementDate) {
		this.spousesRetirementDate = spousesRetirementDate;
	}

	public String getSpousesEmploymentStatus() {
		return spousesEmploymentStatus;
	}

	public void setSpousesEmploymentStatus(String spousesEmploymentStatus) {
		this.spousesEmploymentStatus = spousesEmploymentStatus;
	}

	public String getSpousesEmployerName() {
		return spousesEmployerName;
	}

	public void setSpousesEmployerName(String spousesEmployerName) {
		this.spousesEmployerName = spousesEmployerName;
	}

	public String getSpousesEmployerStreetLine1() {
		return spousesEmployerStreetLine1;
	}

	public void setSpousesEmployerStreetLine1(String spousesEmployerStreetLine1) {
		this.spousesEmployerStreetLine1 = spousesEmployerStreetLine1;
	}

	public String getSpousesEmployerStreetLine2() {
		return spousesEmployerStreetLine2;
	}

	public void setSpousesEmployerStreetLine2(String spousesEmployerStreetLine2) {
		this.spousesEmployerStreetLine2 = spousesEmployerStreetLine2;
	}

	public String getSpousesEmployerStreetLine3() {
		return spousesEmployerStreetLine3;
	}

	public void setSpousesEmployerStreetLine3(String spousesEmployerStreetLine3) {
		this.spousesEmployerStreetLine3 = spousesEmployerStreetLine3;
	}

	public String getSpousesEmployersCity() {
		return spousesEmployersCity;
	}

	public void setSpousesEmployersCity(String spousesEmployersCity) {
		this.spousesEmployersCity = spousesEmployersCity;
	}

	public String getSpousesEmployersState() {
		return spousesEmployersState;
	}

	public void setSpousesEmployersState(String spousesEmployersState) {
		this.spousesEmployersState = spousesEmployersState;
	}

	public String getSpousesEmployersZipCode() {
		return spousesEmployersZipCode;
	}

	public void setSpousesEmployersZipCode(String spousesEmployersZipCode) {
		this.spousesEmployersZipCode = spousesEmployersZipCode;
	}

	public String getSpousesEmployersZipCode4() {
		return spousesEmployersZipCode4;
	}

	public void setSpousesEmployersZipCode4(String spousesEmployersZipCode4) {
		this.spousesEmployersZipCode4 = spousesEmployersZipCode4;
	}

	public String getSpousesEmployersPhoneNumber() {
		return spousesEmployersPhoneNumber;
	}

	public void setSpousesEmployersPhoneNumber(
			String spousesEmployersPhoneNumber) {
		this.spousesEmployersPhoneNumber = spousesEmployersPhoneNumber;
	}

	public String getSpousePhoneNumberWork() {
		return spousePhoneNumberWork;
	}

	public String getConfIEN() {
		return confIEN;
	}

	public void setConfIEN(String confIEN) {
		this.confIEN = confIEN;
	}

	public void setSpousePhoneNumberWork(String spousePhoneNumberWork) {
		this.spousePhoneNumberWork = spousePhoneNumberWork;
	}

	public String getIneligibleDate() {
		return ineligibleDate;
	}

	public void setIneligibleDate(String ineligibleDate) {
		this.ineligibleDate = ineligibleDate;
	}

	public String getEligibleForMedicalId() {
		return eligibleForMedicalId;
	}

	public void setEligibleForMedicalId(String eligibleForMedicalId) {
		this.eligibleForMedicalId = eligibleForMedicalId;
	}

	public String getDateMedicalIdLastAsked() {
		return dateMedicalIdLastAsked;
	}

	public void setDateMedicalIdLastAsked(String dateMedicalIdLastAsked) {
		this.dateMedicalIdLastAsked = dateMedicalIdLastAsked;
	}

	public String getMedicalIdNumber() {
		return medicalIdNumber;
	}

	public void setMedicalIdNumber(String medicalIdNumber) {
		this.medicalIdNumber = medicalIdNumber;
	}

	public String getDispositionLog() {
		return dispositionLog;
	}

	public void setDispositionLog(String dispositionLog) {
		this.dispositionLog = dispositionLog;
	}

	public String getFollowedInClinic() {
		return followedInClinic;
	}

	public void setFollowedInClinic(String followedInClinic) {
		this.followedInClinic = followedInClinic;
	}

	public String getExaminedToday() {
		return examinedToday;
	}

	public void setExaminedToday(String examinedToday) {
		this.examinedToday = examinedToday;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getTypeofcare() {
		return typeofcare;
	}

	public void setTypeofcare(String typeofcare) {
		this.typeofcare = typeofcare;
	}

	public String getTypeofbenifits() {
		return typeofbenifits;
	}

	public void setTypeofbenifits(String typeofbenifits) {
		this.typeofbenifits = typeofbenifits;
	}

	public String getEligibilityCode() {
		return eligibilityCode;
	}

	public void setEligibilityCode(String eligibilityCode) {
		this.eligibilityCode = eligibilityCode;
	}

	public String getRelatedtoaccident() {
		return relatedtoaccident;
	}

	public void setRelatedtoaccident(String relatedtoaccident) {
		this.relatedtoaccident = relatedtoaccident;
	}

	public String getRelatedtooccupation() {
		return relatedtooccupation;
	}

	public void setRelatedtooccupation(String relatedtooccupation) {
		this.relatedtooccupation = relatedtooccupation;
	}

	public String getCoveredByHealthInsurance() {
		return coveredByHealthInsurance;
	}

	public void setCoveredByHealthInsurance(String coveredByHealthInsurance) {
		this.coveredByHealthInsurance = coveredByHealthInsurance;
	}



	public String getRuledIncompetent() {
		return ruledIncompetent;
	}

	public void setRuledIncompetent(String ruledIncompetent) {
		this.ruledIncompetent = ruledIncompetent;
	}

	public String getDateRuledIncompetent() {
		return dateRuledIncompetent;
	}

	public void setDateRuledIncompetent(String dateRuledIncompetent) {
		this.dateRuledIncompetent = dateRuledIncompetent;
	}

	public String getGuardianInstitution() {
		return guardianInstitution;
	}

	public void setGuardianInstitution(String guardianInstitution) {
		this.guardianInstitution = guardianInstitution;
	}

	public String getGuardianAddressStreetLine1() {
		return guardianAddressStreetLine1;
	}

	public void setGuardianAddressStreetLine1(String guardianAddressStreetLine1) {
		this.guardianAddressStreetLine1 = guardianAddressStreetLine1;
	}

	public String getGuardianAddressStreetLine2() {
		return guardianAddressStreetLine2;
	}

	public void setGuardianAddressStreetLine2(String guardianAddressStreetLine2) {
		this.guardianAddressStreetLine2 = guardianAddressStreetLine2;
	}

	public String getGuardianCity() {
		return guardianCity;
	}

	public void setGuardianCity(String guardianCity) {
		this.guardianCity = guardianCity;
	}

	public String getGuardianState() {
		return guardianState;
	}

	public void setGuardianState(String guardianState) {
		this.guardianState = guardianState;
	}

	public String getGuardianZipcode() {
		return guardianZipcode;
	}

	public void setGuardianZipcode(String guardianZipcode) {
		this.guardianZipcode = guardianZipcode;
	}

	public String getGuardianZipcode4() {
		return guardianZipcode4;
	}

	public void setGuardianZipcode4(String guardianZipcode4) {
		this.guardianZipcode4 = guardianZipcode4;
	}

	public String getGuardianPhoneNumber() {
		return guardianPhoneNumber;
	}

	public void setGuardianPhoneNumber(String guardianPhoneNumber) {
		this.guardianPhoneNumber = guardianPhoneNumber;
	}

	public String getTestPatient() {
		return testPatient;
	}

	public void setTestPatient(String testPatient) {
		this.testPatient = testPatient;
	}

	public String[] getRace() {
		return race;
	}

	public void setRace(String[] race) {
		this.race = race;
	}

	public String[] getGranularRace() {
		return granularRace;
	}

	public void setGranularRace(String[] granularRace) {
		this.granularRace = granularRace;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getConfidentialAddressCounty() {
		return confidentialAddressCounty;
	}

	public void setConfidentialAddressCounty(String confidentialAddressCounty) {
		this.confidentialAddressCounty = confidentialAddressCounty;
	}

	public String getGuardianRelationship() {
		return guardianRelationship;
	}

	public void setGuardianRelationship(String guardianRelationship) {
		this.guardianRelationship = guardianRelationship;
	}

	public String getPrimaryNextOfKinPhoneNumber() {
		return primaryNextOfKinPhoneNumber;
	}

	public void setPrimaryNextOfKinPhoneNumber(
			String primaryNextOfKinPhoneNumber) {
		this.primaryNextOfKinPhoneNumber = primaryNextOfKinPhoneNumber;
	}

	public String getVetStatus() {
		return vetStatus;
	}

	public void setVetStatus(String vetStatus) {
		this.vetStatus = vetStatus;
	}

	public String getGuardian() {
		return guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}

	public String getConfidentialChangeTimeStamp() {
		return confidentialChangeTimeStamp;
	}

	public void setConfidentialChangeTimeStamp(
			String confidentialChangeTimeStamp) {
		this.confidentialChangeTimeStamp = confidentialChangeTimeStamp;
	}

	public String getPriamryNextOfKinChangeTimeStamp() {
		return priamryNextOfKinChangeTimeStamp;
	}

	public void setPriamryNextOfKinChangeTimeStamp(
			String priamryNextOfKinChangeTimeStamp) {
		this.priamryNextOfKinChangeTimeStamp = priamryNextOfKinChangeTimeStamp;
	}

	public String getSecondaryNextOfKinChangeTimeStamp() {
		return secondaryNextOfKinChangeTimeStamp;
	}

	public void setSecondaryNextOfKinChangeTimeStamp(
			String secondaryNextOfKinChangeTimeStamp) {
		this.secondaryNextOfKinChangeTimeStamp = secondaryNextOfKinChangeTimeStamp;
	}
	public String getDesigneeChangeTimeStamp() {
		return designeeChangeTimeStamp;
	}

	public void setDesigneeChangeTimeStamp(String designeeChangeTimeStamp) {
		this.designeeChangeTimeStamp = designeeChangeTimeStamp;
	}

	public String getEmergencyContactChangeTimeStamp() {
		return emergencyContactChangeTimeStamp;
	}

	public void setEmergencyContactChangeTimeStamp(
			String emergencyContactChangeTimeStamp) {
		this.emergencyContactChangeTimeStamp = emergencyContactChangeTimeStamp;
	}

	public String getSecondaryEmergencyContactChangeTimeStamp() {
		return secondaryEmergencyContactChangeTimeStamp;
	}

	public void setSecondaryEmergencyContactChangeTimeStamp(
			String secondaryEmergencyContactChangeTimeStamp) {
		this.secondaryEmergencyContactChangeTimeStamp = secondaryEmergencyContactChangeTimeStamp;
	}

	public String getFugitiveFelonFlagChangeTimeStamp() {
		return fugitiveFelonFlagChangeTimeStamp;
	}

	public void setFugitiveFelonFlagChangeTimeStamp(
			String fugitiveFelonFlagChangeTimeStamp) {
		this.fugitiveFelonFlagChangeTimeStamp = fugitiveFelonFlagChangeTimeStamp;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCollectionMethod() {
		return collectionMethod;
	}

	public void setCollectionMethod(String collectionMethod) {
		this.collectionMethod = collectionMethod;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getEthnicityIEN() {
		return ethnicityIEN;
	}

	public void setEthnicityIEN(String ethnicityIEN) {
		this.ethnicityIEN = ethnicityIEN;
	}

	public String getEthnicityRecordIEN() {
		return ethnicityRecordIEN;
	}

	public void setEthnicityRecordIEN(String ethnicityRecordIEN) {
		this.ethnicityRecordIEN = ethnicityRecordIEN;
	}

	public String getAliasIEN() {
		return aliasIEN;
	}

	public void setAliasIEN(String aliasIEN) {
		this.aliasIEN = aliasIEN;
	}

	public String getSearchable() {
		return searchable;
	}

	public void setSearchable(String searchable) {
		this.searchable = searchable;
	}

	public String getDesigneeEmail() {
		return designeeEmail;
	}

	public void setDesigneeEmail(String designeeEmail) {
		this.designeeEmail = designeeEmail;
	}

	public String getIsPatientWebAccessRequested() {
		return isPatientWebAccessRequested;
	}

	public void setIsPatientWebAccessRequested(
			String isPatientWebAccessRequested) {
		this.isPatientWebAccessRequested = isPatientWebAccessRequested;
	}

	public String getIsDesigneeWebAccessRequested() {
		return isDesigneeWebAccessRequested;
	}

	public void setIsDesigneeWebAccessRequested(
			String isDesigneeWebAccessRequested) {
		this.isDesigneeWebAccessRequested = isDesigneeWebAccessRequested;
	}

	public String getIsSelectedPatientHasWebAccess() {
		return isSelectedPatientHasWebAccess;
	}

	public void setIsSelectedPatientHasWebAccess(
			String isSelectedPatientHasWebAccess) {
		this.isSelectedPatientHasWebAccess = isSelectedPatientHasWebAccess;
	}

	public String getIsSelectedDesigneeHasWebAccess() {
		return isSelectedDesigneeHasWebAccess;
	}

	public void setIsSelectedDesigneeHasWebAccess(
			String isSelectedDesigneeHasWebAccess) {
		this.isSelectedDesigneeHasWebAccess = isSelectedDesigneeHasWebAccess;
	}

	public String getPatientICareId() {
		return patientICareId;
	}

	public void setPatientICareId(String patientICareId) {
		this.patientICareId = patientICareId;
	}

	public String getDesigneeICareId() {
		return designeeICareId;
	}

	public void setDesigneeICareId(String designeeICareId) {
		this.designeeICareId = designeeICareId;
	}

	public String getDesigneeMailAddress() {
		return designeeMailAddress;
	}

	public void setDesigneeMailAddress(String designeeMailAddress) {
		this.designeeMailAddress = designeeMailAddress;
	}

	public String getIsPatientEmailIdChanged() {
		return isPatientEmailIdChanged;
	}

	public void setIsPatientEmailIdChanged(String isPatientEmailIdChanged) {
		this.isPatientEmailIdChanged = isPatientEmailIdChanged;
	}

	public String getPatientRole() {
		return patientRole;
	}

	public void setPatientRole(String patientRole) {
		this.patientRole = patientRole;
	}

	public String getDesigneeRole() {
		return designeeRole;
	}

	public void setDesigneeRole(String designeeRole) {
		this.designeeRole = designeeRole;
	}

	/**
	 public int getHouseHoldIncome() {
	 return houseHoldIncome;
	 }

	 public void setHouseHoldIncome(int houseHoldIncome) {
	 this.houseHoldIncome = houseHoldIncome;
	 }
	 **/
	public int getFamilyMembers() {
		return familyMembers;
	}

	public void setFamilyMembers(int familyMembers) {
		this.familyMembers = familyMembers;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getGuarantorFirstName() {
		return guarantorFirstName;
	}

	public void setGuarantorFirstName(String guarantorFirstName) {
		this.guarantorFirstName = guarantorFirstName;
	}

	public String getGuarantorLastName() {
		return guarantorLastName;
	}

	public void setGuarantorLastName(String guarantorLastName) {
		this.guarantorLastName = guarantorLastName;
	}

	public String getGuarantorSex() {
		return guarantorSex;
	}

	public void setGuarantorSex(String guarantorSex) {
		this.guarantorSex = guarantorSex;
	}

	public String getGuarantorSSN() {
		return guarantorSSN;
	}

	public void setGuarantorSSN(String guarantorSSN) {
		this.guarantorSSN = guarantorSSN;
	}

	public String getGuarantorPhoneOne() {
		return guarantorPhoneOne;
	}

	public void setGuarantorPhoneOne(String guarantorPhoneOne) {
		this.guarantorPhoneOne = guarantorPhoneOne;
	}

	public String getGuarantorAddressStreetLine1() {
		return guarantorAddressStreetLine1;
	}

	public void setGuarantorAddressStreetLine1(String guarantorAddressStreetLine1) {
		this.guarantorAddressStreetLine1 = guarantorAddressStreetLine1;
	}

	public String getGuarantorAddressStreetLine2() {
		return guarantorAddressStreetLine2;
	}

	public void setGuarantorAddressStreetLine2(String guarantorAddressStreetLine2) {
		this.guarantorAddressStreetLine2 = guarantorAddressStreetLine2;
	}

	public String getGuarantorCity() {
		return guarantorCity;
	}

	public void setGuarantorCity(String guarantorCity) {
		this.guarantorCity = guarantorCity;
	}

	public String getGuarantorState() {
		return guarantorState;
	}

	public void setGuarantorState(String guarantorState) {
		this.guarantorState = guarantorState;
	}

	public String getGuarantorStateAbbreviation() {
		return guarantorStateAbbreviation;
	}

	public void setGuarantorStateAbbreviation(String guarantorStateAbbreviation) {
		this.guarantorStateAbbreviation = guarantorStateAbbreviation;
	}

	public String getGuarantorZip() {
		return guarantorZip;
	}

	public void setGuarantorZip(String guarantorZip) {
		this.guarantorZip = guarantorZip;
	}

	public String getGuarantorHomePhone() {
		return guarantorHomePhone;
	}

	public void setGuarantorHomePhone(String guarantorHomePhone) {
		this.guarantorHomePhone = guarantorHomePhone;
	}

	public String getGuarantorWorkPhone() {
		return guarantorWorkPhone;
	}

	public void setGuarantorWorkPhone(String guarantorWorkPhone) {
		this.guarantorWorkPhone = guarantorWorkPhone;
	}

	public String getHeadOfHouseholdFirstName() {
		return headOfHouseholdFirstName;
	}

	public void setHeadOfHouseholdFirstName(String headOfHouseholdFirstName) {
		this.headOfHouseholdFirstName = headOfHouseholdFirstName;
	}

	public String getHeadOfHouseholdLastName() {
		return headOfHouseholdLastName;
	}

	public void setHeadOfHouseholdLastName(String headOfHouseholdLastName) {
		this.headOfHouseholdLastName = headOfHouseholdLastName;
	}

	public String getHeadOfHouseholdSSN() {
		return headOfHouseholdSSN;
	}

	public void setHeadOfHouseholdSSN(String headOfHouseholdSSN) {
		this.headOfHouseholdSSN = headOfHouseholdSSN;
	}


	public String getHhSex() {
		return hhSex;
	}

	public void setHhSex(String hhSex) {
		this.hhSex = hhSex;
	}

	public String getHeadOfHouseholdRelation() {
		return headOfHouseholdRelation;
	}

	public void setHeadOfHouseholdRelation(String headOfHouseholdRelation) {
		this.headOfHouseholdRelation = headOfHouseholdRelation;
	}

	public int getPrimaryPhysicianId() {
		return primaryPhysicianId;
	}

	public void setPrimaryPhysicianId(int primaryPhysicianId) {
		this.primaryPhysicianId = primaryPhysicianId;
	}

	public String getDesigneeUserName() {
		return designeeUserName;
	}

	public void setDesigneeUserName(String designeeUserName) {
		this.designeeUserName = designeeUserName;
	}


	public String getPharmacyId() {
		return pharmacyId;
	}

	public void setPharmacyId(String pharmacyId) {
		this.pharmacyId = pharmacyId;
	}

	public String getPharmacyName() {
		return pharmacyName;
	}

	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}

	public String getThinkOfSelf() {
		return thinkOfSelf;
	}

	public void setThinkOfSelf(String thinkOfSelf) {
		this.thinkOfSelf = thinkOfSelf;
	}

    public String getGenderIdentity() {
        return genderIdentity;
    }

    public void setGenderIdentity(String genderIdentity) {
        this.genderIdentity = genderIdentity;
    }

	public String getOtherThinkOfSelf() {
		return otherThinkOfSelf;
	}

	public void setOtherThinkOfSelf(String otherThinkOfSelf) {
		this.otherThinkOfSelf = otherThinkOfSelf;
	}

	public String getProtectionIndicator() {
		return protectionIndicator;
	}

	public void setProtectionIndicator(String protectionIndicator) {
		this.protectionIndicator = protectionIndicator;
	}

	public String getConsentIndicator() {
		return consentIndicator;
	}

	public void setConsentIndicator(String consentIndicator) {
		this.consentIndicator = consentIndicator;
	}

	public String getPrtIndicatorDate() {
		return prtIndicatorDate;
	}

	public void setPrtIndicatorDate(String prtIndicatorDate) {
		this.prtIndicatorDate = prtIndicatorDate;
	}

	@Override
	public String toString() {
		return "PatientInfo{" +
				"dfn='" + dfn + '\'' +
				", designeeEmail='" + designeeEmail + '\'' +
				", designeeUserName='" + designeeUserName + '\'' +
				", isPatientWebAccessRequested='" + isPatientWebAccessRequested + '\'' +
				", isDesigneeWebAccessRequested='" + isDesigneeWebAccessRequested + '\'' +
				", isSelectedPatientHasWebAccess='" + isSelectedPatientHasWebAccess + '\'' +
				", isSelectedDesigneeHasWebAccess='" + isSelectedDesigneeHasWebAccess + '\'' +
				", patientICareId='" + patientICareId + '\'' + "\n"+
				", designeeICareId='" + designeeICareId + '\'' +
				", isPatientEmailIdChanged='" + isPatientEmailIdChanged + '\'' +
				", isDesigneeEmailIdChanged='" + isDesigneeEmailIdChanged + '\'' +
				", designeeOldEmailId='" + designeeOldEmailId + '\'' +
				", patientOldEmailId='" + patientOldEmailId + '\'' +
				", patientOldName='" + patientOldName + '\'' +
				", patientRole='" + patientRole + '\'' +
				", designeeRole='" + designeeRole + '\'' +
				", primaryProvider=" + primaryProvider +
				", userName='" + userName + '\'' +
				", signOnFileHipaa='" + signOnFileHipaa + '\'' +
				", dateOfSof='" + dateOfSof + '\'' +
				", designeeMailAddress='" + designeeMailAddress + '\'' +
				", firstName='" + firstName + '\'' + "\n"+
				", lastName='" + lastName + '\'' +
				", ssn='" + ssn + '\'' +
				", aliasSsn='" + aliasSsn + '\'' +
				", sex='" + sex + '\'' +
				", pharmacyId='" + pharmacyId + '\'' +
				", pharmacyName='" + pharmacyName + '\'' +
				", communicationPreference='" + communicationPreference + '\'' +
				", aliasName='" + aliasName + '\'' +
				", aliasIEN='" + aliasIEN + '\'' +
				", dob='" + dob + '\'' +
				", dobTime='" + dobTime + '\'' + "\n"+
				", type='" + type + '\'' +
				", vaflag='" + vaflag + '\'' +
				", vetStatus='" + vetStatus + '\'' +
				", serviceConnected='" + serviceConnected + '\'' +
				", multipleBirth='" + multipleBirth + '\'' +
				", maritalStatus='" + maritalStatus + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zip='" + zip + '\'' +
				", phone='" + phone + '\'' +
				", phoneWork='" + phoneWork + '\'' +
				", email='" + email + '\'' + "\n"+
				", phoneCell='" + phoneCell + '\'' +
				", employStatus='" + employStatus + '\'' +
				", employer='" + employer + '\'' +
				", employerAddr='" + employerAddr + '\'' +
				", employerAddr2='" + employerAddr2 + '\'' +
				", employerAddr3='" + employerAddr3 + '\'' +
				", employerCity='" + employerCity + '\'' +
				", employerState='" + employerState + '\'' +
				", employerZip='" + employerZip + '\'' +
				", employerZip4='" + employerZip4 + '\'' +
				", employerPhone='" + employerPhone + '\'' + "\n"+
				", coveredByHealthInsurance='" + coveredByHealthInsurance + '\'' +
				", county='" + county + '\'' +
				", dupeOverride='" + dupeOverride + '\'' +
				", patientId='" + patientId + '\'' +
				", regDFN='" + regDFN + '\'' +
				", followClinic='" + followClinic + '\'' +
				", examToday='" + examToday + '\'' +
				", regDate='" + regDate + '\'' +
				", regHr='" + regHr + '\'' +
				", regMin='" + regMin + '\'' +
				", typeBenefit='" + typeBenefit + '\'' + "\n"+
				", typeCare='" + typeCare + '\'' +
				", eligCode='" + eligCode + '\'' +
				", accident='" + accident + '\'' +
				", scPercentage='" + scPercentage + '\'' +
				", occupation='" + occupation + '\'' +
				", prefix='" + prefix + '\'' +
				", suffix='" + suffix + '\'' +
				", degree='" + degree + '\'' +
				", middleName='" + middleName + '\'' +
				", race=" + Arrays.toString(race) +
				", ethnicity='" + ethnicity + '\'' +
				", ethnicityIEN='" + ethnicityIEN + '\'' +
				", ethnicityRecordIEN='" + ethnicityRecordIEN + '\'' +
				", collectionMethod='" + collectionMethod + '\'' + "\n"+
				", religion='" + religion + '\'' +
				", comments='" + comments + '\'' +
				", birthCity='" + birthCity + '\'' +
				", birthState='" + birthState + '\'' +
				", pagerNumber='" + pagerNumber + '\'' +
				", fatherName='" + fatherName + '\'' +
				", motherName='" + motherName + '\'' +
				", motherMaidenName='" + motherMaidenName + '\'' +
				", dateofDeath='" + dateofDeath + '\'' +
				", alias='" + alias + '\'' +
				", isRatedIncompetent='" + isRatedIncompetent + '\'' +
				", addressLine1='" + addressLine1 + '\'' +
				", addressLine2='" + addressLine2 + '\'' +
				", addressLine3='" + addressLine3 + '\'' + "\n"+
				", confidentialAddressCategory='" + confidentialAddressCategory + '\'' +
				", isConfidentialAddressActive='" + isConfidentialAddressActive + '\'' +
				", confIEN='" + confIEN + '\'' +
				", confidentialAddressStreetLine1='" + confidentialAddressStreetLine1 + '\'' +
				", confidentialAddressStreetLine2='" + confidentialAddressStreetLine2 + '\'' +
				", confidentialAddressStreetLine3='" + confidentialAddressStreetLine3 + '\'' +
				", confidentialAddressCity='" + confidentialAddressCity + '\'' +
				", confidentialAddressState='" + confidentialAddressState + '\'' +
				", confidentialAddressZipcode='" + confidentialAddressZipcode + '\'' +
				", confidentialStartDate='" + confidentialStartDate + '\'' +
				", confidentialEndDate='" + confidentialEndDate + '\'' +
				", confidentialAddressCounty='" + confidentialAddressCounty + '\'' +
				", nameofPrimaryNextOfKin='" + nameofPrimaryNextOfKin + '\'' + "\n"+
				", primaryNextOfKinRelationshipToPatient='" + primaryNextOfKinRelationshipToPatient + '\'' +
				", isPriamryNextOfKinAddressSameAsPatient='" + isPriamryNextOfKinAddressSameAsPatient + '\'' +
				", primaryNextOfKinAddressStreetLine1='" + primaryNextOfKinAddressStreetLine1 + '\'' +
				", primaryNextOfKinAddressStreetLine2='" + primaryNextOfKinAddressStreetLine2 + '\'' +
				", primaryNextOfKinAddressStreetLine3='" + primaryNextOfKinAddressStreetLine3 + '\'' +
				", primaryNextOfKinAddressCity='" + primaryNextOfKinAddressCity + '\'' +
				", primaryNextOfKinState='" + primaryNextOfKinState + '\'' +
				", primaryNextOfKinZipcode='" + primaryNextOfKinZipcode + '\'' +
				", primaryNextOfKinZipcode4='" + primaryNextOfKinZipcode4 + '\'' +
				", primaryNextOfKinPhoneNumber='" + primaryNextOfKinPhoneNumber + '\'' +
				", primaryNextOfKinPhoneNumberWork='" + primaryNextOfKinPhoneNumberWork + '\'' +
				", nameofSecondaryNextOfKin='" + nameofSecondaryNextOfKin + '\'' +
				", secondaryNextOfKinRelationshipToPatient='" + secondaryNextOfKinRelationshipToPatient + '\'' +
				", isSecondaryNextOfKinAddressSameAsPatient='" + isSecondaryNextOfKinAddressSameAsPatient + '\'' +
				", secondaryNextOfKinAddressStreetLine1='" + secondaryNextOfKinAddressStreetLine1 + '\'' +
				", secondaryNextOfKinAddressStreetLine2='" + secondaryNextOfKinAddressStreetLine2 + '\'' +
				", secondaryNextOfKinAddressStreetLine3='" + secondaryNextOfKinAddressStreetLine3 + '\'' +
				", secondaryNextOfKinAddressCity='" + secondaryNextOfKinAddressCity + '\'' +
				", secondaryNextOfKinState='" + secondaryNextOfKinState + '\'' + "\n"+
				", secondaryNextOfKinZipcode='" + secondaryNextOfKinZipcode + '\'' +
				", secondaryNextOfKinZipcode4='" + secondaryNextOfKinZipcode4 + '\'' +
				", secondaryNextOfKinPhoneNumber='" + secondaryNextOfKinPhoneNumber + '\'' +
				", secondaryNextOfKinPhoneNumberWork='" + secondaryNextOfKinPhoneNumberWork + '\'' +
				", isDesigneeSameAsNextOfKin='" + isDesigneeSameAsNextOfKin + '\'' +
				", nameofDesignee='" + nameofDesignee + '\'' +
				", designeeRelationshipToPatient='" + designeeRelationshipToPatient + '\'' +
				", isdesigneeAddressSameAsPatient='" + isdesigneeAddressSameAsPatient + '\'' +
				", designeeAddressStreetLine1='" + designeeAddressStreetLine1 + '\'' +
				", designeeAddressStreetLine2='" + designeeAddressStreetLine2 + '\'' +
				", designeeAddressStreetLine3='" + designeeAddressStreetLine3 + '\'' +
				", designeeCity='" + designeeCity + '\'' +
				", designeeState='" + designeeState + '\'' +
				", designeeZipcode='" + designeeZipcode + '\'' +
				", designeeZipcode4='" + designeeZipcode4 + '\'' +
				", designeePhoneNumber='" + designeePhoneNumber + '\'' + "\n"+
				", designeePhoneNumberWork='" + designeePhoneNumberWork + '\'' +
				", isEmergencyContactSameAsNextOfKin='" + isEmergencyContactSameAsNextOfKin + '\'' +
				", nameofEmergencyContact='" + nameofEmergencyContact + '\'' +
				", emergencyContactRelationshipToPatient='" + emergencyContactRelationshipToPatient + '\'' +
				", emergencyContactAddressStreetLine1='" + emergencyContactAddressStreetLine1 + '\'' +
				", emergencyContactAddressStreetLine2='" + emergencyContactAddressStreetLine2 + '\'' +
				", emergencyContactAddressStreetLine3='" + emergencyContactAddressStreetLine3 + '\'' +
				", emergencyContactCity='" + emergencyContactCity + '\'' +
				", emergencyContactState='" + emergencyContactState + '\'' +
				", emergencyContactZipcode='" + emergencyContactZipcode + '\'' +
				", emergencyContactZipcode4='" + emergencyContactZipcode4 + '\'' +
				", emergencyContactPhoneNumber='" + emergencyContactPhoneNumber + '\'' +
				", emergencyContactPhoneNumberWork='" + emergencyContactPhoneNumberWork + '\'' +
				", nameofSecondaryEmergencyContact='" + nameofSecondaryEmergencyContact + '\'' +
				", secondaryEmergencyContactRelationshipToPatient='" + secondaryEmergencyContactRelationshipToPatient + '\'' +
				", secondaryEmergencyContactAddressStreetLine1='" + secondaryEmergencyContactAddressStreetLine1 + '\'' +
				", secondaryEmergencyContactAddressStreetLine2='" + secondaryEmergencyContactAddressStreetLine2 + '\'' +
				", secondaryEmergencyContactAddressStreetLine3='" + secondaryEmergencyContactAddressStreetLine3 + '\'' +
				", secondaryEmergencyContactCity='" + secondaryEmergencyContactCity + '\'' + "\n"+
				", secondaryEmergencyContactState='" + secondaryEmergencyContactState + '\'' +
				", secondaryEmergencyContactZipcode='" + secondaryEmergencyContactZipcode + '\'' +
				", secondaryEmergencyContactZipcode4='" + secondaryEmergencyContactZipcode4 + '\'' +
				", secondaryEmergencyContactPhoneNumber='" + secondaryEmergencyContactPhoneNumber + '\'' +
				", secondaryEmergencyContactPhoneNumberWork='" + secondaryEmergencyContactPhoneNumberWork + '\'' +
				", fugitiveFelonFlag='" + fugitiveFelonFlag + '\'' +
				", fugitiveFelonFlagRemovalRemarks='" + fugitiveFelonFlagRemovalRemarks + '\'' +
				", spousesOccupation='" + spousesOccupation + '\'' +
				", spousesRetirementDate='" + spousesRetirementDate + '\'' +
				", spousesEmploymentStatus='" + spousesEmploymentStatus + '\'' +
				", spousesEmployerName='" + spousesEmployerName + '\'' + "\n"+
				", spousesEmployerStreetLine1='" + spousesEmployerStreetLine1 + '\'' +
				", spousesEmployerStreetLine2='" + spousesEmployerStreetLine2 + '\'' +
				", spousesEmployerStreetLine3='" + spousesEmployerStreetLine3 + '\'' +
				", spousesEmployersCity='" + spousesEmployersCity + '\'' +
				", spousesEmployersState='" + spousesEmployersState + '\'' +
				", spousesEmployersZipCode='" + spousesEmployersZipCode + '\'' +
				", spousesEmployersZipCode4='" + spousesEmployersZipCode4 + '\'' +
				", spousesEmployersPhoneNumber='" + spousesEmployersPhoneNumber + '\'' +
				", spousePhoneNumberWork='" + spousePhoneNumberWork + '\'' +
				", ineligibleDate='" + ineligibleDate + '\'' +
				", eligibleForMedicalId='" + eligibleForMedicalId + '\'' +
				", dateMedicalIdLastAsked='" + dateMedicalIdLastAsked + '\'' +
				", medicalIdNumber='" + medicalIdNumber + '\'' +
				", dispositionLog='" + dispositionLog + '\'' +
				", followedInClinic='" + followedInClinic + '\'' +
				", examinedToday='" + examinedToday + '\'' +
				", dateTime='" + dateTime + '\'' +
				", facility='" + facility + '\'' +
				", typeofcare='" + typeofcare + '\'' + "\n"+
				", typeofbenifits='" + typeofbenifits + '\'' +
				", eligibilityCode='" + eligibilityCode + '\'' +
				", relatedtoaccident='" + relatedtoaccident + '\'' +
				", relatedtooccupation='" + relatedtooccupation + '\'' +
				", ruledIncompetent='" + ruledIncompetent + '\'' +
				", dateRuledIncompetent='" + dateRuledIncompetent + '\'' +
				", guardianRelationship='" + guardianRelationship + '\'' +
				", guardianInstitution='" + guardianInstitution + '\'' +
				", guardian='" + guardian + '\'' +
				", guardianAddressStreetLine1='" + guardianAddressStreetLine1 + '\'' +
				", guardianAddressStreetLine2='" + guardianAddressStreetLine2 + '\'' +
				", guardianCity='" + guardianCity + '\'' +
				", guardianState='" + guardianState + '\'' + "\n"+
				", guardianZipcode='" + guardianZipcode + '\'' +
				", guardianZipcode4='" + guardianZipcode4 + '\'' +
				", guardianPhoneNumber='" + guardianPhoneNumber + '\'' +
				", testPatient='" + testPatient + '\'' +
				", confidentialChangeTimeStamp='" + confidentialChangeTimeStamp + '\'' +
				", priamryNextOfKinChangeTimeStamp='" + priamryNextOfKinChangeTimeStamp + '\'' +
				", secondaryNextOfKinChangeTimeStamp='" + secondaryNextOfKinChangeTimeStamp + '\'' +
				", designeeChangeTimeStamp='" + designeeChangeTimeStamp + '\'' +
				", emergencyContactChangeTimeStamp='" + emergencyContactChangeTimeStamp + '\'' +
				", secondaryEmergencyContactChangeTimeStamp='" + secondaryEmergencyContactChangeTimeStamp + '\'' +
				", fugitiveFelonFlagChangeTimeStamp='" + fugitiveFelonFlagChangeTimeStamp + '\'' +
				", dateMedicalIdLastAskedTimestamp='" + dateMedicalIdLastAskedTimestamp + '\'' +
				", iCareId='" + iCareId + '\'' +
				", searchable='" + searchable + '\'' +
				", isDummyPatient='" + isDummyPatient + '\'' + "\n"+
				", languagePreference='" + languagePreference + '\'' +
				", preliminaryCauseOfDeath='" + preliminaryCauseOfDeath + '\'' +
				", sourceOfNotification='" + sourceOfNotification + '\'' +
				", countyFIPS='" + countyFIPS + '\'' +
				", confidentialAddressCountyFIPS='" + confidentialAddressCountyFIPS + '\'' +
				", loggedInUserInstitutionId='" + loggedInUserInstitutionId + '\'' +
				", loggedInUserCustomerId='" + loggedInUserCustomerId + '\'' +
				", customerId='" + customerId + '\'' +
				", customerName='" + customerName + '\'' +
				", houseHoldIncome='" + houseHoldIncome + '\'' +
				", familyMembers=" + familyMembers +
				", employerName='" + employerName + '\'' +
				", guarantorFirstName='" + guarantorFirstName + '\'' + "\n"+
				", guarantorLastName='" + guarantorLastName + '\'' +
				", guarantorSex='" + guarantorSex + '\'' +
				", guarantorSSN='" + guarantorSSN + '\'' +
				", guarantorPhone='" + guarantorPhone + '\'' +
				", guarantorAddressStreetLine1='" + guarantorAddressStreetLine1 + '\'' +
				", guarantorAddressStreetLine2='" + guarantorAddressStreetLine2 + '\'' +
				", guarantorCity='" + guarantorCity + '\'' +
				", guarantorState='" + guarantorState + '\'' +
				", guarantorStateAbbreviation='" + guarantorStateAbbreviation + '\'' +
				", guarantorZip='" + guarantorZip + '\'' +
				", guarantorHomePhone='" + guarantorHomePhone + '\'' +
				", guarantorWorkPhone='" + guarantorWorkPhone + '\'' +
				", headOfHouseholdFirstName='" + headOfHouseholdFirstName + '\'' +
				", headOfHouseholdLastName='" + headOfHouseholdLastName + '\'' +
				", headOfHouseholdSSN='" + headOfHouseholdSSN + '\'' +
				", guarantorPhoneOne='" + guarantorPhoneOne + '\'' +
				", hhSex='" + hhSex + '\'' +
				", referringProvider='" + referringProvider + '\'' + "\n"+
				", hhPhone='" + hhPhone + '\'' +
				", headOfHouseholdRelation='" + headOfHouseholdRelation + '\'' +
				", primaryPhysicianId=" + primaryPhysicianId +
				", institutionName='" + institutionName + '\'' +
				", medicationCenterDivision='" + medicationCenterDivision + '\'' +
				", adminUserName='" + adminUserName + '\'' +
				", adminICareId='" + adminICareId + '\'' +
				", guarantorRelation='" + guarantorRelation + '\'' +"---------------------" + "\n"+
				", mrn='" + mrn + '\'' +
				", oldMrn='" + oldMrn + '\'' +
				", stateAbbreviation='" + stateAbbreviation + '\'' +
				", deathIMOCode='" + deathIMOCode + '\'' +
				", deathIMODescription='" + deathIMODescription + '\'' +
				", deathIMOType='" + deathIMOType + '\'' +
				", deathIMOValueSet='" + deathIMOValueSet + '\'' +
				", deathIMOOid='" + deathIMOOid + '\'' +
				", emergencyContactStateAbbreviation='" + emergencyContactStateAbbreviation + '\'' +
				", countyName='" + countyName + '\'' +
				'}';
	}
}
