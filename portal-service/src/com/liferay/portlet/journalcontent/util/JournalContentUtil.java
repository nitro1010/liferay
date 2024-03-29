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

package com.liferay.portlet.journalcontent.util;

import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.journal.model.JournalArticleDisplay;

/**
 * @author Raymond Augé
 */
public class JournalContentUtil {

	public static void clearCache() {
		getJournalContent().clearCache();
	}

	public static void clearCache(
		long groupId, String articleId, String templateId) {

		getJournalContent().clearCache(groupId, articleId, templateId);
	}

	public static String getContent(
		long groupId, String articleId, String viewMode, String languageId,
		String xmlRequest) {

		return getJournalContent().getContent(
			groupId, articleId, viewMode, languageId, xmlRequest);
	}

	public static String getContent(
		long groupId, String articleId, String templateId, String viewMode,
		String languageId, String xmlRequest) {

		return getJournalContent().getContent(
			groupId, articleId, templateId, viewMode, languageId, xmlRequest);
	}

	public static String getContent(
		long groupId, String articleId, String templateId, String viewMode,
		String languageId, ThemeDisplay themeDisplay) {

		return getJournalContent().getContent(
			groupId, articleId, templateId, viewMode, languageId, themeDisplay);
	}

	public static String getContent(
		long groupId, String articleId, String templateId, String viewMode,
		String languageId, ThemeDisplay themeDisplay, String xmlRequest) {

		return getJournalContent().getContent(
			groupId, articleId, templateId, viewMode, languageId, themeDisplay);
	}

	public static String getContent(
		long groupId, String articleId, String viewMode, String languageId,
		ThemeDisplay themeDisplay) {

		return getJournalContent().getContent(
			groupId, articleId, viewMode, languageId, themeDisplay);
	}

	public static JournalArticleDisplay getDisplay(
			long groupId, String articleId, double version, String templateId,
			String viewMode, String languageId, ThemeDisplay themeDisplay,
			int page, String xmlRequest) {

		return getJournalContent().getDisplay(
			groupId, articleId, version, templateId, viewMode, languageId,
			themeDisplay, page, xmlRequest);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String viewMode, String languageId,
		String xmlRequest) {

		return getJournalContent().getDisplay(
			groupId, articleId, viewMode, languageId, xmlRequest);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String templateId, String viewMode,
		String languageId, String xmlRequest) {

		return getJournalContent().getDisplay(
			groupId, articleId, templateId, viewMode, languageId, xmlRequest);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String templateId, String viewMode,
		String languageId, ThemeDisplay themeDisplay) {

		return getJournalContent().getDisplay(
			groupId, articleId, templateId, viewMode, languageId, themeDisplay);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String templateId, String viewMode,
		String languageId, ThemeDisplay themeDisplay, int page,
		String xmlRequest) {

		return getJournalContent().getDisplay(
			groupId, articleId, templateId, viewMode, languageId, themeDisplay,
			page, xmlRequest);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String viewMode, String languageId,
		ThemeDisplay themeDisplay) {

		return getJournalContent().getDisplay(
			groupId, articleId, viewMode, languageId, themeDisplay);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String viewMode, String languageId,
		ThemeDisplay themeDisplay, int page) {

		return getJournalContent().getDisplay(
			groupId, articleId, viewMode, languageId, themeDisplay, page);
	}

	public static JournalContent getJournalContent() {
		return _journalContent;
	}

	public void setJournalContent(JournalContent journalContent) {
		_journalContent = journalContent;
	}

	private static JournalContent _journalContent;

}