package com.sportshop.sportshop.mapper;

import com.sportshop.sportshop.dto.request.CategoryRequest;
import com.sportshop.sportshop.dto.response.CategoryResponse;
import com.sportshop.sportshop.entity.CategoryEntity;
import com.sportshop.sportshop.entity.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-09T19:21:48+0700",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryResponse toCategoryResponse(CategoryEntity category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse.CategoryResponseBuilder categoryResponse = CategoryResponse.builder();

        categoryResponse.id( category.getId() );
        categoryResponse.name( category.getName() );
        categoryResponse.image( category.getImage() );
        List<ProductEntity> list = category.getProducts();
        if ( list != null ) {
            categoryResponse.products( new ArrayList<ProductEntity>( list ) );
        }

        return categoryResponse.build();
    }

    @Override
    public CategoryEntity toEntity(CategoryRequest categoryRequest) {
        if ( categoryRequest == null ) {
            return null;
        }

        CategoryEntity.CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.name( categoryRequest.getName() );

        return categoryEntity.build();
    }
}
