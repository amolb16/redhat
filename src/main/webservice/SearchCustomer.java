package webservice;

import java.util.List;

public interface SearchCustomer {
    List<Customer> searchCustomers(List<SearchCriteria> searchCriteria, String sortField, String sortOrder, int maxNumberOfRecords);
}
