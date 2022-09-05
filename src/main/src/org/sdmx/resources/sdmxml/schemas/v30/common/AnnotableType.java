/*
 * XML Type:  AnnotableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AnnotableType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface AnnotableType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "annotabletype4f68type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Annotations" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType getAnnotations();

    /**
     * True if has "Annotations" element
     */
    boolean isSetAnnotations();

    /**
     * Sets the "Annotations" element
     */
    void setAnnotations(org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType annotations);

    /**
     * Appends and returns a new empty "Annotations" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType addNewAnnotations();

    /**
     * Unsets the "Annotations" element
     */
    void unsetAnnotations();
}
