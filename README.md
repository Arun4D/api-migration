# api-migration

## Apigee API Docs

````
https://apidocs.apigee.com/operations#api-products
````

## Kong

### Kong config validate

https://docs.konghq.com/deck/1.19.x/ used to validate dbless kong.yaml file before load to Kong api gateway


## Errors and Fixes

kong_json_schema.json download and when we use jsonschema2poja we will get duplicate config error. to fix that we need to remove _config section the file. 

````
Line number 557

FPlugin ---> remove _config part
```` 