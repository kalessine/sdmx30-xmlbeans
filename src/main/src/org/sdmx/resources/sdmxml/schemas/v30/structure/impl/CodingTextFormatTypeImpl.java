/*
 * XML Type:  CodingTextFormatType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CodingTextFormatType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CodingTextFormatTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.SimpleComponentTextFormatTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType {
    private static final long serialVersionUID = 1L;

    public CodingTextFormatTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "textType"),
    };


    /**
     * Gets the "textType" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum getTextType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "textType" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType xgetTextType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "textType" attribute
     */
    @Override
    public boolean isSetTextType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "textType" attribute
     */
    @Override
    public void setTextType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum textType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(textType);
        }
    }

    /**
     * Sets (as xml) the "textType" attribute
     */
    @Override
    public void xsetTextType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType textType) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(textType);
        }
    }

    /**
     * Unsets the "textType" attribute
     */
    @Override
    public void unsetTextType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
