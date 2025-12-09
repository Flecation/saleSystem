INSERT INTO users (userName,userPassword,userEmail,userAddress,userDob,userRole,userImagePath) values 
('admin','123','admin@gmail.com','yangon','2025-09-27','admin','admin.png') ,
('casher','123','casher@gmail.com','yangon','2025-10-27','casher','cahser.png');

insert into category (categoryName) values 
('Stationary') ,
('snack'),
('drink');

insert into products(productName,productBrand,productPrice,productStock,categoryId,productImagePath) values
('Book','Unicolour',1500,100,1,'book.png'), 
 ('Pen','Linc',1800,100,1,'pencil.png');
