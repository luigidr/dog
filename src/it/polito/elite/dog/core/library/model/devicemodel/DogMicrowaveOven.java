/*
 * Dog - Core
 *
 * Copyright (c) 2011-2014 Dario Bonino and Luigi De Russis
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
* DogMicrowaveOvenModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.MicrowaveOven;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogMicrowaveOven extends AbstractDevice implements MicrowaveOven
{

	public DogMicrowaveOven(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void startSuperHeating()
	{
		if(this.driver!=null)
		{
			((MicrowaveOven) this.driver).startSuperHeating();
		}
	}

	public Measure<?,?>  getRemainingTime()
	{
		if(this.driver!=null)
		{
			return ((MicrowaveOven) this.driver).getRemainingTime();
		}
		 return null;
	}

	public void stop()
	{
		if(this.driver!=null)
		{
			((MicrowaveOven) this.driver).stop();
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((MicrowaveOven) this.driver).getState();
		}
		 return null;
	}

	public Measure<?,?>  getEndTime()
	{
		if(this.driver!=null)
		{
			return ((MicrowaveOven) this.driver).getEndTime();
		}
		 return null;
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((MicrowaveOven) this.driver).on();
		}
	}

	public void stopSuperHeating()
	{
		if(this.driver!=null)
		{
			((MicrowaveOven) this.driver).stopSuperHeating();
		}
	}

	public void start()
	{
		if(this.driver!=null)
		{
			((MicrowaveOven) this.driver).start();
		}
	}

	public void pause()
	{
		if(this.driver!=null)
		{
			((MicrowaveOven) this.driver).pause();
		}
	}

	public Object[] getEventsAndAlerts()
	{
		if(this.driver!=null)
		{
			return ((MicrowaveOven) this.driver).getEventsAndAlerts();
		}
		 return null;
	}

	public void setStartTime(Measure<?,?>  remainingTime, Measure<?,?>  endTime, Measure<?,?>  startTime)
	{
		if(this.driver!=null)
		{
			((MicrowaveOven) this.driver).setStartTime(remainingTime, endTime, startTime);
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((MicrowaveOven) this.driver).off();
		}
	}

	public Measure<?,?>  getStartTime()
	{
		if(this.driver!=null)
		{
			return ((MicrowaveOven) this.driver).getStartTime();
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: StartApplianceNotification*/
	public void notifyStart(){
		StartApplianceNotification notificationEvent=new StartApplianceNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: MultipleEventNotification*/
	public void notifyNewEventSet(Object[] events){
		MultipleEventNotification notificationEvent=new MultipleEventNotification(events );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: MultipleAlertNotification*/
	public void notifyNewAlertSet(Object[] alerts){
		MultipleAlertNotification notificationEvent=new MultipleAlertNotification(alerts );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: EventNotification*/
	public void notifyNewEvent(Object event){
		EventNotification notificationEvent=new EventNotification(event );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: AlertNotification*/
	public void notifyNewAlert(Object alert){
		AlertNotification notificationEvent=new AlertNotification(alert );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: EndTimeChangedNotification*/
	public void notifyChangedEndTime(Measure<?,?>  endTime){
		EndTimeChangedNotification notificationEvent=new EndTimeChangedNotification(endTime );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: RemainingTimeChangedNotification*/
	public void notifyChangedRemainingTime(Measure<?,?>  remainingTime){
		RemainingTimeChangedNotification notificationEvent=new RemainingTimeChangedNotification(remainingTime );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: StopApplianceNotification*/
	public void notifyStop(){
		StopApplianceNotification notificationEvent=new StopApplianceNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: OffNotification*/
	public void notifyOff(){
		OffNotification notificationEvent=new OffNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: StoppedSuperHeatingNotification*/
	public void notifyStoppedSuperHeating(){
		StoppedSuperHeatingNotification notificationEvent=new StoppedSuperHeatingNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: NotEmittingMicrowavesNotification*/
	public void notifyNotEmittingMicrowaves(){
		NotEmittingMicrowavesNotification notificationEvent=new NotEmittingMicrowavesNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: EmittingMicrowavesNotification*/
	public void notifyEmittingMicrowaves(){
		EmittingMicrowavesNotification notificationEvent=new EmittingMicrowavesNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: StartTimeChangedNotification*/
	public void notifyChangedStartTime(Measure<?,?>  startTime){
		StartTimeChangedNotification notificationEvent=new StartTimeChangedNotification(startTime );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: OnNotification*/
	public void notifyOn(){
		OnNotification notificationEvent=new OnNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: PauseApplianceNotification*/
	public void notifyPause(){
		PauseApplianceNotification notificationEvent=new PauseApplianceNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: StartedSuperHeatingNotification*/
	public void notifyStartedSuperHeating(){
		StartedSuperHeatingNotification notificationEvent=new StartedSuperHeatingNotification();
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
