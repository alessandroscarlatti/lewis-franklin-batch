package com.scarlatti.integration

import com.scarlatti.App
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = [App])
class AppTest extends Specification {

	@Test
	"context can load"() {
		when:
			println "loaded context."
		then:
			notThrown(Exception)
	}

}
