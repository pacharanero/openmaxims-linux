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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.emergency.forms.woundimagescc;

import ims.framework.*;
import ims.framework.controls.*;
import ims.framework.enumerations.*;
import ims.framework.utils.RuntimeAnchoring;

public class GenForm extends FormBridge
{
	private static final long serialVersionUID = 1L;

	protected void fireCustomControlValueChanged()
	{
		super.fireValueChanged();
	}
	public boolean canProvideData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).canProvideData();
	}
	public boolean hasData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).hasData();
	}
	public IReportField[] getData(IReportSeed[] reportSeeds)
	{
		return getData(reportSeeds, false);
	}
	public IReportField[] getData(IReportSeed[] reportSeeds, boolean excludeNulls)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields(), excludeNulls).getData();
	}
	public static class recbrwoundImagesRecordBrowser extends RecordBrowserBridge
	{
		private static final long serialVersionUID = 1L;
		
		public void newRow(ims.emergency.vo.WoundImagesVo value, String text)
		{
			super.control.newRow(value, text);
		}
		public void newRow(ims.emergency.vo.WoundImagesVo value, String text, ims.framework.utils.Image image)
		{
			super.control.newRow(value, text, image);
		}
		public void newRow(ims.emergency.vo.WoundImagesVo value, String text, ims.framework.utils.Color textColor)
		{
			super.control.newRow(value, text, textColor);
		}
		public void newRow(ims.emergency.vo.WoundImagesVo value, String text, ims.framework.utils.Image image, ims.framework.utils.Color textColor)
		{
			super.control.newRow(value, text, image, textColor);
		}
		public void newRow(int index, ims.emergency.vo.WoundImagesVo value, String text)
		{
			super.control.newRow(index, value, text);
		}
		public void newRow(int index, ims.emergency.vo.WoundImagesVo value, String text, ims.framework.utils.Image image)
		{
			super.control.newRow(index, value, text, image);
		}
		public void newRow(int index, ims.emergency.vo.WoundImagesVo value, String text, ims.framework.utils.Color textColor)
		{
			super.control.newRow(index, value, text, textColor);
		}
		public void newRow(int index, ims.emergency.vo.WoundImagesVo value, String text, ims.framework.utils.Image image, ims.framework.utils.Color textColor)
		{
			super.control.newRow(index, value, text, image, textColor);
		}
		public ims.emergency.vo.WoundImagesVo getValue()
		{
			return (ims.emergency.vo.WoundImagesVo)super.control.getValue();
		}
		public void setValue(ims.emergency.vo.WoundImagesVo value)
		{
			super.control.setValue(value);
		}
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
	}
	public boolean supportsRecordedInError()
	{
		return false;
	}
	public ims.vo.ValueObject getRecordedInErrorVo()
	{
		return null;
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context) throws Exception
	{
		setContext(loader, form, appForm, factory, context, Boolean.FALSE, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context, Boolean skipContextValidation) throws Exception
	{
		setContext(loader, form, appForm, factory, context, skipContextValidation, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, ims.framework.Context context, Boolean skipContextValidation, Integer startControlID, ims.framework.utils.SizeInfo runtimeSize, ims.framework.Control control, Integer startTabIndex) throws Exception
	{
		if(loader == null); // this is to avoid eclipse warning only.
		if(factory == null); // this is to avoid eclipse warning only.
		if(runtimeSize == null); // this is to avoid eclipse warning only.
		if(appForm == null)
			throw new RuntimeException("Invalid application form");
		if(startControlID == null)
			throw new RuntimeException("Invalid startControlID");
		if(control == null); // this is to avoid eclipse warning only.
		if(startTabIndex == null)
			throw new RuntimeException("Invalid startTabIndex");
		this.context = context;
		this.componentIdentifier = startControlID.toString();
		this.formInfo = form.getFormInfo();
		this.globalContext = new GlobalContext(context);
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(704, 520);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setFormReferences(FormReferencesFlyweightFactory.getInstance().create(Forms.class));
		super.setImageReferences(ImageReferencesFlyweightFactory.getInstance().create(Images.class));
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));


		// Custom Controls
		ims.framework.CustomComponent instance1 = factory.getEmptyCustomComponent();
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 8, 424, 376, 56, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT);
		ims.framework.FormUiLogic m_ccWoundAuthoringForm = loader.loadComponent(102228, appForm, startControlID * 10 + 1000, anchoringHelper1.getSize(), instance1, startTabIndex.intValue() + 2, skipContextValidation);
		//ims.framework.Control m_ccWoundAuthoringControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(8), new Integer(424), new Integer(376), new Integer(56), ControlState.DISABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT, new Integer(startTabIndex.intValue() + 2), m_ccWoundAuthoringForm, instance1 } );
		ims.framework.Control m_ccWoundAuthoringControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1001),  new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), ControlState.DISABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT, new Integer(startTabIndex.intValue() + 2), m_ccWoundAuthoringForm, instance1, Boolean.FALSE } );
		super.addControl(m_ccWoundAuthoringControl);
		Menu[] menus1 = m_ccWoundAuthoringForm.getForm().getRegisteredMenus();
		for(int x = 0; x < menus1.length; x++)
		{
			form.registerMenu(menus1[x]);
		}

		// Label Controls
		RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 392, 415, 63, 17, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Label.class, new Object[] { control, new Integer(startControlID.intValue() + 1002), new Integer(anchoringHelper2.getX()), new Integer(anchoringHelper2.getY()), new Integer(anchoringHelper2.getWidth()), new Integer(anchoringHelper2.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Comment:", new Integer(1), null, new Integer(0)}));

		// Button Controls
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 613, 490, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1003), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), new Integer(startTabIndex.intValue() + 1007), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Cancel", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper4 = new RuntimeAnchoring(designSize, runtimeSize, 535, 490, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1004), new Integer(anchoringHelper4.getX()), new Integer(anchoringHelper4.getY()), new Integer(anchoringHelper4.getWidth()), new Integer(anchoringHelper4.getHeight()), new Integer(startTabIndex.intValue() + 1006), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Save", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper5 = new RuntimeAnchoring(designSize, runtimeSize, 8, 490, 120, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1005), new Integer(anchoringHelper5.getX()), new Integer(anchoringHelper5.getY()), new Integer(anchoringHelper5.getWidth()), new Integer(anchoringHelper5.getHeight()), new Integer(startTabIndex.intValue() + 1004), ControlState.UNKNOWN, ControlState.HIDDEN, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "Capture/Import", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper6 = new RuntimeAnchoring(designSize, runtimeSize, 132, 490, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1006), new Integer(anchoringHelper6.getX()), new Integer(anchoringHelper6.getY()), new Integer(anchoringHelper6.getWidth()), new Integer(anchoringHelper6.getHeight()), new Integer(startTabIndex.intValue() + 1005), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "Edit", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));

		// TextBox Controls
		RuntimeAnchoring anchoringHelper7 = new RuntimeAnchoring(designSize, runtimeSize, 392, 432, 296, 48, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(TextBox.class, new Object[] { control, new Integer(startControlID.intValue() + 1007), new Integer(anchoringHelper7.getX()), new Integer(anchoringHelper7.getY()), new Integer(anchoringHelper7.getWidth()), new Integer(anchoringHelper7.getHeight()), new Integer(startTabIndex.intValue() + 1003), ControlState.DISABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT,Boolean.TRUE, new Integer(0), Boolean.TRUE, Boolean.FALSE, null, null, Boolean.FALSE, ims.framework.enumerations.CharacterCasing.NORMAL, ims.framework.enumerations.TextTrimming.NONE, "", ""}));

		// RecordBrowser Controls
		RuntimeAnchoring anchoringHelper8 = new RuntimeAnchoring(designSize, runtimeSize, 8, 16, 680, 21, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		RecordBrowser m_recbrwoundImagesTemp = (RecordBrowser)factory.getControl(RecordBrowser.class, new Object[] { control, new Integer(startControlID.intValue() + 1008), new Integer(anchoringHelper8.getX()), new Integer(anchoringHelper8.getY()), new Integer(anchoringHelper8.getWidth()), new Integer(anchoringHelper8.getHeight()), new Integer(startTabIndex.intValue() + 1), ControlState.ENABLED, ControlState.DISABLED,ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT, null});
		addControl(m_recbrwoundImagesTemp);
		recbrwoundImagesRecordBrowser recbrwoundImages = (recbrwoundImagesRecordBrowser)RecordBrowserFlyweightFactory.getInstance().createRecordBrowserBridge(recbrwoundImagesRecordBrowser.class, m_recbrwoundImagesTemp);
		super.addRecordBrowser(recbrwoundImages);

		// Picture Controls
		RuntimeAnchoring anchoringHelper9 = new RuntimeAnchoring(designSize, runtimeSize, 8, 64, 680, 336, ims.framework.enumerations.ControlAnchoring.ALL);
		super.addControl(factory.getControl(Picture.class, new Object[] { control, new Integer(startControlID.intValue() + 1009), new Integer(anchoringHelper9.getX()), new Integer(anchoringHelper9.getY()), new Integer(anchoringHelper9.getWidth()), new Integer(anchoringHelper9.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL, Boolean.FALSE}));
	}



	public Forms getForms()
	{
		return (Forms)super.getFormReferences();
	}

	public Images getImages()
	{
		return (Images)super.getImageReferences();
	}
	public ims.core.forms.authoringinfo.IComponent ccWoundAuthoring()
	{
		return (ims.core.forms.authoringinfo.IComponent)((ims.framework.cn.controls.CustomComponent)super.getControl(0)).getLogic();
	}
	public void setccWoundAuthoringValueChangedEvent(ims.framework.delegates.ValueChanged delegate)
	{
		((CustomComponent)super.getControl(0)).setValueChangedEvent(delegate);
	}
	public void setccWoundAuthoringVisible(boolean value)
	{
		((ims.framework.Control)super.getControl(0)).setVisible(value);
	}
	public boolean isccWoundAuthoringVisible()
	{
		return ((ims.framework.Control)super.getControl(0)).isVisible();
	}
	public void setccWoundAuthoringEnabled(boolean value)
	{
		((ims.framework.Control)super.getControl(0)).setEnabled(value);
	}
	public boolean isccWoundAuthoringEnabled()
	{
		return ((ims.framework.Control)super.getControl(0)).isEnabled();
	}
	public Button btnCancel()
	{
		return (Button)super.getControl(2);
	}
	public Button btnSave()
	{
		return (Button)super.getControl(3);
	}
	public Button btnCaptureImport()
	{
		return (Button)super.getControl(4);
	}
	public Button btnEdit()
	{
		return (Button)super.getControl(5);
	}
	public TextBox txtComment()
	{
		return (TextBox)super.getControl(6);
	}
	public recbrwoundImagesRecordBrowser recbrwoundImages()
	{
		return (recbrwoundImagesRecordBrowser)super.getRecordBrowser(0);
	}
	public Picture imgWoundImage()
	{
		return (Picture)super.getControl(8);
	}

	public static class Forms implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		protected final class LocalFormName extends FormName
		{
			private static final long serialVersionUID = 1L;
		
			private LocalFormName(int name)
			{
				super(name);
			}
		}

		private Forms()
		{
			Core = new CoreForms();
		}
		public final class CoreForms implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private CoreForms()
			{
				PatientImageSelection = new LocalFormName(102328);
				WoundImageSelection = new LocalFormName(102422);
			}
			public final FormName PatientImageSelection;
			public final FormName WoundImageSelection;
		}

		public CoreForms Core;
	}


	public static class Images implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		private final class ImageHelper extends ims.framework.utils.ImagePath
		{
			private static final long serialVersionUID = 1L;
			
			private ImageHelper(int id, String path, Integer width, Integer height)
			{
				super(id, path, width, height);
			}
		}
		private Images()
		{
			Core = new CoreImages();
		}
		public final class CoreImages implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private CoreImages()
			{
				NoPatientImage = new ImageHelper(102554, "Images/Core/silhouette_blue.png", new Integer(177), new Integer(177));
			}
			public final ims.framework.utils.Image NoPatientImage;
		}
		public final CoreImages Core;
	}
	public GlobalContext getGlobalContext()
	{
		return this.globalContext;
	}
	public static class GlobalContextBridge extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
	}
	public LocalContext getLocalContext()
	{
		return (LocalContext)super.getLocalCtx();
	}
	public class LocalContext extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
		
		public LocalContext(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			super.setContext(context);
			String prefix = formInfo.getLocalVariablesPrefix();
			cxl_CurrentWoundImage = new ims.framework.ContextVariable("CurrentWoundImage", prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__CurrentWoundImage_" + componentIdentifier + "");
			cxl_EDAssessmentWoundImages = new ims.framework.ContextVariable("EDAssessmentWoundImages", prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__EDAssessmentWoundImages_" + componentIdentifier + "");
			cxl_PatientRef = new ims.framework.ContextVariable("PatientRef", prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__PatientRef_" + componentIdentifier + "");
			cxl_EpisodeOfCareRef = new ims.framework.ContextVariable("EpisodeOfCareRef", prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__EpisodeOfCareRef_" + componentIdentifier + "");
			cxl_CareContextRef = new ims.framework.ContextVariable("CareContextRef", prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__CareContextRef_" + componentIdentifier + "");
			cxl_WoundImageDB = new ims.framework.ContextVariable("WoundImageDB", prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__WoundImageDB_" + componentIdentifier + "");
			cxl_ReadOnly = new ims.framework.ContextVariable("ReadOnly", prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__ReadOnly_" + componentIdentifier + "");
		}
		
		public boolean getCurrentWoundImageIsNotNull()
		{
			return !cxl_CurrentWoundImage.getValueIsNull(context);
		}
		public ims.emergency.vo.WoundImagesVo getCurrentWoundImage()
		{
			return (ims.emergency.vo.WoundImagesVo)cxl_CurrentWoundImage.getValue(context);
		}
		public void setCurrentWoundImage(ims.emergency.vo.WoundImagesVo value)
		{
			cxl_CurrentWoundImage.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_CurrentWoundImage = null;
		public boolean getEDAssessmentWoundImagesIsNotNull()
		{
			return !cxl_EDAssessmentWoundImages.getValueIsNull(context);
		}
		public ims.emergency.vo.EDAssessmentWoundImagesVo getEDAssessmentWoundImages()
		{
			return (ims.emergency.vo.EDAssessmentWoundImagesVo)cxl_EDAssessmentWoundImages.getValue(context);
		}
		public void setEDAssessmentWoundImages(ims.emergency.vo.EDAssessmentWoundImagesVo value)
		{
			cxl_EDAssessmentWoundImages.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_EDAssessmentWoundImages = null;
		public boolean getPatientRefIsNotNull()
		{
			return !cxl_PatientRef.getValueIsNull(context);
		}
		public ims.core.patient.vo.PatientRefVo getPatientRef()
		{
			return (ims.core.patient.vo.PatientRefVo)cxl_PatientRef.getValue(context);
		}
		public void setPatientRef(ims.core.patient.vo.PatientRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'PatientRef' RefVo context variable.");
			if(value == null)
				cxl_PatientRef.setValue(context, null);
			else
				cxl_PatientRef.setValue(context, new ims.core.patient.vo.PatientRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_PatientRef = null;
		public boolean getEpisodeOfCareRefIsNotNull()
		{
			return !cxl_EpisodeOfCareRef.getValueIsNull(context);
		}
		public ims.core.admin.vo.EpisodeOfCareRefVo getEpisodeOfCareRef()
		{
			return (ims.core.admin.vo.EpisodeOfCareRefVo)cxl_EpisodeOfCareRef.getValue(context);
		}
		public void setEpisodeOfCareRef(ims.core.admin.vo.EpisodeOfCareRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'EpisodeOfCareRef' RefVo context variable.");
			if(value == null)
				cxl_EpisodeOfCareRef.setValue(context, null);
			else
				cxl_EpisodeOfCareRef.setValue(context, new ims.core.admin.vo.EpisodeOfCareRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_EpisodeOfCareRef = null;
		public boolean getCareContextRefIsNotNull()
		{
			return !cxl_CareContextRef.getValueIsNull(context);
		}
		public ims.core.admin.vo.CareContextRefVo getCareContextRef()
		{
			return (ims.core.admin.vo.CareContextRefVo)cxl_CareContextRef.getValue(context);
		}
		public void setCareContextRef(ims.core.admin.vo.CareContextRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'CareContextRef' RefVo context variable.");
			if(value == null)
				cxl_CareContextRef.setValue(context, null);
			else
				cxl_CareContextRef.setValue(context, new ims.core.admin.vo.CareContextRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_CareContextRef = null;
		public boolean getWoundImageDBIsNotNull()
		{
			return !cxl_WoundImageDB.getValueIsNull(context);
		}
		public ims.core.vo.AppDBImageVo getWoundImageDB()
		{
			return (ims.core.vo.AppDBImageVo)cxl_WoundImageDB.getValue(context);
		}
		public void setWoundImageDB(ims.core.vo.AppDBImageVo value)
		{
			cxl_WoundImageDB.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_WoundImageDB = null;
		public boolean getReadOnlyIsNotNull()
		{
			return !cxl_ReadOnly.getValueIsNull(context);
		}
		public Boolean getReadOnly()
		{
			return (Boolean)cxl_ReadOnly.getValue(context);
		}
		public void setReadOnly(Boolean value)
		{
			cxl_ReadOnly.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_ReadOnly = null;
	}
	private IReportField[] getFormReportFields()
	{
		if(this.context == null)
			return null;
		if(this.reportFields == null)
			this.reportFields = new ReportFields(this.context, this.formInfo, this.componentIdentifier).getReportFields();
		return this.reportFields;
	}
	private class ReportFields
	{
		public ReportFields(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			this.context = context;
			this.formInfo = formInfo;
			this.componentIdentifier = componentIdentifier;
		}
		public IReportField[] getReportFields()
		{
			String prefix = formInfo.getLocalVariablesPrefix();
			IReportField[] fields = new IReportField[93];
			fields[0] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ID", "ID_Patient");
			fields[1] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SEX", "Sex");
			fields[2] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOB", "Dob");
			fields[3] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOD", "Dod");
			fields[4] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-RELIGION", "Religion");
			fields[5] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISACTIVE", "IsActive");
			fields[6] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ETHNICORIGIN", "EthnicOrigin");
			fields[7] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-MARITALSTATUS", "MaritalStatus");
			fields[8] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SCN", "SCN");
			fields[9] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SOURCEOFINFORMATION", "SourceOfInformation");
			fields[10] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-TIMEOFDEATH", "TimeOfDeath");
			fields[11] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISQUICKREGISTRATIONPATIENT", "IsQuickRegistrationPatient");
			fields[12] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-CURRENTRESPONSIBLECONSULTANT", "CurrentResponsibleConsultant");
			fields[13] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-ID", "ID_Patient");
			fields[14] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-SEX", "Sex");
			fields[15] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-DOB", "Dob");
			fields[16] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ID", "ID_ClinicalContact");
			fields[17] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-SPECIALTY", "Specialty");
			fields[18] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CONTACTTYPE", "ContactType");
			fields[19] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-STARTDATETIME", "StartDateTime");
			fields[20] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ENDDATETIME", "EndDateTime");
			fields[21] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CARECONTEXT", "CareContext");
			fields[22] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ISCLINICALNOTECREATED", "IsClinicalNoteCreated");
			fields[23] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ID", "ID_Hcp");
			fields[24] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-HCPTYPE", "HcpType");
			fields[25] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISACTIVE", "IsActive");
			fields[26] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISHCPARESPONSIBLEHCP", "IsHCPaResponsibleHCP");
			fields[27] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISARESPONSIBLEEDCLINICIAN", "IsAResponsibleEDClinician");
			fields[28] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ID", "ID_CareContext");
			fields[29] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-CONTEXT", "Context");
			fields[30] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ORDERINGHOSPITAL", "OrderingHospital");
			fields[31] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ESTIMATEDDISCHARGEDATE", "EstimatedDischargeDate");
			fields[32] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-STARTDATETIME", "StartDateTime");
			fields[33] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ENDDATETIME", "EndDateTime");
			fields[34] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-LOCATIONTYPE", "LocationType");
			fields[35] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-RESPONSIBLEHCP", "ResponsibleHCP");
			fields[36] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[37] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-CARESPELL", "CareSpell");
			fields[38] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-SPECIALTY", "Specialty");
			fields[39] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-RELATIONSHIP", "Relationship");
			fields[40] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-STARTDATE", "StartDate");
			fields[41] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ENDDATE", "EndDate");
			fields[42] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[43] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALNOTE", "ClinicalNote");
			fields[44] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTETYPE", "NoteType");
			fields[45] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-DISCIPLINE", "Discipline");
			fields[46] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALCONTACT", "ClinicalContact");
			fields[47] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISDERIVEDNOTE", "IsDerivedNote");
			fields[48] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEW", "ForReview");
			fields[49] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[50] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-REVIEWINGDATETIME", "ReviewingDateTime");
			fields[51] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISCORRECTED", "IsCorrected");
			fields[52] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISTRANSCRIBED", "IsTranscribed");
			fields[53] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-SOURCEOFNOTE", "SourceOfNote");
			fields[54] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-RECORDINGDATETIME", "RecordingDateTime");
			fields[55] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-INHOSPITALREPORT", "InHospitalReport");
			fields[56] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[57] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[58] = new ims.framework.ReportField(this.context, "_cvp_STHK.AvailableBedsListFilter", "BO-1014100009-ID", "ID_BedSpaceState");
			fields[59] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ID", "ID_PendingEmergencyAdmission");
			fields[60] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ADMISSIONSTATUS", "AdmissionStatus");
			fields[61] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ID", "ID_InpatientEpisode");
			fields[62] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ESTDISCHARGEDATE", "EstDischargeDate");
			fields[63] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[64] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEW", "ForReview");
			fields[65] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[66] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[67] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[68] = new ims.framework.ReportField(this.context, "_cvp_Core.PasEvent", "BO-1014100003-ID", "ID_PASEvent");
			fields[69] = new ims.framework.ReportField(this.context, "_cvp_Correspondence.CorrespondenceDetails", "BO-1052100001-ID", "ID_CorrespondenceDetails");
			fields[70] = new ims.framework.ReportField(this.context, "_cvp_CareUk.CatsReferral", "BO-1004100035-ID", "ID_CatsReferral");
			fields[71] = new ims.framework.ReportField(this.context, "_cv_Core.ClinicalContact", "BO-1004100003-ID", "ID_ClinicalContact");
			fields[72] = new ims.framework.ReportField(this.context, "_cv_Core.ClinicalContact", "BO-1004100003-SPECIALTY", "Specialty");
			fields[73] = new ims.framework.ReportField(this.context, "_cv_Core.ClinicalContact", "BO-1004100003-SEENBY", "SeenBy");
			fields[74] = new ims.framework.ReportField(this.context, "_cv_Core.ClinicalContact", "BO-1004100003-CONTACTTYPE", "ContactType");
			fields[75] = new ims.framework.ReportField(this.context, "_cv_Core.ClinicalContact", "BO-1004100003-STARTDATETIME", "StartDateTime");
			fields[76] = new ims.framework.ReportField(this.context, "_cv_Core.ClinicalContact", "BO-1004100003-ENDDATETIME", "EndDateTime");
			fields[77] = new ims.framework.ReportField(this.context, "_cv_Core.ClinicalContact", "BO-1004100003-CARECONTEXT", "CareContext");
			fields[78] = new ims.framework.ReportField(this.context, "_cv_Core.ClinicalContact", "BO-1004100003-ISCLINICALNOTECREATED", "IsClinicalNoteCreated");
			fields[79] = new ims.framework.ReportField(this.context, "_cv_Core.PatientImage", "BO-1028100055-ID", "ID_AppDBImage");
			fields[80] = new ims.framework.ReportField(this.context, "_cv_Core.PatientImage", "BO-1028100055-IMAGEDATA", "ImageData");
			fields[81] = new ims.framework.ReportField(this.context, "_cv_Core.PatientImage", "BO-1028100055-IMAGETYPE", "ImageType");
			fields[82] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__CurrentWoundImage_" + componentIdentifier, "BO-1086100050-ID", "ID_WoundImage");
			fields[83] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__CurrentWoundImage_" + componentIdentifier, "BO-1086100050-COMMENT", "Comment");
			fields[84] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__EDAssessmentWoundImages_" + componentIdentifier, "BO-1086100049-ID", "ID_PatientWoundImages");
			fields[85] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__EDAssessmentWoundImages_" + componentIdentifier, "BO-1086100049-PATIENT", "Patient");
			fields[86] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__EDAssessmentWoundImages_" + componentIdentifier, "BO-1086100049-CARECONTEXT", "CareContext");
			fields[87] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__PatientRef_" + componentIdentifier, "BO-1001100000-ID", "ID_Patient");
			fields[88] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__EpisodeOfCareRef_" + componentIdentifier, "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[89] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__CareContextRef_" + componentIdentifier, "BO-1004100019-ID", "ID_CareContext");
			fields[90] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__WoundImageDB_" + componentIdentifier, "BO-1028100055-ID", "ID_AppDBImage");
			fields[91] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__WoundImageDB_" + componentIdentifier, "BO-1028100055-IMAGEDATA", "ImageData");
			fields[92] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.WoundImagesCC.__internal_x_context__WoundImageDB_" + componentIdentifier, "BO-1028100055-IMAGETYPE", "ImageType");
			return fields;
		}
		protected Context context = null;
		protected ims.framework.FormInfo formInfo;
		protected String componentIdentifier;
	}
	public String getUniqueIdentifier()
	{
		return formInfo.getLocalVariablesPrefix() + formInfo.getNamespaceName() + formInfo.getFormName() + formInfo.getFormId() + "_" + this.componentIdentifier;
	}
	private Context context = null;
	private ims.framework.FormInfo formInfo = null;
	private String componentIdentifier;
	private GlobalContext globalContext = null;
	private IReportField[] reportFields = null;
}