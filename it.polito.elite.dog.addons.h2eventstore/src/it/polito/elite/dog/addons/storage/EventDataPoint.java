/*
 * Dog - Addons - H2 EventStore
 * 
 * Copyright (c) 2014 Dario Bonino
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
package it.polito.elite.dog.addons.storage;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.measure.DecimalMeasure;
import javax.measure.quantity.Quantity;

/**
 * @author bonino
 * 
 */
public class EventDataPoint
{
	// the time stamp of the event
	private Date at;

	// the event value as string
	private String value;

	// the event unit of measure if present
	private String unit;

	/**
	 * Creates an instance of {@link EventDataPoint} representing one event
	 * generated by one sensor in Dog.
	 * 
	 * @param at
	 *            The time stamp (as a {@link Date}) at which the event was
	 *            generated.
	 * @param value
	 *            The value of the event.
	 * @param unit
	 *            The unit of measure of the even, if present;
	 */
	public EventDataPoint(Date at, String value, String unit)
	{
		super();
		this.at = at;
		this.value = value;
		this.unit = unit != null ? unit : "";
	}

	/**
	 * Get the time at which the event was generated
	 * 
	 * @return
	 */
	public Date getAt()
	{
		return this.at;
	}

	/**
	 * Set the time at which the event was generated
	 * 
	 * @param at
	 */
	public void setAt(Date at)
	{
		this.at = at;
	}

	/**
	 * Get the value of the event as a {@link String}
	 * 
	 * @return
	 */
	public String getValue()
	{
		return this.value;
	}

	/**
	 * Set the value of the event as a {@link String}
	 * 
	 * @param value
	 */
	public void setValue(String value)
	{
		this.value = value;
	}

	/**
	 * Get the unit of measure of the event, if present.
	 * 
	 * @return
	 */
	public String getUnit()
	{
		return this.unit;
	}

	/**
	 * Set the unit of measure of the event.
	 * 
	 * @param unit
	 */
	public void setUnit(String unit)
	{
		this.unit = unit;
	}

	/**
	 * Get the event value as a measure
	 */
	/*public DecimalMeasure<Quantity> getValueAsMeasure()
	{
		return DecimalMeasure.valueOf(this.value + this.unit);
	}*/

	@Override
	public String toString()
	{
		// format the timestamp
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		StringBuffer asStringBuffer = new StringBuffer();
		asStringBuffer.append("{'at':'" + sdf.format(this.at)+"',");
		asStringBuffer.append(" 'value':" + this.value+"',");
		asStringBuffer.append(" 'unit':" + this.unit + "'}");
		return asStringBuffer.toString();
	}

}
