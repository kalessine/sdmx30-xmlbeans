/*
 * XML Type:  StructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.StructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class StructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.StructureType {
    private static final long serialVersionUID = 1L;

    public StructureTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Structures"),
    };


    /**
     * Gets the "Structures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType getStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Structures" element
     */
    @Override
    public boolean isSetStructures() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Structures" element
     */
    @Override
    public void setStructures(org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType structures) {
        generatedSetterHelperImpl(structures, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Structures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType addNewStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "Structures" element
     */
    @Override
    public void unsetStructures() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
}
