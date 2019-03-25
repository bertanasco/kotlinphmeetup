# kotlinforbackend
serverless using kotlin 

## Install severless

1. Install serverless
 ```npm install -g serverless```

2. Create function
 ```serverless create —-template aws-kotlin-jvm-gradle --path FUNCTION_NAME```

3. Configure  aws credentials
 ```serverless config credentials --provider aws --key YOUR_KEY --secret YOUR_SECRET ```

4. Deploy
```./gradlew deploy ```

