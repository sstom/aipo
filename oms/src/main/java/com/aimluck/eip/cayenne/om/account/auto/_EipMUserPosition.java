package com.aimluck.eip.cayenne.om.account.auto;

/** Class _EipMUserPosition was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipMUserPosition extends org.apache.cayenne.CayenneDataObject {

    public static final String POSITION_PROPERTY = "position";
    public static final String TURBINE_USER_PROPERTY = "turbineUser";

    public static final String ID_PK_COLUMN = "ID";

    public void setPosition(Integer position) {
        writeProperty("position", position);
    }
    public Integer getPosition() {
        return (Integer)readProperty("position");
    }
    
    
    public void setTurbineUser(com.aimluck.eip.cayenne.om.security.TurbineUser turbineUser) {
        setToOneTarget("turbineUser", turbineUser, true);
    }

    public com.aimluck.eip.cayenne.om.security.TurbineUser getTurbineUser() {
        return (com.aimluck.eip.cayenne.om.security.TurbineUser)readProperty("turbineUser");
    } 
    
    
}
