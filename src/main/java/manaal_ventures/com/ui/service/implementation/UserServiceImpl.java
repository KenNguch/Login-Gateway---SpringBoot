package manaal_ventures.com.ui.service.implementation;

import manaal_ventures.com.entity.UserEntity;
import manaal_ventures.com.repository.UserRepository;
import manaal_ventures.com.shared.dto.UserDto;
import manaal_ventures.com.ui.service.interfaces.UserInterface;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserInterface {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {
        UserEntity userEntity = new UserEntity();
        // copy properties from userDto to userEntity
        BeanUtils.copyProperties(user, userEntity);
        userEntity.setEncryptedPassword("test");
        userEntity.setUserId("test");

        UserEntity storedUserDetails = userRepository.save(userEntity);

        UserDto returnValue = new UserDto();
        // copy properties from userEntity to userDto
        BeanUtils.copyProperties(storedUserDetails, returnValue);


        return returnValue;
    }
}
