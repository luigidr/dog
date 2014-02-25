/*
 * Dog - Core
 * 
 * Copyright (c) 2011-2013 Dario Bonino and Luigi De Russis
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
//Automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
//

package it.polito.elite.dog.core.library.model.state;


import it.polito.elite.dog.core.library.model.statevalue.AuxStateValue;
import it.polito.elite.dog.core.library.model.statevalue.CDStateValue;
import it.polito.elite.dog.core.library.model.statevalue.PhonoStateValue;
import it.polito.elite.dog.core.library.model.statevalue.StateValue;
import it.polito.elite.dog.core.library.model.statevalue.Tape1StateValue;
import it.polito.elite.dog.core.library.model.statevalue.Tape2StateValue;
import it.polito.elite.dog.core.library.model.statevalue.TunerStateValue;



/**
* SourceSelectionState - automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
* @author it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
*/
public class SourceSelectionState extends DiscreteState
{
	/**
	 * The unique class version for serialization
	 */

	private static final long serialVersionUID = 1L;

	public static final String TAPE1 = "tape1";
	public static final String CD = "cd";
	public static final String TAPE2 = "tape2";
	public static final String AUX = "aux";
	public static final String TUNER = "tuner";
	public static final String PHONO = "phono";


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public SourceSelectionState(Tape1StateValue tape1statevalue)
	{
		//call the super class constructor
		super(new StateValue[]{tape1statevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public SourceSelectionState(CDStateValue cdstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{cdstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public SourceSelectionState(Tape2StateValue tape2statevalue)
	{
		//call the super class constructor
		super(new StateValue[]{tape2statevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public SourceSelectionState(AuxStateValue auxstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{auxstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public SourceSelectionState(TunerStateValue tunerstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{tunerstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public SourceSelectionState(PhonoStateValue phonostatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{phonostatevalue});
	}

	@Deprecated
	private void initCommon()
	{
		this.old2NewMap.put(SourceSelectionState.TAPE1, new Tape1StateValue());
		this.old2NewMap.put(SourceSelectionState.CD, new CDStateValue());
		this.old2NewMap.put(SourceSelectionState.TAPE2, new Tape2StateValue());
		this.old2NewMap.put(SourceSelectionState.AUX, new AuxStateValue());
		this.old2NewMap.put(SourceSelectionState.TUNER, new TunerStateValue());
		this.old2NewMap.put(SourceSelectionState.PHONO, new PhonoStateValue());
	}
	/**
	 * Creates a state object in the Dog2.0 old way (before May 2012).
	 * 
	 * @param valueOfTheCurrentStateValue
	 */
	@Deprecated
	public SourceSelectionState(Object valueOfTheCurrentStateValue)
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
	public SourceSelectionState(StateValue... currentStateValue)
	{
		super(currentStateValue);
	}

	/**
	 * Default constructor.
	 */
	public SourceSelectionState()
	{
		super();
	}
}