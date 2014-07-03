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
* DogEnergyAndPowerMeteringLevelControllableOutputModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.EnergyAndPowerMeteringLevelControllableOutput;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogEnergyAndPowerMeteringLevelControllableOutput extends AbstractDevice implements EnergyAndPowerMeteringLevelControllableOutput
{

	public DogEnergyAndPowerMeteringLevelControllableOutput(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void stepDown()
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).stepDown();
		}
	}

	public void stepUp()
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).stepUp();
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((EnergyAndPowerMeteringLevelControllableOutput) this.driver).getState();
		}
		 return null;
	}

	public void storeScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).storeScene(sceneNumber);
		}
	}

	public void deleteScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).deleteScene(sceneNumber);
		}
	}

	public void set(Object value)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).set(value);
		}
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).on();
		}
	}

	public Measure<?,?>  getActiveEnergyValue()
	{
		if(this.driver!=null)
		{
			return ((EnergyAndPowerMeteringLevelControllableOutput) this.driver).getActiveEnergyValue();
		}
		 return null;
	}

	public void deleteGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).deleteGroup(groupID);
		}
	}

	public Measure<?,?>  getActivePower()
	{
		if(this.driver!=null)
		{
			return ((EnergyAndPowerMeteringLevelControllableOutput) this.driver).getActivePower();
		}
		 return null;
	}

	public void storeGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).storeGroup(groupID);
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).off();
		}
	}



	/*Generated Notifications*/

	/*Notification: SinglePhaseActivePowerMeasurementNotification*/
	public void notifyNewActivePowerValue(Measure<?,?>  powerValue){
		SinglePhaseActivePowerMeasurementNotification notificationEvent=new SinglePhaseActivePowerMeasurementNotification(powerValue );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: StoreSceneNotification*/
	public void notifyStoredScene(Integer sceneNumber){
		StoreSceneNotification notificationEvent=new StoreSceneNotification(sceneNumber );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: DeleteSceneNotification*/
	public void notifyDeletedScene(Integer sceneNumber){
		DeleteSceneNotification notificationEvent=new DeleteSceneNotification(sceneNumber );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: JoinGroupNotification*/
	public void notifyJoinedGroup(Integer groupNumber){
		JoinGroupNotification notificationEvent=new JoinGroupNotification(groupNumber );
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
	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel){
		LevelControlNotification notificationEvent=new LevelControlNotification(newLevel );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SinglePhaseActiveEnergyMeasurementNotification*/
	public void notifyNewActiveEnergyValue(Measure<?,?>  value){
		SinglePhaseActiveEnergyMeasurementNotification notificationEvent=new SinglePhaseActiveEnergyMeasurementNotification(value );
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
	/*Notification: LeaveGroupNotification*/
	public void notifyLeftGroup(Integer groupNumber){
		LeaveGroupNotification notificationEvent=new LeaveGroupNotification(groupNumber );
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
