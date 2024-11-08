
## Orders Query: Retrieve orders with many items and calculate the total price.




> Solucion: Agregar los indices para OrderID por ser una columna de identificador, Quantity por ser una condicion de la consulta.


```
CREATE INDEX index_orderid ON Orders(OrderID);
CREATE INDEX index_quantity ON Orders(Quantity);
        
```

## Customer Query: Find all customers from London and sort by CustomerName.

> SOLUCION:
```
CREATE INDEX idx_customers_city ON Customers(City);
CREATE INDEX idx_customers_customername ON Customers(CustomerName);
```


# 2. NoSQL Query Implementation

> Solucion: Agregar los indices para `likes` y para `status`
```
db.posts.createIndex({ status: 1 });
db.posts.createIndex({ likes: -1 });
```

## 2.2 User Data Aggregation


> Solucion: Agregar los indices para `status`
```
db.users.createIndex({ status: 1 });
```
