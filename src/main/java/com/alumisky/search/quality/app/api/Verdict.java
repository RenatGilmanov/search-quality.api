/*
 * Copyright 2009-2018 AlumiSky (http://alumisky.net). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.alumisky.search.quality.app.api;

/**
 * Defines exact verdicts {@link Validator} can provide for a 
 * specific result.
 */
public enum Verdict {

    /**
     * Relevant: the product ranking is completely relevant.
     *
     * This is the best verdict validator can give, and means that the result is
     * exactly right.
     */
    RELEVANT,
    /**
     * Near: The product ranking is not a perfect match, but it is clearly
     * reasonable for it to be ranked highly.
     *
     * No one would be surprised that the search query brought back such a
     * result.
     */
    NEAR,
    /**
     * Misplaced: It is obvious why the search engine returned the result, but
     * it clearly shouldn't be ranked highly.
     *
     * Basically, right keyword, wrong idea.
     */
    MISPLACED,
    /**
     * Irrelevant: The result has no apparent relationship to the customer’s
     * search.
     *
     * A customer could reasonably conclude that the search engine is off its
     * rocker.
     */
    IRRELEVANT,
    
    /**
     * Undefined: for some reason the result is undefined and can not be validated.
     * 
     * This is internal type of the {@link Verdict}.
     */
    UNDEFINED
}
