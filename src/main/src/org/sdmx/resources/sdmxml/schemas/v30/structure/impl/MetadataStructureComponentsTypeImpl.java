/*
 * XML Type:  MetadataStructureComponentsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataStructureComponentsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataStructureComponentsTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.MetadataStructureComponentsBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType {
    private static final long serialVersionUID = 1L;

    public MetadataStructureComponentsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttributeList"),
    };


    /**
     * Gets the "MetadataAttributeList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType getMetadataAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "MetadataAttributeList" element
     */
    @Override
    public void setMetadataAttributeList(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType metadataAttributeList) {
        generatedSetterHelperImpl(metadataAttributeList, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataAttributeList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType addNewMetadataAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
