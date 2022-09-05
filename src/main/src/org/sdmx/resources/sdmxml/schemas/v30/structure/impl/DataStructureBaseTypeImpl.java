/*
 * XML Type:  DataStructureBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataStructureBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataStructureBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.StructureTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureBaseType {
    private static final long serialVersionUID = 1L;

    public DataStructureBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
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
     * True if has "DataStructureComponents" element
     */
    @Override
    public boolean isSetDataStructureComponents() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
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

    /**
     * Unsets the "DataStructureComponents" element
     */
    @Override
    public void unsetDataStructureComponents() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
}
