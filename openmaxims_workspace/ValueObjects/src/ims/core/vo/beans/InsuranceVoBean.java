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

package ims.core.vo.beans;

public class InsuranceVoBean extends ims.vo.ValueObjectBean
{
	public InsuranceVoBean()
	{
	}
	public InsuranceVoBean(ims.core.vo.InsuranceVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.medicalcardno = vo.getMedicalCardNo();
		this.healthactcategory = vo.getHealthActCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getHealthActCategory().getBean();
		this.ehicnumber = vo.getEHICNumber();
		this.ehicexpirydate = vo.getEHICExpiryDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getEHICExpiryDate().getBean();
		this.ehiccountry = vo.getEHICCountry() == null ? null : (ims.vo.LookupInstanceBean)vo.getEHICCountry().getBean();
		this.ehicinstitution = vo.getEHICInstitution();
		this.medicalcardproved = vo.getMedicalCardProved() == null ? null : (ims.vo.LookupInstanceBean)vo.getMedicalCardProved().getBean();
		this.eligibilityproof = vo.getEligibilityProof();
		this.medicalcardexpirydate = vo.getMedicalCardExpiryDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getMedicalCardExpiryDate().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.InsuranceVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.medicalcardno = vo.getMedicalCardNo();
		this.healthactcategory = vo.getHealthActCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getHealthActCategory().getBean();
		this.ehicnumber = vo.getEHICNumber();
		this.ehicexpirydate = vo.getEHICExpiryDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getEHICExpiryDate().getBean();
		this.ehiccountry = vo.getEHICCountry() == null ? null : (ims.vo.LookupInstanceBean)vo.getEHICCountry().getBean();
		this.ehicinstitution = vo.getEHICInstitution();
		this.medicalcardproved = vo.getMedicalCardProved() == null ? null : (ims.vo.LookupInstanceBean)vo.getMedicalCardProved().getBean();
		this.eligibilityproof = vo.getEligibilityProof();
		this.medicalcardexpirydate = vo.getMedicalCardExpiryDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getMedicalCardExpiryDate().getBean();
	}

	public ims.core.vo.InsuranceVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.InsuranceVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.InsuranceVo vo = null;
		if(map != null)
			vo = (ims.core.vo.InsuranceVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.InsuranceVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public String getMedicalCardNo()
	{
		return this.medicalcardno;
	}
	public void setMedicalCardNo(String value)
	{
		this.medicalcardno = value;
	}
	public ims.vo.LookupInstanceBean getHealthActCategory()
	{
		return this.healthactcategory;
	}
	public void setHealthActCategory(ims.vo.LookupInstanceBean value)
	{
		this.healthactcategory = value;
	}
	public String getEHICNumber()
	{
		return this.ehicnumber;
	}
	public void setEHICNumber(String value)
	{
		this.ehicnumber = value;
	}
	public ims.framework.utils.beans.PartialDateBean getEHICExpiryDate()
	{
		return this.ehicexpirydate;
	}
	public void setEHICExpiryDate(ims.framework.utils.beans.PartialDateBean value)
	{
		this.ehicexpirydate = value;
	}
	public ims.vo.LookupInstanceBean getEHICCountry()
	{
		return this.ehiccountry;
	}
	public void setEHICCountry(ims.vo.LookupInstanceBean value)
	{
		this.ehiccountry = value;
	}
	public String getEHICInstitution()
	{
		return this.ehicinstitution;
	}
	public void setEHICInstitution(String value)
	{
		this.ehicinstitution = value;
	}
	public ims.vo.LookupInstanceBean getMedicalCardProved()
	{
		return this.medicalcardproved;
	}
	public void setMedicalCardProved(ims.vo.LookupInstanceBean value)
	{
		this.medicalcardproved = value;
	}
	public String getEligibilityProof()
	{
		return this.eligibilityproof;
	}
	public void setEligibilityProof(String value)
	{
		this.eligibilityproof = value;
	}
	public ims.framework.utils.beans.PartialDateBean getMedicalCardExpiryDate()
	{
		return this.medicalcardexpirydate;
	}
	public void setMedicalCardExpiryDate(ims.framework.utils.beans.PartialDateBean value)
	{
		this.medicalcardexpirydate = value;
	}

	private Integer id;
	private int version;
	private String medicalcardno;
	private ims.vo.LookupInstanceBean healthactcategory;
	private String ehicnumber;
	private ims.framework.utils.beans.PartialDateBean ehicexpirydate;
	private ims.vo.LookupInstanceBean ehiccountry;
	private String ehicinstitution;
	private ims.vo.LookupInstanceBean medicalcardproved;
	private String eligibilityproof;
	private ims.framework.utils.beans.PartialDateBean medicalcardexpirydate;
}