/*
 * Copyright 2009-2018 AlumiSky (http://alumisky.net). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.alumisky.search.quality.app.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implements a set of {@link Result}.
 */
public class ResultSet {

    private double score;
    private List<Result> results = new ArrayList();

    /**
     * 
     * @param results 
     */
    public ResultSet(List<Result> results) {
        this.results = results;
    }
    
    /**
     * 
     * @param r 
     */
    public void addResult(Result r) {
        results.add(r);
    }    
    
    /**
     * 
     * @param results 
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     * 
     * @return 
     */
    public double getScore() {
        return score;
    }

    /**
     * 
     * @param score 
     */
    public void setScore(double score) {
        this.score = score;
    }        
    
    /**
     * 
     * @return 
     */
    public List<Result> getResults() {
        return Collections.unmodifiableList(results);
    }
    
    /**
     * 
     * @param index
     * @return 
     */
    public Result getResult(int index) {
        return results.get(index);
    }
    
    /**
     * 
     * @return 
     */
    public int size() {
        return results.size();
    }
}
