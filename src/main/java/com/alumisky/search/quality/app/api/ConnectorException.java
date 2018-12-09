/*
 * Copyright 2009-2018 AlumiSky (http://alumisky.net). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.alumisky.search.quality.app.api;

/**
 * Checked exception, thrown when any attempt to fetch search result fails.
 */
public class ConnectorException extends Exception {
    
    /**
     * Constructs an instance of this class with the specified message.
     * 
     * @param message the detail message
     */
    public ConnectorException(String message) {
        super(message);
    }

    /**
     * Constructs an instance of this class with the specified message and the cause.
     * @param message the detail message
     * @param cause the cause
     */    
    public ConnectorException(String message, Throwable cause) {
        super(message, cause);
    }
}
