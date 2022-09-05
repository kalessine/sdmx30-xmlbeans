/*
 * An XML document type.
 * Localname: CustomType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CustomType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class CustomTypeDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDocument {
    private static final long serialVersionUID = 1L;

    public CustomTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CustomType"),
    };


    /**
     * Gets the "CustomType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType getCustomType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CustomType" element
     */
    @Override
    public void setCustomType(org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType customType) {
        generatedSetterHelperImpl(customType, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CustomType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType addNewCustomType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
