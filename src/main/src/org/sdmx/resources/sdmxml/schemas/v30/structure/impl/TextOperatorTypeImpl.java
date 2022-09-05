/*
 * XML Type:  TextOperatorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TextOperatorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TextOperatorType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleOperatorType
 *     org.sdmx.resources.sdmxml.schemas.v30.structure.TextSearchOperatorType
 */
public class TextOperatorTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TextOperatorType, org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleOperatorType, org.sdmx.resources.sdmxml.schemas.v30.structure.TextSearchOperatorType {
    private static final long serialVersionUID = 1L;

    public TextOperatorTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected TextOperatorTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
