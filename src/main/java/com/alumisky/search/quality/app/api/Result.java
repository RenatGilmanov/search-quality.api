/*
 * Copyright 2009-2018 AlumiSky (http://alumisky.net). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.alumisky.search.quality.app.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Implements a <tt>result</tt> provided by the {@link Connector} implementation.
 */
public class Result {
    public static final Result EMPTY = new Result();
    
    private String title;
    private String image;
    private String description;
    private String type;
    private String link;

    private Verdict verdict = Verdict.UNDEFINED;
    private List<ValidationResult> messages = new ArrayList();
    
    /**
     * 
     */
    public Result() {
        title = "";
        type = "";
        image = "";
        description = "";
        link = "";
    }

    /**
     * 
     * @param title
     * @param type 
     */
    public Result(String title, String type) {
        this(title, "", type);
    }        
    
    /**
     * 
     * @param title
     * @param description
     * @param type 
     */
    public Result(String title, String description, String type) {
        this.title = title;
        this.description = description;
        this.type = type;
    }

    /**
     *
     * @param title
     * @param image
     * @param link
     * @param description
     * @param type
     */
    public Result(String title, String image, String link, String description, String type) {
        this.title = title;
        this.image = image;
        this.link = link;
        this.description = description;
        this.type = type;
    }
    
    /**
     * Returns the product title.
     * 
     * @return title of the product
     */

    public String getTitle() {
        return title;
    }
    
    /**
     * Returns the <tt>Result</tt> description.
     * 
     * @return the description, associated with the result 
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
            
    /**
     * Returns type of the <tt>Result</tt>.
     * 
     * @return type of the result
     */
    public String getType() {
        return type;
    }    

    /**
     * 
     * @param verdict 
     */
    public void setVerdict(Verdict verdict) {
        this.verdict = verdict;
    }

    /**
     * Returns the {@link Verdict}, associated with the result.
     * 
     * @return result verdict
     */
    public Verdict getVerdict() {
        return verdict;
    }
    
    public void addMessage(ValidationResult message) {
        messages.add(message);
    }
    
    public Iterator<ValidationResult> getMessages() {
        return messages.iterator();
    }

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return title;
    }
}
