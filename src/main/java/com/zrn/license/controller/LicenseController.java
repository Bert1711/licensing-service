package com.zrn.license.controller;

import com.zrn.license.model.License;
import com.zrn.license.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zaroyan
 */
@RestController
@RequestMapping(value = "v1/organization/{organizationId}/license")
public class LicenseController {
    @Autowired
    private LicenseService licenseService;

    @GetMapping(value= "/{licenseId}")
    public ResponseEntity<License> getLicense(
            @PathVariable("organizationId") String organizationId,
            @PathVariable("licenseId") String licenseId) {
        License license = licenseService.getLicense(licenseId,organizationId);
        return ResponseEntity.ok(license);
    }
}
