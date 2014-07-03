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

package it.polito.elite.dog.core.library.model.state;


import it.polito.elite.dog.core.library.model.statevalue.NotEmittingMicrowavesStateValue;
import it.polito.elite.dog.core.library.model.statevalue.EmittingMicrowavesStateValue;
import it.polito.elite.dog.core.library.model.statevalue.StateValue;





/**
* MicrowaveEmissionState - automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
* @author it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
*/
public class MicrowaveEmissionState extends DoubleValuedState
{
	/**
	 * The unique class version for serialization
	 */

	private static final long serialVersionUID = 1L;

	public static final String EMITTINGMICROWAVES = "emittingMicrowaves";
	public static final String NOTEMITTINGMICROWAVES = "notEmittingMicrowaves";


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public MicrowaveEmissionState(EmittingMicrowavesStateValue emittingmicrowavesstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{emittingmicrowavesstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public MicrowaveEmissionState(NotEmittingMicrowavesStateValue notemittingmicrowavesstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{notemittingmicrowavesstatevalue});
	}

	@Deprecated
	private void initCommon()
	{
		this.old2NewMap.put(MicrowaveEmissionState.EMITTINGMICROWAVES, new EmittingMicrowavesStateValue());
		this.old2NewMap.put(MicrowaveEmissionState.NOTEMITTINGMICROWAVES, new NotEmittingMicrowavesStateValue());
	}
	/**
	 * Creates a state object in the Dog2.0 old way (before May 2012).
	 * 
	 * @param valueOfTheCurrentStateValue
	 */
	@Deprecated
	public MicrowaveEmissionState(Object valueOfTheCurrentStateValue)
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
	public MicrowaveEmissionState(StateValue... currentStateValue)
	{
		super(currentStateValue);
	}

	/**
	 * Default constructor.
	 */
	public MicrowaveEmissionState()
	{
		super();
	}
}
