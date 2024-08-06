package org.ghosttrio.adaptor;

public class SearchServiceTolrAdaptor implements SearchService {

    private TolrClient tolrClinet = new TolrClient();

    public SearchResult search(String keyword) {

        TolrQuery tolrQuery = new TolrQuery(keyword);
        QueryResponse response = tolrClinet.query(tolrQuery);
        return convertToResult(response);
    }

    private SearchResult convertToResult(QueryResponse response) {
        return new SearchResult();
    }

}
