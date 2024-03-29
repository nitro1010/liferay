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

package com.liferay.util.jazzy;

import com.swabunga.spell.engine.Word;
import com.swabunga.spell.event.SpellCheckEvent;
import com.swabunga.spell.event.SpellCheckListener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class BasicSpellCheckListener implements SpellCheckListener {

	public BasicSpellCheckListener(String text) {
		_text = text;
		_textCharArray = text.toCharArray();
		_invalidWords = new ArrayList<InvalidWord>();
	}

	public void spellingError(SpellCheckEvent event) {
		List<String> suggestions = new ArrayList<String>();

		Iterator<Word> itr = event.getSuggestions().iterator();

		while (itr.hasNext()) {
			Word word = itr.next();

			suggestions.add(word.getWord());
		}

		int pos = event.getWordContextPosition();

		if (pos >= 0) {
			if ((pos == 0) ||
				((pos > 0) &&
				 //(_text.charAt(pos - 1) != '<') &&
				 (!_isInsideHtmlTag(pos)) &&
				 (_text.charAt(pos - 1) != '&') &&
				 (event.getInvalidWord().length() > 1))) {

				_invalidWords.add(
					new InvalidWord(
						event.getInvalidWord(), suggestions,
						event.getWordContext(), pos));
			}
		}
	}

	public List<InvalidWord> getInvalidWords() {
		return _invalidWords;
	}

	private boolean _isInsideHtmlTag(int pos) {
		boolean insideHtmlTag = false;

		for (int i = pos; i >= 0; i--) {
			if (_textCharArray[i] == '<') {
				insideHtmlTag = true;

				break;
			}
			else if (_textCharArray[i] == '>') {
				break;
			}
		}

		if (insideHtmlTag) {
			for (int i = pos; i < _textCharArray.length; i++) {
				if (_textCharArray[i] == '<') {
					insideHtmlTag = false;

					break;
				}
				else if (_textCharArray[i] == '>') {
					break;
				}
			}
		}

		return insideHtmlTag;
	}

	private String _text;
	private char[] _textCharArray;
	private List<InvalidWord> _invalidWords;

}