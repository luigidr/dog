/*
 * Dog - Core
 *
 * Copyright (c) 2011-2016 Dario Bonino and Luigi De Russis
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
// Automatically generated by the DogOnt2Dog utility
//

package it.polito.elite.dog.core.library.model.notification;



/**
* HumidityMeasurementMNotification - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.notification.annotation.NotificationParam;
import javax.measure.Measure;

public class HumidityMeasurementMNotification implements ParametricNotification
{
	public static String notificationName = "changedRelativeHumidityAt";

	public static String notificationTopic="it/polito/elite/dog/core/library/model/notification/HumidityMeasurementMNotification";

	private String deviceUri;

	public String getDeviceUri()
	{
		return this.deviceUri;
	}
	public void setDeviceUri(String deviceUri)
	{
		 this.deviceUri=deviceUri;
	}
	public String getNotificationTopic()
	{
		 return HumidityMeasurementMNotification.notificationTopic; 
	}
	private String sensorID;
	private Measure<?,?>  relativeHumidity;

	public HumidityMeasurementMNotification(String sensorID, Measure<?,?>  relativeHumidity)
	{

		this.sensorID=sensorID;
		this.relativeHumidity=relativeHumidity;
	}
	@NotificationParam("sensorID")
	public String getSensorID(){
		return this.sensorID;
}
	public Measure<?,?>  getRelativeHumidity(){
		return this.relativeHumidity;
}

}
