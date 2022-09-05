/*
 * An XML document type.
 * Localname: MetadataStructureComponents
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one MetadataStructureComponents(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class MetadataStructureComponentsDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.GroupingDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsDocument {
    private static final long serialVersionUID = 1L;

    public MetadataStructureComponentsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataStructureComponents"),
    };


    /**
     * Gets the "MetadataStructureComponents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType getMetadataStructureComponents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "MetadataStructureComponents" element
     */
    @Override
    public void setMetadataStructureComponents(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType metadataStructureComponents) {
        generatedSetterHelperImpl(metadataStructureComponents, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataStructureComponents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType addNewMetadataStructureComponents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
