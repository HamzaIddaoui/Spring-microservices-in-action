package com.springmicroservicesinaction.licenses.service;

import com.springmicroservicesinaction.licenses.models.License;
import com.springmicroservicesinaction.licenses.repository.LicenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseService {
    private final LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public License getLicense(Long organizationId, Long licenseId){
        return licenseRepository.findByOrganizationIdAndId(organizationId, licenseId);
    }

    public List<License> getLicensesByOrg(Long organizationId){
        return licenseRepository.findByOrganizationId(organizationId);
    }
}
