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

public class SecurityLevelAndServiceCheckVoBean extends ims.vo.ValueObjectBean
{
	public SecurityLevelAndServiceCheckVoBean()
	{
	}
	public SecurityLevelAndServiceCheckVoBean(ims.ocrr.vo.SecurityLevelAndServiceCheckVo vo)
	{
		this.securitylevel = vo.getSecurityLevel() == null ? null : (ims.ocrr.vo.beans.SecurityLevelConfigVoBean)vo.getSecurityLevel().getBean();
		this.service = vo.getService() == null ? null : new ims.vo.RefVoBean(vo.getService().getBoId(), vo.getService().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.SecurityLevelAndServiceCheckVo vo)
	{
		this.securitylevel = vo.getSecurityLevel() == null ? null : (ims.ocrr.vo.beans.SecurityLevelConfigVoBean)vo.getSecurityLevel().getBean(map);
		this.service = vo.getService() == null ? null : new ims.vo.RefVoBean(vo.getService().getBoId(), vo.getService().getBoVersion());
	}

	public ims.ocrr.vo.SecurityLevelAndServiceCheckVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.SecurityLevelAndServiceCheckVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.SecurityLevelAndServiceCheckVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.SecurityLevelAndServiceCheckVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.SecurityLevelAndServiceCheckVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.ocrr.vo.beans.SecurityLevelConfigVoBean getSecurityLevel()
	{
		return this.securitylevel;
	}
	public void setSecurityLevel(ims.ocrr.vo.beans.SecurityLevelConfigVoBean value)
	{
		this.securitylevel = value;
	}
	public ims.vo.RefVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.vo.RefVoBean value)
	{
		this.service = value;
	}

	private ims.ocrr.vo.beans.SecurityLevelConfigVoBean securitylevel;
	private ims.vo.RefVoBean service;
}
