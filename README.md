# xpto

## Endpoints

Lista todas as cidades:

```
GET /v1/cidades 
```

Lista todas as capitais em ordem alfabética:

```
GET /v1/cidades/capitais
```

Retorna uma cidade pelo código IBGE:

```
GET /v1/cidades/:ibge
```

Cadastra uma cidade:

```
POST /v1/cidades
```

Exclui uma cidade pelo código IBGE:

```
DELETE /v1/cidades/:ibge
```

Retorna o total de cidades:

```
GET /v1/cidades/count
```


Retorna as cidades baseado em uma UF:

```
GET /v1/estados/:uf/cidades
```

Retorna o total de cidades por UF:

```
GET /v1/estados/:uf/cidades/count
```

Retorna o estado com a maior quantidade de cidades:

```
GET /v1/estados/cidades/maior
```

Retorna o estado com a menor quantidade de cidades:

```
GET /v1/estados/cidades/menor
```
