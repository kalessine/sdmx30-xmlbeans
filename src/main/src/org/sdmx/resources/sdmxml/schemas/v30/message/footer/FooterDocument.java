/*
 * An XML document type.
 * Localname: Footer
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.footer;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Footer(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer) element.
 *
 * This is a complex type.
 */
public interface FooterDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "footer7b5ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Footer" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType getFooter();

    /**
     * Sets the "Footer" element
     */
    void setFooter(org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType footer);

    /**
     * Appends and returns a new empty "Footer" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType addNewFooter();
}
