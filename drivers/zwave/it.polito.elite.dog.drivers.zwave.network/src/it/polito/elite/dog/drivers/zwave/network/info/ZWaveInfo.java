/*
 * Dog  - Z-Wave
 * 
 * Copyright 2013 Davide Aimone  and Dario Bonino 
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
package it.polito.elite.dog.drivers.zwave.network.info;

public class ZWaveInfo
{
	// the manufacturer identifier (ZWave)
	public static String MANUFACTURER = "ZWave";	
	
	// the node ID
	public static String NODE_ID = "NodeID";
	
	// the instance ID
	public static String INSTANCE_ID = "InstanceID";
	
	// the command name to which a specific configuration refers
	public static String COMMAND_NAME = "realCommandName";
	
	// the notification name to which a specific configuration refers
	public static String NOTIFICATION_NAME = "notificationName";
	
	// constant for configuration
	public static final String PROPERTY_UPDATETIME = "updateTimeMillis";
	
	// the persistent store configuration property
	public static final String PROPERTY_PERSISTENT_STORE = "persistentStore";
	
	// the persistent store configuration property
	public static final String PROPERTY_STEP_PERCENT = "stepAsPercentage";

	
}