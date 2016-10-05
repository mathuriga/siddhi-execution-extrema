package org.wso2.extension.siddhi.window.minbymaxby.TimeWindow;

/**
 * Output the max event corresponding to a given attribute in a Time Window
 */

public class MaxByTimeWindowProcessor extends MaxByMinByTimeWindowProcessor {
    public MaxByTimeWindowProcessor() {
        sortType = Constants.MAX_BY;
        windowType =Constants.MaxByTime;
    }
}
