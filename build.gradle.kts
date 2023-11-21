import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("net.minecraftforge.gradle") version "[6.0.14,6.2)"
}

group = "hummel"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

minecraft {
	mappings("official", "1.19.2")
	runs {
		create("client") {
			workingDirectory(project.file("run"))
			property("forge.logging.markers", "REGISTRIES")
		}
	}
}

dependencies {
	minecraft("net.minecraftforge:forge:1.19.2-43.3.5")
}

tasks {
	jar {
		finalizedBy("reobfJar")
	}
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}