/*
 * XML Type:  CategorisationsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CategorisationsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CategorisationsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "categorisationstype1d59type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Categorisation" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType> getCategorisationList();

    /**
     * Gets array of all "Categorisation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType[] getCategorisationArray();

    /**
     * Gets ith "Categorisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType getCategorisationArray(int i);

    /**
     * Returns number of "Categorisation" element
     */
    int sizeOfCategorisationArray();

    /**
     * Sets ith "Categorisation" element
     */
    void setCategorisationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType categorisation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Categorisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType insertNewCategorisation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Categorisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType addNewCategorisation();

    /**
     * Removes the ith "Categorisation" element
     */
    void removeCategorisation(int i);
}
