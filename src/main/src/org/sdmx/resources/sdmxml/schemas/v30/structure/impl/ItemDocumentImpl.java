/*
 * An XML document type.
 * Localname: Item
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Item(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class ItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    private static final long serialVersionUID = 1L;

    public ItemDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Item"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoFeatureSetCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoGridCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoRefCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ReportingCategory"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Item"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlMapping"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataConsumer"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "UserDefinedOperator"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Code"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "NamePersonalisation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Organisation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Category"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Agency"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Transformation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OrganisationUnit"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Ruleset"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Concept"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CustomType"),
    }),
    };

    /**
     * Gets the "Item" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType getItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Item" element
     */
    @Override
    public void setItem(org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType item) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(item);
        }
    }

    /**
     * Appends and returns a new empty "Item" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType addNewItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
