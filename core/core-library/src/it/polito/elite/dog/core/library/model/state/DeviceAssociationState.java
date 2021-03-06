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

package it.polito.elite.dog.core.library.model.state;


import it.polito.elite.dog.core.library.model.statevalue.DisassociatingStateValue;
import it.polito.elite.dog.core.library.model.statevalue.AssociatingStateValue;
import it.polito.elite.dog.core.library.model.statevalue.IdleStateValue;
import it.polito.elite.dog.core.library.model.statevalue.StateValue;





/**
* DeviceAssociationState - automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
* @author it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
*/
public class DeviceAssociationState extends TripleValuedState
{
	/**
	 * The unique class version for serialization
	 */

	private static final long serialVersionUID = 1L;

	public static final String DISASSOCIATING = "disassociating";
	public static final String ASSOCIATING = "associating";
	public static final String IDLE = "idle";


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public DeviceAssociationState(DisassociatingStateValue disassociatingstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{disassociatingstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public DeviceAssociationState(AssociatingStateValue associatingstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{associatingstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public DeviceAssociationState(IdleStateValue idlestatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{idlestatevalue});
	}

	@Deprecated
	private void initCommon()
	{
		this.old2NewMap.put(DeviceAssociationState.DISASSOCIATING, new DisassociatingStateValue());
		this.old2NewMap.put(DeviceAssociationState.ASSOCIATING, new AssociatingStateValue());
		this.old2NewMap.put(DeviceAssociationState.IDLE, new IdleStateValue());
	}
	/**
	 * Creates a state object in the Dog2.0 old way (before May 2012).
	 * 
	 * @param valueOfTheCurrentStateValue
	 */
	@Deprecated
	public DeviceAssociationState(Object valueOfTheCurrentStateValue)
	{
		this.initCommon();
		this.valueOfTheCurrentStateValue = valueOfTheCurrentStateValue;
		if(valueOfTheCurrentStateValue instanceof String)
		{
			this.currentStateValue[0]=this.old2NewMap.get((String)valueOfTheCurrentStateValue);
		}
	}
	/**
	 * Class constructor.
	 */
	public DeviceAssociationState(StateValue... currentStateValue)
	{
		super(currentStateValue);
	}

	/**
	 * Default constructor.
	 */
	public DeviceAssociationState()
	{
		super();
	}
}
