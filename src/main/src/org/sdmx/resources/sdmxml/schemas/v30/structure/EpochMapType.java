/*
 * XML Type:  EpochMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML EpochMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface EpochMapType extends org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "epochmaptype6efbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "basePeriod" attribute
     */
    java.lang.String getBasePeriod();

    /**
     * Gets (as xml) the "basePeriod" attribute
     */
    org.apache.xmlbeans.XmlString xgetBasePeriod();

    /**
     * Sets the "basePeriod" attribute
     */
    void setBasePeriod(java.lang.String basePeriod);

    /**
     * Sets (as xml) the "basePeriod" attribute
     */
    void xsetBasePeriod(org.apache.xmlbeans.XmlString basePeriod);

    /**
     * Gets the "epochPeriod" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType.Enum getEpochPeriod();

    /**
     * Gets (as xml) the "epochPeriod" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType xgetEpochPeriod();

    /**
     * Sets the "epochPeriod" attribute
     */
    void setEpochPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType.Enum epochPeriod);

    /**
     * Sets (as xml) the "epochPeriod" attribute
     */
    void xsetEpochPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType epochPeriod);
}
