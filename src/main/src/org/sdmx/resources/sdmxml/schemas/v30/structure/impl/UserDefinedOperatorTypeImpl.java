/*
 * XML Type:  UserDefinedOperatorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML UserDefinedOperatorType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class UserDefinedOperatorTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.UserDefinedOperatorBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType {
    private static final long serialVersionUID = 1L;

    public UserDefinedOperatorTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OperatorDefinition"),
    };


    /**
     * Gets the "OperatorDefinition" element
     */
    @Override
    public java.lang.String getOperatorDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "OperatorDefinition" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetOperatorDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "OperatorDefinition" element
     */
    @Override
    public void setOperatorDefinition(java.lang.String operatorDefinition) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(operatorDefinition);
        }
    }

    /**
     * Sets (as xml) the "OperatorDefinition" element
     */
    @Override
    public void xsetOperatorDefinition(org.apache.xmlbeans.XmlString operatorDefinition) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(operatorDefinition);
        }
    }
}
