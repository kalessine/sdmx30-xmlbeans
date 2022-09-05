/*
 * An XML document type.
 * Localname: Annotations
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Annotations(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common) element.
 *
 * This is a complex type.
 */
public class AnnotationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsDocument {
    private static final long serialVersionUID = 1L;

    public AnnotationsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Annotations"),
    };


    /**
     * Gets the "Annotations" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType getAnnotations() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Annotations" element
     */
    @Override
    public void setAnnotations(org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType annotations) {
        generatedSetterHelperImpl(annotations, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Annotations" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType addNewAnnotations() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
