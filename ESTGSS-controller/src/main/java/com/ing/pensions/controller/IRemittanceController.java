package com.ing.pensions.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ing.pensions.bean.database.remittance.RemittanceBean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Remittances Rest API.
 *
 * @author alejandro.guede
 *
 */
@RequestMapping(IRemittanceController.Paths.RESOURCE)
@Api(value = "Remittances Rest API.")
public interface IRemittanceController {

    /** API rest paths. */
    public static class Paths {

        private Paths() {
        }

        /** Definition of API path. */
        public static final String RESOURCE = "/remittance";
    }

    /**
     * Inserts a bean into a database.
     *
     * @param remittanceBean
     *            the bean to insert.
     * @return 200 OK
     */
    @PutMapping()
    @ApiOperation(value = "Rest service for remittance inserts.", notes = "Inserts a new remittance.", httpMethod = "PUT", responseContainer = "ResponseEntity")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Response OK"),
                            @ApiResponse(code = 403, message = "Forbbiden") })
    ResponseEntity<Void> insertRemittance(
            @ApiParam(name = "remittanceBean", value = "Remittance data to insert.") @RequestBody RemittanceBean remittanceBean);

    /**
     * Obtains a list of beans which refeer to remittances.
     *
     * @return a list of remittances.
     */
    @GetMapping()
    @ApiOperation(value = "Rest service for get.", notes = "Inserts a new remittance.", httpMethod = "GET", responseContainer = "ResponseEntity")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Response OK"),
                            @ApiResponse(code = 403, message = "Forbbiden") })
    ResponseEntity<List<RemittanceBean>> getRemittances();

}
