/*
 * An XML document type.
 * Localname: MeasureList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one MeasureList(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class MeasureListDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentListDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListDocument {
    private static final long serialVersionUID = 1L;

    public MeasureListDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MeasureList"),
    };


    /**
     * Gets the "MeasureList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType getMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "MeasureList" element
     */
    @Override
    public void setMeasureList(org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType measureList) {
        generatedSetterHelperImpl(measureList, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MeasureList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType addNewMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
