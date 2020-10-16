# generic-request
test-generic-request


test with following command

```
curl --location --request POST 'localhost:8080/p' \
--header 'Content-Type: application/json' \
--data-raw '{"type" : "WOW", "reactedAt": 123456789, "payload" : 1}'
```

```
curl --location --request POST 'localhost:8080/p' \
--header 'Content-Type: application/json' \
--data-raw '{"type" : "MOO", "reactedAt": 123456789, "payload" : "this is a message"}'
```
