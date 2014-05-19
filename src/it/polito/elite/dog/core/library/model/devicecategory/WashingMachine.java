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

package it.polito.elite.dog.core.library.model.devicecategory;


 
 /**
* WashingMachineCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import javax.measure.Measure;

public interface WashingMachine extends WhiteGoods
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public Measure<?,?>  getRemainingTime();
	public void stop();
	public DeviceStatus getState();
	public Measure<?,?>  getEndTime();
	public void on();
	public void start();
	public void pause();
	public Object[] getEventsAndAlerts();
	public void setStartTime(Measure<?,?>  remainingTime, Measure<?,?>  endTime, Measure<?,?>  startTime);
	public void off();
	public Measure<?,?>  getStartTime();


	/*Generated Notifications*/

	/*Notification: StartApplianceNotification*/
	public void notifyStart();
	/*Notification: MultipleEventNotification*/
	public void notifyNewEventSet(Object[] events);
	/*Notification: EventNotification*/
	public void notifyNewEvent(Object event);
	/*Notification: MultipleAlertNotification*/
	public void notifyNewAlertSet(Object[] alerts);
	/*Notification: AlertNotification*/
	public void notifyNewAlert(Object alert);
	/*Notification: StartTimeChangedNotification*/
	public void notifyChangedStartTime(Measure<?,?>  startTime);
	/*Notification: OnNotification*/
	public void notifyOn();
	/*Notification: EndTimeChangedNotification*/
	public void notifyChangedEndTime(Measure<?,?>  endTime);
	/*Notification: RemainingTimeChangedNotification*/
	public void notifyChangedRemainingTime(Measure<?,?>  remainingTime);
	/*Notification: OffNotification*/
	public void notifyOff();
	/*Notification: StopApplianceNotification*/
	public void notifyStop();
	/*Notification: PauseApplianceNotification*/
	public void notifyPause();
	public void updateStatus();
}
