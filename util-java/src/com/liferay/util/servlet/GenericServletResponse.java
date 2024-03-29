/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.util.servlet;

import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.util.UnsyncPrintWriterPool;

import java.io.PrintWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * @author Brian Wing Shun Chan
 */
public class GenericServletResponse extends HttpServletResponseWrapper {

	public GenericServletResponse(HttpServletResponse response) {
		super(response);

		_ubaos = new UnsyncByteArrayOutputStream();
	}

	public byte[] getData() {
		return _ubaos.toByteArray();
	}

	public int getContentLength() {
		return _contentLength;
	}

	@Override
	public void setContentLength(int length) {
		super.setContentLength(length);

		_contentLength = length;
	}

	@Override
	public String getContentType() {
		return _contentType;
	}

	@Override
	public void setContentType(String type) {
		super.setContentType(type);

		_contentType = type;
	}

	@Override
	public ServletOutputStream getOutputStream() {
		return new GenericServletOutputStream(_ubaos);
	}

	@Override
	public PrintWriter getWriter() {
		return UnsyncPrintWriterPool.borrow(getOutputStream());
	}

	private int _contentLength;
	private String _contentType;
	private UnsyncByteArrayOutputStream _ubaos;

}