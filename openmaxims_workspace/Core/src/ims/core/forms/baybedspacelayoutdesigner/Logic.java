//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Marius Mihalec using IMS Development Environment (version 1.62 build 3111.36466)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.core.forms.baybedspacelayoutdesigner;

import java.text.ParseException;

import ims.core.vo.BedSpaceStateLiteVo;
import ims.core.vo.BedSpaceStateLiteVoCollection;
import ims.core.vo.BedSpaceVo;
import ims.core.vo.BedSpaceVoCollection;
import ims.core.vo.FloorBedSpaceLayoutVo;
import ims.core.vo.FloorLayoutLiteVo;
import ims.core.vo.FloorLayoutLiteVoCollection;
import ims.core.vo.FloorLayoutVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.enums.BedLayoutAction;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.FormName;
import ims.framework.controls.Bed;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.enumerations.Position;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long	serialVersionUID	= 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}

	@Override
	protected void onLnkReturnClick() throws PresentationLogicException 
	{
		returnToList();		
	}
	
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().Core.setBedLayoutAction(BedLayoutAction.EDIT);
		open();
		form.setMode(FormMode.EDIT);
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (save())
		{
			form.setMode(FormMode.VIEW);
			open();
		}
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (form.getLocalContext().getCurrentRecord() == null || (form.getGlobalContext().Core.getBedLayoutActionIsNotNull() && form.getGlobalContext().Core.getBedLayoutAction().equals(BedLayoutAction.CLONE)))
		{
			returnToList();
		}
		else
		{
			open();
			form.setMode(FormMode.VIEW);
		}
	}

	@Override
	protected void onCmbFloorLayoutValueChanged() throws PresentationLogicException
	{
		loadNewSelectedLayout();
	}

	private void loadNewSelectedLayout()
	{
		form.bedPlanner().setPlan("");

		FloorLayoutLiteVo id = form.cmbFloorLayout().getValue();
		if (id != null)
		{
			FloorLayoutVo layout = domain.getLayout(form.cmbFloorLayout().getValue());
			form.bedPlanner().setPlan(layout.getVml());
			form.getLocalContext().setCurentLayout(layout);
		}
	}

	private void initialize()
	{
		if (form.getGlobalContext().Core.BedFloorLayout.getReadOnly() != null && form.getGlobalContext().Core.BedFloorLayout.getReadOnly().booleanValue())
		{
			form.setMode(FormMode.VIEW);
		}
		else
		{
			form.setMode(FormMode.EDIT);
			form.txtName().setFocus();
			if (form.getGlobalContext().Core.BedFloorLayout.getSelection() == null || (form.getGlobalContext().Core.getBedLayoutActionIsNotNull() && form.getGlobalContext().Core.getBedLayoutAction().equals(BedLayoutAction.CLONE)))
			{
				form.cmbStatus().setValue(PreActiveActiveInactiveStatus.PREACTIVE);
				form.chkIsTemplate().setValue(false);
			}
		}

		loadFloorLayouts();
		form.bedPlanner().addBedImage(Bed.WHITE.getType());
	}

	private void loadFloorLayouts()
	{
		form.cmbFloorLayout().clear();

		FloorLayoutLiteVoCollection layouts = domain.listFloorLayouts(PreActiveActiveInactiveStatus.ACTIVE);

		if (layouts != null)
		{
			for (int x = 0; x < layouts.size(); x++)
			{
				addFloorLayout(layouts.get(x));
			}
		}
	}

	private void addFloorLayout(FloorLayoutLiteVo layout)
	{
		if (layout != null && !floorLayoutAdded(layout))
		{
			form.cmbFloorLayout().newRow(layout, layout.getName());
		}
	}

	private boolean floorLayoutAdded(FloorLayoutLiteVo layout)
	{
		for (int x = 0; x < form.cmbFloorLayout().getValues().size(); x++)
		{
			if (((FloorLayoutLiteVo) form.cmbFloorLayout().getValues().get(x)).equals(layout))
				return true;
		}

		return false;
	}

	private void open()
	{
		if (form.getGlobalContext().Core.BedFloorLayout.getSelection() != null)
		{
			FloorBedSpaceLayoutVo value = domain.get(form.getGlobalContext().Core.BedFloorLayout.getSelection());

			if (form.getGlobalContext().Core.getBedLayoutActionIsNotNull() && form.getGlobalContext().Core.getBedLayoutAction().equals(BedLayoutAction.CLONE))
			{
				FloorBedSpaceLayoutVo record = new FloorBedSpaceLayoutVo();
				record.setBedSpaces(value.getBedSpaces());
				record.setFloorLayout(value.getFloorLayout());
				record.setName(null);
				record.setStatus(PreActiveActiveInactiveStatus.PREACTIVE);
				record.setIsTemplate(true);
				populateScreenFromData(record);
			}
			else
			{
				populateScreenFromData(value);
				form.chkIsTemplate().setEnabled(false);
			}
		}
		else
			form.chkIsTemplate().setValue(true);
	}

	private FloorBedSpaceLayoutVo populateDataFromScreen(FloorBedSpaceLayoutVo value)
	{
		if (value == null || (form.getGlobalContext().Core.getBedLayoutActionIsNotNull() && form.getGlobalContext().Core.getBedLayoutAction().equals(BedLayoutAction.CLONE)))
		{
			value = new FloorBedSpaceLayoutVo();
		}

		BedSpaceStateLiteVoCollection voCollBedSpaceState = new BedSpaceStateLiteVoCollection();

		value.setName(form.txtName().getValue());
		value.setStatus(form.cmbStatus().getValue());
		value.setFloorLayout(form.getLocalContext().getCurentLayout());
		value.setIsTemplate(form.chkIsTemplate().getValue());

		BedSpaceVoCollection voCollBedSpace = new BedSpaceVoCollection();
		LocationLiteVo voWard = null;
		LocationLiteVo voBay = null;
		for (int x = 0; x < form.bedPlanner().getBeds().size(); x++)
		{
			Bed bed = form.bedPlanner().getBeds().get(x);

			if (bed != null && bed.getIdentifier() != null && bed.getIdentifier() instanceof BedSpaceStateLiteVo)
			{
				BedSpaceStateLiteVo voBedSpaceState = (BedSpaceStateLiteVo) bed.getIdentifier();
				
				if(voWard == null && voBedSpaceState.getWardIsNotNull())
					voWard = voBedSpaceState.getWard();
				
				if(voBay == null && voBedSpaceState.getBayIsNotNull())
					voBay = voBedSpaceState.getBay();
				
				voCollBedSpaceState.add(voBedSpaceState);

				BedSpaceVo voBedSpace = null;
				if (voBedSpaceState.getBedSpace() != null)
				{
					voBedSpace = voBedSpaceState.getBedSpace();
					if (form.getGlobalContext().Core.getBedLayoutActionIsNotNull() && form.getGlobalContext().Core.getBedLayoutAction().equals(BedLayoutAction.CLONE))
						voBedSpace.setID_BedSpace(null);
					
					voBedSpace.setVml(bed.getVML());
					voBedSpace.setTextPosition(bed.getTextPosition().toString());
					voBedSpace.setImagePosition(bed.getImagePosition().toString());
					voCollBedSpace.add(voBedSpace);
				}
			}
		}

		//this code is to update the instantiated BedSpaceState's with the ward & bay when a new bed is added to an instantiated ward
		if(voCollBedSpaceState != null )
		{
			for (BedSpaceStateLiteVo voBedSpaceState : voCollBedSpaceState)
			{
				if(voWard != null && voBedSpaceState.getWard() == null)
					voBedSpaceState.setWard(voWard);
				if(voBay != null && voBedSpaceState.getBay() == null)
					voBedSpaceState.setBay(voBay);
			}
		}
	

			
		value.setBedSpaces(voCollBedSpace);
		form.getLocalContext().setBedSpaceStateColl(voCollBedSpaceState);

		return value;
	}

	private void populateScreenFromData(FloorBedSpaceLayoutVo value)
	{
		form.getLocalContext().setCurrentRecord(value);
		form.bedPlanner().clear();

		if (value != null)
		{
			if (form.getGlobalContext().Core.getBedLayoutActionIsNotNull() && !form.getGlobalContext().Core.getBedLayoutAction().equals(BedLayoutAction.CLONE))
			{
				form.txtName().setValue(value.getName());
				form.cmbStatus().setValue(value.getStatus());
				form.chkIsTemplate().setValue(value.getIsTemplate());
			}
			else if(form.getGlobalContext().Core.getBedLayoutActionIsNotNull() && form.getGlobalContext().Core.getBedLayoutAction().equals(BedLayoutAction.CLONE))
				form.chkIsTemplate().setValue(false);
			else
				form.chkIsTemplate().setValue(true);
			

			addFloorLayout(value.getFloorLayout());
			form.cmbFloorLayout().setValue(value.getFloorLayout());
			form.getLocalContext().setCurentLayout(value.getFloorLayout());

			if (value.getFloorLayout() != null)
			{
				form.bedPlanner().setPlan(value.getFloorLayout().getVml());
			}

			if (value.getBedSpaces() != null)
			{
				for (int x = 0; x < value.getBedSpaces().size(); x++)
				{
					BedSpaceVo voBed = value.getBedSpaces().get(x);
					Bed bed = null;
					try
					{
						bed = new Bed(voBed.getID_BedSpace(), Bed.WHITE.getType(), voBed.getVml(), Position.parse(voBed.getTextPosition()), Position.parse(voBed.getImagePosition()));
					}
					catch (ParseException e)
					{
						throw new CodingRuntimeException("Parse exception on Bed Planner");
					}
					BedSpaceStateLiteVo bedSpaceState = null;
					bedSpaceState = domain.getBedSpaceStateByBedSpace(voBed);					
					
					//state will be null for a template
					if(bedSpaceState == null)
					{
						bedSpaceState = new BedSpaceStateLiteVo();
						bedSpaceState.setBedSpace(voBed);
					}
					if(bed != null)
						bed.setIdentifier(bedSpaceState);

					if (form.getGlobalContext().Core.getBedLayoutActionIsNotNull() && form.getGlobalContext().Core.getBedLayoutAction().equals(BedLayoutAction.CLONE))
					{
						voBed.setID_BedSpace(null);
						bedSpaceState = new BedSpaceStateLiteVo();
						bedSpaceState.setBedSpace(voBed);
						bedSpaceState.getBedSpace().setID_BedSpace(null);
						bed.setIdentifier(bedSpaceState);
					}
					
					if(bed != null)
						form.bedPlanner().addBed(bed);
				}
			}
		}
	}

	private boolean save()
	{
		FloorBedSpaceLayoutVo value = populateDataFromScreen(form.getLocalContext().getCurrentRecord());

		String[] errors = value.validate();
		if (errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}

		try
		{
			//if its a template dont instantiate a states collection
			if(form.chkIsTemplate().getValue())
				value = domain.save(value, null);
			else
				value = domain.save(value, form.getLocalContext().getBedSpaceStateColl());
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		} 
		catch (DomainInterfaceException e) 
		{		
			engine.showErrors(new String[]{e.getMessage()});
			open();
			return false;
		}

		form.getLocalContext().setCurrentRecord(value);
		form.getGlobalContext().Core.BedFloorLayout.setSelection(value);

		return true;
	}

	private void returnToList()
	{
		engine.open(form.getForms().Core.BedSpaceLayoutList);
	}

	@Override
	protected void onBedPlannerBedInfo(Bed bed, boolean readOnly)
	{
		form.getGlobalContext().Core.setBedSpaceProperty(bed);
		//wdev-11155
		if(readOnly)
			engine.open(form.getForms().Core.BedSpacePropertyDialog,new Object[]{Boolean.FALSE});
		else
			engine.open(form.getForms().Core.BedSpacePropertyDialog);
	}

	@Override
	protected void onBedPlannerBedAdded(Bed bed)
	{
		BedSpaceStateLiteVo bedSpaceStatus = new BedSpaceStateLiteVo();
		BedSpaceVo bedSpace = new BedSpaceVo();
		bedSpaceStatus.setBedSpace(bedSpace);
		bed.setIdentifier(bedSpaceStatus);

		form.getGlobalContext().Core.setBedSpaceProperty(bed);
		engine.open(form.getForms().Core.BedSpacePropertyDialog);
	}

	@Override
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException
	{
		if ((formName.equals(form.getForms().Core.BedSpacePropertyDialog)) && (result.equals(DialogResult.CANCEL)))
		{

		}
		else if ((formName.equals(form.getForms().Core.BedSpacePropertyDialog)) && (result.equals(DialogResult.OK)))
		{

		}
	}

	@Override
	protected void onBedPlannerBedEdited(Bed bed)
	{
	}
}