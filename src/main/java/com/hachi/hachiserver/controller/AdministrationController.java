package com.hachi.hachiserver.controller;

import com.hachi.hachiserver.service.AdministrationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/administrations")
public class AdministrationController {

    private final AdministrationService administrationService;
}
