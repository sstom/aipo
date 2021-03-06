package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipMAddressbookCompany was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipMAddressbookCompany extends org.apache.cayenne.CayenneDataObject {

    public static final String ADDRESS_PROPERTY = "address";
    public static final String COMPANY_NAME_PROPERTY = "companyName";
    public static final String COMPANY_NAME_KANA_PROPERTY = "companyNameKana";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String CREATE_USER_ID_PROPERTY = "createUserId";
    public static final String FAX_NUMBER_PROPERTY = "faxNumber";
    public static final String POST_NAME_PROPERTY = "postName";
    public static final String TELEPHONE_PROPERTY = "telephone";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String UPDATE_USER_ID_PROPERTY = "updateUserId";
    public static final String URL_PROPERTY = "url";
    public static final String ZIPCODE_PROPERTY = "zipcode";

    public static final String COMPANY_ID_PK_COLUMN = "COMPANY_ID";

    public void setAddress(String address) {
        writeProperty("address", address);
    }
    public String getAddress() {
        return (String)readProperty("address");
    }
    
    
    public void setCompanyName(String companyName) {
        writeProperty("companyName", companyName);
    }
    public String getCompanyName() {
        return (String)readProperty("companyName");
    }
    
    
    public void setCompanyNameKana(String companyNameKana) {
        writeProperty("companyNameKana", companyNameKana);
    }
    public String getCompanyNameKana() {
        return (String)readProperty("companyNameKana");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setCreateUserId(Integer createUserId) {
        writeProperty("createUserId", createUserId);
    }
    public Integer getCreateUserId() {
        return (Integer)readProperty("createUserId");
    }
    
    
    public void setFaxNumber(String faxNumber) {
        writeProperty("faxNumber", faxNumber);
    }
    public String getFaxNumber() {
        return (String)readProperty("faxNumber");
    }
    
    
    public void setPostName(String postName) {
        writeProperty("postName", postName);
    }
    public String getPostName() {
        return (String)readProperty("postName");
    }
    
    
    public void setTelephone(String telephone) {
        writeProperty("telephone", telephone);
    }
    public String getTelephone() {
        return (String)readProperty("telephone");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setUpdateUserId(Integer updateUserId) {
        writeProperty("updateUserId", updateUserId);
    }
    public Integer getUpdateUserId() {
        return (Integer)readProperty("updateUserId");
    }
    
    
    public void setUrl(String url) {
        writeProperty("url", url);
    }
    public String getUrl() {
        return (String)readProperty("url");
    }
    
    
    public void setZipcode(String zipcode) {
        writeProperty("zipcode", zipcode);
    }
    public String getZipcode() {
        return (String)readProperty("zipcode");
    }
    
    
}
