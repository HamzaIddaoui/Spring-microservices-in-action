package com.springmicroservicesinaction.licenses.controller;

import com.springmicroservicesinaction.licenses.models.License;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/oraginazations/{oragnizationId}/licenses")
public class LicenceServiceController {
    @GetMapping(value = "/{licenseId}")
    public License getLicenses(
            @PathVariable String oragnizationId,
            @PathVariable String licenseId){
        return License.builder()
                .id(Long.valueOf(licenseId))
                .organizationId(Long.valueOf(oragnizationId))
                .productName("Teleco")
                .licenseType("Seat")
                .build();
    }
}
