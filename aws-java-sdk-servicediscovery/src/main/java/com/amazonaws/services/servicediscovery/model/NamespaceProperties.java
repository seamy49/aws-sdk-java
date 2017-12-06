/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains information that is specific to the namespace type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/NamespaceProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamespaceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A complex type that contains the ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * </p>
     */
    private DnsProperties dnsProperties;

    /**
     * <p>
     * A complex type that contains the ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * </p>
     * 
     * @param dnsProperties
     *        A complex type that contains the ID for the hosted zone that Amazon Route 53 creates when you create a
     *        namespace.
     */

    public void setDnsProperties(DnsProperties dnsProperties) {
        this.dnsProperties = dnsProperties;
    }

    /**
     * <p>
     * A complex type that contains the ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * </p>
     * 
     * @return A complex type that contains the ID for the hosted zone that Amazon Route 53 creates when you create a
     *         namespace.
     */

    public DnsProperties getDnsProperties() {
        return this.dnsProperties;
    }

    /**
     * <p>
     * A complex type that contains the ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * </p>
     * 
     * @param dnsProperties
     *        A complex type that contains the ID for the hosted zone that Amazon Route 53 creates when you create a
     *        namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceProperties withDnsProperties(DnsProperties dnsProperties) {
        setDnsProperties(dnsProperties);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDnsProperties() != null)
            sb.append("DnsProperties: ").append(getDnsProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NamespaceProperties == false)
            return false;
        NamespaceProperties other = (NamespaceProperties) obj;
        if (other.getDnsProperties() == null ^ this.getDnsProperties() == null)
            return false;
        if (other.getDnsProperties() != null && other.getDnsProperties().equals(this.getDnsProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDnsProperties() == null) ? 0 : getDnsProperties().hashCode());
        return hashCode;
    }

    @Override
    public NamespaceProperties clone() {
        try {
            return (NamespaceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.NamespacePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
