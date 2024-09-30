package com.springmicroservicesinaction.licenses.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Builder
@Entity
@Table(name = "licenses")
@NoArgsConstructor
@AllArgsConstructor
public class License{
    @Id
    @Column(name = "license_id",nullable = false)
    private Long id;
    @Column(name = "organization_id",nullable = false)
    private Long organizationId;
    @Column(name = "product_name",nullable = false)
    private String productName;
    @Column(name = "license_type",nullable = false)
    private String licenseType;
}
