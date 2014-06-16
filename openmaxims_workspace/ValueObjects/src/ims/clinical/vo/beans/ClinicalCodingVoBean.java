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

package ims.clinical.vo.beans;

public class ClinicalCodingVoBean extends ims.vo.ValueObjectBean
{
	public ClinicalCodingVoBean()
	{
	}
	public ClinicalCodingVoBean(ims.clinical.vo.ClinicalCodingVo vo)
	{
		// Base value object field type not supported.
		this.description = vo.getDescription();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.ClinicalCodingVo vo)
	{
		// Base value object field type not supported.
		this.description = vo.getDescription();
	}

	public ims.clinical.vo.ClinicalCodingVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.ClinicalCodingVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.ClinicalCodingVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.ClinicalCodingVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.ClinicalCodingVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String value)
	{
		this.description = value;
	}

	private String description;
}