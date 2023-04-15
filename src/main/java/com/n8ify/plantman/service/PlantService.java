package com.n8ify.plantman.service;

import com.n8ify.plantman.model.rest.request.BaseRequest;
import com.n8ify.plantman.model.rest.request.body.CreatePlantRequestBody;
import com.n8ify.plantman.model.rest.response.BaseResponse;
import com.n8ify.plantman.model.rest.response.body.CreatePlantResponseBody;

public interface PlantService {

    BaseResponse<CreatePlantResponseBody> register(BaseRequest<CreatePlantRequestBody> request);

}
