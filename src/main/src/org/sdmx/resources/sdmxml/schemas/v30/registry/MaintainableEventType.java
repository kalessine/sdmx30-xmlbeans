/*
 * XML Type:  MaintainableEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MaintainableEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface MaintainableEventType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "maintainableeventtype4485type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "URN" element
     */
    java.lang.String getURN();

    /**
     * Gets (as xml) the "URN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetURN();

    /**
     * True if has "URN" element
     */
    boolean isSetURN();

    /**
     * Sets the "URN" element
     */
    void setURN(java.lang.String urn);

    /**
     * Sets (as xml) the "URN" element
     */
    void xsetURN(org.apache.xmlbeans.XmlAnyURI urn);

    /**
     * Unsets the "URN" element
     */
    void unsetURN();

    /**
     * Gets the "Ref" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType getRef();

    /**
     * True if has "Ref" element
     */
    boolean isSetRef();

    /**
     * Sets the "Ref" element
     */
    void setRef(org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType ref);

    /**
     * Appends and returns a new empty "Ref" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType addNewRef();

    /**
     * Unsets the "Ref" element
     */
    void unsetRef();
}
