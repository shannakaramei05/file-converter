@jakarta.xml.bind.annotation.XmlSchema(
        namespace = "urn:oecd:ties:crs:v2",
        elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED,
        xmlns = {
                @jakarta.xml.bind.annotation.XmlNs(prefix = "xsi", namespaceURI = "http://www.w3.org/2001/XMLSchema-instance"),
                @jakarta.xml.bind.annotation.XmlNs(prefix = "stf", namespaceURI = "urn:oecd:ties:crsstf:v5"),
                @jakarta.xml.bind.annotation.XmlNs(prefix = "", namespaceURI = "urn:oecd:ties:crsstf:v5"),
                @jakarta.xml.bind.annotation.XmlNs(prefix = "sfa", namespaceURI = "urn:oecd:ties:stffatcatypes:v1"),
                @jakarta.xml.bind.annotation.XmlNs(prefix = "ftc", namespaceURI = "urn:oecd:ties:fatca:v1"),
                @jakarta.xml.bind.annotation.XmlNs(prefix = "iso", namespaceURI = "urn:oecd:ties:isocrstypes:v1"),
                @jakarta.xml.bind.annotation.XmlNs(prefix = "cfc", namespaceURI = "urn:oecd:ties:commontypesfatcacrs:v2"),
                @jakarta.xml.bind.annotation.XmlNs(prefix = "crs", namespaceURI = "urn:oecd:ties:crs:v2"),
                @jakarta.xml.bind.annotation.XmlNs(prefix = "ns9", namespaceURI = "urn:oecd:ties:isofatcatypes:v1"),
        }

)
package com.basic.fileconverter.model.reportingFI;