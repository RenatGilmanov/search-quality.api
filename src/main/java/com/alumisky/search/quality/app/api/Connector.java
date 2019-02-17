/*
 * Copyright 2009-2018 AlumiSky (http://alumisky.net). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.alumisky.search.quality.app.api;

import java.util.List;

/**
 * Defines a high-level <tt>Connector</tt> contract.
 * 
 * Basically, it is all about fetching results from any external source 
 * and converting fetched data into {@link Result} representation.
 */
public interface Connector {
    
    /**
     * Returns unique <tt>Connector</tt> name.
     * 
     * @return connector name
     */
    String getName();
    
    /**
     * Returns search results for a given query.
     * 
     * @param query search query
     * @return results, provided by a specific search service 
     * @throws ConnectorException in case of any problem
     */
    List<Result> search(String[] query) throws ConnectorException;
}
