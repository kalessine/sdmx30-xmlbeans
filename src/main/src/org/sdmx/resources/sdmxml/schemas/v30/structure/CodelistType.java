/*
 * XML Type:  CodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CodelistType extends org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "codelisttype36f3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "CodelistExtension" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType> getCodelistExtensionList();

    /**
     * Gets array of all "CodelistExtension" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType[] getCodelistExtensionArray();

    /**
     * Gets ith "CodelistExtension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType getCodelistExtensionArray(int i);

    /**
     * Returns number of "CodelistExtension" element
     */
    int sizeOfCodelistExtensionArray();

    /**
     * Sets ith "CodelistExtension" element
     */
    void setCodelistExtensionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType codelistExtension);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodelistExtension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType insertNewCodelistExtension(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CodelistExtension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType addNewCodelistExtension();

    /**
     * Removes the ith "CodelistExtension" element
     */
    void removeCodelistExtension(int i);
}
