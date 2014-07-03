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


import it.polito.elite.dog.core.library.model.statevalue.PauseStateValue;
import it.polito.elite.dog.core.library.model.statevalue.ProgramInterruptedStateValue;
import it.polito.elite.dog.core.library.model.statevalue.StandByStateValue;
import it.polito.elite.dog.core.library.model.statevalue.IdleStateValue;
import it.polito.elite.dog.core.library.model.statevalue.OnStateValue;
import it.polito.elite.dog.core.library.model.statevalue.OffStateValue;
import it.polito.elite.dog.core.library.model.statevalue.FailureStateValue;
import it.polito.elite.dog.core.library.model.statevalue.ConnectedStateValue;
import it.polito.elite.dog.core.library.model.statevalue.RunningStateValue;
import it.polito.elite.dog.core.library.model.statevalue.ProgrammedAndWaitingToStartStateValue;
import it.polito.elite.dog.core.library.model.statevalue.ProgrammedStateValue;
import it.polito.elite.dog.core.library.model.statevalue.StateValue;


import it.polito.elite.dog.core.library.model.statevalue.SuperHeatingStateValue;
import it.polito.elite.dog.core.library.model.statevalue.EndProgrammedStateValue;



/**
* HeatingApplianceState - automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
* @author it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
*/
public class HeatingApplianceState extends GenericApplianceState
{
	/**
	 * The unique class version for serialization
	 */

	private static final long serialVersionUID = 1L;

	public static final String PAUSE = "pause";
	public static final String FAILURE = "failure";
	public static final String STANDBY = "standBy";
	public static final String IDLE = "idle";
	public static final String SUPERHEATING = "superHeating";
	public static final String ON = "on";
	public static final String PROGRAMMEDANDWAITINGTOSTART = "programmedAndWaitingToStart";
	public static final String ENDPROGRAMMED = "endProgrammed";
	public static final String PROGRAMINTERRUPTED = "programInterrupted";
	public static final String PROGRAMMED = "programmed";
	public static final String OFF = "off";
	public static final String RUNNING = "running";
	public static final String CONNECTED = "connected";


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(PauseStateValue pausestatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{pausestatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(FailureStateValue failurestatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{failurestatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(StandByStateValue standbystatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{standbystatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(IdleStateValue idlestatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{idlestatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(SuperHeatingStateValue superheatingstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{superheatingstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(OnStateValue onstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{onstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(ProgrammedAndWaitingToStartStateValue programmedandwaitingtostartstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{programmedandwaitingtostartstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(EndProgrammedStateValue endprogrammedstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{endprogrammedstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(ProgramInterruptedStateValue programinterruptedstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{programinterruptedstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(ProgrammedStateValue programmedstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{programmedstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(OffStateValue offstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{offstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(RunningStateValue runningstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{runningstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public HeatingApplianceState(ConnectedStateValue connectedstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{connectedstatevalue});
	}

	@Deprecated
	private void initCommon()
	{
		this.old2NewMap.put(HeatingApplianceState.PAUSE, new PauseStateValue());
		this.old2NewMap.put(HeatingApplianceState.FAILURE, new FailureStateValue());
		this.old2NewMap.put(HeatingApplianceState.STANDBY, new StandByStateValue());
		this.old2NewMap.put(HeatingApplianceState.IDLE, new IdleStateValue());
		this.old2NewMap.put(HeatingApplianceState.SUPERHEATING, new SuperHeatingStateValue());
		this.old2NewMap.put(HeatingApplianceState.ON, new OnStateValue());
		this.old2NewMap.put(HeatingApplianceState.PROGRAMMEDANDWAITINGTOSTART, new ProgrammedAndWaitingToStartStateValue());
		this.old2NewMap.put(HeatingApplianceState.ENDPROGRAMMED, new EndProgrammedStateValue());
		this.old2NewMap.put(HeatingApplianceState.PROGRAMINTERRUPTED, new ProgramInterruptedStateValue());
		this.old2NewMap.put(HeatingApplianceState.PROGRAMMED, new ProgrammedStateValue());
		this.old2NewMap.put(HeatingApplianceState.OFF, new OffStateValue());
		this.old2NewMap.put(HeatingApplianceState.RUNNING, new RunningStateValue());
		this.old2NewMap.put(HeatingApplianceState.CONNECTED, new ConnectedStateValue());
	}
	/**
	 * Creates a state object in the Dog2.0 old way (before May 2012).
	 * 
	 * @param valueOfTheCurrentStateValue
	 */
	@Deprecated
	public HeatingApplianceState(Object valueOfTheCurrentStateValue)
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
	public HeatingApplianceState(StateValue... currentStateValue)
	{
		super(currentStateValue);
	}

	/**
	 * Default constructor.
	 */
	public HeatingApplianceState()
	{
		super();
	}
}
