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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.70 build 3467.22451)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.rules.domain.impl;

import ims.admin.vo.BusinessRuleVo;
import ims.admin.vo.domain.BusinessRuleVoAssembler;
import ims.core.admin.domain.objects.BusinessRule;
import ims.domain.DomainFactory;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.rules.domain.base.impl.BaseRulesEditImpl;

public class RulesEditImpl extends BaseRulesEditImpl
{

	private static final long serialVersionUID = 1L;
	
	public BusinessRuleVo save(BusinessRuleVo rule) throws ims.domain.exceptions.StaleObjectException, UnqViolationUncheckedException
	{
		if(rule == null)
			throw new CodingRuntimeException("BusinessRuleVo is null");		
		
		DomainFactory factory = getDomainFactory();		
		BusinessRule dom = BusinessRuleVoAssembler.extractBusinessRule(factory,rule);		
		factory.save(dom);		
		return BusinessRuleVoAssembler.create(dom);					
	}		
}