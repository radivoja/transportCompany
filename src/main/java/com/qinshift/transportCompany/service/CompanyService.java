package com.qinshift.transportCompany.service;

import com.qinshift.transportCompany.dto.Company;

import java.util.List;
import java.util.Optional;


public interface CompanyService {
    List<Company>  listAll();
    Optional<Company> createCompany(Company company);
    Optional<Company> getCompanyById(Integer id);
    Optional<Company> deleteCompany(Integer id);
    Optional<Company> updateCompany(Integer id, Company entity);
}
