/*
 * An XML document type.
 * Localname: Category
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Category(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryDocument {
    private static final long serialVersionUID = 1L;

    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Category"),
    };


    /**
     * Gets the "Category" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType getCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Category" element
     */
    @Override
    public void setCategory(org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType category) {
        generatedSetterHelperImpl(category, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Category" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType addNewCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
