# dw-interfaces-log

Minimal project for https://github.com/dropwizard/dropwizard/issues/2244

### Expected Log
```
INFO  [2018-02-05 09:12:58,784] io.dropwizard.jersey.DropwizardResourceConfig: The following paths were found for the configured resources:

    GET     /extra (service.api.ExtraResource)
    GET     /hello (service.api.HelloResource)
    
```

### Actual Log
```
INFO  [2018-02-05 09:13:43,298] io.dropwizard.jersey.DropwizardResourceConfig: The following paths were found for the configured resources:

    GET     /extra (service.api.ExtraResource)

```
