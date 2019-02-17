/*
 * Copyright 2009-2018 AlumiSky (http://alumisky.net). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.alumisky.search.quality.app.api;

/**
 * Defines a high-level contract for the <tt>ScoreFunction</tt>.
 * 
 * The function is used to measure {@link ResultSet} relevance. It is expected 
 * to get 0.0 for totally non relevant results and 1.0 for relevant.
 */
public interface ScoreFunction {
    
    /**
     * Measures {@link ResultSet} relevancy and returns calculated score.
     * 
     * @param set result set to be measures
     * @return score for the specified result set
     */
    double score(ResultSet set);

    /**
     * Returns a unique string for this specific score function.
     *
     * @return score function type
     */
    String getType();
}
