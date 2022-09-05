/*
 * An XML document type.
 * Localname: MetadataAttributeUsage
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one MetadataAttributeUsage(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class MetadataAttributeUsageDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageDocument {
    private static final long serialVersionUID = 1L;

    public MetadataAttributeUsageDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttributeUsage"),
    };


    /**
     * Gets the "MetadataAttributeUsage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType getMetadataAttributeUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "MetadataAttributeUsage" element
     */
    @Override
    public void setMetadataAttributeUsage(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType metadataAttributeUsage) {
        generatedSetterHelperImpl(metadataAttributeUsage, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataAttributeUsage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType addNewMetadataAttributeUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
