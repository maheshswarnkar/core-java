package ms.examples.iCare.readXLFile;

/**
 * @author MAHESH
 *
 */
public class OrderablePojo {

	private String orderTypes;
	private String types;
	private String name;
	private String active;
	private String inactivatedDate;
	private String cptCode;
	private String icd10PcCode;
	private String imoLexicalCode;
	private String referenceId;
	private String availableModifier;
	private String relatedServices;

	public String getOrderTypes() {
		return orderTypes;
	}

	public void setOrderTypes(String orderTypes) {
		this.orderTypes = orderTypes;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getInactivatedDate() {
		return inactivatedDate;
	}

	public void setInactivatedDate(String inactivatedDate) {
		this.inactivatedDate = inactivatedDate;
	}

	public String getCptCode() {
		return cptCode;
	}

	public void setCptCode(String cptCode) {
		this.cptCode = cptCode;
	}

	public String getIcd10PcCode() {
		return icd10PcCode;
	}

	public void setIcd10PcCode(String icd10PcCode) {
		this.icd10PcCode = icd10PcCode;
	}

	public String getImoLexicalCode() {
		return imoLexicalCode;
	}

	public void setImoLexicalCode(String imoLexicalCode) {
		this.imoLexicalCode = imoLexicalCode;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getAvailableModifier() {
		return availableModifier;
	}

	public void setAvailableModifier(String availableModifier) {
		this.availableModifier = availableModifier;
	}

	public String getRelatedServices() {
		return relatedServices;
	}

	public void setRelatedServices(String relatedServices) {
		this.relatedServices = relatedServices;
	}

}
