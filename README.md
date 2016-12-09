# ncproject
##### Запрос на создание записи по url http://localhost:8080/create-owner
###### body: { "firstName" : "Frodo", "lastName" : "Baggins", "address" : "Mordor", "phoneNumber" : "13109" }
###### body: { "firstName" : "Ivan", "lastName" : "Ivanovich", "address" : "Ivanovskaya", "phoneNumber" : "13110" }
##### Запрос на удаление записи по url http://localhost:8080/delete-owner (не работает)
###### body: {"id" : "1"}
##### Запрос на обновление (все поля) по url http://localhost:8080/update-owner
###### body: { "id" : "2" "firstName" : "Ivan", "lastName" : "Ivanovich", "address" : "Ivanovskaya", "phoneNumber" : "89152101245" }
##### Запрос на извлечение записи по номеру телефона по url http://localhost:8080/find-by-phone?phone=9152101245


