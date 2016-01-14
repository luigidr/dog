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
* SnapshotCameraCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import java.awt.Image;
public interface SnapshotCamera extends SurveillanceCamera
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public void zoomOut();
	public void increaseContrast();
	public DeviceStatus getState();
	public void panRight();
	public void increaseLuminosity();
	public void on();
	public void panUp();
	public void decreaseLuminosity();
	public void off();
	public void panDown();
	public Image grabPicture();
	public void increaseColor();
	public void panLeft();
	public void decreaseQuality();
	public void increaseQuality();
	public void decreaseColor();
	public void decreaseContrast();
	public void zoomIn();


	/*Generated Notifications*/

	/*Notification: OnNotification*/
	public void notifyOn();
	/*Notification: OffNotification*/
	public void notifyOff();
	public void updateStatus();
}
