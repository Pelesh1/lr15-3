package com.example.lr153.service;

import com.example.lr153.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService {
    @Override
    public Response modify(Response response){
        response.setErrorMessage("Что-то случилось");
        return response;
    }
}
