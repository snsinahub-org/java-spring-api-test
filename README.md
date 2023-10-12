# A project based on spring-boot for api test automation via postman and newman

In this example, I created a collection and exported as JSON file...
then run `newman` command in GitHub actions
`newman run test/postman/students/students.json --reporters htmlextra,cli,allure --reporter-htmlextra-report sample.html >> $GITHUB_STEP_SUMMARY`

## Installations
```BASH
npm install -g newman
npm install -g newman-reporter-htmlextra
npm install -g newman-reporter-allure
npm install -g allure

```

## Other tools
- Postman. Includes free and paid versions. Accessible help and tutorials.
- Katalon. Accessible to all levels of expertise. Has minimum maintenance requirements and supports integrations with CI/CD and DevOps tools.
- Apigee. Designs, secures, analyzes, scales and tests APIs. Part of the Google Cloud offering.
- SoapUI. API testing tool for both REST- and SOAP-based APIs.
  - [Docker](https://www.soapui.org/docs/test-automation/running-in-docker/)
- JMeter. Offers open source, cross-platform testing based on Java. Apache JMeter works on any platform that has a Java VM.
- ReadyAPI. Offers the same essential features as SoapUI but is a new offering.
