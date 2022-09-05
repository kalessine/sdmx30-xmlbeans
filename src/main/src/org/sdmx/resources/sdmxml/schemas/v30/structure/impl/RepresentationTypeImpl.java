/*
 * XML Type:  RepresentationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RepresentationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class RepresentationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType {
    private static final long serialVersionUID = 1L;

    public RepresentationTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TextFormat"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Enumeration"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "EnumerationFormat"),
        new QName("", "minOccurs"),
        new QName("", "maxOccurs"),
    };


    /**
     * Gets the "TextFormat" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType getTextFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "TextFormat" element
     */
    @Override
    public boolean isSetTextFormat() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "TextFormat" element
     */
    @Override
    public void setTextFormat(org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType textFormat) {
        generatedSetterHelperImpl(textFormat, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TextFormat" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType addNewTextFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "TextFormat" element
     */
    @Override
    public void unsetTextFormat() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Enumeration" element
     */
    @Override
    public java.lang.String getEnumeration() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Enumeration" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType xgetEnumeration() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "Enumeration" element
     */
    @Override
    public boolean isSetEnumeration() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Enumeration" element
     */
    @Override
    public void setEnumeration(java.lang.String enumeration) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(enumeration);
        }
    }

    /**
     * Sets (as xml) the "Enumeration" element
     */
    @Override
    public void xsetEnumeration(org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType enumeration) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(enumeration);
        }
    }

    /**
     * Unsets the "Enumeration" element
     */
    @Override
    public void unsetEnumeration() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "EnumerationFormat" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType getEnumerationFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "EnumerationFormat" element
     */
    @Override
    public boolean isSetEnumerationFormat() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "EnumerationFormat" element
     */
    @Override
    public void setEnumerationFormat(org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType enumerationFormat) {
        generatedSetterHelperImpl(enumerationFormat, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "EnumerationFormat" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType addNewEnumerationFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "EnumerationFormat" element
     */
    @Override
    public void unsetEnumerationFormat() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "minOccurs" attribute
     */
    @Override
    public java.math.BigInteger getMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "minOccurs" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return target;
        }
    }

    /**
     * True if has "minOccurs" attribute
     */
    @Override
    public boolean isSetMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "minOccurs" attribute
     */
    @Override
    public void setMinOccurs(java.math.BigInteger minOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setBigIntegerValue(minOccurs);
        }
    }

    /**
     * Sets (as xml) the "minOccurs" attribute
     */
    @Override
    public void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(minOccurs);
        }
    }

    /**
     * Unsets the "minOccurs" attribute
     */
    @Override
    public void unsetMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "maxOccurs" attribute
     */
    @Override
    public java.lang.Object getMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType xgetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "maxOccurs" attribute
     */
    @Override
    public boolean isSetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "maxOccurs" attribute
     */
    @Override
    public void setMaxOccurs(java.lang.Object maxOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setObjectValue(maxOccurs);
        }
    }

    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    @Override
    public void xsetMaxOccurs(org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType maxOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(maxOccurs);
        }
    }

    /**
     * Unsets the "maxOccurs" attribute
     */
    @Override
    public void unsetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
}
