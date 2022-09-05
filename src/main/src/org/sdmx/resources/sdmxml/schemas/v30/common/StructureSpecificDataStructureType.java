/*
 * XML Type:  StructureSpecificDataStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.StructureSpecificDataStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructureSpecificDataStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface StructureSpecificDataStructureType extends org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.StructureSpecificDataStructureType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structurespecificdatastructuretypefeb2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "namespace" attribute
     */
    java.lang.String getNamespace();

    /**
     * Gets (as xml) the "namespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetNamespace();

    /**
     * True if has "namespace" attribute
     */
    boolean isSetNamespace();

    /**
     * Sets the "namespace" attribute
     */
    void setNamespace(java.lang.String namespace);

    /**
     * Sets (as xml) the "namespace" attribute
     */
    void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);

    /**
     * Unsets the "namespace" attribute
     */
    void unsetNamespace();

    /**
     * Gets the "dimensionAtObservation" attribute
     */
    java.lang.String getDimensionAtObservation();

    /**
     * Gets (as xml) the "dimensionAtObservation" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType xgetDimensionAtObservation();

    /**
     * True if has "dimensionAtObservation" attribute
     */
    boolean isSetDimensionAtObservation();

    /**
     * Sets the "dimensionAtObservation" attribute
     */
    void setDimensionAtObservation(java.lang.String dimensionAtObservation);

    /**
     * Sets (as xml) the "dimensionAtObservation" attribute
     */
    void xsetDimensionAtObservation(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType dimensionAtObservation);

    /**
     * Unsets the "dimensionAtObservation" attribute
     */
    void unsetDimensionAtObservation();

    /**
     * Gets the "explicitMeasures" attribute
     */
    boolean getExplicitMeasures();

    /**
     * Gets (as xml) the "explicitMeasures" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetExplicitMeasures();

    /**
     * True if has "explicitMeasures" attribute
     */
    boolean isSetExplicitMeasures();

    /**
     * Sets the "explicitMeasures" attribute
     */
    void setExplicitMeasures(boolean explicitMeasures);

    /**
     * Sets (as xml) the "explicitMeasures" attribute
     */
    void xsetExplicitMeasures(org.apache.xmlbeans.XmlBoolean explicitMeasures);

    /**
     * Unsets the "explicitMeasures" attribute
     */
    void unsetExplicitMeasures();
}
