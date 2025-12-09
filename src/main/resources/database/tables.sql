drop database saleSystem;
create database saleSystem;
use saleSystem;

create table category(
	categoryId int primary key auto_increment,
    categoryName varchar(100),
    categoryDescription longtext
);

create table users(
	userId int primary key auto_increment,
    userName varchar(100),
    userPassword varchar(255),
    userEmail varchar(100),
    userAddress longtext,
    userDob Date,
    userRole varchar(50),
    userImagePath longtext
);

create table products(
	productId int primary key auto_increment,
    productName varchar(100),
    productBrand varchar(100),
    productPrice double(10,5),
    productStock int ,
    categoryId int,
    productImagePath longtext,
    foreign key (categoryId) references category(categoryId) on update cascade on delete cascade
);

create table sales(
	saleId int primary key auto_increment,
    saleTotal double(10,5),
    saleDateTime timestamp,
    userId int,
    foreign key (userId) references users(userId) on update cascade on delete cascade
);

create table saleItmes(
	saleItemId int primary key auto_increment,
    saleId int,
    productId int,
    saleQty int,
    subTotal double(10,5),
	foreign key (saleId) references sales(saleId) on update cascade on delete cascade,
	foreign key (productId) references products(productId) on update cascade on delete cascade
);
