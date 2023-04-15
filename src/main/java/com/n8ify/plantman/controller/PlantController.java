package com.n8ify.plantman.controller;

import com.n8ify.plantman.constant.EndpointConstant;
import com.n8ify.plantman.model.rest.request.BaseRequest;
import com.n8ify.plantman.model.rest.request.body.CreatePlantRequestBody;
import com.n8ify.plantman.model.rest.response.BaseResponse;
import com.n8ify.plantman.model.rest.response.body.CreatePlantResponseBody;
import com.n8ify.plantman.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.n8ify.plantman.constant.EndpointConstant.PLANT_ROOT_ENDPOINT;

@RestController
@RequestMapping(value = PLANT_ROOT_ENDPOINT)
public class PlantController extends AbstractController {

    @Autowired
    private PlantService plantService;

    @PostMapping(value = EndpointConstant.PLANT_REGISTER_ENDPOINT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse<CreatePlantResponseBody> register(@Valid @RequestBody BaseRequest<CreatePlantRequestBody> request) {
        return plantService.register(request);
    }

}
