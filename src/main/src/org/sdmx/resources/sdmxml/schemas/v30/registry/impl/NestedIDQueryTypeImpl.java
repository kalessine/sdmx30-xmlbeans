/*
 * XML Type:  NestedIDQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML NestedIDQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.WildCardValueType
 */
public class NestedIDQueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType, org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType, org.sdmx.resources.sdmxml.schemas.v30.common.WildCardValueType {
    private static final long serialVersionUID = 1L;

    public NestedIDQueryTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected NestedIDQueryTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
