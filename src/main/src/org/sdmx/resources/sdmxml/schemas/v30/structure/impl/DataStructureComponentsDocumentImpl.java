/*
 * An XML document type.
 * Localname: DataStructureComponents
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DataStructureComponents(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class DataStructureComponentsDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.GroupingDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsDocument {
    private static final long serialVersionUID = 1L;

    public DataStructureComponentsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataStructureComponents"),
    };


    /**
     * Gets the "DataStructureComponents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType getDataStructureComponents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataStructureComponents" element
     */
    @Override
    public void setDataStructureComponents(org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType dataStructureComponents) {
        generatedSetterHelperImpl(dataStructureComponents, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataStructureComponents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType addNewDataStructureComponents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
