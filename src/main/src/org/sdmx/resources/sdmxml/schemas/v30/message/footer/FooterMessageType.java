/*
 * XML Type:  FooterMessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.footer;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML FooterMessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer).
 *
 * This is a complex type.
 */
public interface FooterMessageType extends org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "footermessagetypeac14type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "severity" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType.Enum getSeverity();

    /**
     * Gets (as xml) the "severity" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType xgetSeverity();

    /**
     * True if has "severity" attribute
     */
    boolean isSetSeverity();

    /**
     * Sets the "severity" attribute
     */
    void setSeverity(org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType.Enum severity);

    /**
     * Sets (as xml) the "severity" attribute
     */
    void xsetSeverity(org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType severity);

    /**
     * Unsets the "severity" attribute
     */
    void unsetSeverity();
}
