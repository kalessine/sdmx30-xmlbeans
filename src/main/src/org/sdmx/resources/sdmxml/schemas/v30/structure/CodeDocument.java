/*
 * An XML document type.
 * Localname: Code
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Code(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface CodeDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CodeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "code5a0bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Code" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType getCode();

    /**
     * Sets the "Code" element
     */
    void setCode(org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType code);

    /**
     * Appends and returns a new empty "Code" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType addNewCode();
}
