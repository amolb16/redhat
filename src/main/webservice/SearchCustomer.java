package webservice;

import java.util.List;
import java.util.Map;

public interface SearchCustomer {
    List<Customer> searchCustomers(List<SearchCriteria> searchCriteria, String sortField, String sortOrder, int maxNumberOfRecords);
}
