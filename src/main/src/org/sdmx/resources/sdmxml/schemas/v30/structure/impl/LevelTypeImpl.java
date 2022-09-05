/*
 * XML Type:  LevelType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML LevelType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class LevelTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.LevelBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType {
    private static final long serialVersionUID = 1L;

    public LevelTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CodingFormat"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Level"),
    };


    /**
     * Gets the "CodingFormat" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType getCodingFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "CodingFormat" element
     */
    @Override
    public boolean isSetCodingFormat() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "CodingFormat" element
     */
    @Override
    public void setCodingFormat(org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType codingFormat) {
        generatedSetterHelperImpl(codingFormat, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CodingFormat" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType addNewCodingFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "CodingFormat" element
     */
    @Override
    public void unsetCodingFormat() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Level" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType getLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Level" element
     */
    @Override
    public boolean isSetLevel() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Level" element
     */
    @Override
    public void setLevel(org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType level) {
        generatedSetterHelperImpl(level, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Level" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType addNewLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "Level" element
     */
    @Override
    public void unsetLevel() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
