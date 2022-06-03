/**
 * CarGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class CarGroup  implements java.io.Serializable {
    private int carGroupId;

    private java.lang.String carGroupName;

    private java.lang.String carGroupCategory;

    private java.math.BigDecimal amount;

    private com.bookcyprus.webservicesV2.CarVehicle[] vehicles;

    private com.bookcyprus.webservicesV2.CarGroupSupplement[] supplements;

    public CarGroup() {
    }

    public CarGroup(
           int carGroupId,
           java.lang.String carGroupName,
           java.lang.String carGroupCategory,
           java.math.BigDecimal amount,
           com.bookcyprus.webservicesV2.CarVehicle[] vehicles,
           com.bookcyprus.webservicesV2.CarGroupSupplement[] supplements) {
           this.carGroupId = carGroupId;
           this.carGroupName = carGroupName;
           this.carGroupCategory = carGroupCategory;
           this.amount = amount;
           this.vehicles = vehicles;
           this.supplements = supplements;
    }


    /**
     * Gets the carGroupId value for this CarGroup.
     * 
     * @return carGroupId
     */
    public int getCarGroupId() {
        return carGroupId;
    }


    /**
     * Sets the carGroupId value for this CarGroup.
     * 
     * @param carGroupId
     */
    public void setCarGroupId(int carGroupId) {
        this.carGroupId = carGroupId;
    }


    /**
     * Gets the carGroupName value for this CarGroup.
     * 
     * @return carGroupName
     */
    public java.lang.String getCarGroupName() {
        return carGroupName;
    }


    /**
     * Sets the carGroupName value for this CarGroup.
     * 
     * @param carGroupName
     */
    public void setCarGroupName(java.lang.String carGroupName) {
        this.carGroupName = carGroupName;
    }


    /**
     * Gets the carGroupCategory value for this CarGroup.
     * 
     * @return carGroupCategory
     */
    public java.lang.String getCarGroupCategory() {
        return carGroupCategory;
    }


    /**
     * Sets the carGroupCategory value for this CarGroup.
     * 
     * @param carGroupCategory
     */
    public void setCarGroupCategory(java.lang.String carGroupCategory) {
        this.carGroupCategory = carGroupCategory;
    }


    /**
     * Gets the amount value for this CarGroup.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CarGroup.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the vehicles value for this CarGroup.
     * 
     * @return vehicles
     */
    public com.bookcyprus.webservicesV2.CarVehicle[] getVehicles() {
        return vehicles;
    }


    /**
     * Sets the vehicles value for this CarGroup.
     * 
     * @param vehicles
     */
    public void setVehicles(com.bookcyprus.webservicesV2.CarVehicle[] vehicles) {
        this.vehicles = vehicles;
    }


    /**
     * Gets the supplements value for this CarGroup.
     * 
     * @return supplements
     */
    public com.bookcyprus.webservicesV2.CarGroupSupplement[] getSupplements() {
        return supplements;
    }


    /**
     * Sets the supplements value for this CarGroup.
     * 
     * @param supplements
     */
    public void setSupplements(com.bookcyprus.webservicesV2.CarGroupSupplement[] supplements) {
        this.supplements = supplements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarGroup)) return false;
        CarGroup other = (CarGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.carGroupId == other.getCarGroupId() &&
            ((this.carGroupName==null && other.getCarGroupName()==null) || 
             (this.carGroupName!=null &&
              this.carGroupName.equals(other.getCarGroupName()))) &&
            ((this.carGroupCategory==null && other.getCarGroupCategory()==null) || 
             (this.carGroupCategory!=null &&
              this.carGroupCategory.equals(other.getCarGroupCategory()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.vehicles==null && other.getVehicles()==null) || 
             (this.vehicles!=null &&
              java.util.Arrays.equals(this.vehicles, other.getVehicles()))) &&
            ((this.supplements==null && other.getSupplements()==null) || 
             (this.supplements!=null &&
              java.util.Arrays.equals(this.supplements, other.getSupplements())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCarGroupId();
        if (getCarGroupName() != null) {
            _hashCode += getCarGroupName().hashCode();
        }
        if (getCarGroupCategory() != null) {
            _hashCode += getCarGroupCategory().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getVehicles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupplements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carGroupCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Vehicles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarVehicle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarVehicle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Supplements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupSupplement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupSupplement"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
