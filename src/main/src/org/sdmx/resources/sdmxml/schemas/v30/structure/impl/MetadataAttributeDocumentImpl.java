/*
 * An XML document type.
 * Localname: MetadataAttribute
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one MetadataAttribute(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class MetadataAttributeDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeDocument {
    private static final long serialVersionUID = 1L;

    public MetadataAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttribute"),
    };


    /**
     * Gets the "MetadataAttribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType getMetadataAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "MetadataAttribute" element
     */
    @Override
    public void setMetadataAttribute(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType metadataAttribute) {
        generatedSetterHelperImpl(metadataAttribute, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataAttribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType addNewMetadataAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
