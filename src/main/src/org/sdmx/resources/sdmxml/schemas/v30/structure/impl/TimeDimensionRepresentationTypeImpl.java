/*
 * XML Type:  TimeDimensionRepresentationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionRepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TimeDimensionRepresentationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class TimeDimensionRepresentationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.SimpleDataStructureRepresentationTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionRepresentationType {
    private static final long serialVersionUID = 1L;

    public TimeDimensionRepresentationTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TextFormat"),
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
}
