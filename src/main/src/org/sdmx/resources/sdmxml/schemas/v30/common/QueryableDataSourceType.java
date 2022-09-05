/*
 * XML Type:  QueryableDataSourceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML QueryableDataSourceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface QueryableDataSourceType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "queryabledatasourcetype9341type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataURL" element
     */
    java.lang.String getDataURL();

    /**
     * Gets (as xml) the "DataURL" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetDataURL();

    /**
     * Sets the "DataURL" element
     */
    void setDataURL(java.lang.String dataURL);

    /**
     * Sets (as xml) the "DataURL" element
     */
    void xsetDataURL(org.apache.xmlbeans.XmlAnyURI dataURL);

    /**
     * Gets the "WSDLURL" element
     */
    java.lang.String getWSDLURL();

    /**
     * Gets (as xml) the "WSDLURL" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetWSDLURL();

    /**
     * True if has "WSDLURL" element
     */
    boolean isSetWSDLURL();

    /**
     * Sets the "WSDLURL" element
     */
    void setWSDLURL(java.lang.String wsdlurl);

    /**
     * Sets (as xml) the "WSDLURL" element
     */
    void xsetWSDLURL(org.apache.xmlbeans.XmlAnyURI wsdlurl);

    /**
     * Unsets the "WSDLURL" element
     */
    void unsetWSDLURL();

    /**
     * Gets the "WADLURL" element
     */
    java.lang.String getWADLURL();

    /**
     * Gets (as xml) the "WADLURL" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetWADLURL();

    /**
     * True if has "WADLURL" element
     */
    boolean isSetWADLURL();

    /**
     * Sets the "WADLURL" element
     */
    void setWADLURL(java.lang.String wadlurl);

    /**
     * Sets (as xml) the "WADLURL" element
     */
    void xsetWADLURL(org.apache.xmlbeans.XmlAnyURI wadlurl);

    /**
     * Unsets the "WADLURL" element
     */
    void unsetWADLURL();

    /**
     * Gets the "isRESTDatasource" attribute
     */
    boolean getIsRESTDatasource();

    /**
     * Gets (as xml) the "isRESTDatasource" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsRESTDatasource();

    /**
     * Sets the "isRESTDatasource" attribute
     */
    void setIsRESTDatasource(boolean isRESTDatasource);

    /**
     * Sets (as xml) the "isRESTDatasource" attribute
     */
    void xsetIsRESTDatasource(org.apache.xmlbeans.XmlBoolean isRESTDatasource);

    /**
     * Gets the "isWebServiceDatasource" attribute
     */
    boolean getIsWebServiceDatasource();

    /**
     * Gets (as xml) the "isWebServiceDatasource" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsWebServiceDatasource();

    /**
     * Sets the "isWebServiceDatasource" attribute
     */
    void setIsWebServiceDatasource(boolean isWebServiceDatasource);

    /**
     * Sets (as xml) the "isWebServiceDatasource" attribute
     */
    void xsetIsWebServiceDatasource(org.apache.xmlbeans.XmlBoolean isWebServiceDatasource);
}
