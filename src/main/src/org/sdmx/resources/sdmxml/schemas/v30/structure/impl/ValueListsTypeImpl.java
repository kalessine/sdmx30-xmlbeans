/*
 * XML Type:  ValueListsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ValueListsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ValueListsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType {
    private static final long serialVersionUID = 1L;

    public ValueListsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ValueList"),
    };


    /**
     * Gets a List of "ValueList" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType> getValueListList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueListArray,
                this::setValueListArray,
                this::insertNewValueList,
                this::removeValueList,
                this::sizeOfValueListArray
            );
        }
    }

    /**
     * Gets array of all "ValueList" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType[] getValueListArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType[0]);
    }

    /**
     * Gets ith "ValueList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType getValueListArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValueList" element
     */
    @Override
    public int sizeOfValueListArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ValueList" element
     */
    @Override
    public void setValueListArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType valueList) {
        generatedSetterHelperImpl(valueList, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType insertNewValueList(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType addNewValueList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ValueList" element
     */
    @Override
    public void removeValueList(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
