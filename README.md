## Micronaut 3.1.3 Documentation

- [User Guide](https://docs.micronaut.io/3.1.3/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.1.3/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.1.3/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Handler

[AWS Lambda Handler](https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html)

Handler: example.micronaut.BookRequestHandler

## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)

## Deployment

    ./mvnw package -DskipTests
    cd dependencies-layer
    sam deploy --guided
    cd ..
    sam deploy --guided

## Trigger Lambda

From AWS Lambda Console run the lambda with the following payload.

    {
    "name": "my book"
    }
