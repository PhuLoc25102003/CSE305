public class RentalContractAndLease {
    private String ContractID;
    private String PropertyID;
    private String TenantID;
    private String RentAmount;


    public RentalContractAndLease(String contractID, String propertyID, String tenantID, String rentAmount) {
        ContractID = contractID;
        PropertyID = propertyID;
        TenantID = tenantID;
        RentAmount = rentAmount;
    }

    public void createContract(){

    }

    public void terminateContract(){

    }



    public String getContractID() {
        return ContractID;
    }
    public void setContractID(String contractID) {
        ContractID = contractID;
    }
    public String getPropertyID() {
        return PropertyID;
    }
    public void setPropertyID(String propertyID) {
        PropertyID = propertyID;
    }
    public String getTenantID() {
        return TenantID;
    }
    public void setTenantID(String tenantID) {
        TenantID = tenantID;
    }
    public String getRentAmount() {
        return RentAmount;
    }
    public void setRentAmount(String rentAmount) {
        RentAmount = rentAmount;
    }

}
