/*
 * XML Type:  CodelistBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CodelistBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CodelistBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "codelistbasetypebfe4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Code" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType> getCodeList();

    /**
     * Gets array of all "Code" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType[] getCodeArray();

    /**
     * Gets ith "Code" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType getCodeArray(int i);

    /**
     * Returns number of "Code" element
     */
    int sizeOfCodeArray();

    /**
     * Sets ith "Code" element
     */
    void setCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType code);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Code" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType insertNewCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Code" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType addNewCode();

    /**
     * Removes the ith "Code" element
     */
    void removeCode(int i);
}
