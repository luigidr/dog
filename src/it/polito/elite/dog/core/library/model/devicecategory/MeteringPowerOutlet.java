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

package it.polito.elite.dog.core.library.model.devicecategory;


 
 /**
* MeteringPowerOutletCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import javax.measure.Measure;

public interface MeteringPowerOutlet extends EnergyMeteringPowerOutlet, PowerMeteringPowerOutlet, PowerFactorMeter
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public Measure<?,?>  getReactiveEnergyValue();
	public DeviceStatus getState();
	public Measure<?,?>  getPowerFactor();
	public void storeScene(Integer sceneNumber);
	public void deleteScene(Integer sceneNumber);
	public void on();
	public Measure<?,?>  getActiveEnergyValue();
	public void deleteGroup(Integer groupID);
	public Measure<?,?>  getActivePower();
	public void storeGroup(Integer groupID);
	public void off();


	/*Generated Notifications*/

	/*Notification: SinglePhaseActivePowerMeasurementNotification*/
	public void notifyNewActivePowerValue(Measure<?,?>  powerValue);
	/*Notification: StoreSceneNotification*/
	public void notifyStoredScene(Integer sceneNumber);
	/*Notification: DeleteSceneNotification*/
	public void notifyDeletedScene(Integer sceneNumber);
	/*Notification: JoinGroupNotification*/
	public void notifyJoinedGroup(Integer groupNumber);
	/*Notification: OnNotification*/
	public void notifyOn();
	/*Notification: SinglePhaseReactiveEnergyMeasurementNotification*/
	public void notifyNewReactiveEnergyValue(Measure<?,?>  value);
	/*Notification: SinglePhaseActiveEnergyMeasurementNotification*/
	public void notifyNewActiveEnergyValue(Measure<?,?>  value);
	/*Notification: PowerFactorMeasurementNotification*/
	public void notifyNewPowerFactorValue(Measure<?,?>  powerFactor);
	/*Notification: OffNotification*/
	public void notifyOff();
	/*Notification: LeaveGroupNotification*/
	public void notifyLeftGroup(Integer groupNumber);
	public void updateStatus();
}
