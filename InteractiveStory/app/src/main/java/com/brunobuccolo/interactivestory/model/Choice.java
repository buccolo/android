package com.brunobuccolo.interactivestory.model;

/**
 * Created by Buccolo on 7/6/15.
 */
public class Choice {
    private String mText;
    private int mPage;

    public Choice(String text, int page) {
        setText(text);
        setPage(page);
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getPage() {
        return mPage;
    }

    public void setPage(int page) {
        mPage = page;
    }
}
