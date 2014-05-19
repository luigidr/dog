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
* DogThreePhaseElectricityMeterModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.ThreePhaseElectricityMeter;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogThreePhaseElectricityMeter extends AbstractDevice implements ThreePhaseElectricityMeter
{

	public DogThreePhaseElectricityMeter(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public Measure<?,?>  getLLVoltageValue(String phaseID2, String phaseID1)
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getLLVoltageValue(phaseID2, phaseID1);
		}
		 return null;
	}

	public Measure<?,?>  getReactiveEnergyValue()
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getReactiveEnergyValue();
		}
		 return null;
	}

	public Measure<?,?>  getReactivePower(String phaseID)
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getReactivePower(phaseID);
		}
		 return null;
	}

	public Measure<?,?>  getFrequency()
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getFrequency();
		}
		 return null;
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getState();
		}
		 return null;
	}

	public Measure<?,?>  getPowerFactor()
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getPowerFactor();
		}
		 return null;
	}

	public Measure<?,?>  getActiveEnergyValue()
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getActiveEnergyValue();
		}
		 return null;
	}

	public Measure<?,?>  getLNVoltageValue(String phaseID)
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getLNVoltageValue(phaseID);
		}
		 return null;
	}

	public Measure<?,?>  getElectricCurrentValue(String phaseID)
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getElectricCurrentValue(phaseID);
		}
		 return null;
	}

	public Measure<?,?>  getApparentPower(String phaseID)
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getApparentPower(phaseID);
		}
		 return null;
	}

	public Measure<?,?>  getActivePower(String phaseID)
	{
		if(this.driver!=null)
		{
			return ((ThreePhaseElectricityMeter) this.driver).getActivePower(phaseID);
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: FrequencyMeasurementNotification*/
	public void notifyNewFrequencyValue(Measure<?,?>  frequency){
		FrequencyMeasurementNotification notificationEvent=new FrequencyMeasurementNotification(frequency );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: ThreePhaseReactivePowerMeasurementNotification*/
	public void notifyNewReactivePowerValue(String phaseID, Measure<?,?>  value){
		ThreePhaseReactivePowerMeasurementNotification notificationEvent=new ThreePhaseReactivePowerMeasurementNotification(phaseID , value );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SinglePhaseReactiveEnergyMeasurementNotification*/
	public void notifyNewReactiveEnergyValue(Measure<?,?>  value){
		SinglePhaseReactiveEnergyMeasurementNotification notificationEvent=new SinglePhaseReactiveEnergyMeasurementNotification(value );
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
	/*Notification: ThreePhaseLNVoltageMeasurementNotification*/
	public void notifyNewPhaseNeutralVoltageValue(String phaseID, Measure<?,?>  value){
		ThreePhaseLNVoltageMeasurementNotification notificationEvent=new ThreePhaseLNVoltageMeasurementNotification(phaseID , value );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: ThreePhaseLLVoltageMeasurementNotification*/
	public void notifyNewPhasePhaseVoltageValue(String phaseID, Measure<?,?>  value){
		ThreePhaseLLVoltageMeasurementNotification notificationEvent=new ThreePhaseLLVoltageMeasurementNotification(phaseID , value );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: ThreePhaseActivePowerMeasurementNotification*/
	public void notifyNewActivePowerValue(String phaseID, Measure<?,?>  value){
		ThreePhaseActivePowerMeasurementNotification notificationEvent=new ThreePhaseActivePowerMeasurementNotification(phaseID , value );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: ThreePhaseApparentPowerMeasurementNotification*/
	public void notifyNewApparentPowerValue(String phaseID, Measure<?,?>  value){
		ThreePhaseApparentPowerMeasurementNotification notificationEvent=new ThreePhaseApparentPowerMeasurementNotification(phaseID , value );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: PowerFactorMeasurementNotification*/
	public void notifyNewPowerFactorValue(Measure<?,?>  powerFactor){
		PowerFactorMeasurementNotification notificationEvent=new PowerFactorMeasurementNotification(powerFactor );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: ThreePhaseCurrentMeasurementNotification*/
	public void notifyNewCurrentValue(String phaseID, Measure<?,?>  value){
		ThreePhaseCurrentMeasurementNotification notificationEvent=new ThreePhaseCurrentMeasurementNotification(phaseID , value );
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
