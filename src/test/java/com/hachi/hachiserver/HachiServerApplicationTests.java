package com.hachi.hachiserver;

import com.hachi.hachiserver.repository.UserRepository;
import com.hachi.hachiserver.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class HachiServerApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void showUser(){
		log.info(userRepository.findByUsername("hung170598").toString());
	}

}
