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
* DogDvdModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.Dvd;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import it.polito.elite.dog.core.library.model.notification.*;
import javax.measure.Measure;

public class DogDvd extends AbstractDevice implements Dvd
{

	public DogDvd(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void setVolume(Integer volume)
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).setVolume(volume);
		}
	}

	public void next()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).next();
		}
	}

	public void prev()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).prev();
		}
	}

	public void rew()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).rew();
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((Dvd) this.driver).getState();
		}
		 return null;
	}

	public void decreaseVolume()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).decreaseVolume();
		}
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).on();
		}
	}

	public void goToTrack(Integer trackNumber)
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).goToTrack(trackNumber);
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).off();
		}
	}

	public void increaseVolume()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).increaseVolume();
		}
	}

	public void stop()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).stop();
		}
	}

	public void fwd()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).fwd();
		}
	}

	public void pause()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).pause();
		}
	}

	public void play()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).play();
		}
	}

	public void standBy()
	{
		if(this.driver!=null)
		{
			((Dvd) this.driver).standBy();
		}
	}



	/*Generated Notifications*/

	/*Notification: PlayNotification*/
	public void notifyPlay(){
		PlayNotification notificationEvent=new PlayNotification();
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
	/*Notification: PausePlaybackNotification*/
	public void notifyPause(){
		PausePlaybackNotification notificationEvent=new PausePlaybackNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: ForwardNotification*/
	public void notifyFwd(){
		ForwardNotification notificationEvent=new ForwardNotification();
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
	/*Notification: OffNotification*/
	public void notifyOff(){
		OffNotification notificationEvent=new OffNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: StandByNotification*/
	public void notifyStandby(){
		StandByNotification notificationEvent=new StandByNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: RewindNotification*/
	public void notifyRew(){
		RewindNotification notificationEvent=new RewindNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: StopPlaybackNotification*/
	public void notifyStop(){
		StopPlaybackNotification notificationEvent=new StopPlaybackNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: TrackControlNotification*/
	public void notifyChangedTrack(String trackId){
		TrackControlNotification notificationEvent=new TrackControlNotification(trackId );
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
