/*
 * An XML document type.
 * Localname: VtlMapping
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one VtlMapping(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class VtlMappingDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingDocument {
    private static final long serialVersionUID = 1L;

    public VtlMappingDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlMapping"),
    };


    /**
     * Gets the "VtlMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType getVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "VtlMapping" element
     */
    @Override
    public void setVtlMapping(org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType vtlMapping) {
        generatedSetterHelperImpl(vtlMapping, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "VtlMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType addNewVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
