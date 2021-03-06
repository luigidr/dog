/*
 * Dog - Gateway Driver
 * 
 * Copyright (c) 2012-2014 Dario Bonino and Luigi De Russis
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
package it.polito.elite.dog.drivers.modbus.gateway;

import it.polito.elite.dog.core.library.model.ControllableDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.devicecategory.ModbusGateway;
import it.polito.elite.dog.core.library.util.LogHelper;
import it.polito.elite.dog.drivers.modbus.network.ModbusDriverInstance;
import it.polito.elite.dog.drivers.modbus.network.info.ModbusRegisterInfo;
import it.polito.elite.dog.drivers.modbus.network.interfaces.ModbusNetwork;

import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;

/**
 * @author <a href="mailto:dario.bonino@polito.it">Dario Bonino</a>
 * @see <a href="http://elite.polito.it">http://elite.polito.it</a>
 *
 */
public class ModbusGatewayDriverInstance extends ModbusDriverInstance implements ModbusGateway
{
	// the driver logger
	LogHelper logger;
	
	// the log identifier, unique for the class
	public static String logId = "[ModbusGatewayDriverInstance]: ";

	public ModbusGatewayDriverInstance(ModbusNetwork network, ControllableDevice controllableDevice, String gatewayAddress, String gatewayPort, String protocolVariant,
			BundleContext context)
	{
		super(network, controllableDevice, gatewayAddress, gatewayPort, protocolVariant);
		
		// create a logger
		this.logger = new LogHelper(context);
		
		// create a new device state (according to the current DogOnt model, no
		// state is actually associated to a Modbus gateway)
		this.currentState = new DeviceStatus(device.getDeviceId());
		
		// connect this driver instance with the device
		this.device.setDriver(this);
	}
	
	@Override
	public synchronized DeviceStatus getState()
	{
		return this.currentState;
	}
	
	//getGatewayAddress already implemented by the superclass...

	@Override
	public void newMessageFromHouse(ModbusRegisterInfo registerInfo, String string)
	{
		// currently no functionalities are associated to modbus gateways
		// therefore they do not use any datapoint and they do not listen to the
		// house messages...
		
		// just log
		this.logger.log(LogService.LOG_INFO, ModbusGatewayDriverInstance.logId
				+ "Received new message from house involving the register:\n " + registerInfo
				+ "\n No operation is currently supported");
		
	}
	
	@Override
	public void updateStatus()
	{
		// intentionally left empty
		
	}

	@Override
	protected void specificConfiguration()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void addToNetworkDriver(ModbusRegisterInfo register)
	{
		// TODO Auto-generated method stub
		
	}	
}
