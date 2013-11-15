package com.itkweb.menotte.menotte_rs.spring_config;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(2)
public class MenotteSecurityInitializer
extends AbstractSecurityWebApplicationInitializer {
}
