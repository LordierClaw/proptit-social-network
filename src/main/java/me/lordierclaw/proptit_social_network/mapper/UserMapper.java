package me.lordierclaw.proptit_social_network.mapper;

import me.lordierclaw.proptit_social_network.dto.UserBasicInfoDto;
import me.lordierclaw.proptit_social_network.dto.UserDetailedInfoDto;
import me.lordierclaw.proptit_social_network.dto.UserOnlineInfoDto;
import me.lordierclaw.proptit_social_network.entity.UserEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface UserMapper {

    UserEntity toEntity(UserBasicInfoDto userBasicInfoDto);

    UserEntity toEntity(UserDetailedInfoDto userDetailedInfoDto);

    UserEntity toEntity(UserOnlineInfoDto userOnlineInfoDto);

    UserBasicInfoDto toUserBasicInfoDto(UserEntity userEntity);

    UserDetailedInfoDto toUserDetailedInfoDto(UserEntity userEntity);

    UserOnlineInfoDto toUserOnlineInfoDto(UserEntity userEntity);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    UserEntity partialUpdate(UserBasicInfoDto userBasicInfoDto, @MappingTarget UserEntity userEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    UserEntity partialUpdate(UserDetailedInfoDto userDetailedInfoDto, @MappingTarget UserEntity userEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    UserEntity partialUpdate(UserOnlineInfoDto userOnlineInfoDto, @MappingTarget UserEntity userEntity);
}
