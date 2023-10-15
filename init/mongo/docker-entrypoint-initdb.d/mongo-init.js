// log the start if the script is executed
print('START');

// switch to the 'product-service' database (or create it if it doesn't exist)
db = db.getSiblingDB('product-service');

db.createUser(
    {
        user: 'mongoadmin',
        pwd: 'password',
        roles: [{role: 'readWrite', db: 'product-service'}],
    }
);

// create a new collection named 'user' within the 'product-service' database
db.createCollection('user');

print('END');
