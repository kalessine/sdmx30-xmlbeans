/*
 * XML Type:  GeographicCodelistsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeographicCodelistsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GeographicCodelistsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geographiccodeliststypecd47type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "GeographicCodelist" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType> getGeographicCodelistList();

    /**
     * Gets array of all "GeographicCodelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType[] getGeographicCodelistArray();

    /**
     * Gets ith "GeographicCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType getGeographicCodelistArray(int i);

    /**
     * Returns number of "GeographicCodelist" element
     */
    int sizeOfGeographicCodelistArray();

    /**
     * Sets ith "GeographicCodelist" element
     */
    void setGeographicCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType geographicCodelist);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeographicCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType insertNewGeographicCodelist(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "GeographicCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType addNewGeographicCodelist();

    /**
     * Removes the ith "GeographicCodelist" element
     */
    void removeGeographicCodelist(int i);
}
