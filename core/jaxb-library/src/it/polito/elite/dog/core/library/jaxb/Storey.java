/*
 * Dog - Core
 * 
 * Copyright (c) 2009-2014 Dario Bonino and Luigi De Russis
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.15 at 03:00:00 PM CEST 
//

package it.polito.elite.dog.core.library.jaxb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * <p>
 * Java class for storey complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="storey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flat" type="{http://elite.polito.it/dogHomeConfiguration}flat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="room" type="{http://elite.polito.it/dogHomeConfiguration}room" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="levelFromGround" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storey", propOrder = { "description", "flat", "room" })
public class Storey implements Cloneable
{
	
	protected String description;
	@JsonProperty("flats")
	protected List<Flat> flat;
	@JsonProperty("rooms")
	protected List<Room> room;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAttribute(name = "levelFromGround")
	protected Integer levelFromGround;
	@XmlAttribute(name = "class")
	@JsonProperty("class")
	protected String clazz;
	
	/**
	 * Creates a new {@code Storey} instance.
	 * 
	 */
	public Storey()
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		super();
	}
	
	/**
	 * Creates a new {@code Storey} instance by deeply copying a given
	 * {@code Storey} instance.
	 * 
	 * 
	 * @param o
	 *            The instance to copy.
	 * @throws NullPointerException
	 *             if {@code o} is {@code null}.
	 */
	public Storey(final Storey o)
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		super();
		if (o == null)
		{
			throw new NullPointerException("Cannot create a copy of 'Storey' from 'null'.");
		}
		// CBuiltinLeafInfo: java.lang.String
		this.description = ((o.description == null) ? null : o.getDescription());
		// 'Flat' collection.
		if (o.flat != null)
		{
			copyFlat(o.getFlat(), this.getFlat());
		}
		// 'Room' collection.
		if (o.room != null)
		{
			copyRoom(o.getRoom(), this.getRoom());
		}
		// CBuiltinLeafInfo: java.lang.String
		this.id = ((o.id == null) ? null : o.getId());
		// CBuiltinLeafInfo: java.lang.Integer
		this.levelFromGround = ((o.levelFromGround == null) ? null : o.getLevelFromGround());
		// CBuiltinLeafInfo: java.lang.String
		this.clazz = ((o.clazz == null) ? null : o.getClazz());
	}
	
	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value)
	{
		this.description = value;
	}
	
	/**
	 * Gets the value of the flat property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the flat property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFlat().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Flat }
	 * 
	 * 
	 */
	public List<Flat> getFlat()
	{
		if (flat == null)
		{
			flat = new ArrayList<Flat>();
		}
		return this.flat;
	}
	
	/**
	 * Gets the value of the room property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the room property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRoom().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Room }
	 * 
	 * 
	 */
	public List<Room> getRoom()
	{
		if (room == null)
		{
			room = new ArrayList<Room>();
		}
		return this.room;
	}
	
	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId()
	{
		return id;
	}
	
	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value)
	{
		this.id = value;
	}
	
	/**
	 * Gets the value of the levelFromGround property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLevelFromGround()
	{
		return levelFromGround;
	}
	
	/**
	 * Sets the value of the levelFromGround property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLevelFromGround(Integer value)
	{
		this.levelFromGround = value;
	}
	
	/**
	 * Gets the value of the clazz property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClazz()
	{
		return clazz;
	}
	
	/**
	 * Sets the value of the clazz property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClazz(String value)
	{
		this.clazz = value;
	}
	
	/**
	 * Copies all values of property {@code Flat} deeply.
	 * 
	 * @param source
	 *            The source to copy from.
	 * @param target
	 *            The target to copy {@code source} to.
	 * @throws NullPointerException
	 *             if {@code target} is {@code null}.
	 */
	private static void copyFlat(final List<Flat> source, final List<Flat> target)
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		if ((source != null) && (!source.isEmpty()))
		{
			for (final Iterator<?> it = source.iterator(); it.hasNext();)
			{
				final Object next = it.next();
				if (next instanceof Flat)
				{
					// CClassInfo: it.polito.elite.dog.core.library.jaxb.Flat
					target.add(((Flat) next).clone());
					continue;
				}
				// Please report this at
				// https://apps.sourceforge.net/mantisbt/ccxjc/
				throw new AssertionError(
						(("Unexpected instance '" + next) + "' for property 'Flat' of class 'it.polito.elite.dog.core.library.jaxb.Storey'."));
			}
		}
	}
	
	/**
	 * Copies all values of property {@code Room} deeply.
	 * 
	 * @param source
	 *            The source to copy from.
	 * @param target
	 *            The target to copy {@code source} to.
	 * @throws NullPointerException
	 *             if {@code target} is {@code null}.
	 */
	private static void copyRoom(final List<Room> source, final List<Room> target)
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		if ((source != null) && (!source.isEmpty()))
		{
			for (final Iterator<?> it = source.iterator(); it.hasNext();)
			{
				final Object next = it.next();
				if (next instanceof Room)
				{
					// CClassInfo: it.polito.elite.dog.core.library.jaxb.Room
					target.add(((Room) next).clone());
					continue;
				}
				// Please report this at
				// https://apps.sourceforge.net/mantisbt/ccxjc/
				throw new AssertionError(
						(("Unexpected instance '" + next) + "' for property 'Room' of class 'it.polito.elite.dog.core.library.jaxb.Storey'."));
			}
		}
	}
	
	/**
	 * Creates and returns a deep copy of this object.
	 * 
	 * 
	 * @return A deep copy of this object.
	 */
	@Override
	public Storey clone()
	{
		try
		{
			{
				// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
				final Storey clone = ((Storey) super.clone());
				// CBuiltinLeafInfo: java.lang.String
				clone.description = ((this.description == null) ? null : this.getDescription());
				// 'Flat' collection.
				if (this.flat != null)
				{
					clone.flat = null;
					copyFlat(this.getFlat(), clone.getFlat());
				}
				// 'Room' collection.
				if (this.room != null)
				{
					clone.room = null;
					copyRoom(this.getRoom(), clone.getRoom());
				}
				// CBuiltinLeafInfo: java.lang.String
				clone.id = ((this.id == null) ? null : this.getId());
				// CBuiltinLeafInfo: java.lang.Integer
				clone.levelFromGround = ((this.levelFromGround == null) ? null : this.getLevelFromGround());
				// CBuiltinLeafInfo: java.lang.String
				clone.clazz = ((this.clazz == null) ? null : this.getClazz());
				return clone;
			}
		}
		catch (CloneNotSupportedException e)
		{
			// Please report this at
			// https://apps.sourceforge.net/mantisbt/ccxjc/
			throw new AssertionError(e);
		}
	}
	
}