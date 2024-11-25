plugins {
    id("java")
    id("war")
}

group = "com.rockmap"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("jakarta.servlet:jakarta.servlet-api:6.1.0")  // Dipendenza per le servlet
    providedCompile("org.apache.tomcat:tomcat-servlet-api:11.0.1")  // Dipendenza di Tomcat
    testImplementation("junit:junit:4.13.2")
}

tasks.war {
    archiveFileName = "rockmap.war"  // Nome del WAR che sarà generato
    webAppDirectory = file("src/main/webapp")
}
