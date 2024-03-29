//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.10 at 10:03:40 AM EDT 
//


package opin.dictionary.dictDef;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for semanticGroupingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="semanticGroupingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="composition" type="{http://www.cs.pitt.edu/mpqa/}compositionType" minOccurs="0"/>
 *         &lt;element name="sense" type="{http://www.cs.pitt.edu/mpqa/}senseBaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="elements" use="required" type="{http://www.cs.pitt.edu/mpqa/}elementListReferenceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semanticGroupingType", propOrder = {
    "composition",
    "sense"
})
public class SemanticGroupingType {

    protected CompositionType composition;
    protected SenseBaseType sense;
    @XmlAttribute(required = true)
    protected List<Integer> elements;

    /**
     * Gets the value of the composition property.
     * 
     * @return
     *     possible object is
     *     {@link CompositionType }
     *     
     */
    public CompositionType getComposition() {
        return composition;
    }

    /**
     * Sets the value of the composition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositionType }
     *     
     */
    public void setComposition(CompositionType value) {
        this.composition = value;
    }

    /**
     * Gets the value of the sense property.
     * 
     * @return
     *     possible object is
     *     {@link SenseBaseType }
     *     
     */
    public SenseBaseType getSense() {
        return sense;
    }

    /**
     * Sets the value of the sense property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenseBaseType }
     *     
     */
    public void setSense(SenseBaseType value) {
        this.sense = value;
    }

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getElements() {
        if (elements == null) {
            elements = new ArrayList<Integer>();
        }
        return this.elements;
    }

}
