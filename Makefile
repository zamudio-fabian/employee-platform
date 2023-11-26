run:
	@$(PWD)/gradlew bootRun --warning-mode all

build:
	@$(PWD)/gradlew clean build --warning-mode all

tests:
	@$(PWD)/gradlew test --warning-mode all

databasestart:
	@docker-compose -f "docker-compose-database.yml" up -d

databasestop:
	@docker-compose -f "docker-compose-database.yml" down