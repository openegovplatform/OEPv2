/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.core.dossiermgt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.dossiermgt.service.http.EbPartnerShipServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.http.EbPartnerShipServiceSoap
 * @generated
 */
public class EbPartnerShipSoap implements Serializable {
	public static EbPartnerShipSoap toSoapModel(EbPartnerShip model) {
		EbPartnerShipSoap soapModel = new EbPartnerShipSoap();

		soapModel.setEbPartnerShipId(model.getEbPartnerShipId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setName(model.getName());
		soapModel.setCpaId(model.getCpaId());
		soapModel.setService(model.getService());
		soapModel.setAction(model.getAction());
		soapModel.setInbound(model.getInbound());

		return soapModel;
	}

	public static EbPartnerShipSoap[] toSoapModels(EbPartnerShip[] models) {
		EbPartnerShipSoap[] soapModels = new EbPartnerShipSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EbPartnerShipSoap[][] toSoapModels(EbPartnerShip[][] models) {
		EbPartnerShipSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EbPartnerShipSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EbPartnerShipSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EbPartnerShipSoap[] toSoapModels(List<EbPartnerShip> models) {
		List<EbPartnerShipSoap> soapModels = new ArrayList<EbPartnerShipSoap>(models.size());

		for (EbPartnerShip model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EbPartnerShipSoap[soapModels.size()]);
	}

	public EbPartnerShipSoap() {
	}

	public long getPrimaryKey() {
		return _ebPartnerShipId;
	}

	public void setPrimaryKey(long pk) {
		setEbPartnerShipId(pk);
	}

	public long getEbPartnerShipId() {
		return _ebPartnerShipId;
	}

	public void setEbPartnerShipId(long ebPartnerShipId) {
		_ebPartnerShipId = ebPartnerShipId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCpaId() {
		return _cpaId;
	}

	public void setCpaId(String cpaId) {
		_cpaId = cpaId;
	}

	public String getService() {
		return _service;
	}

	public void setService(String service) {
		_service = service;
	}

	public String getAction() {
		return _action;
	}

	public void setAction(String action) {
		_action = action;
	}

	public int getInbound() {
		return _inbound;
	}

	public void setInbound(int inbound) {
		_inbound = inbound;
	}

	private long _ebPartnerShipId;
	private long _companyId;
	private Date _createDate;
	private String _name;
	private String _cpaId;
	private String _service;
	private String _action;
	private int _inbound;
}