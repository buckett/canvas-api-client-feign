# canvas-api-client-feign

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Generated

Most of this project's source code is generated from the swagger source. To re-generate the files run:

```shell
./build-client canvas-swagger2.json
```

This uses templates in `feign-template` to build the files. These were copied from [swagger-codegen](https://github.com/swagger-api/swagger-codegen) and then patched to support the pagination through the link header that we need for the canvas API.

The first generate of this project used swagger-codegen, however it appears that the community has split and more up to date 
versions of the codebase are in [openapi-generator](https://github.com/OpenAPITools/openapi-generator).

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>uk.ac.ox.it</groupId>
    <artifactId>canvas-api-client-feign</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>

```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



