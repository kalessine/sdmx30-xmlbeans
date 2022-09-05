/*
 * An XML document type.
 * Localname: Transformation
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Transformation(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class TransformationDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationDocument {
    private static final long serialVersionUID = 1L;

    public TransformationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Transformation"),
    };


    /**
     * Gets the "Transformation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType getTransformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Transformation" element
     */
    @Override
    public void setTransformation(org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType transformation) {
        generatedSetterHelperImpl(transformation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Transformation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType addNewTransformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
