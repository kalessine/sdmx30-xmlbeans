/*
 * XML Type:  UserDefinedOperatorSchemeBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML UserDefinedOperatorSchemeBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class UserDefinedOperatorSchemeBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.VtlDefinitionSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeBaseType {
    private static final long serialVersionUID = 1L;

    public UserDefinedOperatorSchemeBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "UserDefinedOperator"),
    };


    /**
     * Gets a List of "UserDefinedOperator" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType> getUserDefinedOperatorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getUserDefinedOperatorArray,
                this::setUserDefinedOperatorArray,
                this::insertNewUserDefinedOperator,
                this::removeUserDefinedOperator,
                this::sizeOfUserDefinedOperatorArray
            );
        }
    }

    /**
     * Gets array of all "UserDefinedOperator" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType[] getUserDefinedOperatorArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType[0]);
    }

    /**
     * Gets ith "UserDefinedOperator" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType getUserDefinedOperatorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "UserDefinedOperator" element
     */
    @Override
    public int sizeOfUserDefinedOperatorArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "UserDefinedOperator" element
     */
    @Override
    public void setUserDefinedOperatorArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType userDefinedOperator) {
        generatedSetterHelperImpl(userDefinedOperator, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserDefinedOperator" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType insertNewUserDefinedOperator(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "UserDefinedOperator" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType addNewUserDefinedOperator() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "UserDefinedOperator" element
     */
    @Override
    public void removeUserDefinedOperator(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
