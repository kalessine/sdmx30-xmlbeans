/*
 * An XML document type.
 * Localname: GroupDimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one GroupDimension(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class GroupDimensionDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionDocument {
    private static final long serialVersionUID = 1L;

    public GroupDimensionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GroupDimension"),
    };


    /**
     * Gets the "GroupDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType getGroupDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "GroupDimension" element
     */
    @Override
    public void setGroupDimension(org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType groupDimension) {
        generatedSetterHelperImpl(groupDimension, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "GroupDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType addNewGroupDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
