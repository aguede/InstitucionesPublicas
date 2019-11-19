package com.ing.pensions.boot.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ing.pensions.controller.IFileController;
import com.ing.pensions.controller.IRemittanceController;
import com.ing.pensions.controller.exception.ESTGSSPensionsControllerAdvice;
import com.ing.pensions.controller.impl.FileControllerImpl;
import com.ing.pensions.controller.impl.RemittanceControllerImpl;
import com.ing.pensions.repository.database.IRemittanceMapper;
import com.ing.pensions.service.IFileService;
import com.ing.pensions.service.IRemittanceService;
import com.ing.pensions.service.impl.FileServiceImpl;
import com.ing.pensions.service.impl.RemittanceServiceImpl;

/**
 * ESTGSS bean configuration.
 *
 * @author alejandro.guede
 *
 */
@Configuration
@MapperScan("com.ing.pensions.repository.database")
public class ESTGSSPensionsBeanConfiguration {

    /** ControllerAdvice bean definition. */
    @Bean
    public ESTGSSPensionsControllerAdvice institucionesPublicasErrorAdvice() {
        return new ESTGSSPensionsControllerAdvice();
    }

    /** Bean definition for remittanceController. */
    @Bean
    public IRemittanceController remittanceController(final IRemittanceService remittanceService) {
        return new RemittanceControllerImpl(remittanceService);
    }

    /** Bean definition for remittanceService. */
    @Bean
    public IRemittanceService remittanceService(final IRemittanceMapper remittanceMapper) {
        return new RemittanceServiceImpl(remittanceMapper);
    }

    /** Bean definition for fileController. */
    @Bean
    public IFileController fileController(final IFileService fileService) {
        return new FileControllerImpl(fileService);
    }

    /** Bean definition for fileService. */
    @Bean
    public IFileService fileService() {
        return new FileServiceImpl();
    }

}
