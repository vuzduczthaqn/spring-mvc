insert into Product_type(typeId,typeName)
values	('tb','Table'),
		('ch','Chair'),
		('pt','Painting'),
		('pl','Plant'),
		('mr','Mirror'),
		('lp','Lamp'),
		('bd','Bed'),
		('dr','Dressings')


insert into Producer(producer_id,producer_name,numberPhone,address)
values	('br1','Amado','012345678',N'6 P. Mạc Thái Tổ, Khu ga, Cầu Giấy, Hà Nội'),
		('br2','Ikea','012345678',N'418 Đ. La Thành, Chợ Dừa, Đống Đa, Hà Nội, Việt Nam'),
		('br3','Furniture Inc','012345678',N'Ngõ 36, Xuân La, Tây Hồ, Hà Nội, Việt Nam'),
		('br4','The factory','012345678',N'Xuân Đỉnh, Tây Hồ, Hà Nội, Việt Nam'),
		('br5','Artdeco','012345678',N'235 Hoàng Quốc Việt, Cổ Nhuế, Bắc Từ Liêm, Hà Nội, Việt Nam')


insert into Position(positionId,posion_name,status)
values ('admin','Admin',1),
		('customer','Customer',1)

insert into Product(product_name,type_id,producer_id,path_image,describe,quantity,price)
values	(N'bàn học 0','tb','br1','1-0JQ1TD-rt1_Wno7NJOnL7eyHt9-kz_Y','bbbbbb','10','200000.0'),
		(N'bàn học 1','tb','br1','1V8Vq2bv6Qkxb1gClJ9D1yw-T7G6R6WgL','bbbbbb','10','200000.0'),
		(N'bàn học 2','tb','br4','1-TVNvXNn1ckWaHAgVz4HXqu8iqlyFviN','bbbbbb','10','200000.0'),
		(N'bàn học 3','tb','br2','1l951USBND6Ti8ISRIwau6Zw1F-Rxvsbl','bbbbbb','10','200000.0'),
		(N'bàn học 4','tb','br1','1XZE-gDvWDPRbCU8t1ND2BbNO1ShyMUDQ','bbbbbb','10','200000.0'),
		(N'bàn học 5','tb','br1','1z2_9Bq9sF1VEU4w3WcjBhLfiYegXstYj','bbbbbb','10','200000.0'),
		(N'bàn học 6','tb','br4','1UK-5aH5Bujml5DzVfRN3atff4YpUsU0G','bbbbbb','10','200000.0'),
		(N'bàn học 7','tb','br4','1w3f_D5AaRxfc-I7eK7WEg6YuyROYDWLd','bbbbbb','10','200000.0'),
		(N'bàn học 8','tb','br4','1zcSIMGPtwILOwRU6aReGZBTCWdC9i-g5','bbbbbb','10','200000.0'),
		(N'bàn học 9','tb','br4','1Tlf-k8pfs60XDTE_IrKDMueZt_250J_C','bbbbbb','10','200000.0'),

		(N'Gương 1','mr','br3','1NzzXWX9AFCJfwPfi2JKgUybmuKbrz1xV','bbbbbb','10','200000.0'),

		(N'Cây cảnh 1','pl','br2','1NzzXWX9AFCJfwPfi2JKgUybmuKbrz1xV','bbbbbb','10','200000.0'),

		(N'Đèn 1','lp','br3','1NzzXWX9AFCJfwPfi2JKgUybmuKbrz1xV','bbbbbb','10','200000.0'),

		(N'Tranh treo tường 1','pt','br3','1NzzXWX9AFCJfwPfi2JKgUybmuKbrz1xV','bbbbbb','10','200000.0')

