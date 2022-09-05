/*
 * An XML document type.
 * Localname: Annotations
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Annotations(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common) element.
 *
 * This is a complex type.
 */
public interface AnnotationsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "annotations750edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Annotations" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType getAnnotations();

    /**
     * Sets the "Annotations" element
     */
    void setAnnotations(org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType annotations);

    /**
     * Appends and returns a new empty "Annotations" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType addNewAnnotations();
}
