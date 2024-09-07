package com.springmicroservicesinaction.licenses.models;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class License{
    private Long id;
    private Long organizationId;
    private String productName;
    private String licenseType;
}
