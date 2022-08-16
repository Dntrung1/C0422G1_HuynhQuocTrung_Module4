package com.example.service.impl;

import com.example.service.IConversionService;
import org.springframework.stereotype.Service;

@Service
public class ConversionService implements IConversionService {
    @Override
    public double conversion(String usd, String rate) {
        return (Double.parseDouble(usd) * Double.parseDouble(rate));
    }

}
