package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.response.ImageResponse;
import com.sportshop.sportshop.entity.ImageEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-09T19:21:48+0700",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ImageMapperImpl implements ImageMapper {

    @Override
    public ImageResponse toImageResponse(ImageEntity imageEntity) {
        if ( imageEntity == null ) {
            return null;
        }

        ImageResponse.ImageResponseBuilder imageResponse = ImageResponse.builder();

        imageResponse.id( imageEntity.getId() );
        imageResponse.imageLink( imageEntity.getImageLink() );
        imageResponse.product( imageEntity.getProduct() );

        return imageResponse.build();
    }
}
