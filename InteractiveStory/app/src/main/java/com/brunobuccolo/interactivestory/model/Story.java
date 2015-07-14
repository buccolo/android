package com.brunobuccolo.interactivestory.model;

import com.brunobuccolo.interactivestory.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Buccolo on 7/12/15.
 */
public class Story {
    public static List<Page> mPages = new ArrayList<Page>() {{
        Page page0 = new Page("On your return trip.", R.drawable.page0);
        page0.setChoice1(new Choice("Stop and Investigate", 1));
        page0.setChoice2(new Choice("Continue Home Earth", 2));

        Page page1 = new Page("Your deftly land your ship.", R.drawable.page1);
        page1.setChoice1(new Choice("Explore the Cave", 3));
        page1.setChoice2(new Choice("Explore the Rover", 4));

        Page page2 = new Page("You continue your course.", R.drawable.page2);
        page2.setChoice1(new Choice("Head back to Mars", 4));
        page2.setChoice2(new Choice("Continue Home Earth", 6));

        Page page3 = new Page("Your EVA suit.", R.drawable.page3);
        page3.setChoice1(new Choice("Continue towards the faint light", 5));
        page3.setChoice2(new Choice("Refill at ship and explore the rover", 4));

        Page page4 = new Page("The rover is covered.", R.drawable.page4);
        page4.setChoice1(new Choice("Explore the coordinates", 5));
        page4.setChoice2(new Choice("Return to Earth", 6));

        Page page5 = new Page("After a long walk.", R.drawable.page5);
        page5.setChoice2(new Choice("Play Again", 0));

        Page page6 = new Page("You arive home at Earth", R.drawable.page0);
        page6.setChoice2(new Choice("Play Again", 0));

        add(page0);
        add(page1);
        add(page2);
        add(page3);
        add(page4);
        add(page5);
        add(page6);
    }};

    public static Page getPage(int pageIndex) {
        return mPages.get(pageIndex);
    }
}
