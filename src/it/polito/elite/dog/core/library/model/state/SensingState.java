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


import it.polito.elite.dog.core.library.model.statevalue.DetectedStateValue;
import it.polito.elite.dog.core.library.model.statevalue.NotDetectedStateValue;
import it.polito.elite.dog.core.library.model.statevalue.StateValue;





/**
* SensingState - automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
* @author it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
*/
public class SensingState extends DoubleValuedState
{
	/**
	 * The unique class version for serialization
	 */

	private static final long serialVersionUID = 1L;

	public static final String DETECTED = "detected";
	public static final String NOTDETECTED = "notDetected";


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public SensingState(DetectedStateValue detectedstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{detectedstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public SensingState(NotDetectedStateValue notdetectedstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{notdetectedstatevalue});
	}

	@Deprecated
	private void initCommon()
	{
		this.old2NewMap.put(SensingState.DETECTED, new DetectedStateValue());
		this.old2NewMap.put(SensingState.NOTDETECTED, new NotDetectedStateValue());
	}
	/**
	 * Creates a state object in the Dog2.0 old way (before May 2012).
	 * 
	 * @param valueOfTheCurrentStateValue
	 */
	@Deprecated
	public SensingState(Object valueOfTheCurrentStateValue)
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
	public SensingState(StateValue... currentStateValue)
	{
		super(currentStateValue);
	}

	/**
	 * Default constructor.
	 */
	public SensingState()
	{
		super();
	}
}
