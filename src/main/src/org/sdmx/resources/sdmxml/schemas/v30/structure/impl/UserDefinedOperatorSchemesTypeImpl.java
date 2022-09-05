/*
 * XML Type:  UserDefinedOperatorSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML UserDefinedOperatorSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class UserDefinedOperatorSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType {
    private static final long serialVersionUID = 1L;

    public UserDefinedOperatorSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "UserDefinedOperatorScheme"),
    };


    /**
     * Gets a List of "UserDefinedOperatorScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType> getUserDefinedOperatorSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getUserDefinedOperatorSchemeArray,
                this::setUserDefinedOperatorSchemeArray,
                this::insertNewUserDefinedOperatorScheme,
                this::removeUserDefinedOperatorScheme,
                this::sizeOfUserDefinedOperatorSchemeArray
            );
        }
    }

    /**
     * Gets array of all "UserDefinedOperatorScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType[] getUserDefinedOperatorSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType[0]);
    }

    /**
     * Gets ith "UserDefinedOperatorScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType getUserDefinedOperatorSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "UserDefinedOperatorScheme" element
     */
    @Override
    public int sizeOfUserDefinedOperatorSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "UserDefinedOperatorScheme" element
     */
    @Override
    public void setUserDefinedOperatorSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType userDefinedOperatorScheme) {
        generatedSetterHelperImpl(userDefinedOperatorScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserDefinedOperatorScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType insertNewUserDefinedOperatorScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "UserDefinedOperatorScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType addNewUserDefinedOperatorScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "UserDefinedOperatorScheme" element
     */
    @Override
    public void removeUserDefinedOperatorScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
