//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.01 at 04:33:26 PM EET 
//


package com.demosoft.investiogation.neuronlan.xml.generated.network;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Link complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Link">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="neuronId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outputId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="weight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link")
public class Link {

    @XmlAttribute(name = "neuronId")
    protected String neuronId;
    @XmlAttribute(name = "inputId")
    protected String inputId;
    @XmlAttribute(name = "outputId")
    protected String outputId;
    @XmlAttribute(name = "weight")
    protected Integer weight;

    /**
     * Gets the value of the neuronId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeuronId() {
        return neuronId;
    }

    /**
     * Sets the value of the neuronId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeuronId(String value) {
        this.neuronId = value;
    }

    /**
     * Gets the value of the inputId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputId() {
        return inputId;
    }

    /**
     * Sets the value of the inputId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputId(String value) {
        this.inputId = value;
    }

    /**
     * Gets the value of the outputId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputId() {
        return outputId;
    }

    /**
     * Sets the value of the outputId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputId(String value) {
        this.outputId = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    @Override
    public String toString() {
        return "Link{" +
                "neuronId='" + neuronId + '\'' +
                ", inputId='" + inputId + '\'' +
                ", outputId='" + outputId + '\'' +
                ", weight=" + weight +
                '}';
    }
}
