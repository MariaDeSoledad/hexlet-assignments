package exercise.mapper;

import exercise.dto.CarDTO;
import exercise.dto.CarCreateDTO;
import exercise.dto.CarUpdateDTO;
import exercise.model.Car;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = { JsonNullableMapper.class })
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDTO map(Car car);

    Car map(CarCreateDTO dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void update(CarUpdateDTO dto, @MappingTarget Car car);
}