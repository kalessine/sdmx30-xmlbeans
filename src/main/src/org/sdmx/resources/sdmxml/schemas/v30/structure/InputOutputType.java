/*
 * XML Type:  InputOutputType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML InputOutputType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface InputOutputType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "inputoutputtype40a1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ObjectReference" element
     */
    java.lang.String getObjectReference();

    /**
     * Gets (as xml) the "ObjectReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType xgetObjectReference();

    /**
     * Sets the "ObjectReference" element
     */
    void setObjectReference(java.lang.String objectReference);

    /**
     * Sets (as xml) the "ObjectReference" element
     */
    void xsetObjectReference(org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType objectReference);

    /**
     * Gets the "localID" attribute
     */
    java.lang.String getLocalID();

    /**
     * Gets (as xml) the "localID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetLocalID();

    /**
     * True if has "localID" attribute
     */
    boolean isSetLocalID();

    /**
     * Sets the "localID" attribute
     */
    void setLocalID(java.lang.String localID);

    /**
     * Sets (as xml) the "localID" attribute
     */
    void xsetLocalID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType localID);

    /**
     * Unsets the "localID" attribute
     */
    void unsetLocalID();
}
