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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for buildingEnvironment complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="buildingEnvironment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="building" type="{http://elite.polito.it/dogHomeConfiguration}building" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buildingEnvironment", propOrder = { "building" })
public class BuildingEnvironment implements Cloneable
{
	
	protected List<Building> building;
	
	/**
	 * Creates a new {@code BuildingEnvironment} instance.
	 * 
	 */
	public BuildingEnvironment()
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		super();
	}
	
	/**
	 * Creates a new {@code BuildingEnvironment} instance by deeply copying a
	 * given {@code BuildingEnvironment} instance.
	 * 
	 * 
	 * @param o
	 *            The instance to copy.
	 * @throws NullPointerException
	 *             if {@code o} is {@code null}.
	 */
	public BuildingEnvironment(final BuildingEnvironment o)
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		super();
		if (o == null)
		{
			throw new NullPointerException("Cannot create a copy of 'BuildingEnvironment' from 'null'.");
		}
		// 'Building' collection.
		if (o.building != null)
		{
			copyBuilding(o.getBuilding(), this.getBuilding());
		}
	}
	
	/**
	 * Gets the value of the building property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the building property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBuilding().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Building }
	 * 
	 * 
	 */
	public List<Building> getBuilding()
	{
		if (building == null)
		{
			building = new ArrayList<Building>();
		}
		return this.building;
	}
	
	/**
	 * Copies all values of property {@code Building} deeply.
	 * 
	 * @param source
	 *            The source to copy from.
	 * @param target
	 *            The target to copy {@code source} to.
	 * @throws NullPointerException
	 *             if {@code target} is {@code null}.
	 */
	private static void copyBuilding(final List<Building> source, final List<Building> target)
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		if ((source != null) && (!source.isEmpty()))
		{
			for (final Iterator<?> it = source.iterator(); it.hasNext();)
			{
				final Object next = it.next();
				if (next instanceof Building)
				{
					// CClassInfo:
					// it.polito.elite.dog.core.library.jaxb.Building
					target.add(((Building) next).clone());
					continue;
				}
				// Please report this at
				// https://apps.sourceforge.net/mantisbt/ccxjc/
				throw new AssertionError(
						(("Unexpected instance '" + next) + "' for property 'Building' of class 'it.polito.elite.dog.core.library.jaxb.BuildingEnvironment'."));
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
	public BuildingEnvironment clone()
	{
		try
		{
			{
				// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
				final BuildingEnvironment clone = ((BuildingEnvironment) super.clone());
				// 'Building' collection.
				if (this.building != null)
				{
					clone.building = null;
					copyBuilding(this.getBuilding(), clone.getBuilding());
				}
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
