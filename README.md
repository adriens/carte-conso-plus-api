[![Build Status](https://travis-ci.org/adriens/carte-conso-plus-api.svg?branch=master)](https://travis-ci.org/adriens/carte-conso-plus-api)
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/deffc8e0359909a35d44)

# carte-conso-plus-api

[![Join the chat at https://gitter.im/carte-conso-plus-api/Lobby](https://badges.gitter.im/carte-conso-plus-api/Lobby.svg)](https://gitter.im/carte-conso-plus-api/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

API pour interagir avec le site (http://www.consoplus.nc/) de la Carte Conso + (Nouvelle-Calédonie).

# Demo

![Dummy demo screenshot](DEMO.png "Dummy demo screenshot")

# Endpoints

`/` : welcome message

`/{login}/{password}` : main details

`/{login}/{password}/solde` : le solde brut (pas de json)

`/{login}/{password}/detail` : le detail décrit, brut (pas de json)

`/partners` : la liste des partenaires de la carte (json)


# Heroku

```
https://carte-conso-plus.herokuapp.com/
https://carte-conso-plus.herokuapp.com/{YOUR_LOGIN}/{YOUR_PASSWORD}
https://carte-conso-plus.herokuapp.com/{YOUR_LOGIN}/{YOUR_PASSWORD}/detail
https://carte-conso-plus.herokuapp.com/{YOUR_LOGIN}/{YOUR_PASSWORD}/solde
https://carte-conso-plus.herokuapp.com/partners/
```

# Postman doc

[Postman documentation](https://documenter.getpostman.com/view/3489712/carte-conso-plus/RVnZgHts)
