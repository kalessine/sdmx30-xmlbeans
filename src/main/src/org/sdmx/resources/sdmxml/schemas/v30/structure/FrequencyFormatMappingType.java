/*
 * XML Type:  FrequencyFormatMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML FrequencyFormatMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface FrequencyFormatMappingType extends org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "frequencyformatmappingtype9803type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "FrequencyId" element
     */
    java.lang.String getFrequencyId();

    /**
     * Gets (as xml) the "FrequencyId" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetFrequencyId();

    /**
     * Sets the "FrequencyId" element
     */
    void setFrequencyId(java.lang.String frequencyId);

    /**
     * Sets (as xml) the "FrequencyId" element
     */
    void xsetFrequencyId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType frequencyId);

    /**
     * Gets the "DatePattern" element
     */
    java.lang.String getDatePattern();

    /**
     * Gets (as xml) the "DatePattern" element
     */
    org.apache.xmlbeans.XmlString xgetDatePattern();

    /**
     * Sets the "DatePattern" element
     */
    void setDatePattern(java.lang.String datePattern);

    /**
     * Sets (as xml) the "DatePattern" element
     */
    void xsetDatePattern(org.apache.xmlbeans.XmlString datePattern);
}
