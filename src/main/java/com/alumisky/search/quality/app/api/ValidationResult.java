/*
 * Copyright 2009-2018 AlumiSky (http://alumisky.net). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.alumisky.search.quality.app.api;

/**
 * Implements a <tt>ValidationResult</tt> provided for the specific {@see Result} 
 * by any implementation of {@see Validator} contract.
 */
public class ValidationResult {
    
    private final String type;
    private final String message;
    private final Verdict verdict;

    /**
     * Constructs an instance of this class with the specified type, verdict and message.
     * 
     * @param type validation type
     * @param verdict the {@see Verdict}
     * @param message the detail message
     */    
    public ValidationResult(String type, Verdict verdict, String message) {
        this.type = type;
        this.message = message;
        this.verdict = verdict;
    }

    public String getType() {
        return type;
    }

    public Verdict getVerdict() {
        return verdict;
    }

    public String getMessage() {
        return message;
    }
}
