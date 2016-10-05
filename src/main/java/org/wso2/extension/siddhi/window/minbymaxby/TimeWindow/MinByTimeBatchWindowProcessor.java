package org.wso2.extension.siddhi.window.minbymaxby.TimeWindow;

/**
 * Output the min event corresponding to a given attribute in a TimeBatch Window
 */
public class MinByTimeBatchWindowProcessor extends MaxByMinByTimeBatchWindowProcessor {
    public MinByTimeBatchWindowProcessor() {
        sortType = Constants.MIN_BY;
        windowType = Constants.MinByTimeBatch;
    }
}
