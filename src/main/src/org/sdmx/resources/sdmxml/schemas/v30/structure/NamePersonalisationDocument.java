/*
 * An XML document type.
 * Localname: NamePersonalisation
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one NamePersonalisation(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface NamePersonalisationDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "namepersonalisationa70cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "NamePersonalisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType getNamePersonalisation();

    /**
     * Sets the "NamePersonalisation" element
     */
    void setNamePersonalisation(org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType namePersonalisation);

    /**
     * Appends and returns a new empty "NamePersonalisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType addNewNamePersonalisation();
}
