package com.ing.pensions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controller to manage pension file captures.
 *
 * @author Daniel Diaz
 *
 */
@RequestMapping(IFileController.Paths.RESOURCE)
@Api(value = "APi rest for file capture", tags = { "File controller" })
public interface IFileController {

    /** API rest paths. */
    public static class Paths {

        private Paths() {
        }

        /** APi rest defined mapping. */
        public static final String RESOURCE = "/files";
        /** Process file path */
        public static final String PROCESS  = "/process";
    }

    /**
     * Captures, validates, and stores a particular pension file, based on the
     * filename received.
     *
     * @param filename
     *            - Name of the file to capture
     * @return - ResponseEntity with the corresponding HTTP status.
     */
    @PutMapping(IFileController.Paths.PROCESS)
    @ApiOperation(value = "Rest service for file capture", notes = "Captures a new File, acording to it´s name", httpMethod = "PUT", responseContainer = "ResponseEntity")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK") })
    ResponseEntity<Void> fileCapture(
            @ApiParam(name = "filename", value = "Name of the file to be captures") @RequestParam String filename);

}
