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

package it.polito.elite.dog.core.library.model.devicemodel;


 
/**
* DogEnOceanGatewayModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.EnOceanGateway;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import it.polito.elite.dog.core.library.model.technology.ExplicitTeachInData;
import it.polito.elite.dog.core.library.model.notification.*;
public class DogEnOceanGateway extends AbstractDevice implements EnOceanGateway
{

	public DogEnOceanGateway(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void teachIn()
	{
		if(this.driver!=null)
		{
			((EnOceanGateway) this.driver).teachIn();
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((EnOceanGateway) this.driver).getState();
		}
		 return null;
	}

	public void explicitTeachIn(ExplicitTeachInData teachInData)
	{
		if(this.driver!=null)
		{
			((EnOceanGateway) this.driver).explicitTeachIn(teachInData);
		}
	}

	public void smartTeachIn()
	{
		if(this.driver!=null)
		{
			((EnOceanGateway) this.driver).smartTeachIn();
		}
	}



	/*Generated Notifications*/

	/*Notification: TeachInEndedNotification*/
	public void notifyDeactivatedTeachIn(){
		TeachInEndedNotification notificationEvent=new TeachInEndedNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: TeachInActiveNotification*/
	public void notifyActivatedTeachIn(){
		TeachInActiveNotification notificationEvent=new TeachInActiveNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
