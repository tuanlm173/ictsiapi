package com.justanalytics.response;

import java.util.List;

public class CollectionResponse<T> {
    private List<T> results;

    public CollectionResponse() {}

    public CollectionResponse(List<T> results) {
        this.results = results;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

}