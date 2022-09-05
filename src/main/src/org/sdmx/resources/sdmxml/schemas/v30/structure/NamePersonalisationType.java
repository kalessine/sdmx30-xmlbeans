/*
 * XML Type:  NamePersonalisationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML NamePersonalisationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface NamePersonalisationType extends org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "namepersonalisationtype13f6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VtlDefaultName" element
     */
    java.lang.String getVtlDefaultName();

    /**
     * Gets (as xml) the "VtlDefaultName" element
     */
    org.apache.xmlbeans.XmlString xgetVtlDefaultName();

    /**
     * Sets the "VtlDefaultName" element
     */
    void setVtlDefaultName(java.lang.String vtlDefaultName);

    /**
     * Sets (as xml) the "VtlDefaultName" element
     */
    void xsetVtlDefaultName(org.apache.xmlbeans.XmlString vtlDefaultName);

    /**
     * Gets the "PersonalisedName" element
     */
    java.lang.String getPersonalisedName();

    /**
     * Gets (as xml) the "PersonalisedName" element
     */
    org.apache.xmlbeans.XmlString xgetPersonalisedName();

    /**
     * Sets the "PersonalisedName" element
     */
    void setPersonalisedName(java.lang.String personalisedName);

    /**
     * Sets (as xml) the "PersonalisedName" element
     */
    void xsetPersonalisedName(org.apache.xmlbeans.XmlString personalisedName);

    /**
     * Gets the "vtlArtefact" attribute
     */
    java.lang.String getVtlArtefact();

    /**
     * Gets (as xml) the "vtlArtefact" attribute
     */
    org.apache.xmlbeans.XmlString xgetVtlArtefact();

    /**
     * Sets the "vtlArtefact" attribute
     */
    void setVtlArtefact(java.lang.String vtlArtefact);

    /**
     * Sets (as xml) the "vtlArtefact" attribute
     */
    void xsetVtlArtefact(org.apache.xmlbeans.XmlString vtlArtefact);
}
