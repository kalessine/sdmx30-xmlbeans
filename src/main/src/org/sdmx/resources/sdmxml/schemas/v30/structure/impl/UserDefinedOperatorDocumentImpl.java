/*
 * An XML document type.
 * Localname: UserDefinedOperator
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one UserDefinedOperator(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class UserDefinedOperatorDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorDocument {
    private static final long serialVersionUID = 1L;

    public UserDefinedOperatorDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "UserDefinedOperator"),
    };


    /**
     * Gets the "UserDefinedOperator" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType getUserDefinedOperator() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "UserDefinedOperator" element
     */
    @Override
    public void setUserDefinedOperator(org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType userDefinedOperator) {
        generatedSetterHelperImpl(userDefinedOperator, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "UserDefinedOperator" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType addNewUserDefinedOperator() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
