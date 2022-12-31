package com.example.demostruct.mapper;

import com.example.demostruct.dto.ItemDTO;
import com.example.demostruct.dto.ProductDTO;
import com.example.demostruct.model.Item;
import com.example.demostruct.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.UUID;

@Mapper(imports = UUID.class)
public interface ProductMapper {

    @Mapping(source = "desc", target = "description")
    @Mapping(target = "itemId", expression = "java(UUID.randomUUID().toString())")
    @Mapping(source = "items", target = "itemsList")
   // @Mapping(source = "currency.name", target = "itemsList.currencyName")
    ProductDTO toDTO(Product product);
    //@Mapping(source = "description", target = "desc")
    @InheritInverseConfiguration
    Product toEntity(ProductDTO productDTO);
   // @Mapping(source = "items", target = "itemsList")
   // List<ItemDTO> listItemDTO(List<Item> list);
}
