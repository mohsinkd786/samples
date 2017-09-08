package com.sample.design.patterns.structural.composite;

import java.util.List;

public interface HtmlTag {

	public String getTagName();

	public void setStartTag(String tag);

	public void setEndTag(String tag);

	public default void setTagBody(String tagBody) {
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}

	public default void addChildTag(HtmlTag htmlTag) {
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}

	public default void removeChildTag(HtmlTag htmlTag) {
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}

	public default List<HtmlTag> getChildren() {
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}

	public void generateHtml();

}