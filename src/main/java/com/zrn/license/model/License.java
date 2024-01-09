package com.zrn.license.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Zaroyan
 */
@Getter
@Setter
@ToString
public class License {
    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
