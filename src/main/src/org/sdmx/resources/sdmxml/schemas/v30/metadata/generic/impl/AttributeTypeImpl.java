/*
 * XML Type:  AttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic).
 *
 * This is a complex type.
 */
public class AttributeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType {
    private static final long serialVersionUID = 1L;

    public AttributeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic", "Value"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Text"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "StructuredText"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic", "Attribute"),
        new QName("", "id"),
    };


    /**
     * Gets a List of "Value" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlAnySimpleType> getValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueArray,
                this::setValueArray,
                this::insertNewValue,
                this::removeValue,
                this::sizeOfValueArray
            );
        }
    }

    /**
     * Gets array of all "Value" elements
     */
    @Override
    public org.apache.xmlbeans.XmlAnySimpleType[] getValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.XmlAnySimpleType[0]);
    }

    /**
     * Gets ith "Value" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnySimpleType getValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Value" element
     */
    @Override
    public int sizeOfValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Value" element
     */
    @Override
    public void setValueArray(int i, org.apache.xmlbeans.XmlAnySimpleType value) {
        generatedSetterHelperImpl(value, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnySimpleType insertNewValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnySimpleType addNewValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Value" element
     */
    @Override
    public void removeValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

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
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "Text" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[1], i);
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
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Text" element
     */
    @Override
    public void setTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType text) {
        generatedSetterHelperImpl(text, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Text" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], i);
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
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType[0]);
    }

    /**
     * Gets ith "StructuredText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType getStructuredTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType)get_store().find_element_user(PROPERTY_QNAME[2], i);
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
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "StructuredText" element
     */
    @Override
    public void setStructuredTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType structuredText) {
        generatedSetterHelperImpl(structuredText, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuredText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType insertNewStructuredText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "Attribute" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType> getAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAttributeArray,
                this::setAttributeArray,
                this::insertNewAttribute,
                this::removeAttribute,
                this::sizeOfAttributeArray
            );
        }
    }

    /**
     * Gets array of all "Attribute" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType[] getAttributeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType[0]);
    }

    /**
     * Gets ith "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType getAttributeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Attribute" element
     */
    @Override
    public int sizeOfAttributeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "Attribute" element
     */
    @Override
    public void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType attribute) {
        generatedSetterHelperImpl(attribute, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType insertNewAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType addNewAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "Attribute" element
     */
    @Override
    public void removeAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(id);
        }
    }
}
