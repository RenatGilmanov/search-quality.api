/*
 * Copyright 2009-2018 AlumiSky (http://alumisky.net). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.alumisky.search.quality.app.api;

/**
 * Defines a high-level contract for {@link ResultSet} validating logic.
 */
public interface Validator {
    
    /**
     * Returns a unique string for this specific validation logic. 
     * 
     * @return validator type
     */
    String getType();
    
    /**
     *  Validates the {@link ResultSet} returned for the query.
     * 
     * @param query the query {@link ResultSet} is returned for
     * @param results search results for the query
     */
    void validate(String[] query, ResultSet results);
}