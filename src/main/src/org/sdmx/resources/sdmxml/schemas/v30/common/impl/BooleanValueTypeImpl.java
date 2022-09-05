/*
 * XML Type:  BooleanValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.BooleanValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML BooleanValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.common.BooleanValueType.
 */
public class BooleanValueTypeImpl extends org.apache.xmlbeans.impl.values.JavaBooleanHolderEx implements org.sdmx.resources.sdmxml.schemas.v30.common.BooleanValueType {
    private static final long serialVersionUID = 1L;

    public BooleanValueTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected BooleanValueTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Text"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "StructuredText"),
    };


    /**
     * Gets a List of "Text" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getTextList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTextArray,
                this::setTextArray,
                this::insertNewText,
                this::removeText,
                this::sizeOfTextArray
            );
        }
    }

    /**
     * Gets array of all "Text" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getTextArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "Text" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Text" element
     */
    @Override
    public int sizeOfTextArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Text" element
     */
    @Override
    public void setTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType text) {
        generatedSetterHelperImpl(text, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Text" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Text" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewText() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Text" element
     */
    @Override
    public void removeText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "StructuredText" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType> getStructuredTextList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStructuredTextArray,
                this::setStructuredTextArray,
                this::insertNewStructuredText,
                this::removeStructuredText,
                this::sizeOfStructuredTextArray
            );
        }
    }

    /**
     * Gets array of all "StructuredText" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType[] getStructuredTextArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType[0]);
    }

    /**
     * Gets ith "StructuredText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType getStructuredTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StructuredText" element
     */
    @Override
    public int sizeOfStructuredTextArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "StructuredText" element
     */
    @Override
    public void setStructuredTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType structuredText) {
        generatedSetterHelperImpl(structuredText, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuredText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType insertNewStructuredText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StructuredText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType addNewStructuredText() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "StructuredText" element
     */
    @Override
    public void removeStructuredText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
