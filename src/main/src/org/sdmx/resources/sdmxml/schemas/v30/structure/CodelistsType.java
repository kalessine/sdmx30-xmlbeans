/*
 * XML Type:  CodelistsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CodelistsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CodelistsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "codeliststypee6betype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Codelist" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType> getCodelistList();

    /**
     * Gets array of all "Codelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType[] getCodelistArray();

    /**
     * Gets ith "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType getCodelistArray(int i);

    /**
     * Returns number of "Codelist" element
     */
    int sizeOfCodelistArray();

    /**
     * Sets ith "Codelist" element
     */
    void setCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType codelist);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType insertNewCodelist(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType addNewCodelist();

    /**
     * Removes the ith "Codelist" element
     */
    void removeCodelist(int i);
}
