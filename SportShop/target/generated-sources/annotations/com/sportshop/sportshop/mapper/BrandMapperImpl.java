package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.response.BrandResponse;
import com.sportshop.sportshop.entity.BrandEntity;
import com.sportshop.sportshop.entity.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-17T14:54:06+0700",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class BrandMapperImpl implements BrandMapper {

    @Override
    public BrandResponse toBrandResponse(BrandEntity brandEntity) {
        if ( brandEntity == null ) {
            return null;
        }

        BrandResponse.BrandResponseBuilder brandResponse = BrandResponse.builder();

        brandResponse.id( brandEntity.getId() );
        brandResponse.name( brandEntity.getName() );
        brandResponse.image( brandEntity.getImage() );
        List<ProductEntity> list = brandEntity.getProducts();
        if ( list != null ) {
            brandResponse.products( new ArrayList<ProductEntity>( list ) );
        }

        return brandResponse.build();
    }
}
