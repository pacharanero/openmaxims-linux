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

package ims.ocrr.vo.beans;

public class MyOrderPasEventVoBean extends ims.vo.ValueObjectBean
{
	public MyOrderPasEventVoBean()
	{
	}
	public MyOrderPasEventVoBean(ims.ocrr.vo.MyOrderPasEventVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.eventdatetime = vo.getEventDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEventDateTime().getBean();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.MedicLiteVoBean)vo.getConsultant().getBean();
		this.location = vo.getLocation() == null ? null : (ims.core.vo.beans.LocShortVoBean)vo.getLocation().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.MyOrderPasEventVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.eventdatetime = vo.getEventDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEventDateTime().getBean();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.MedicLiteVoBean)vo.getConsultant().getBean(map);
		this.location = vo.getLocation() == null ? null : (ims.core.vo.beans.LocShortVoBean)vo.getLocation().getBean(map);
	}

	public ims.ocrr.vo.MyOrderPasEventVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.MyOrderPasEventVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.MyOrderPasEventVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.MyOrderPasEventVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.MyOrderPasEventVo();
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
	public ims.framework.utils.beans.DateTimeBean getEventDateTime()
	{
		return this.eventdatetime;
	}
	public void setEventDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.eventdatetime = value;
	}
	public ims.core.vo.beans.MedicLiteVoBean getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.core.vo.beans.MedicLiteVoBean value)
	{
		this.consultant = value;
	}
	public ims.core.vo.beans.LocShortVoBean getLocation()
	{
		return this.location;
	}
	public void setLocation(ims.core.vo.beans.LocShortVoBean value)
	{
		this.location = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateTimeBean eventdatetime;
	private ims.core.vo.beans.MedicLiteVoBean consultant;
	private ims.core.vo.beans.LocShortVoBean location;
}