/**
 * LON_Network_eCommand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.echelon.wsdl.web_services_ns.ilon100.v4_0.message;

@SuppressWarnings({"rawtypes","unchecked"})
public class LON_Network_eCommand implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LON_Network_eCommand(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Syncronize = "Syncronize";
    public static final java.lang.String _ListLnsNetworkInterfaces = "ListLnsNetworkInterfaces";
    public static final LON_Network_eCommand Syncronize = new LON_Network_eCommand(_Syncronize);
    public static final LON_Network_eCommand ListLnsNetworkInterfaces = new LON_Network_eCommand(_ListLnsNetworkInterfaces);
    public java.lang.String getValue() { return _value_;}
    public static LON_Network_eCommand fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LON_Network_eCommand enumeration = (LON_Network_eCommand)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LON_Network_eCommand fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LON_Network_eCommand.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/", "LON_Network_eCommand"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
