package com.n8ify.plantman.service.impl;

import com.n8ify.plantman.enums.ResponseStatus;
import com.n8ify.plantman.model.entity.PlantDataEntity;
import com.n8ify.plantman.model.rest.request.BaseRequest;
import com.n8ify.plantman.model.rest.request.body.CreatePlantRequestBody;
import com.n8ify.plantman.model.rest.response.BaseResponse;
import com.n8ify.plantman.model.rest.response.body.CreatePlantResponseBody;
import com.n8ify.plantman.service.PlantService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlantServiceImpl extends AbstractPlantmanService implements PlantService {

    @Override
    @Transactional
    public BaseResponse<CreatePlantResponseBody> register(BaseRequest<CreatePlantRequestBody> request) {

        long startTimeMillis = System.currentTimeMillis();

        CreatePlantRequestBody body = request.getBody();
        PlantDataEntity entity = PlantDataEntity
                .builder()
                .plntName(body.getName())
                .plntRemark(body.getRemark())
                .plntPlantType(body.getPlantType())
                .plntGrowthDay(body.getGrowthDay())
                .plntTag(body.getTag())
                .plntAvailableToPlant(body.getAvailableToPlant())
                .build();
        entity = super.plantRepository.save(entity);

        super.logTimeUsage(startTimeMillis, "RegisterPlant", "Register plant success");

        return new BaseResponse<>(request.getRequestId(), ResponseStatus.SUCCESS, new CreatePlantResponseBody(entity.getPlntId(), entity.getPlntName()));
    }

}
