package dev.rost.autoconfigurationpackagesandbox;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.ActiveProfiles;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@SpringBootTest
class AppTests {

	@Autowired Collection<JpaRepository<?, ?>> jpaRepositories;

	@Test
	void contextLoads() {
		assertThat(jpaRepositories).hasSize(3);
	}
}
