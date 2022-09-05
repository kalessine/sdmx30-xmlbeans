/*
 * XML Type:  CodeSelectionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CodeSelectionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CodeSelectionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType {
    private static final long serialVersionUID = 1L;

    public CodeSelectionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MemberValue"),
    };


    /**
     * Gets a List of "MemberValue" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType> getMemberValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMemberValueArray,
                this::setMemberValueArray,
                this::insertNewMemberValue,
                this::removeMemberValue,
                this::sizeOfMemberValueArray
            );
        }
    }

    /**
     * Gets array of all "MemberValue" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType[] getMemberValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType[0]);
    }

    /**
     * Gets ith "MemberValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType getMemberValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MemberValue" element
     */
    @Override
    public int sizeOfMemberValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MemberValue" element
     */
    @Override
    public void setMemberValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType memberValue) {
        generatedSetterHelperImpl(memberValue, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MemberValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType insertNewMemberValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MemberValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType addNewMemberValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "MemberValue" element
     */
    @Override
    public void removeMemberValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
