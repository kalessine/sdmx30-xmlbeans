/*
 * An XML document type.
 * Localname: Group
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Group(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentListDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDocument {
    private static final long serialVersionUID = 1L;

    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Group"),
    };


    /**
     * Gets the "Group" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType getGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Group" element
     */
    @Override
    public void setGroup(org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType group) {
        generatedSetterHelperImpl(group, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Group" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType addNewGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
